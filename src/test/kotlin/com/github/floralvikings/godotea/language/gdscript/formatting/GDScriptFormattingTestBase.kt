package com.github.floralvikings.godotea.language.gdscript.formatting

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFile
import com.intellij.application.options.CodeStyle
import com.intellij.openapi.command.WriteCommandAction
import com.intellij.psi.codeStyle.CodeStyleManager
import com.intellij.psi.codeStyle.CommonCodeStyleSettings
import com.intellij.testFramework.fixtures.BasePlatformTestCase
import com.intellij.util.containers.ContainerUtil

abstract class GDScriptFormattingTestBase : BasePlatformTestCase() {
    private val testSubfolder = this::class.simpleName!!.replace(Regex("FormattingTest$"), "").camelToSnakeCase()
    
    override fun getTestDataPath(): String = "src/test/testData/gdscript/formatting/$testSubfolder/"
    
    protected fun doInsertTextTest(text: String, configureSettings: CommonCodeStyleSettings.() -> Unit = {}) {
        val testFile = configFile()!!
        CodeStyle.getLanguageSettings(testFile).configureSettings()

        WriteCommandAction.runWriteCommandAction(project) {
            myFixture.type(text)
        }

        val resultPath = testFile.name.replace("_before.gd", "_after.gd")
        myFixture.checkResultByFile(resultPath, false)
    }

    private fun doReformatTest(configureSettings: CommonCodeStyleSettings.() -> Unit = {}) {
        val testFile = configFile()!!
        CodeStyle.getLanguageSettings(testFile).configureSettings()

        WriteCommandAction.writeCommandAction(project).run<Throwable> {
            CodeStyleManager.getInstance(project).reformatText(
                myFixture.file,
                ContainerUtil.newArrayList(myFixture.file.textRange)
            )
        }

        myFixture.checkResultByFile(
            testFile.virtualFile.parent.path,
            testFile.name.replace("_before.gd", "_after.gd"),
            false
        )
    }

    private fun configFile(): GDScriptFile? {
        val testName = getTestName(true)
        return myFixture.configureByFile("${testName}_before.gd") as? GDScriptFile
    }
    
    private fun String.camelToSnakeCase(): String {
        val pattern = "(?<=.)[A-Z]".toRegex()
        return this.replace(pattern, "_$0").lowercase()
    }
    
}