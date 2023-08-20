package com.github.floralvikings.godotea.language.gdscript.typification

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import com.github.floralvikings.godotea.language.gdscript.psi.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.GDUnknownType
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.GDvoid
import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.util.*
import com.intellij.openapi.components.Service
import com.intellij.openapi.diagnostic.Logger
import com.intellij.psi.PsiElement
import java.util.*

@Service(Service.Level.PROJECT)
class TypeInferenceService {
    private val log = Logger.getInstance(TypeInferenceService::class.java)
    
    private val typeMap: MutableMap<String, GDType> = mutableMapOf()
    
    private val objectMapper = ObjectMapper().registerKotlinModule()
    
    init {
        registerType(GDvoid)
        registerType(GDUnknownType)
        registerBuiltInTypes()
    }
    
    private fun registerBuiltInTypes() {
        val builtinsJsonStream = javaClass.getResourceAsStream("/builtins/builtins.json")!!
        val builtinsJsonReader=  builtinsJsonStream.reader()
        val types = objectMapper.readValue<List<GDType>>(builtinsJsonReader)
        types.forEach(::registerType)
    }
    
    fun registerType(type: GDType) {
        if(typeMap[type.name] != null) {
            log.warn("Type re-registration: $type")
        }
        typeMap[type.name]  = type
    }
    
    fun lookupType(name: String?): GDType = if(name == null) GDUnknownType else typeMap[name] ?: GDUnknownType

    fun inferType(psiElement: PsiElement): GDType {
        return when (psiElement) {
            is GDScriptDotQualifiedExpression -> inferDotQualifiedExpressionType(psiElement)
            is GDScriptClassVarDeclaration -> inferClassVarDeclarationType(psiElement)
            is GDScriptVarStatement -> inferLocalVarDeclarationType(psiElement)
            is GDScriptInvocationExpression -> inferPrimaryInvocationType(psiElement)
            is GDScriptIdExpression -> inferPrimaryIdType(psiElement.id)
            else -> GDUnknownType
        }
    }

    fun inferFunctionOwnerType(invocation: GDScriptInvocationExpression): GDType? {
        val parent = invocation.parent
        if (parent !is GDScriptDotQualifiedExpression) {
            return null
        }

        val invocationIndex = parent.children.indexOf(invocation)
        if(invocationIndex <= 0) {
            return null
        }
        
        return inferDotQualifiedExpressionType(parent, invocationIndex - 1)
    }

    fun inferDotQualifiedExpressionType(
        expression: GDScriptDotQualifiedExpression,
        index: Int = expression.children.lastIndex
    ): GDType {
        val rootObjectType = when (val rootObjectElement = expression.firstChild) {
            is GDScriptInvocationExpression -> inferPrimaryInvocationType(rootObjectElement)
            is GDScriptId -> inferPrimaryIdType(rootObjectElement)
            else -> GDUnknownType
        }
        var currentType: GDType = rootObjectType
        var currentIndex = 1
        while (currentType != GDUnknownType && currentIndex <= index) {
            val currentElement = expression.children[currentIndex]
            currentType = if (currentElement is GDScriptInvocationExpression) {
                lookupType(currentType.functions.firstOrNull { it.name == currentElement.id.text }?.returnType)
            } else {
                typeMap[currentType.fields.firstOrNull { it.name == currentElement.text }?.type] ?: GDUnknownType
            }
            currentIndex++
        }
        return currentType
    }

    private fun inferClassVarDeclarationType(declaration: GDScriptClassVarDeclaration): GDType {
        if (declaration.type != null) {
            return lookupType(declaration.type!!.text)
        }

        if (declaration.expression != null) {
            return inferType(declaration.expression!!)
        }
        // TODO Might be a good idea to check assignments
        return GDUnknownType
    }

    fun inferLocalVarDeclarationType(declaration: GDScriptVarStatement): GDType {
        if(declaration.type != null) {
            return lookupType(declaration.type!!.text)
        }

        if(declaration.expression != null) {
            return inferType(declaration.expression!!)
        }
        // TODO Might be a good idea to check assignments
        return GDUnknownType
    }

