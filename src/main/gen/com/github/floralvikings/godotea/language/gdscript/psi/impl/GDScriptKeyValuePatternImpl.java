// This is a generated file. Not intended for manual editing.
package com.github.floralvikings.godotea.language.gdscript.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.floralvikings.godotea.language.gdscript.psi.*;

public class GDScriptKeyValuePatternImpl extends ASTWrapperPsiElement implements GDScriptKeyValuePattern {

  public GDScriptKeyValuePatternImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GDScriptVisitor visitor) {
    visitor.visitKeyValuePattern(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GDScriptVisitor) accept((GDScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GDScriptPattern getPattern() {
    return findChildByClass(GDScriptPattern.class);
  }

  @Override
  @NotNull
  public GDScriptString getString() {
    return findNotNullChildByClass(GDScriptString.class);
  }

}
