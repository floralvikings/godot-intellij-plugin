package com.github.floralvikings.godotea.language.gdscript.completion

import com.intellij.testFramework.fixtures.BasePlatformTestCase

class CompletionTest : BasePlatformTestCase() {
    override fun getTestDataPath(): String = "src/test/testData/gdscript/completion/"

    fun test_class_var_completion() = doTest("class_var")

    fun test_local_var_completion() = doTest("test_local_var")
    
    fun test_global_function_completion() = doTest("print")

    fun test_built_in_member_reference_completion() = doTest("x", "y", "abs")

    fun test_declared_member_reference_completion() = doTest("foo")

    private fun configFile(): String {
        val testName = getTestName(true)
        myFixture.configureByFile("$testName.gd")
        return testName
    }

    private fun doTest(vararg expectedVariants: String) {
        val testName = configFile()

        val variants = myFixture.getCompletionVariants("$testName.gd")

        assertNotNull("Variants should not be null", variants)
        for (expectedVariant in expectedVariants) {
            assertTrue("$expectedVariant missing from variants", variants?.contains(expectedVariant) ?: false)
        }
        assertTrue(variants!!.containsAll(expectedVariants.toList()))
    }
}