    private fun inferFunctionDeclarationReturnType(
        declaredFunctions: List<GDScriptFunctionDeclaration>,
        invocation: GDScriptInvocationExpression
    ): GDType {
        val overload = when (declaredFunctions.size) {
            0 -> null
            1 -> declaredFunctions[0]
            // TODO filter based on parameter types
            else -> declaredFunctions.firstOrNull { it.functionDeclarationParameters.functionParameterList.size == invocation.call.expressionList.size }
        } ?: return GDUnknownType

        val functionReturnType = overload.functionReturnType
        if(functionReturnType != null) {
            return lookupType(functionReturnType.type.text)
        }

        // TODO Inspect return statements and infer type from them
        return GDUnknownType
    }

    private fun inferPrimaryInvocationType(invocation: GDScriptInvocationExpression): GDType {
        val functionName = invocation.id.text
        
        val builtInType = typeMap[functionName]
        if (builtInType != null) {
            return builtInType
        }

        val globalFunctions = globalFunctions

        val builtInFunction = globalFunctions.firstOrNull{ it.name == functionName }
        if (builtInFunction != null) {
            return lookupType(builtInFunction.returnType)
        }

        val gdScriptFile = invocation.containingFile as GDScriptFile
        val declaredFunctions = gdScriptFile.findTopLevelFunctionsNamed(functionName)
        if (declaredFunctions.isNotEmpty()) {
            return inferFunctionDeclarationReturnType(declaredFunctions, invocation)
        }

        val localMatchingInnerClass = gdScriptFile.findInnerClassDeclaration(functionName)
        if(localMatchingInnerClass != null) {
            return inferInnerClassDeclarationType(localMatchingInnerClass)
        }

        // TODO non-local declared classes

        return GDUnknownType
    }

    val globalFunctions: List<GDFunction>
        get() {
            val globalScopeFunctions = lookupType("@GlobalScope").functions
            val gdscriptFunctions = lookupType("@GDScript").functions
            val globalFunctions = globalScopeFunctions + gdscriptFunctions
            return globalFunctions
        }

    val typeNames: Set<String>
        get() = typeMap.keys

    private fun inferInnerClassDeclarationType(innerClass: GDScriptInnerClassDeclaration): GDType {
        val functions = innerClass.functionDeclarations
            .filter { it.functionName.text != "_init" }
            .map(this::createGDFunctionFromDeclaration)
        val constructors = innerClass.functionDeclarations
            .filter { it.functionName.text == "_init" }
            .map(this::createGDConstructorFromDeclaration)
        val fields = innerClass.varDeclarations.map(this::createGDFieldFromDeclaration)
        val superType = getTypeFromExtendsDeclaration(innerClass.extendsDeclaration)

        return GDType(innerClass.id.text, constructors, fields, functions, superType)
    }

    private fun getTypeFromExtendsDeclaration(declaration: GDScriptExtendsDeclaration?): String {
        if(declaration == null) {
            return GDUnknownType.name
        }
        val typeName = if(declaration.type == null) {
            declaration.string!!.text
        } else {
            declaration.type!!.text
        }
        return typeName
    }

    private fun createGDFunctionFromDeclaration(declaration: GDScriptFunctionDeclaration): GDFunction {
        return GDFunction(declaration.functionName.text) {
            declaration.functionDeclarationParameters.functionParameterList.forEach { param ->
                if(param.type != null) {
                    param.parameterName.text(param.type!!.text)
                } else if(param.expression != null) {
                    param.parameterName.text()
                } else {
                    param.parameterName.text()
                }
            }
            if(declaration.functionReturnType != null) {
                returns(declaration.functionReturnType!!.type.text)
            }
            // TODO Infer return type from return statements?
        }
    }

    private fun inferPrimaryIdType(id: GDScriptId): GDType {
        val declaration = id.reference.resolve()
        if (declaration != null) {
            return inferType(declaration)
        }
        // TODO Built-in constants/fields
        return GDUnknownType
    }

    private fun createGDConstructorFromDeclaration(declaration: GDScriptFunctionDeclaration): GDConstructor {
        val parameters = declaration.functionDeclarationParameters.functionParameterList.map { param ->
            val type = if (param.type != null) {
                param.type!!.text
            } else {
                GDUnknownType.name
            }
            GDParameter(param.parameterName.text, type)
        }
        return GDConstructor(parameters)
    }

    private fun createGDFieldFromDeclaration(declaration: GDScriptClassVarDeclaration): GDField {
        val type = inferClassVarDeclarationType(declaration)
        return GDField(declaration.classVarName.text, type.name)
    }
}