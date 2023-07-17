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

public class GDScriptFunctionParameterImpl extends GDScriptNamedElementImpl implements GDScriptFunctionParameter {

  public GDScriptFunctionParameterImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GDScriptVisitor visitor) {
    visitor.visitFunctionParameter(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GDScriptVisitor) accept((GDScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GDScriptExpression getExpression() {
    return findChildByClass(GDScriptExpression.class);
  }

  @Override
  @NotNull
  public GDScriptParameterName getParameterName() {
    return findNotNullChildByClass(GDScriptParameterName.class);
  }

  @Override
  @Nullable
  public GDScriptType getType() {
    return findChildByClass(GDScriptType.class);
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
