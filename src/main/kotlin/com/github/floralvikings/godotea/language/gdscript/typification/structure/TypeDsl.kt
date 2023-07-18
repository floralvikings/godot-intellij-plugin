package com.github.floralvikings.godotea.language.gdscript.typification.structure

import com.github.floralvikings.godotea.language.gdscript.typification.builtins.basic.GDVoid

fun type(name: String, configure: TypeBuilder.() -> Unit): GDScriptType = TypeBuilder(name).apply(configure).build()

fun func(
    name: String,
    returnType: GDScriptType = GDVoid,
    configure: FunctionBuilder.() -> Unit
): GDScriptFunction {
    return FunctionBuilder(name, returnType).apply(configure).build()
}
fun func(
    name: String,
    returnType: GDScriptType = GDVoid,
    vararg parameters: GDScriptParameter
): GDScriptFunction {
    return FunctionBuilder(name, returnType).apply { parameters.forEach { name(it.type) } }.build()
}

class TypeBuilder internal constructor(val name: String) {
    private val constructors = mutableListOf<GDScriptConstructor>()
    private val functions = mutableListOf<GDScriptFunction>()
    private val fields = mutableListOf<GDScriptField>()
    private var superType: GDScriptType? = null

    fun extends(type: GDScriptType?) {
        this.superType = type
    }

    fun constructor(configure: ConstructorBuilder.() -> Unit): GDScriptConstructor {
        val constructor = ConstructorBuilder().apply(configure).build()
        constructors.add(constructor)
        return constructor
    }

    fun func(
        name: String,
        returnType: GDScriptType = GDVoid,
        configure: FunctionBuilder.() -> Unit = { }
    ): GDScriptFunction {
        val func = FunctionBuilder(name, returnType).apply(configure).build()
        functions.add(func)
        return func
    }

    fun field(
        name: String,
        type: GDScriptType? = null,
        configure: FieldBuilder.() -> Unit = { }
    ): GDScriptField {
        val field = FieldBuilder(name, type).apply(configure).build()
        fields.add(field)
        return field
    }

    operator fun String.invoke(type: GDScriptType? = null): GDScriptField {
        val field = field(this, type)
        fields.add(field)
        return field
    }

    fun build(): GDScriptType {
        return GDScriptType(name, constructors, fields, functions, superType)
    }
}

class FunctionBuilder internal constructor(val name: String, var returnType: GDScriptType) {
    private val parameters = mutableListOf<GDScriptParameter>()

    fun returns(type: GDScriptType) {
        this.returnType = type
    }

    operator fun String.invoke(type: GDScriptType? = null): GDScriptParameter {
        val param = GDScriptParameter(this, type)
        parameters.add(param)
        return param
    }

    fun build(): GDScriptFunction {
        return GDScriptFunction(name, parameters, returnType)
    }
}

class ConstructorBuilder internal constructor() {
    private val parameters = mutableListOf<GDScriptParameter>()

    operator fun String.invoke(type: GDScriptType? = null): GDScriptParameter {
        val param = GDScriptParameter(this, type)
        parameters.add(param)
        return param
    }

    fun build(): GDScriptConstructor {
        return GDScriptConstructor(parameters)
    }
}

class FieldBuilder internal constructor(val name: String, val type: GDScriptType?) {
    fun build(): GDScriptField = GDScriptField(name, type)
}
