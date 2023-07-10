// This is a generated file. Not intended for manual editing.
package com.github.floralvikings.godotea.language.gdscript.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GDScriptElifStatement extends PsiElement {

  @Nullable
  GDScriptAssertStatement getAssertStatement();

  @Nullable
  GDScriptAssignStatement getAssignStatement();

  @Nullable
  GDScriptAwaitStatement getAwaitStatement();

  @Nullable
  GDScriptBlock getBlock();

  @Nullable
  GDScriptBreakStatement getBreakStatement();

  @Nullable
  GDScriptConstStatement getConstStatement();

  @Nullable
  GDScriptContinueStatement getContinueStatement();

  @NotNull
  GDScriptExpression getExpression();

  @Nullable
  GDScriptExpressionStatement getExpressionStatement();

  @Nullable
  GDScriptForStatement getForStatement();

  @Nullable
  GDScriptIfStatement getIfStatement();

  @Nullable
  GDScriptMatchStatement getMatchStatement();

  @Nullable
  GDScriptReturnStatement getReturnStatement();

  @Nullable
  GDScriptVarStatement getVarStatement();

  @Nullable
  GDScriptWhileStatement getWhileStatement();

}
