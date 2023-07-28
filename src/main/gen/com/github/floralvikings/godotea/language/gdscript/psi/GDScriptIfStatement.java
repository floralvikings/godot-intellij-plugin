// This is a generated file. Not intended for manual editing.
package com.github.floralvikings.godotea.language.gdscript.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GDScriptIfStatement extends PsiElement {

  @Nullable
  GDScriptBlock getBlock();

  @NotNull
  List<GDScriptElifStatement> getElifStatementList();

  @Nullable
  GDScriptElseStatement getElseStatement();

  @NotNull
  GDScriptExpression getExpression();

  @Nullable
  GDScriptScriptStatement getScriptStatement();

}
