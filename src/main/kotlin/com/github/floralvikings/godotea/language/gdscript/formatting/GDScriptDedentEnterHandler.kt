package com.github.floralvikings.godotea.language.gdscript.formatting

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptIfStatement
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes
import com.intellij.codeInsight.editorActions.enter.EnterHandlerDelegate
import com.intellij.codeInsight.editorActions.enter.EnterHandlerDelegateAdapter
import com.intellij.formatting.FormattingMode
import com.intellij.openapi.actionSystem.DataContext
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.editor.actionSystem.EditorActionHandler
import com.intellij.openapi.util.Ref
import com.intellij.psi.PsiFile
import com.intellij.psi.codeStyle.CodeStyleManager
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
        val element = file.findElementAt(caretOffset.get() - 1)
        if(element?.prevSibling?.elementType == GDScriptTypes.ELSE) {
            val elseStatement = element!!.parent
            val ifStatement = elseStatement.parent as GDScriptIfStatement
            val codeStyleManager = CodeStyleManager.getInstance(file.project)
            
            val elseLineNumber = editor.document.getLineNumber(elseStatement.startOffset)
            val elseLineOffset = editor.document.getLineStartOffset(elseLineNumber)
            val elseIndent = elseStatement.startOffset - elseLineOffset
            
            val ifLineNumber = editor.document.getLineNumber(ifStatement.startOffset)
            val ifLineOffset = editor.document.getLineStartOffset(ifLineNumber)
            val ifIndent = ifStatement.startOffset - ifLineOffset
            
            if(elseIndent > ifIndent) {
                val numToDelete = elseIndent - ifIndent
                val deleteOffset = elseStatement.textOffset - numToDelete
                editor.document.deleteString(deleteOffset, deleteOffset + numToDelete)
                editor.caretModel.moveToOffset(caretOffset.get() - numToDelete)
                caretOffset.set(caretOffset.get() - numToDelete)
            }
        }
        return super.preprocessEnter(file, editor, caretOffset, caretAdvance, dataContext, originalHandler)
    }
}