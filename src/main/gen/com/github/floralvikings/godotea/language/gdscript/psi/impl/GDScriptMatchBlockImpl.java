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
  public List<GDScriptBlock> getBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptBlock.class);
  }

  @Override
  @NotNull
  public List<GDScriptPatternList> getPatternListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptPatternList.class);
  }

  @Override
  @NotNull
  public List<GDScriptScriptStatement> getScriptStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptScriptStatement.class);
  }

}
