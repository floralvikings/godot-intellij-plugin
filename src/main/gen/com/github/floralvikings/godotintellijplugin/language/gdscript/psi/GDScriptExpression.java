// This is a generated file. Not intended for manual editing.
package com.github.floralvikings.godotintellijplugin.language.gdscript.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GDScriptExpression extends PsiElement {

  @NotNull
  List<GDScriptExpression> getExpressionList();

  @NotNull
  List<GDScriptId> getIdList();

  @NotNull
  List<GDScriptString> getStringList();

}
