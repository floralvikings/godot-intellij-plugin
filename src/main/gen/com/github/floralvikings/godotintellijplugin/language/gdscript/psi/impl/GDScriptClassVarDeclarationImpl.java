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

public class GDScriptClassVarDeclarationImpl extends ASTWrapperPsiElement implements GDScriptClassVarDeclaration {

  public GDScriptClassVarDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GDScriptVisitor visitor) {
    visitor.visitClassVarDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GDScriptVisitor) accept((GDScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GDScriptBlockGet> getBlockGetList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptBlockGet.class);
  }

  @Override
  @NotNull
  public List<GDScriptBlockSet> getBlockSetList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptBlockSet.class);
  }

  @Override
  @Nullable
  public GDScriptExpression getExpression() {
    return findChildByClass(GDScriptExpression.class);
  }

  @Override
  @NotNull
  public GDScriptId getId() {
    return findNotNullChildByClass(GDScriptId.class);
  }

  @Override
  @Nullable
  public GDScriptSetGet getSetGet() {
    return findChildByClass(GDScriptSetGet.class);
  }

  @Override
  @Nullable
  public GDScriptType getType() {
    return findChildByClass(GDScriptType.class);
  }

  @Override
  @NotNull
  public List<GDScriptVarExport> getVarExportList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptVarExport.class);
  }

}
