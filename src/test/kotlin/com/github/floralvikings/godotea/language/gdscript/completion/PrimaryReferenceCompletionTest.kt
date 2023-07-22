package com.github.floralvikings.godotea.language.gdscript.completion

import com.intellij.testFramework.fixtures.BasePlatformTestCase
import junit.framework.TestCase

class PrimaryReferenceCompletionTest : BasePlatformTestCase() {
    override fun getTestDataPath(): String = "src/test/testData/gdscript/completion/"

    fun test_class_var_completion() = doTest("class_var")

    private fun configFile(): String {
        val testName = getTestName(true)
        myFixture.configureByFile("$testName.gd")
        return testName
    }

    private fun doTest(vararg expectedVariants: String) {
        val testName = configFile()

        val variants = myFixture.getCompletionVariants("$testName.gd")

        TestCase.assertNotNull(variants)
        TestCase.assertTrue(variants!!.containsAll(expectedVariants.toList()))
    }
}