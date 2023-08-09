@file:DependsOn("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.15.2")
@file:DependsOn("com.fasterxml.jackson.module:jackson-module-kotlin:2.15.2")
@file:Import(
    "../main/kotlin/com/github/floralvikings/godotea/language/gdscript/typification/structure/GDDeclaration.kt",
    "../main/kotlin/com/github/floralvikings/godotea/language/gdscript/typification/structure/GDConstructor.kt",
    "../main/kotlin/com/github/floralvikings/godotea/language/gdscript/typification/structure/GDField.kt",
    "../main/kotlin/com/github/floralvikings/godotea/language/gdscript/typification/structure/GDFunction.kt",
    "../main/kotlin/com/github/floralvikings/godotea/language/gdscript/typification/structure/GDParameter.kt",
    "../main/kotlin/com/github/floralvikings/godotea/language/gdscript/typification/structure/GDType.kt",
    "../main/kotlin/com/github/floralvikings/godotea/language/gdscript/typification/structure/TypeDsl.kt",
    "../main/kotlin/com/github/floralvikings/godotea/language/gdscript/typification/builtins/placeholder/GDvoid.kt",
    "../main/kotlin/com/github/floralvikings/godotea/language/gdscript/typification/builtins/placeholder/GDUnknownType.kt",
)

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.structure.GDType
import java.io.File

val objectMapper = ObjectMapper()
objectMapper.registerKotlinModule()

val outputFile = File("output/json/builtins.json")
if (outputFile.exists()) {
    outputFile.delete()
}
outputFile.parentFile.mkdirs()
outputFile.createNewFile()

val types = File("output/scrape/")
    .listFiles()!!
    .asSequence()
    .map(::readGodotClass)
    .filter { it.name != "Type" }
    .map(::convertGodotClassToGDType)
    .map { it.second }

objectMapper.writerWithDefaultPrettyPrinter().writeValue(outputFile, types)


fun readGodotClass(file: File): GodotClass {
    return objectMapper.readValue(file, GodotClass::class.java)
}

fun convertGodotClassToGDType(godotClass: GodotClass): Pair<GodotClass, GDType> {
    return godotClass to GDType(godotClass.name) {
        extends(godotClass.inherits)
        
        if(godotClass.constructors.isEmpty()) {
            constructor { }
        }
        godotClass.constructors.forEach { constructor -> 
            constructor {
                val nameTypePairs = convertSignatureToNameTypePairs(constructor.signature)
                nameTypePairs.forEach { (name, type) ->
                    name(type)
                }
            }
        }
        
        godotClass.properties.forEach { property ->
            property.name(property.type)
        }
        
        godotClass.methods.forEach { method ->
            val nameRegex = Regex("""^[\w]+""")
            val name = nameRegex.find(method.signature)!!
                .groups[0]!!
                .value
            func(name) {
                returns(method.returnType)
                val nameTypePairs = convertSignatureToNameTypePairs(method.signature)
                nameTypePairs.forEach { (name, type) ->
                    name(type)
                }
            }
        }
    }
}

fun convertSignatureToNameTypePairs(signature: String): List<Pair<String, String>> {
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
            val name = if (it[1].contains("=")) it[1].substring(0, it[1].indexOf("=")) else it[1]
            name to unrefinedType
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
