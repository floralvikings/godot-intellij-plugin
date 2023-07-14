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

public class GDScriptElifStatementImpl extends ASTWrapperPsiElement implements GDScriptElifStatement {

  public GDScriptElifStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GDScriptVisitor visitor) {
    visitor.visitElifStatement(this);
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
