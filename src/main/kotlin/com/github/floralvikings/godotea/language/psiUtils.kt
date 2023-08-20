package com.github.floralvikings.godotea.language

import com.intellij.openapi.util.TextRange
import com.intellij.openapi.util.text.StringUtil
import com.intellij.psi.PsiDocumentManager
import com.intellij.psi.PsiElement
import com.intellij.psi.util.siblings
import com.intellij.refactoring.suggested.endOffset
import com.intellij.refactoring.suggested.startOffset

fun PsiElement.isMultiline() = getLineCount() > 1

fun PsiElement.getLineCount(): Int {
    val spaceRange = textRange ?: TextRange.EMPTY_RANGE
    return getLineCountByDocument(spaceRange.startOffset, spaceRange.endOffset)
        ?: (StringUtil.getLineBreakCount(text ?: error("Cannot count number of lines")) + 1)
}

fun PsiElement.getLineCountByDocument(startOffset: Int, endOffset: Int): Int? {
    val doc = containingFile?.let { PsiDocumentManager.getInstance(project).getDocument(it) } ?: return null
    if (endOffset > doc.textLength || startOffset >= endOffset) return null

    val startLine = doc.getLineNumber(startOffset)
    val endLine = doc.getLineNumber(endOffset)

    return endLine - startLine + 1
}

fun PsiElement.containsLineBreakInChild(globalStartOffset: Int, globalEndOffset: Int): Boolean =
    getLineCountByDocument(globalStartOffset, globalEndOffset)?.let { it > 1 }
        ?: firstChild.siblings(forward = true, withSelf = true)
            .dropWhile { it.startOffset < globalStartOffset }
            .takeWhile { it.endOffset <= globalEndOffset }
            .any { it.textContains('\n') || it.textContains('\r') }
