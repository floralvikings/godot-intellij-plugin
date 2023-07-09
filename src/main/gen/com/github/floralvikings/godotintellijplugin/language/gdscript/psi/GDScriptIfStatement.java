// This is a generated file. Not intended for manual editing.
package com.github.floralvikings.godotintellijplugin.language.gdscript.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GDScriptIfStatement extends PsiElement {

  @Nullable
  GDScriptAssignStatement getAssignStatement();

  @Nullable
  GDScriptBlock getBlock();

  @NotNull
  GDScriptExpression getExpression();

  @Nullable
  GDScriptExpressionStatement getExpressionStatement();

  @Nullable
  GDScriptIfStatement getIfStatement();

  @Nullable
  GDScriptReturnStatement getReturnStatement();

  @Nullable
  GDScriptVarStatement getVarStatement();

}
