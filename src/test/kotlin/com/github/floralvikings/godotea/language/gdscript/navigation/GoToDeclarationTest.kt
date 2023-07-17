package com.github.floralvikings.godotea.language.gdscript.navigation

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptClassVarDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFile
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFunctionDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptInnerClassDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptVarStatement
import com.intellij.psi.PsiElement
import com.intellij.psi.util.childrenOfType
import com.intellij.testFramework.fixtures.BasePlatformTestCase

class GoToDeclarationTest : BasePlatformTestCase() {
    override fun getTestDataPath(): String = "src/test/testData/gdscript/navigation"

    fun test_go_to_class_var_from_invocation_argument() = doTest { childrenOfType<GDScriptClassVarDeclaration>()[0] }

    fun test_go_to_class_var_from_reference() = doTest { childrenOfType<GDScriptClassVarDeclaration>()[0] }

    fun test_go_to_local_var() = doTest {
        childrenOfType<GDScriptFunctionDeclaration>()[0].block.childrenOfType<GDScriptVarStatement>()[0]
    }

    fun test_go_to_member_var() = doTest { null }

    fun test_go_to_parameter_declaration() = doTest {
        childrenOfType<GDScriptFunctionDeclaration>()[0].functionParameterList[0]
    }

    fun test_go_to_inner_class_var() = doTest {
        childrenOfType<GDScriptInnerClassDeclaration>()[0].classBlock.childrenOfType<GDScriptClassVarDeclaration>()[0]
    }

    fun test_go_to_shadowed_inner_class_var() = doTest {
        childrenOfType<GDScriptInnerClassDeclaration>()[0].classBlock.childrenOfType<GDScriptClassVarDeclaration>()[0]
    }

    fun test_go_to_shadowed_local_var() = doTest {
        childrenOfType<GDScriptFunctionDeclaration>()[0].block.childrenOfType<GDScriptVarStatement>()[0]
    }

    fun test_go_to_top_level_function_declaration() = doTest {
        childrenOfType<GDScriptFunctionDeclaration>()[0]
    }

    fun test_go_to_inner_class_function_declaration() = doTest {
        childrenOfType<GDScriptInnerClassDeclaration>()[0].classBlock.childrenOfType<GDScriptFunctionDeclaration>()[0]
    }

    fun test_go_to_top_level_function_declaration_from_inner_class() = doTest {
        childrenOfType<GDScriptFunctionDeclaration>()[0]
    }

    private fun configFile() {
        val testName = getTestName(true)
        myFixture.configureByFile("$testName.gd")
    }

    private fun doTest(findExpectedDeclaration: GDScriptFile.() -> PsiElement?) {
        configFile()

        val reference = myFixture.file.findReferenceAt(myFixture.caretOffset)
        assertNotNull("No reference at caret", reference)

        val expectedDeclaration = (myFixture.file as GDScriptFile).findExpectedDeclaration()
        val actualDeclaration = reference?.resolve()
        assertEquals(expectedDeclaration, actualDeclaration)
    }
}