package com.github.floralvikings.godotea.language.gdscript.formatting

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes
import com.intellij.codeInsight.editorActions.enter.EnterHandlerDelegate
import com.intellij.codeInsight.editorActions.enter.EnterHandlerDelegateAdapter
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
            val elseIndent = CodeStyleManager.getInstance(file.project)
                .getLineIndent(file, elseStatement.textOffset) ?: ""
            editor.document.deleteString(elseStatement.startOffset - elseIndent.length, elseStatement.startOffset)
            editor.caretModel.moveToOffset(caretOffset.get() - elseIndent.length)
            caretOffset.set(caretOffset.get() - elseIndent.length)
        }
        return super.preprocessEnter(file, editor, caretOffset, caretAdvance, dataContext, originalHandler)
    }
}