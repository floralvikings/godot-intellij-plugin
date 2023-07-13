// This is a generated file. Not intended for manual editing.
package com.github.floralvikings.godotea.language.gdscript.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes.*;
import com.github.floralvikings.godotea.language.gdscript.psi.*;
import com.github.floralvikings.godotea.language.gdscript.psi.util.GDScriptImplPsiUtil;

public class GDScriptLuaDictionaryExpressionImpl extends GDScriptExpressionImpl implements GDScriptLuaDictionaryExpression {

  public GDScriptLuaDictionaryExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull GDScriptVisitor visitor) {
    visitor.visitLuaDictionaryExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GDScriptVisitor) accept((GDScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GDScriptLuaDictionaryEntry> getLuaDictionaryEntryList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptLuaDictionaryEntry.class);
  }

}
