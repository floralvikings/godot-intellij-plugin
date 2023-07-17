package com.github.floralvikings.godotea.language.gdscript.refactoring

import com.github.floralvikings.godotea.language.gdscript.psi.*
import com.intellij.psi.PsiElement
import com.intellij.psi.util.childrenOfType
import com.intellij.testFramework.fixtures.BasePlatformTestCase
import junit.framework.TestCase

class RenameTest : BasePlatformTestCase() {
    override fun getTestDataPath(): String = "src/test/testData/gdscript/refactoring/rename"

    fun test_rename_local_var() = doTest("new_name") {
        listOf(
            childrenOfType<GDScriptFunctionDeclaration>()[0]
                .block.childrenOfType<GDScriptExpressionStatement>()[0]
                .childrenOfType<GDScriptInvocationExpression>()[0]
                .childrenOfType<GDScriptExpression>()[0]
                .childrenOfType<GDScriptId>()[0]
        )
    }

    fun test_rename_class_var() = doTest("something") {
        listOf(
            childrenOfType<GDScriptFunctionDeclaration>()[0]
                .block.childrenOfType<GDScriptExpressionStatement>()[0]
                .childrenOfType<GDScriptInvocationExpression>()[0]
                .childrenOfType<GDScriptExpression>()[0]
                .childrenOfType<GDScriptId>()[0]
        )
    }

    fun test_rename_function() = doTest("new_function_name") {
        listOf (
            childrenOfType<GDScriptFunctionDeclaration>()[1]
                .block.childrenOfType<GDScriptExpressionStatement>()[0]
                .childrenOfType<GDScriptInvocationExpression>()[0]
                .childrenOfType<GDScriptId>()[0]
        )
    }

    fun test_rename_parameter() = doTest("new_parameter_name") {
        listOf(
            childrenOfType<GDScriptFunctionDeclaration>()[0]
                .block.childrenOfType<GDScriptExpressionStatement>()[0]
                .childrenOfType<GDScriptInvocationExpression>()[0]
                .childrenOfType<GDScriptExpression>()[0]
                .childrenOfType<GDScriptId>()[0]
        )
    }

    private fun configFile() {
        val testName = getTestName(true)
        myFixture.configureByFile("$testName.gd")
    }

    private fun doTest(newName: String, findExpectedElements: GDScriptFile.() -> List<PsiElement>) {
        configFile()

        myFixture.renameElementAtCaret(newName)

        val expectedRenames = (myFixture.file as GDScriptFile).findExpectedElements()
        expectedRenames.forEach {
            assertInstanceOf(it, GDScriptId::class.java)
            TestCase.assertEquals(it.text, newName)
        }
    }
}