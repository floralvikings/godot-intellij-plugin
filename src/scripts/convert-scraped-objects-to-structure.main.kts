@file:DependsOn("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.15.2")
@file:DependsOn("com.fasterxml.jackson.module:jackson-module-kotlin:2.15.2")

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import java.io.File

File("output/scrape/")
    .listFiles()!!
    .asSequence()
    .map(::readGodotClass)
    .filter { it.name != "Type" }
    .map(::convertGodotClassToObjectDeclaration)
    .forEach { (godotClass, content) ->
        val outputFile = File("output/generated/GD${godotClass.name}.kt")
        if (outputFile.exists()) {
            outputFile.delete()
        }
        outputFile.parentFile.mkdirs()
        outputFile.createNewFile()
        outputFile.writeText(content)

        godotClass.enumerations
            .forEach {
                val unrefinedType = it.name.replace(Regex("\\w+ "), "").replace(":", "")
                if (unrefinedType != "Type") {
                    val enumName = refineType(godotClass.name, unrefinedType)
                    val enumOutputFile = File("output/generated/enums/$enumName.kt")
                    if (enumOutputFile.exists()) {
                        enumOutputFile.delete()
                    }
                    enumOutputFile.parentFile.mkdirs()
                    enumOutputFile.createNewFile()
                    enumOutputFile.writeText(generateEnumType(unrefinedType, enumName))
                }
            }
    }

fun generateEnumType(godotName: String, refinedName: String): String {
    return """
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*

object $refinedName : GDType("$godotName")
"""
}

fun readGodotClass(file: File): GodotClass {
    val objectMapper = ObjectMapper()
    objectMapper.registerKotlinModule()
    return objectMapper.readValue(file, GodotClass::class.java)
}

fun convertGodotClassToObjectDeclaration(godotClass: GodotClass): Pair<GodotClass, String> {
    val className = godotClass.name
    val objectName = "GD$className"
    val fields = godotClass.properties.joinToString("\n") {
        """"${it.name}"(${refineType(className, it.type)})"""
    }
    val constructors = if (godotClass.constructors.isNotEmpty()) {
        godotClass.constructors.joinToString("\n") { convertGodotConstructorToConstructorDSL(className, it) }
    } else {
        createDefaultConstructorDSL()
    }
    val functions = if (godotClass.methods.isNotEmpty()) {
        godotClass.methods.joinToString("\n") { convertGodotMethodToFunctionDSL(className, it) }
    } else {
        ""
    }

    return godotClass to """
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object $objectName: GDType("$className", {

$fields
$constructors
$functions
}){

}"""
}

fun createDefaultConstructorDSL() = """constructor { }"""

fun convertGodotConstructorToConstructorDSL(className: String, constructor: GodotConstructor): String {
    val parameters = convertSignatureToParametersDSL(className, constructor.signature)

    return """
constructor {
$parameters
}"""
}

fun convertGodotMethodToFunctionDSL(className: String, it: GodotMethod): String {
    val nameRegex = Regex("""^[\w]+""")
    val name = nameRegex.find(it.signature)!!
        .groups[0]!!
        .value
    val parameters = convertSignatureToParametersDSL(className, it.signature)
    val returnType = refineType(className, it.returnType)
    return """
func("$name") {
returns($returnType)
$parameters
}"""
}

fun convertSignatureToParametersDSL(className: String, signature: String): String {
    return Regex("""\((.*)\)""").find(signature)!!
        .groups[1]!!
        .value
        .trim()
        .split(",")
        .map { it.trim() }
        .map { it.split(" ") }
        .filter { it.size == 2 }
        .map {
            val unrefinedType = it[0]
            val type = refineType(className, unrefinedType)
            val name = if (it[1].contains("=")) it[1].substring(0, it[1].indexOf("=")) else it[1]
            """"$name"($type)"""
        }.joinToString("\n")

}

fun refineType(className: String, unrefinedType: String): String {
    val deTypedType = if (unrefinedType == "Type") {
        "TypeEnum"
    } else if(unrefinedType == "Parameter") {
        "ParameterEnum"
    } else if(unrefinedType == "Function") { 
        // TODO Handle function parameters better?
        "FunctionParameter"
    } else {
        unrefinedType
    }
    val deDottedType = deTypedType.replace(".", "")
    if(deDottedType.contains("<")) {
        // TODO Handle generics (are they even called generics in gdscript?)
        return "GDUnknownType"
    }
    if(deDottedType.endsWith("*")) {
        // TODO Handle pointer types
        return "GDUnknownType"
    }
    return if (deDottedType.endsWith("[]")) {
        val arrayType = deDottedType.substring(0, deDottedType.indexOf("["))
        if (arrayType == className) {
            "GDTypedArray(GDSameType::class)"
        } else {
            "GDTypedArray(GD$arrayType::class)"
        }
    } else {
        if (deDottedType == className) {
            "GDSameType"
        } else {
            "GD$deDottedType"
        }
    }
}

data class GodotClass(
    val name: String,
    val inherits: String?,
    val properties: List<GodotProperty>,
    val constructors: List<GodotConstructor>,
    val methods: List<GodotMethod>,
    val operators: List<GodotOperator>,
    val signals: List<GodotSignal>,
    val enumerations: List<GodotEnum>
) {
    @JsonIgnore
    fun isNotEmpty(): Boolean {
        return properties.isNotEmpty()
                || methods.isNotEmpty()
                || signals.isNotEmpty()
                || enumerations.isNotEmpty()
    }
}

data class GodotProperty(val type: String, val name: String)

data class GodotConstructor(val signature: String)

data class GodotMethod(val returnType: String, val signature: String)

data class GodotOperator(val returnType: String, val operator: String)

data class GodotConstant(val signature: String)

data class GodotEnum(val name: String, val values: List<GodotEnumValue>)

data class GodotEnumValue(val signature: String)

data class GodotSignal(val signature: String)
