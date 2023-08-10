package com.github.floralvikings.godotea.language.gdscript.reference

import com.github.floralvikings.godotea.language.gdscript.cache.GDScriptIDReferenceResolver
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptDotQualifiedExpression
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptElementFactory
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFile
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptId
import com.github.floralvikings.godotea.language.gdscript.typification.TypeInferenceService
import com.github.floralvikings.godotea.language.gdscript.util.*
import com.intellij.openapi.components.service
import com.intellij.openapi.util.Key
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReferenceBase
import com.intellij.psi.util.CachedValue
import com.intellij.psi.util.CachedValuesManager
import com.intellij.refactoring.suggested.startOffset

class GDScriptIDReference(private val id: GDScriptId) : PsiReferenceBase<GDScriptId>(id, id.textRange) {
    
    val typeInferenceService = id.project.service<TypeInferenceService>()

    override fun resolve(): PsiElement? {
        return CachedValuesManager.getCachedValue(
            id,
            Key.create<CachedValue<PsiElement>>(id.toString()),
            GDScriptIDReferenceResolver(id)
        )
    }

    override fun isReferenceTo(element: PsiElement): Boolean {
        return resolve() == element
    }

    override fun getRangeInElement(): TextRange {
        return id.textRange.shiftLeft(id.startOffset)
    }

    override fun handleElementRename(newElementName: String): PsiElement {
        val identifier = id.identifier ?: return id
        val newIdentifier = GDScriptElementFactory.createIdentifier(id.project, newElementName)
        id.node.replaceChild(identifier.node, newIdentifier.node)
        return id
    }

    override fun getVariants(): Array<out Any> {
        return if(id.parent is GDScriptDotQualifiedExpression) {
            getMemberReferenceVariants()
        } else {
            getPrimaryReferenceVariants()
        }
    }

    private fun getMemberReferenceVariants(): Array<String> {
        val inferenceService = id.project.getService(TypeInferenceService::class.java)
        val qualifiedExpression = id.parent as GDScriptDotQualifiedExpression
        val ownerIndex = qualifiedExpression.children.indexOf(id) - 1
        if(ownerIndex < 0) {
            return getPrimaryReferenceVariants()
        }
        val ownerType = inferenceService.inferDotQualifiedExpressionType(qualifiedExpression, ownerIndex)
        return ownerType.fields.map { it.name }.toTypedArray() + ownerType.functions.map { it.name }.toSet()
    }

    private fun getPrimaryReferenceVariants(): Array<String> {
        val declaredVariants = getDeclaredPrimaryReferenceVariants()
        val builtInVariants = getBuiltInPrimaryReferenceVariants()

        return (declaredVariants + builtInVariants).toTypedArray()
    }

    private fun getBuiltInPrimaryReferenceVariants(): List<String> {
        val variants = mutableListOf<String>()

        variants.addAll(typeInferenceService.globalFunctions.map { it.name })
        variants.addAll(typeInferenceService.typeNames)

        return variants
    }

    private fun getDeclaredPrimaryReferenceVariants(): List<String> {
        val variants = mutableListOf<String>()

        val surroundingFunction = id.getSurroundingFunction()
        if (surroundingFunction != null) {
            variants.addAll(surroundingFunction.functionDeclarationParameters?.functionParameterList?.map { it.parameterName.text }!!)
            variants.addAll(surroundingFunction.variableDeclarations.map { it.localVarName.text })
        }

        val surroundingClass = id.getSurroundingClass()
        if (surroundingClass != null) {
            variants.addAll(surroundingClass.varDeclarations.map { it.classVarName.text })
            variants.addAll(surroundingClass.functionDeclarations.map() { it.functionName.text })
        }

        val file = id.containingFile
        if (file is GDScriptFile) {
            variants.addAll(file.topLevelVarDeclarations.map { it.classVarName.text })
            variants.addAll(file.topLevelFunctionDeclarations.map { it.functionName.text })
        }
        // TODO Declared autoload properties
        return variants
    }
}
