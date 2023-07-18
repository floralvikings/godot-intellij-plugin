package com.github.floralvikings.godotea.language.gdscript.typification

object GDScriptBuiltIns {

    object Types {
        val VOID = GDScriptType("void")
        val INT = GDScriptType("int")
        val FLOAT = GDScriptType("float")

        val VECTOR_2 = type("Vector2") {
            constructor {  }
            constructor {
                "x"(FLOAT)
                "y"(FLOAT)
            }
            field("x", FLOAT)
            field("y", FLOAT)
        }
    }

    val functions = listOf(
        func("print") { "args"(Types.VOID) }
    )

    val types = mapOf(
        "void" to Types.VOID,
        "int" to Types.INT,
        "Vector2" to Types.VECTOR_2
    )

    val functionNames = functions.map { it.name }.toHashSet()

    val constructorNames = types.keys
}