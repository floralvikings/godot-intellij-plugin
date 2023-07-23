package com.github.floralvikings.godotea.language.gdscript.typification

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptClassVarDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFile
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.vector.GDVector2
import com.intellij.psi.util.childrenOfType
import com.intellij.testFramework.fixtures.BasePlatformTestCase
import junit.framework.TestCase

class TypeInferenceServiceTest : BasePlatformTestCase() {
    override fun getTestDataPath(): String = "src/test/testData/gdscript/typification"

    fun test_explicitly_declared_class_var_type_inference() = doTest { service ->
        val declaration = childrenOfType<GDScriptClassVarDeclaration>().firstOrNull()
        assertNotNull(declaration)
        TestCase.assertEquals(GDVector2, service.inferType(declaration!!))
    }

    private fun configFile(): GDScriptFile {
        val testName = getTestName(true)
        return myFixture.configureByFile("$testName.gd") as GDScriptFile
    }

    private fun doTest(test: GDScriptFile.(service: TypeInferenceService) -> Unit) {
        val service = myFixture.project.getService(TypeInferenceService::class.java)
        configFile().test(service)
    }
}