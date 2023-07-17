// This is a generated file. Not intended for manual editing.
package com.github.floralvikings.godotea.language.gdscript.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GDScriptFunctionParameter extends GDScriptNamedElement {

  @Nullable
  GDScriptExpression getExpression();

  @NotNull
  GDScriptParameterName getParameterName();

  @Nullable
  GDScriptType getType();

  @Nullable
  String getName();

  @NotNull
  PsiElement setName(@NotNull String newName);

  @NotNull
  PsiElement getNameIdentifier();

  int getTextOffset();

}
