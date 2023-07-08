// This is a generated file. Not intended for manual editing.
package com.github.floralvikings.godotintellijplugin.language.gdscript.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.floralvikings.godotintellijplugin.language.gdscript.psi.GDScriptTypes.*;
import com.github.floralvikings.godotintellijplugin.language.gdscript.psi.*;

public class GDScriptDictionaryExpressionImpl extends GDScriptExpressionImpl implements GDScriptDictionaryExpression {

  public GDScriptDictionaryExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull GDScriptVisitor visitor) {
    visitor.visitDictionaryExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GDScriptVisitor) accept((GDScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GDScriptDictionaryEntry> getDictionaryEntryList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GDScriptDictionaryEntry.class);
  }

}
