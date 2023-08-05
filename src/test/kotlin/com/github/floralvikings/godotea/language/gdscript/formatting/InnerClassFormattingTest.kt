package com.github.floralvikings.godotea.language.gdscript.formatting

class InnerClassFormattingTest : GDScriptFormattingTestBase() {

    fun test_inner_class_block_indent() = doInsertTextTest("\n")

    fun test_inner_class_function_body_indent() = doInsertTextTest("\n")
}