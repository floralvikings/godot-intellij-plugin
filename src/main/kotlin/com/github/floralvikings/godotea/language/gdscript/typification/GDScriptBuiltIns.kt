package com.github.floralvikings.godotea.language.gdscript.typification

object GDScriptBuiltIns {
    val functions = listOf(
        GDScriptFunction("print", listOf(GDScriptParameter("args", vararg = true)))
    )

    val functionNames = functions.map { it.name }.toHashSet()
}