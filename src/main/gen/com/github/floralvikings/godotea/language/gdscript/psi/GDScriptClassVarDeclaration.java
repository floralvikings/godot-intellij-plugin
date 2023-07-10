// This is a generated file. Not intended for manual editing.
package com.github.floralvikings.godotea.language.gdscript.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GDScriptClassVarDeclaration extends PsiElement {

  @NotNull
  List<GDScriptBlockGet> getBlockGetList();

  @NotNull
  List<GDScriptBlockSet> getBlockSetList();

  @Nullable
  GDScriptExpression getExpression();

  @NotNull
  GDScriptId getId();

  @Nullable
  GDScriptSetGet getSetGet();

  @Nullable
  GDScriptType getType();

  @NotNull
  List<GDScriptVarExport> getVarExportList();

}
