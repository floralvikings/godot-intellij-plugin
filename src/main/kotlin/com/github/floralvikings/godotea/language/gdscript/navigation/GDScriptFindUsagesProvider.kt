package com.github.floralvikings.godotea.language.gdscript.navigation

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptClassVarDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFunctionParameter
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptVarStatement
import com.intellij.lang.HelpID
import com.intellij.lang.cacheBuilder.SimpleWordsScanner
import com.intellij.lang.cacheBuilder.WordsScanner
import com.intellij.lang.findUsages.FindUsagesProvider
import com.intellij.psi.PsiElement
import org.jetbrains.annotations.Nls
import org.jetbrains.annotations.NonNls

class GDScriptFindUsagesProvider : FindUsagesProvider {
    override fun getWordsScanner(): WordsScanner = SimpleWordsScanner()

    override fun canFindUsagesFor(psiElement: PsiElement): Boolean =
        psiElement is GDScriptClassVarDeclaration
                || psiElement is GDScriptVarStatement
                || psiElement is GDScriptFunctionParameter

    override fun getHelpId(psiElement: PsiElement): @NonNls String = HelpID.FIND_OTHER_USAGES

    override fun getType(element: PsiElement): @Nls String = when(element) {
        is GDScriptClassVarDeclaration -> "Class Variable"
        is GDScriptFunctionParameter -> "Function Parameter"
        is GDScriptVarStatement -> "Local Variable"
        else -> ""
    }

    override fun getDescriptiveName(element: PsiElement): @Nls String = when(element) {
        is GDScriptClassVarDeclaration -> element.classVarName.text
        is GDScriptFunctionParameter -> element.parameterName.text
        is GDScriptVarStatement -> element.localVarName.text
        else -> element.text
    }

    override fun getNodeText(element: PsiElement, useFullName: Boolean): @Nls String = when(element) {
        is GDScriptClassVarDeclaration -> element.classVarName.text
        is GDScriptFunctionParameter -> element.parameterName.text
        is GDScriptVarStatement -> element.localVarName.text
        else -> element.text
    }
}
