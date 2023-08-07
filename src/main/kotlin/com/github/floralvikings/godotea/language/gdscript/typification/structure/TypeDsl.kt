package com.github.floralvikings.godotea.language.gdscript.typification.structure

import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.GDvoid

fun type(name: String, configure: TypeBuilder.() -> Unit): GDType = TypeBuilder(name).apply(configure).build()

fun func(
    name: String,
    configure: FunctionBuilder.() -> Unit
): GDFunction {
    return FunctionBuilder(name).apply(configure).build()
}
fun func(
    name: String,
    vararg parameters: GDParameter
): GDFunction {
    return FunctionBuilder(name).apply { parameters.forEach { name(it.type) } }.build()
}

class TypeBuilder internal constructor(val name: String) {
    private val constructors = mutableListOf<GDConstructor>()
    private val functions = mutableListOf<GDFunction>()
    private val fields = mutableListOf<GDField>()
    private var superType: GDType? = null

    fun extends(type: GDType?) {
        this.superType = type
    }

    fun constructor(configure: ConstructorBuilder.() -> Unit): GDConstructor {
        val constructor = ConstructorBuilder().apply(configure).build()
        constructors.add(constructor)
        return constructor
    }

    fun func(
        name: String,
        configure: FunctionBuilder.() -> Unit = { }
    ): GDFunction {
        val func = FunctionBuilder(name).apply(configure).build()
        functions.add(func)
        return func
    }

    fun field(
        name: String,
        type: GDType? = null,
        configure: FieldBuilder.() -> Unit = { }
    ): GDField {
        val field = FieldBuilder(name, type).apply(configure).build()
        fields.add(field)
        return field
    }

    operator fun String.invoke(type: GDType? = null): GDField {
        val field = field(this, type)
        fields.add(field)
        return field
    }

    fun build(): GDType {
        return GDType(name, constructors, fields, functions, superType)
    }
}

class FunctionBuilder internal constructor(val name: String) {
    private var returnType:GDType = GDvoid
    private val parameters = mutableListOf<GDParameter>()

    fun returns(type: GDType) {
        this.returnType = type
    }

    operator fun String.invoke(type: GDType? = null): GDParameter {
        val param = GDParameter(this, type)
        parameters.add(param)
        return param
    }

    fun param(parameter: GDParameter) {
        parameters.add(parameter)
    }

    fun build(): GDFunction {
        return GDFunction(name, parameters, returnType)
    }
}

class ConstructorBuilder internal constructor() {
    private val parameters = mutableListOf<GDParameter>()

    operator fun String.invoke(type: GDType? = null): GDParameter {
        val param = GDParameter(this, type)
        parameters.add(param)
        return param
    }

    fun build(): GDConstructor {
        return GDConstructor(parameters)
    }
}

class FieldBuilder internal constructor(val name: String, val type: GDType?) {
    fun build(): GDField = GDField(name, type)
}
