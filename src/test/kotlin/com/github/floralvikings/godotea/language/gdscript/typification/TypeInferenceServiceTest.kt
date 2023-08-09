package com.github.floralvikings.godotea.language.gdscript.typification

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptClassVarDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptExpressionStatement
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFile
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFunctionDeclaration
import com.github.floralvikings.godotea.language.gdscript.util.findTopLevelFunctionsNamed
import com.github.floralvikings.godotea.language.gdscript.util.findTopLevelVarNamed
import com.github.floralvikings.godotea.language.gdscript.util.findVariableDeclaration
import com.intellij.psi.util.childrenOfType
import com.intellij.testFramework.fixtures.BasePlatformTestCase
import junit.framework.TestCase

class TypeInferenceServiceTest : BasePlatformTestCase() {
    override fun getTestDataPath(): String = "src/test/testData/gdscript/typification"

    fun test_built_in_constructor_type_inference() = doTest {service ->
        val expression = childrenOfType<GDScriptFunctionDeclaration>()[0]
            .block!!
            .childrenOfType<GDScriptExpressionStatement>()[0]
            .expression
        TestCase.assertEquals("Vector2", service.inferType(expression).name)
    }

    fun test_constructor_class_var_type_inference() = doTest {service ->
        val declaration = childrenOfType<GDScriptClassVarDeclaration>().firstOrNull()
        assertNotNull(declaration)
        TestCase.assertEquals("Vector2", service.inferType(declaration!!).name)
    }

    fun test_constructor_member_class_var_type_inference() = doTest {service ->
        val declaration = childrenOfType<GDScriptClassVarDeclaration>().firstOrNull()
        assertNotNull(declaration)
        TestCase.assertEquals("float", service.inferType(declaration!!).name)
    }

    fun test_explicitly_declared_class_var_type_inference() = doTest { service ->
        val declaration = childrenOfType<GDScriptClassVarDeclaration>().firstOrNull()
        assertNotNull(declaration)
        assertEquals("Vector2", service.inferType(declaration!!).name)
    }

    fun test_explicitly_declared_inner_class_return_type_inference() = doTest { service ->
        val declaration = findTopLevelFunctionsNamed("another_test")[0]
            .findVariableDeclaration("x")
        assertNotNull(declaration)
        assertEquals("int", service.inferType(declaration!!).name)
    }

    fun test_explicitly_declared_return_type_inference() = doTest { service ->
        val declaration = findTopLevelFunctionsNamed("another_test")[0]
            .findVariableDeclaration("x")
        assertNotNull(declaration)
        assertEquals("int", service.inferType(declaration!!).name)
    }

    fun test_member_field_class_var_type_inference() = doTest { service ->
        val declaration = findTopLevelVarNamed("another_test")
        assertNotNull(declaration)
        assertEquals("float", service.inferType(declaration!!).name)
    }

    fun test_type_inference_propagation() = doTest {service ->
        val functionDeclaration = findTopLevelFunctionsNamed("test_propagation")[0]

        val reassignedVarDeclaration = functionDeclaration.findVariableDeclaration("v2_reassigned")
        val reassignedType = service.inferLocalVarDeclarationType(reassignedVarDeclaration!!)
        TestCase.assertEquals("Vector2", reassignedType.name)

        val absVarDeclaration = functionDeclaration.findVariableDeclaration("v2_reassigned_abs")
        val absType = service.inferLocalVarDeclarationType(absVarDeclaration!!)
        assertEquals("Vector2", absType.name)
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