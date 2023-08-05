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

public class GDScriptFunctionDeclarationImpl extends GDScriptNamedElementImpl implements GDScriptFunctionDeclaration {

  public GDScriptFunctionDeclarationImpl(ASTNode node) {
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
  @Nullable
  public GDScriptBlock getBlock() {
    return findChildByClass(GDScriptBlock.class);
  }

  @Override
  @NotNull
  public GDScriptFunctionDeclarationParameters getFunctionDeclarationParameters() {
    return findNotNullChildByClass(GDScriptFunctionDeclarationParameters.class);
  }

  @Override
  @NotNull
  public GDScriptFunctionName getFunctionName() {
    return findNotNullChildByClass(GDScriptFunctionName.class);
  }

  @Override
  @Nullable
  public GDScriptFunctionReturnType getFunctionReturnType() {
    return findChildByClass(GDScriptFunctionReturnType.class);
  }

  @Override
  @Nullable
  public String getName() {
    return GDScriptImplPsiUtil.getName(this);
  }

  @Override
  @NotNull
  public PsiElement setName(@NotNull String newName) {
    return GDScriptImplPsiUtil.setName(this, newName);
  }

  @Override
  @NotNull
  public PsiElement getNameIdentifier() {
    return GDScriptImplPsiUtil.getNameIdentifier(this);
  }

  @Override
  public int getTextOffset() {
    return GDScriptImplPsiUtil.getTextOffset(this);
  }

}
