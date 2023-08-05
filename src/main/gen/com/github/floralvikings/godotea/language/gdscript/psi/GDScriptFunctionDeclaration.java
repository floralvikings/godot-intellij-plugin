// This is a generated file. Not intended for manual editing.
package com.github.floralvikings.godotea.language.gdscript.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GDScriptFunctionDeclaration extends GDScriptNamedElement {

  @Nullable
  GDScriptBlock getBlock();

  @NotNull
  GDScriptFunctionDeclarationParameters getFunctionDeclarationParameters();

  @NotNull
  GDScriptFunctionName getFunctionName();

  @Nullable
  GDScriptFunctionReturnType getFunctionReturnType();

  @Nullable
  String getName();

  @NotNull
  PsiElement setName(@NotNull String newName);

  @NotNull
  PsiElement getNameIdentifier();

  int getTextOffset();

}
