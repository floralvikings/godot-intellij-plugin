package com.github.floralvikings.godotea.language.gdscript.formatting

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptElifStatement
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptElseStatement
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptIfStatement
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes
import com.github.floralvikings.godotea.language.gdscript.util.prevNonWhitespaceSibling
import com.intellij.application.options.CodeStyle
import com.intellij.codeInsight.editorActions.enter.EnterHandlerDelegate
import com.intellij.codeInsight.editorActions.enter.EnterHandlerDelegateAdapter
import com.intellij.openapi.actionSystem.DataContext
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.editor.actionSystem.EditorActionHandler
import com.intellij.openapi.util.Ref
import com.intellij.psi.PsiFile
import com.intellij.psi.codeStyle.CodeStyleSettingsManager
import com.intellij.psi.util.elementType
import com.intellij.refactoring.suggested.startOffset

class GDScriptDedentEnterHandler : EnterHandlerDelegateAdapter() {
    override fun preprocessEnter(
        file: PsiFile,
        editor: Editor,
        caretOffset: Ref<Int>,
        caretAdvance: Ref<Int>,
        dataContext: DataContext,
        originalHandler: EditorActionHandler?
    ): EnterHandlerDelegate.Result {
        val prevElement = file.findElementAt(caretOffset.get() - 1)
        val parent = prevElement?.parent
        
        if (parent is GDScriptElseStatement || parent is GDScriptElifStatement) {
            val ifStatement = parent.parent as GDScriptIfStatement

            val elseLineNumber = editor.document.getLineNumber(parent.startOffset)
            val elseLineOffset = editor.document.getLineStartOffset(elseLineNumber)
            val elseIndent = parent.startOffset - elseLineOffset

            val ifLineNumber = editor.document.getLineNumber(ifStatement.startOffset)
            val ifLineOffset = editor.document.getLineStartOffset(ifLineNumber)
            val ifIndent = ifStatement.startOffset - ifLineOffset

            if (elseIndent > ifIndent) {
                val numToDelete = elseIndent - ifIndent
                val deleteOffset = parent.textOffset - numToDelete
                editor.document.deleteString(deleteOffset, deleteOffset + numToDelete)
                caretOffset.set(caretOffset.get() - numToDelete)
            }
        }
        
        return super.preprocessEnter(file, editor, caretOffset, caretAdvance, dataContext, originalHandler)
    }
}
