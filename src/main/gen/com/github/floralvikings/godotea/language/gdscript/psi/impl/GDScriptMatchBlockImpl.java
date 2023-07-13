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

public class GDScriptMatchBlockImpl extends ASTWrapperPsiElement implements GDScriptMatchBlock {

  public GDScriptMatchBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GDScriptVisitor visitor) {
    visitor.visitMatchBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GDScriptVisitor) accept((GDScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GDScriptAssertStatement> getAssertStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptAssertStatement.class);
  }

  @Override
  @NotNull
  public List<GDScriptAssignStatement> getAssignStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptAssignStatement.class);
  }

  @Override
  @NotNull
  public List<GDScriptAwaitStatement> getAwaitStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptAwaitStatement.class);
  }

  @Override
  @NotNull
  public List<GDScriptBlock> getBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptBlock.class);
  }

  @Override
  @NotNull
  public List<GDScriptBreakStatement> getBreakStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptBreakStatement.class);
  }

  @Override
  @NotNull
  public List<GDScriptConstStatement> getConstStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptConstStatement.class);
  }

  @Override
  @NotNull
  public List<GDScriptContinueStatement> getContinueStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptContinueStatement.class);
  }

  @Override
  @NotNull
  public List<GDScriptExpressionStatement> getExpressionStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptExpressionStatement.class);
  }

  @Override
  @NotNull
  public List<GDScriptForStatement> getForStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptForStatement.class);
  }

  @Override
  @NotNull
  public List<GDScriptIfStatement> getIfStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptIfStatement.class);
  }

  @Override
  @NotNull
  public List<GDScriptMatchStatement> getMatchStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptMatchStatement.class);
  }

  @Override
  @NotNull
  public List<GDScriptPatternList> getPatternListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptPatternList.class);
  }

  @Override
  @NotNull
  public List<GDScriptReturnStatement> getReturnStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptReturnStatement.class);
  }

  @Override
  @NotNull
  public List<GDScriptVarStatement> getVarStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptVarStatement.class);
  }

  @Override
  @NotNull
  public List<GDScriptWhileStatement> getWhileStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptWhileStatement.class);
  }

}
