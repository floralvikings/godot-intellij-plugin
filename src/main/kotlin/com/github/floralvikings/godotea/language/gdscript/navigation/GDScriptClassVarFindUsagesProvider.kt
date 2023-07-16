package com.github.floralvikings.godotea.language.gdscript.navigation

import com.github.floralvikings.godotea.language.gdscript.lexer.GDScriptLexerAdapter
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptClassVarDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes
import com.intellij.lang.HelpID
import com.intellij.lang.cacheBuilder.DefaultWordsScanner
import com.intellij.lang.cacheBuilder.SimpleWordsScanner
import com.intellij.lang.cacheBuilder.WordsScanner
import com.intellij.lang.findUsages.FindUsagesProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.tree.TokenSet
import org.jetbrains.annotations.Nls
import org.jetbrains.annotations.NonNls

class GDScriptClassVarFindUsagesProvider : FindUsagesProvider {
    override fun getWordsScanner(): WordsScanner = SimpleWordsScanner()

    override fun canFindUsagesFor(psiElement: PsiElement): Boolean =
        psiElement is GDScriptClassVarDeclaration

    override fun getHelpId(psiElement: PsiElement): @NonNls String = HelpID.FIND_OTHER_USAGES

    override fun getType(element: PsiElement): @Nls String = "Class Variable"

    override fun getDescriptiveName(element: PsiElement): @Nls String =
        (element as GDScriptClassVarDeclaration).classVarName.text

    override fun getNodeText(element: PsiElement, useFullName: Boolean): @Nls String {
        return if(useFullName) {
            (element as GDScriptClassVarDeclaration).qualifiedName
        } else {
            (element as GDScriptClassVarDeclaration).classVarName.text
        }
    }
}
