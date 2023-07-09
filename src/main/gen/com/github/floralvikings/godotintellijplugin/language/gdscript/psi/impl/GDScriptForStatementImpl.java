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

public class GDScriptForStatementImpl extends ASTWrapperPsiElement implements GDScriptForStatement {

  public GDScriptForStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GDScriptVisitor visitor) {
    visitor.visitForStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GDScriptVisitor) accept((GDScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GDScriptAssignStatement getAssignStatement() {
    return findChildByClass(GDScriptAssignStatement.class);
  }

  @Override
  @Nullable
  public GDScriptBlock getBlock() {
    return findChildByClass(GDScriptBlock.class);
  }

  @Override
  @NotNull
  public GDScriptExpression getExpression() {
    return findNotNullChildByClass(GDScriptExpression.class);
  }

  @Override
  @Nullable
  public GDScriptExpressionStatement getExpressionStatement() {
    return findChildByClass(GDScriptExpressionStatement.class);
  }

  @Override
  @Nullable
  public GDScriptForStatement getForStatement() {
    return findChildByClass(GDScriptForStatement.class);
  }

  @Override
  @NotNull
  public GDScriptId getId() {
    return findNotNullChildByClass(GDScriptId.class);
  }

  @Override
  @Nullable
  public GDScriptIfStatement getIfStatement() {
    return findChildByClass(GDScriptIfStatement.class);
  }

  @Override
  @Nullable
  public GDScriptMatchStatement getMatchStatement() {
    return findChildByClass(GDScriptMatchStatement.class);
  }

  @Override
  @Nullable
  public GDScriptReturnStatement getReturnStatement() {
    return findChildByClass(GDScriptReturnStatement.class);
  }

  @Override
  @Nullable
  public GDScriptVarStatement getVarStatement() {
    return findChildByClass(GDScriptVarStatement.class);
  }

  @Override
  @Nullable
  public GDScriptWhileStatement getWhileStatement() {
    return findChildByClass(GDScriptWhileStatement.class);
  }

}
