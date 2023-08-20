package com.github.floralvikings.godotea.language.gdscript.formatting.blocks

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes
import com.github.floralvikings.godotea.language.gdscript.util.prevNonWhitespaceSibling
import com.intellij.psi.util.elementType

fun GDScriptBlock.endsWithDoubleNewline(): Boolean {
  val prevNode = node
  val prevLastChildNode = prevNode.lastChildNode?.psi ?: return false
  val prevLastChildType = prevLastChildNode.elementType
  val prevSecondToLastChildType = prevLastChildNode.prevNonWhitespaceSibling.elementType
  return prevLastChildType == GDScriptTypes.LINE_BREAK && prevSecondToLastChildType == GDScriptTypes.LINE_BREAK
}
