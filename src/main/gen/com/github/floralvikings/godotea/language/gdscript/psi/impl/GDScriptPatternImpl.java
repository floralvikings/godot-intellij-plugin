// This is a generated file. Not intended for manual editing.
package com.github.floralvikings.godotea.language.gdscript.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.floralvikings.godotea.language.gdscript.psi.*;

public class GDScriptPatternImpl extends ASTWrapperPsiElement implements GDScriptPattern {

  public GDScriptPatternImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GDScriptVisitor visitor) {
    visitor.visitPattern(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GDScriptVisitor) accept((GDScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GDScriptArrayPattern getArrayPattern() {
    return findChildByClass(GDScriptArrayPattern.class);
  }

  @Override
  @Nullable
  public GDScriptBindingPattern getBindingPattern() {
    return findChildByClass(GDScriptBindingPattern.class);
  }

  @Override
  @Nullable
  public GDScriptDictPattern getDictPattern() {
    return findChildByClass(GDScriptDictPattern.class);
  }

  @Override
  @Nullable
  public GDScriptString getString() {
    return findChildByClass(GDScriptString.class);
  }

  @Override
  @Nullable
  public PsiElement getBinaryNumber() {
    return findChildByType(BINARY_NUMBER);
  }

  @Override
  @Nullable
  public PsiElement getHexadecimalNumber() {
    return findChildByType(HEXADECIMAL_NUMBER);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

  @Override
  @Nullable
  public PsiElement getRealNumber() {
    return findChildByType(REAL_NUMBER);
  }

}
