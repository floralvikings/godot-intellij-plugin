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

public class GDScriptPatternListImpl extends ASTWrapperPsiElement implements GDScriptPatternList {

  public GDScriptPatternListImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GDScriptVisitor visitor) {
    visitor.visitPatternList(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GDScriptVisitor) accept((GDScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GDScriptPattern> getPatternList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptPattern.class);
  }

}
