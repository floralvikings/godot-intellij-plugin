package com.github.floralvikings.godotea.language.gdscript.typification

import com.github.floralvikings.godotea.language.gdscript.typification.builtins.basic.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.functions.Print
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.GDvoid
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.vector.GDVector2

object GDScriptBuiltIns {
    val functions = listOf(
        Print
    )

    val types = mapOf(
        "bool" to GDBool,
        "float" to GDFloat,
        "int" to GDInt,
        "NodePath" to GDNodePath,
        "null" to GDNull,
        "String" to GDString,
        "StringName" to GDStringName,
        "void" to GDvoid,
        "Vector2" to GDVector2
    )

    val functionNames = functions.map { it.name }.toHashSet()

    val constructorNames = types.keys
}