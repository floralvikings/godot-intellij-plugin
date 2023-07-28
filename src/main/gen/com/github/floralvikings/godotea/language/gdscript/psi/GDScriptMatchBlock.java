// This is a generated file. Not intended for manual editing.
package com.github.floralvikings.godotea.language.gdscript.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GDScriptMatchBlock extends PsiElement {

  @NotNull
  List<GDScriptBlock> getBlockList();

  @NotNull
  List<GDScriptPatternList> getPatternListList();

  @NotNull
  List<GDScriptScriptStatement> getScriptStatementList();

}
