// This is a generated file. Not intended for manual editing.
package com.github.floralvikings.godotea.language.gdscript.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.floralvikings.godotea.language.gdscript.psi.*;

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
  public GDScriptAssertStatement getAssertStatement() {
    return findChildByClass(GDScriptAssertStatement.class);
  }

  @Override
  @Nullable
  public GDScriptAssignStatement getAssignStatement() {
    return findChildByClass(GDScriptAssignStatement.class);
  }

  @Override
  @Nullable
  public GDScriptAwaitStatement getAwaitStatement() {
    return findChildByClass(GDScriptAwaitStatement.class);
  }

  @Override
  @Nullable
  public GDScriptBlock getBlock() {
    return findChildByClass(GDScriptBlock.class);
  }

  @Override
  @Nullable
  public GDScriptBreakStatement getBreakStatement() {
    return findChildByClass(GDScriptBreakStatement.class);
  }

  @Override
  @Nullable
  public GDScriptConstStatement getConstStatement() {
    return findChildByClass(GDScriptConstStatement.class);
  }

  @Override
  @Nullable
  public GDScriptContinueStatement getContinueStatement() {
    return findChildByClass(GDScriptContinueStatement.class);
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
