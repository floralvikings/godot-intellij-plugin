// This is a generated file. Not intended for manual editing.
package com.github.floralvikings.godotintellijplugin.language.gdscript.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GDScriptAssignStatement extends PsiElement {

  @NotNull
  GDScriptAssignOperator getAssignOperator();

  @NotNull
  List<GDScriptExpression> getExpressionList();

}
