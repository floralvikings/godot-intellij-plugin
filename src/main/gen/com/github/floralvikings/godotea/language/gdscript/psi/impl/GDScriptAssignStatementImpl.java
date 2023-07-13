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
import com.github.floralvikings.godotea.language.gdscript.psi.util.GDScriptImplPsiUtil;

public class GDScriptAssignStatementImpl extends ASTWrapperPsiElement implements GDScriptAssignStatement {

  public GDScriptAssignStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GDScriptVisitor visitor) {
    visitor.visitAssignStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GDScriptVisitor) accept((GDScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public GDScriptAssignOperator getAssignOperator() {
    return findNotNullChildByClass(GDScriptAssignOperator.class);
  }

  @Override
  @NotNull
  public List<GDScriptExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptExpression.class);
  }

}
