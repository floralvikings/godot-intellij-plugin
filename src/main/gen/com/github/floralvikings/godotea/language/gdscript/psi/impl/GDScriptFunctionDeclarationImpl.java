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

public class GDScriptFunctionDeclarationImpl extends ASTWrapperPsiElement implements GDScriptFunctionDeclaration {

  public GDScriptFunctionDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GDScriptVisitor visitor) {
    visitor.visitFunctionDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GDScriptVisitor) accept((GDScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public GDScriptBlock getBlock() {
    return findNotNullChildByClass(GDScriptBlock.class);
  }

  @Override
  @NotNull
  public List<GDScriptFunctionParameter> getFunctionParameterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptFunctionParameter.class);
  }

  @Override
  @Nullable
  public GDScriptFunctionReturnType getFunctionReturnType() {
    return findChildByClass(GDScriptFunctionReturnType.class);
  }

  @Override
  @NotNull
  public GDScriptId getId() {
    return findNotNullChildByClass(GDScriptId.class);
  }

}
