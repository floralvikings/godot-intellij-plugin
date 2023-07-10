// This is a generated file. Not intended for manual editing.
package com.github.floralvikings.godotea.language.gdscript.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GDScriptPattern extends PsiElement {

  @Nullable
  GDScriptArrayPattern getArrayPattern();

  @Nullable
  GDScriptBindingPattern getBindingPattern();

  @Nullable
  GDScriptDictPattern getDictPattern();

  @Nullable
  GDScriptString getString();

  @Nullable
  PsiElement getBinaryNumber();

  @Nullable
  PsiElement getHexadecimalNumber();

  @Nullable
  PsiElement getIdentifier();

  @Nullable
  PsiElement getRealNumber();

}
