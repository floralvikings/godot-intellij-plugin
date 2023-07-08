package com.github.floralvikings.godotintellijplugin.language.gdscript.parser

import com.github.floralvikings.godotintellijplugin.language.gdscript.GDScriptLanguage
import com.github.floralvikings.godotintellijplugin.language.gdscript.lexer.GDScriptLexerAdapter
import com.github.floralvikings.godotintellijplugin.language.gdscript.psi.GDScriptFile
import com.github.floralvikings.godotintellijplugin.language.gdscript.psi.GDScriptTokenSets
import com.github.floralvikings.godotintellijplugin.language.gdscript.psi.GDScriptTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class GDScriptParserDefinition : ParserDefinition {
    companion object {
        val FILE = IFileElementType(GDScriptLanguage.INSTANCE)
    }

    override fun createLexer(project: Project?): Lexer = GDScriptLexerAdapter()

    override fun createParser(project: Project?): PsiParser = GDScriptParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun getCommentTokens(): TokenSet = GDScriptTokenSets.COMMENTS

    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY

    override fun createElement(node: ASTNode?): PsiElement = GDScriptTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = GDScriptFile(viewProvider)
}