// This is a generated file. Not intended for manual editing.
package com.github.floralvikings.godotintellijplugin.language.gdscript.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GDScriptMatchBlock extends PsiElement {

  @NotNull
  List<GDScriptAssertStatement> getAssertStatementList();

  @NotNull
  List<GDScriptAssignStatement> getAssignStatementList();

  @NotNull
  List<GDScriptAwaitStatement> getAwaitStatementList();

  @NotNull
  List<GDScriptBlock> getBlockList();

  @NotNull
  List<GDScriptBreakStatement> getBreakStatementList();

  @NotNull
  List<GDScriptConstStatement> getConstStatementList();

  @NotNull
  List<GDScriptContinueStatement> getContinueStatementList();

  @NotNull
  List<GDScriptExpressionStatement> getExpressionStatementList();

  @NotNull
  List<GDScriptForStatement> getForStatementList();

  @NotNull
  List<GDScriptIfStatement> getIfStatementList();

  @NotNull
  List<GDScriptMatchStatement> getMatchStatementList();

  @NotNull
  List<GDScriptPatternList> getPatternListList();

  @NotNull
  List<GDScriptReturnStatement> getReturnStatementList();

  @NotNull
  List<GDScriptVarStatement> getVarStatementList();

  @NotNull
  List<GDScriptWhileStatement> getWhileStatementList();

}
