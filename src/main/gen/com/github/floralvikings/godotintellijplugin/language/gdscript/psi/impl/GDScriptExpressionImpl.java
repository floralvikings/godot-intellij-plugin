// This is a generated file. Not intended for manual editing.
package com.github.floralvikings.godotintellijplugin.language.gdscript.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.floralvikings.godotintellijplugin.language.gdscript.psi.GDScriptTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.floralvikings.godotintellijplugin.language.gdscript.psi.*;

public class GDScriptExpressionImpl extends ASTWrapperPsiElement implements GDScriptExpression {

  public GDScriptExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GDScriptVisitor visitor) {
    visitor.visitExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GDScriptVisitor) accept((GDScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GDScriptExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptExpression.class);
  }

  @Override
  @NotNull
  public List<GDScriptId> getIdList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptId.class);
  }

  @Override
  @NotNull
  public List<GDScriptString> getStringList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptString.class);
  }

}
