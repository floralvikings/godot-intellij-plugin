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

public class GDScriptAssertStatementImpl extends ASTWrapperPsiElement implements GDScriptAssertStatement {

  public GDScriptAssertStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GDScriptVisitor visitor) {
    visitor.visitAssertStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GDScriptVisitor) accept((GDScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public GDScriptExpression getExpression() {
    return findNotNullChildByClass(GDScriptExpression.class);
  }

  @Override
  @Nullable
  public GDScriptString getString() {
    return findChildByClass(GDScriptString.class);
  }

}
