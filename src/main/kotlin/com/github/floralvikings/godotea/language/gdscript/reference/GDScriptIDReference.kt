package com.github.floralvikings.godotea.language.gdscript.reference

import com.github.floralvikings.godotea.language.gdscript.cache.GDScriptIDReferenceResolver
import com.github.floralvikings.godotea.language.gdscript.psi.*
import com.github.floralvikings.godotea.language.gdscript.typification.GDScriptBuiltIns
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.GDUnknownType
import com.github.floralvikings.godotea.language.gdscript.typification.structure.GDDeclaration
import com.github.floralvikings.godotea.language.gdscript.util.*
import com.intellij.openapi.util.Key
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReferenceBase
import com.intellij.psi.util.CachedValue
import com.intellij.psi.util.CachedValuesManager
import com.intellij.refactoring.suggested.startOffset

class GDScriptIDReference(private val id: GDScriptId) : PsiReferenceBase<GDScriptId>(id, id.textRange) {

    val declaration: GDDeclaration by lazy {
        when (val psiDeclaration = resolve()) {
            is GDScriptVarStatement -> psiDeclaration.resolveType()
            else -> GDUnknownType
        }
    }

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
        val parent = id.parent
        if(parent is GDScriptExpression && parent.idList.isNotEmpty()) {
            val idIndex = parent.idList.indexOf(id)
            if(idIndex == 0) {
                return getPrimaryReferenceVariants()
            }
        }
        return super.getVariants()
    }

    private fun getPrimaryReferenceVariants(): Array<String> {
        val declaredVariants = getDeclaredVariants()
        val builtInVariants = getBuiltInVariants()

        return (declaredVariants + builtInVariants).toTypedArray()
    }

    private fun getBuiltInVariants(): List<String> {
        val variants = mutableListOf<String>()

        variants.addAll(GDScriptBuiltIns.functionNames)
        variants.addAll(GDScriptBuiltIns.constructorNames)

        return variants
    }

    private fun getDeclaredVariants(): List<String> {
        val variants = mutableListOf<String>()

        val surroundingFunction = id.getSurroundingFunction()
        if (surroundingFunction != null) {
            variants.addAll(surroundingFunction.functionParameterList.map { it.parameterName.text })
            variants.addAll(surroundingFunction.getVariableDeclarations().map { it.localVarName.text })
        }

        val surroundingClass = id.getSurroundingClass()
        if (surroundingClass != null) {
            variants.addAll(surroundingClass.getVarDeclarations().map { it.classVarName.text })
            variants.addAll(surroundingClass.getFunctionDeclarations().map() { it.functionName.text })
        }

        val file = id.containingFile
        if (file is GDScriptFile) {
            variants.addAll(file.getVarDeclarations().map { it.classVarName.text })
            variants.addAll(file.getFunctionDeclarations().map { it.functionName.text })
        }
        // TODO Declared autoload properties
        return variants
    }
}
