// This is a generated file. Not intended for manual editing.
package com.github.floralvikings.godotea.language.gdscript.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GDScriptClassVarDeclaration extends GDScriptNamedElement {

  @NotNull
  List<GDScriptBlockGet> getBlockGetList();

  @NotNull
  List<GDScriptBlockSet> getBlockSetList();

  @NotNull
  GDScriptClassVarName getClassVarName();

  @Nullable
  GDScriptExpression getExpression();

  @Nullable
  GDScriptSetGet getSetGet();

  @Nullable
  GDScriptType getType();

  @NotNull
  List<GDScriptVarExport> getVarExportList();

  @Nullable
  String getName();

  @NotNull
  PsiElement setName(@NotNull String newName);

  @NotNull
  PsiElement getNameIdentifier();

  @NotNull
  String getQualifiedName();

  int getTextOffset();

}
