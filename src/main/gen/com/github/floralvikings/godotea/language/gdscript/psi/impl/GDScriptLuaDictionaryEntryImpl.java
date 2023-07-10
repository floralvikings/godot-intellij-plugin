// This is a generated file. Not intended for manual editing.
package com.github.floralvikings.godotea.language.gdscript.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.floralvikings.godotea.language.gdscript.psi.*;

public class GDScriptLuaDictionaryEntryImpl extends ASTWrapperPsiElement implements GDScriptLuaDictionaryEntry {

  public GDScriptLuaDictionaryEntryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GDScriptVisitor visitor) {
    visitor.visitLuaDictionaryEntry(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GDScriptVisitor) accept((GDScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GDScriptExpression getExpression() {
    return findChildByClass(GDScriptExpression.class);
  }

  @Override
  @Nullable
  public GDScriptKey getKey() {
    return findChildByClass(GDScriptKey.class);
  }

}
