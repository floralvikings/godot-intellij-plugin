// This is a generated file. Not intended for manual editing.
package com.github.floralvikings.godotintellijplugin.language.gdscript.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.floralvikings.godotintellijplugin.language.gdscript.psi.GDScriptTypes.*;
import static com.github.floralvikings.godotintellijplugin.language.gdscript.parser.GDScriptParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class GDScriptParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ARRAY_EXPRESSION, DICTIONARY_EXPRESSION, EXPRESSION, INVOCATION_EXPRESSION,
      LAMBDA_EXPRESSION, LUA_DICTIONARY_EXPRESSION),
  };

  /* ********************************************************** */
  // (VAR? expression) | DOT_DOT | UNDERSCORE
  public static boolean array_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_argument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_ARGUMENT, "<array argument>");
    r = array_argument_0(b, l + 1);
    if (!r) r = consumeToken(b, DOT_DOT);
    if (!r) r = consumeToken(b, UNDERSCORE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // VAR? expression
  private static boolean array_argument_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_argument_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = array_argument_0_0(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VAR?
  private static boolean array_argument_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_argument_0_0")) return false;
    consumeToken(b, VAR);
    return true;
  }

  /* ********************************************************** */
  // id? L_BRACKET LINE_BREAK* array_argument? LINE_BREAK* (COMMA LINE_BREAK* array_argument LINE_BREAK*)* COMMA? LINE_BREAK* R_BRACKET
  public static boolean array_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_EXPRESSION, "<array expression>");
    r = array_expression_0(b, l + 1);
    r = r && consumeToken(b, L_BRACKET);
    r = r && array_expression_2(b, l + 1);
    r = r && array_expression_3(b, l + 1);
    r = r && array_expression_4(b, l + 1);
    r = r && array_expression_5(b, l + 1);
    r = r && array_expression_6(b, l + 1);
    r = r && array_expression_7(b, l + 1);
    r = r && consumeToken(b, R_BRACKET);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // id?
  private static boolean array_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expression_0")) return false;
    id(b, l + 1);
    return true;
  }

  // LINE_BREAK*
  private static boolean array_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expression_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "array_expression_2", c)) break;
    }
    return true;
  }

  // array_argument?
  private static boolean array_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expression_3")) return false;
    array_argument(b, l + 1);
    return true;
  }

  // LINE_BREAK*
  private static boolean array_expression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expression_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "array_expression_4", c)) break;
    }
    return true;
  }

  // (COMMA LINE_BREAK* array_argument LINE_BREAK*)*
  private static boolean array_expression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expression_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!array_expression_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "array_expression_5", c)) break;
    }
    return true;
  }

  // COMMA LINE_BREAK* array_argument LINE_BREAK*
  private static boolean array_expression_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expression_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && array_expression_5_0_1(b, l + 1);
    r = r && array_argument(b, l + 1);
    r = r && array_expression_5_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean array_expression_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expression_5_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "array_expression_5_0_1", c)) break;
    }
    return true;
  }

  // LINE_BREAK*
  private static boolean array_expression_5_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expression_5_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "array_expression_5_0_3", c)) break;
    }
    return true;
  }

  // COMMA?
  private static boolean array_expression_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expression_6")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // LINE_BREAK*
  private static boolean array_expression_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expression_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "array_expression_7", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // id (L_BRACKET id R_BRACKET)
  static boolean array_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = id(b, l + 1);
    r = r && array_type_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // L_BRACKET id R_BRACKET
  private static boolean array_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_BRACKET);
    r = r && id(b, l + 1);
    r = r && consumeToken(b, R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EQUAL
  //     | PLUS_EQUAL
  //     | MINUS_EQUAL
  //     | STAR_EQUAL
  //     | SLASH_EQUAL
  //     | PERCENT_EQUAL
  //     | LESS_LESS_EQUAL
  //     | GREATER_GREATER_EQUAL
  //     | AMPERSAND_EQUAL
  //     | PIPE_EQUAL
  //     | CARET_EQUAL
  //     | INFER
  public static boolean assign_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGN_OPERATOR, "<assign operator>");
    r = consumeToken(b, EQUAL);
    if (!r) r = consumeToken(b, PLUS_EQUAL);
    if (!r) r = consumeToken(b, MINUS_EQUAL);
    if (!r) r = consumeToken(b, STAR_EQUAL);
    if (!r) r = consumeToken(b, SLASH_EQUAL);
    if (!r) r = consumeToken(b, PERCENT_EQUAL);
    if (!r) r = consumeToken(b, LESS_LESS_EQUAL);
    if (!r) r = consumeToken(b, GREATER_GREATER_EQUAL);
    if (!r) r = consumeToken(b, AMPERSAND_EQUAL);
    if (!r) r = consumeToken(b, PIPE_EQUAL);
    if (!r) r = consumeToken(b, CARET_EQUAL);
    if (!r) r = consumeToken(b, INFER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression assign_operator expression
  public static boolean assign_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGN_STATEMENT, "<assign statement>");
    r = expression(b, l + 1);
    r = r && assign_operator(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<indented <<listOf script_statement (end_of_statement (&INDNONE | &INDEQ) | &INDEQ)>>>>
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK, "<block>");
    r = indented(b, l + 1, block_0_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // end_of_statement (&INDNONE | &INDEQ) | &INDEQ
  private static boolean block_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block_0_0_1_0(b, l + 1);
    if (!r) r = block_0_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // end_of_statement (&INDNONE | &INDEQ)
  private static boolean block_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = end_of_statement(b, l + 1);
    r = r && block_0_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE | &INDEQ
  private static boolean block_0_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_0_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block_0_0_1_0_1_0(b, l + 1);
    if (!r) r = block_0_0_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE
  private static boolean block_0_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_0_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indNone(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // &INDEQ
  private static boolean block_0_0_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_0_0_1_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indEq(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // &INDEQ
  private static boolean block_0_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_0_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indEq(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<indented (GET COLON LINE_BREAK block)>>
  public static boolean block_get(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_get")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_GET, "<block get>");
    r = indented(b, l + 1, GDScriptParser::block_get_0_0);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // GET COLON LINE_BREAK block
  private static boolean block_get_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_get_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, GET, COLON, LINE_BREAK);
    r = r && block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<indented (SET parameters COLON LINE_BREAK block)>>
  public static boolean block_set(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_set")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_SET, "<block set>");
    r = indented(b, l + 1, GDScriptParser::block_set_0_0);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SET parameters COLON LINE_BREAK block
  private static boolean block_set_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_set_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SET);
    r = r && parameters(b, l + 1);
    r = r && consumeTokens(b, 0, COLON, LINE_BREAK);
    r = r && block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // L_PAREN LINE_BREAK* expression? LINE_BREAK* (COMMA LINE_BREAK* expression LINE_BREAK*)* R_PAREN
  static boolean call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call")) return false;
    if (!nextTokenIs(b, L_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_PAREN);
    r = r && call_1(b, l + 1);
    r = r && call_2(b, l + 1);
    r = r && call_3(b, l + 1);
    r = r && call_4(b, l + 1);
    r = r && consumeToken(b, R_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "call_1", c)) break;
    }
    return true;
  }

  // expression?
  private static boolean call_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_2")) return false;
    expression(b, l + 1);
    return true;
  }

  // LINE_BREAK*
  private static boolean call_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "call_3", c)) break;
    }
    return true;
  }

  // (COMMA LINE_BREAK* expression LINE_BREAK*)*
  private static boolean call_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!call_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "call_4", c)) break;
    }
    return true;
  }

  // COMMA LINE_BREAK* expression LINE_BREAK*
  private static boolean call_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && call_4_0_1(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && call_4_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean call_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_4_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "call_4_0_1", c)) break;
    }
    return true;
  }

  // LINE_BREAK*
  private static boolean call_4_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_4_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "call_4_0_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // CONST id [COLON type] EQUAL expression
  public static boolean class_const_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_const_declaration")) return false;
    if (!nextTokenIs(b, CONST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONST);
    r = r && id(b, l + 1);
    r = r && class_const_declaration_2(b, l + 1);
    r = r && consumeToken(b, EQUAL);
    r = r && expression(b, l + 1);
    exit_section_(b, m, CLASS_CONST_DECLARATION, r);
    return r;
  }

  // [COLON type]
  private static boolean class_const_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_const_declaration_2")) return false;
    class_const_declaration_2_0(b, l + 1);
    return true;
  }

  // COLON type
  private static boolean class_const_declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_const_declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // class_const_declaration end_of_statement
  static boolean class_const_declaration_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_const_declaration_statement")) return false;
    if (!nextTokenIs(b, CONST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_const_declaration(b, l + 1);
    r = r && end_of_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CLASS_NAME id end_of_statement
  public static boolean class_name_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_name_declaration")) return false;
    if (!nextTokenIs(b, CLASS_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLASS_NAME);
    r = r && id(b, l + 1);
    r = r && end_of_statement(b, l + 1);
    exit_section_(b, m, CLASS_NAME_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // var_export? LINE_BREAK* AT_ONREADY? LINE_BREAK* VAR id (
  //     (COLON(type(
  //         ((LINE_BREAK (block_get|block_set))+)
  //         | ([(EQUAL|INFER) expression])
  //     )))
  //     | (COLON set_get)
  //     | [(EQUAL | INFER) expression]
  // )
  public static boolean class_var_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_VAR_DECLARATION, "<class var declaration>");
    r = class_var_declaration_0(b, l + 1);
    r = r && class_var_declaration_1(b, l + 1);
    r = r && class_var_declaration_2(b, l + 1);
    r = r && class_var_declaration_3(b, l + 1);
    r = r && consumeToken(b, VAR);
    r = r && id(b, l + 1);
    r = r && class_var_declaration_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // var_export?
  private static boolean class_var_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_0")) return false;
    var_export(b, l + 1);
    return true;
  }

  // LINE_BREAK*
  private static boolean class_var_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "class_var_declaration_1", c)) break;
    }
    return true;
  }

  // AT_ONREADY?
  private static boolean class_var_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_2")) return false;
    consumeToken(b, AT_ONREADY);
    return true;
  }

  // LINE_BREAK*
  private static boolean class_var_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "class_var_declaration_3", c)) break;
    }
    return true;
  }

  // (COLON(type(
  //         ((LINE_BREAK (block_get|block_set))+)
  //         | ([(EQUAL|INFER) expression])
  //     )))
  //     | (COLON set_get)
  //     | [(EQUAL | INFER) expression]
  private static boolean class_var_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_var_declaration_6_0(b, l + 1);
    if (!r) r = class_var_declaration_6_1(b, l + 1);
    if (!r) r = class_var_declaration_6_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COLON(type(
  //         ((LINE_BREAK (block_get|block_set))+)
  //         | ([(EQUAL|INFER) expression])
  //     ))
  private static boolean class_var_declaration_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && class_var_declaration_6_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type(
  //         ((LINE_BREAK (block_get|block_set))+)
  //         | ([(EQUAL|INFER) expression])
  //     )
  private static boolean class_var_declaration_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_6_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && class_var_declaration_6_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((LINE_BREAK (block_get|block_set))+)
  //         | ([(EQUAL|INFER) expression])
  private static boolean class_var_declaration_6_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_6_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_var_declaration_6_0_1_1_0(b, l + 1);
    if (!r) r = class_var_declaration_6_0_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LINE_BREAK (block_get|block_set))+
  private static boolean class_var_declaration_6_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_6_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_var_declaration_6_0_1_1_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!class_var_declaration_6_0_1_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_var_declaration_6_0_1_1_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK (block_get|block_set)
  private static boolean class_var_declaration_6_0_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_6_0_1_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    r = r && class_var_declaration_6_0_1_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // block_get|block_set
  private static boolean class_var_declaration_6_0_1_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_6_0_1_1_0_0_1")) return false;
    boolean r;
    r = block_get(b, l + 1);
    if (!r) r = block_set(b, l + 1);
    return r;
  }

  // [(EQUAL|INFER) expression]
  private static boolean class_var_declaration_6_0_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_6_0_1_1_1")) return false;
    class_var_declaration_6_0_1_1_1_0(b, l + 1);
    return true;
  }

  // (EQUAL|INFER) expression
  private static boolean class_var_declaration_6_0_1_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_6_0_1_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_var_declaration_6_0_1_1_1_0_0(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EQUAL|INFER
  private static boolean class_var_declaration_6_0_1_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_6_0_1_1_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, EQUAL);
    if (!r) r = consumeToken(b, INFER);
    return r;
  }

  // COLON set_get
  private static boolean class_var_declaration_6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_6_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && set_get(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [(EQUAL | INFER) expression]
  private static boolean class_var_declaration_6_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_6_2")) return false;
    class_var_declaration_6_2_0(b, l + 1);
    return true;
  }

  // (EQUAL | INFER) expression
  private static boolean class_var_declaration_6_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_6_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_var_declaration_6_2_0_0(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EQUAL | INFER
  private static boolean class_var_declaration_6_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_6_2_0_0")) return false;
    boolean r;
    r = consumeToken(b, EQUAL);
    if (!r) r = consumeToken(b, INFER);
    return r;
  }

  /* ********************************************************** */
  // class_var_declaration end_of_statement
  static boolean class_var_declaration_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_statement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_var_declaration(b, l + 1);
    r = r && end_of_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (key LINE_BREAK* (COLON LINE_BREAK* VAR? expression)?) | DOT_DOT
  public static boolean dictionary_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_entry")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DICTIONARY_ENTRY, "<dictionary entry>");
    r = dictionary_entry_0(b, l + 1);
    if (!r) r = consumeToken(b, DOT_DOT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // key LINE_BREAK* (COLON LINE_BREAK* VAR? expression)?
  private static boolean dictionary_entry_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_entry_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = key(b, l + 1);
    r = r && dictionary_entry_0_1(b, l + 1);
    r = r && dictionary_entry_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean dictionary_entry_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_entry_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "dictionary_entry_0_1", c)) break;
    }
    return true;
  }

  // (COLON LINE_BREAK* VAR? expression)?
  private static boolean dictionary_entry_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_entry_0_2")) return false;
    dictionary_entry_0_2_0(b, l + 1);
    return true;
  }

  // COLON LINE_BREAK* VAR? expression
  private static boolean dictionary_entry_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_entry_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && dictionary_entry_0_2_0_1(b, l + 1);
    r = r && dictionary_entry_0_2_0_2(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean dictionary_entry_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_entry_0_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "dictionary_entry_0_2_0_1", c)) break;
    }
    return true;
  }

  // VAR?
  private static boolean dictionary_entry_0_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_entry_0_2_0_2")) return false;
    consumeToken(b, VAR);
    return true;
  }

  /* ********************************************************** */
  // L_BRACE LINE_BREAK* dictionary_entry? LINE_BREAK* (COMMA LINE_BREAK* dictionary_entry LINE_BREAK*)* COMMA? LINE_BREAK* R_BRACE
  public static boolean dictionary_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_expression")) return false;
    if (!nextTokenIs(b, L_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_BRACE);
    r = r && dictionary_expression_1(b, l + 1);
    r = r && dictionary_expression_2(b, l + 1);
    r = r && dictionary_expression_3(b, l + 1);
    r = r && dictionary_expression_4(b, l + 1);
    r = r && dictionary_expression_5(b, l + 1);
    r = r && dictionary_expression_6(b, l + 1);
    r = r && consumeToken(b, R_BRACE);
    exit_section_(b, m, DICTIONARY_EXPRESSION, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean dictionary_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "dictionary_expression_1", c)) break;
    }
    return true;
  }

  // dictionary_entry?
  private static boolean dictionary_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_expression_2")) return false;
    dictionary_entry(b, l + 1);
    return true;
  }

  // LINE_BREAK*
  private static boolean dictionary_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_expression_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "dictionary_expression_3", c)) break;
    }
    return true;
  }

  // (COMMA LINE_BREAK* dictionary_entry LINE_BREAK*)*
  private static boolean dictionary_expression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_expression_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dictionary_expression_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dictionary_expression_4", c)) break;
    }
    return true;
  }

  // COMMA LINE_BREAK* dictionary_entry LINE_BREAK*
  private static boolean dictionary_expression_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_expression_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && dictionary_expression_4_0_1(b, l + 1);
    r = r && dictionary_entry(b, l + 1);
    r = r && dictionary_expression_4_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean dictionary_expression_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_expression_4_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "dictionary_expression_4_0_1", c)) break;
    }
    return true;
  }

  // LINE_BREAK*
  private static boolean dictionary_expression_4_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_expression_4_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "dictionary_expression_4_0_3", c)) break;
    }
    return true;
  }

  // COMMA?
  private static boolean dictionary_expression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_expression_5")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // LINE_BREAK*
  private static boolean dictionary_expression_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_expression_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "dictionary_expression_6", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LINE_BREAK |  <<eof>> | SEMICOLON+
  static boolean end_of_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "end_of_statement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    if (!r) r = eof(b, l + 1);
    if (!r) r = end_of_statement_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SEMICOLON+
  private static boolean end_of_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "end_of_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, SEMICOLON)) break;
      if (!empty_element_parsed_guard_(b, "end_of_statement_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AT_EXPORT
  //     | AT_EXPORT_ENUM
  //     | AT_EXPORT_FILE
  //     | AT_EXPORT_DIR
  //     | AT_EXPORT_GLOBAL_FILE
  //     | AT_EXPORT_GLOBAL_DIR
  //     | AT_EXPORT_MULTILINE
  //     | AT_EXPORT_PLACEHOLDER
  //     | AT_EXPORT_RANGE
  //     | AT_EXPORT_EXP_EASING
  //     | AT_EXPORT_COLOR_NO_ALPHA
  //     | AT_EXPORT_NODE_PATH
  //     | AT_EXPORT_FLAGS
  //     | AT_EXPORT_FLAGS_2D_RENDER
  //     | AT_EXPORT_FLAGS_2D_PHYSICS
  //     | AT_EXPORT_FLAGS_2D_NAVIGATION
  //     | AT_EXPORT_FLAGS_3D_RENDER
  //     | AT_EXPORT_FLAGS_3D_PHYSICS
  //     | AT_EXPORT_FLAGS_3D_NAVIGATION
  static boolean export_annotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export_annotation")) return false;
    boolean r;
    r = consumeToken(b, AT_EXPORT);
    if (!r) r = consumeToken(b, AT_EXPORT_ENUM);
    if (!r) r = consumeToken(b, AT_EXPORT_FILE);
    if (!r) r = consumeToken(b, AT_EXPORT_DIR);
    if (!r) r = consumeToken(b, AT_EXPORT_GLOBAL_FILE);
    if (!r) r = consumeToken(b, AT_EXPORT_GLOBAL_DIR);
    if (!r) r = consumeToken(b, AT_EXPORT_MULTILINE);
    if (!r) r = consumeToken(b, AT_EXPORT_PLACEHOLDER);
    if (!r) r = consumeToken(b, AT_EXPORT_RANGE);
    if (!r) r = consumeToken(b, AT_EXPORT_EXP_EASING);
    if (!r) r = consumeToken(b, AT_EXPORT_COLOR_NO_ALPHA);
    if (!r) r = consumeToken(b, AT_EXPORT_NODE_PATH);
    if (!r) r = consumeToken(b, AT_EXPORT_FLAGS);
    if (!r) r = consumeToken(b, AT_EXPORT_FLAGS_2D_RENDER);
    if (!r) r = consumeToken(b, AT_EXPORT_FLAGS_2D_PHYSICS);
    if (!r) r = consumeToken(b, AT_EXPORT_FLAGS_2D_NAVIGATION);
    if (!r) r = consumeToken(b, AT_EXPORT_FLAGS_3D_RENDER);
    if (!r) r = consumeToken(b, AT_EXPORT_FLAGS_3D_PHYSICS);
    if (!r) r = consumeToken(b, AT_EXPORT_FLAGS_3D_NAVIGATION);
    return r;
  }

  /* ********************************************************** */
  // (operand | operator)+
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION, "<expression>");
    r = expression_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!expression_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // operand | operator
  private static boolean expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_0")) return false;
    boolean r;
    r = operand(b, l + 1);
    if (!r) r = operator(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // expression
  public static boolean expression_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_STATEMENT, "<expression statement>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EXTENDS nested_type end_of_statement
  public static boolean extends_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extends_declaration")) return false;
    if (!nextTokenIs(b, EXTENDS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTENDS);
    r = r && nested_type(b, l + 1);
    r = r && end_of_statement(b, l + 1);
    exit_section_(b, m, EXTENDS_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER | INT | FLOAT | BOOL | VOID | NODE_PATH
  public static boolean id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ID, "<id>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, BOOL);
    if (!r) r = consumeToken(b, VOID);
    if (!r) r = consumeToken(b, NODE_PATH);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // id? call
  public static boolean invocation_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "invocation_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INVOCATION_EXPRESSION, "<invocation expression>");
    r = invocation_expression_0(b, l + 1);
    r = r && call(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // id?
  private static boolean invocation_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "invocation_expression_0")) return false;
    id(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // expression
  public static boolean key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEY, "<key>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FUNC id? L_PAREN id? (COMMA id)* R_PAREN COLON expression
  public static boolean lambda_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression")) return false;
    if (!nextTokenIs(b, FUNC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FUNC);
    r = r && lambda_expression_1(b, l + 1);
    r = r && consumeToken(b, L_PAREN);
    r = r && lambda_expression_3(b, l + 1);
    r = r && lambda_expression_4(b, l + 1);
    r = r && consumeTokens(b, 0, R_PAREN, COLON);
    r = r && expression(b, l + 1);
    exit_section_(b, m, LAMBDA_EXPRESSION, r);
    return r;
  }

  // id?
  private static boolean lambda_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_1")) return false;
    id(b, l + 1);
    return true;
  }

  // id?
  private static boolean lambda_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_3")) return false;
    id(b, l + 1);
    return true;
  }

  // (COMMA id)*
  private static boolean lambda_expression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!lambda_expression_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "lambda_expression_4", c)) break;
    }
    return true;
  }

  // COMMA id
  private static boolean lambda_expression_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && id(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  static Parser listOf_$(Parser _p1, Parser _p2) {
    return (b, l) -> listOf(b, l + 1, _p1, _p2);
  }

  // <<p1>> (<<p2>> <<p1>>)*
  static boolean listOf(PsiBuilder b, int l, Parser _p1, Parser _p2) {
    if (!recursion_guard_(b, l, "listOf")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _p1.parse(b, l);
    r = r && listOf_1(b, l + 1, _p2, _p1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (<<p2>> <<p1>>)*
  private static boolean listOf_1(PsiBuilder b, int l, Parser _p2, Parser _p1) {
    if (!recursion_guard_(b, l, "listOf_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!listOf_1_0(b, l + 1, _p2, _p1)) break;
      if (!empty_element_parsed_guard_(b, "listOf_1", c)) break;
    }
    return true;
  }

  // <<p2>> <<p1>>
  private static boolean listOf_1_0(PsiBuilder b, int l, Parser _p2, Parser _p1) {
    if (!recursion_guard_(b, l, "listOf_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _p2.parse(b, l);
    r = r && _p1.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (key EQUAL expression) | DOT_DOT
  public static boolean lua_dictionary_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lua_dictionary_entry")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LUA_DICTIONARY_ENTRY, "<lua dictionary entry>");
    r = lua_dictionary_entry_0(b, l + 1);
    if (!r) r = consumeToken(b, DOT_DOT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // key EQUAL expression
  private static boolean lua_dictionary_entry_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lua_dictionary_entry_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = key(b, l + 1);
    r = r && consumeToken(b, EQUAL);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // L_BRACE LINE_BREAK* lua_dictionary_entry? LINE_BREAK* (COMMA LINE_BREAK* lua_dictionary_entry LINE_BREAK*)* COMMA? LINE_BREAK* R_BRACE
  public static boolean lua_dictionary_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lua_dictionary_expression")) return false;
    if (!nextTokenIs(b, L_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_BRACE);
    r = r && lua_dictionary_expression_1(b, l + 1);
    r = r && lua_dictionary_expression_2(b, l + 1);
    r = r && lua_dictionary_expression_3(b, l + 1);
    r = r && lua_dictionary_expression_4(b, l + 1);
    r = r && lua_dictionary_expression_5(b, l + 1);
    r = r && lua_dictionary_expression_6(b, l + 1);
    r = r && consumeToken(b, R_BRACE);
    exit_section_(b, m, LUA_DICTIONARY_EXPRESSION, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean lua_dictionary_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lua_dictionary_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "lua_dictionary_expression_1", c)) break;
    }
    return true;
  }

  // lua_dictionary_entry?
  private static boolean lua_dictionary_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lua_dictionary_expression_2")) return false;
    lua_dictionary_entry(b, l + 1);
    return true;
  }

  // LINE_BREAK*
  private static boolean lua_dictionary_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lua_dictionary_expression_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "lua_dictionary_expression_3", c)) break;
    }
    return true;
  }

  // (COMMA LINE_BREAK* lua_dictionary_entry LINE_BREAK*)*
  private static boolean lua_dictionary_expression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lua_dictionary_expression_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!lua_dictionary_expression_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "lua_dictionary_expression_4", c)) break;
    }
    return true;
  }

  // COMMA LINE_BREAK* lua_dictionary_entry LINE_BREAK*
  private static boolean lua_dictionary_expression_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lua_dictionary_expression_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && lua_dictionary_expression_4_0_1(b, l + 1);
    r = r && lua_dictionary_entry(b, l + 1);
    r = r && lua_dictionary_expression_4_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean lua_dictionary_expression_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lua_dictionary_expression_4_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "lua_dictionary_expression_4_0_1", c)) break;
    }
    return true;
  }

  // LINE_BREAK*
  private static boolean lua_dictionary_expression_4_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lua_dictionary_expression_4_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "lua_dictionary_expression_4_0_3", c)) break;
    }
    return true;
  }

  // COMMA?
  private static boolean lua_dictionary_expression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lua_dictionary_expression_5")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // LINE_BREAK*
  private static boolean lua_dictionary_expression_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lua_dictionary_expression_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "lua_dictionary_expression_6", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // MULTILINE_SINGLE_QUOTED_STRING | MULTILINE_DOUBLE_QUOTED_STRING
  static boolean multiline_string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiline_string")) return false;
    if (!nextTokenIs(b, "", MULTILINE_DOUBLE_QUOTED_STRING, MULTILINE_SINGLE_QUOTED_STRING)) return false;
    boolean r;
    r = consumeToken(b, MULTILINE_SINGLE_QUOTED_STRING);
    if (!r) r = consumeToken(b, MULTILINE_DOUBLE_QUOTED_STRING);
    return r;
  }

  /* ********************************************************** */
  // id (DOT id)*
  static boolean nested_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nested_type")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = id(b, l + 1);
    r = r && nested_type_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DOT id)*
  private static boolean nested_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nested_type_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!nested_type_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "nested_type_1", c)) break;
    }
    return true;
  }

  // DOT id
  private static boolean nested_type_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nested_type_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && id(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // array_expression
  //     | dictionary_expression
  //     | lua_dictionary_expression
  //     | invocation_expression
  //     | lambda_expression
  //     | string
  //     | multiline_string
  //     | id
  //     | REAL_NUMBER
  //     | BINARY_NUMBER
  //     | HEXADECIMAL_NUMBER
  //     | TRUE
  //     | FALSE
  //     | NULL
  //     | SELF
  static boolean operand(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operand")) return false;
    boolean r;
    r = array_expression(b, l + 1);
    if (!r) r = dictionary_expression(b, l + 1);
    if (!r) r = lua_dictionary_expression(b, l + 1);
    if (!r) r = invocation_expression(b, l + 1);
    if (!r) r = lambda_expression(b, l + 1);
    if (!r) r = string(b, l + 1);
    if (!r) r = multiline_string(b, l + 1);
    if (!r) r = id(b, l + 1);
    if (!r) r = consumeToken(b, REAL_NUMBER);
    if (!r) r = consumeToken(b, BINARY_NUMBER);
    if (!r) r = consumeToken(b, HEXADECIMAL_NUMBER);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, NULL);
    if (!r) r = consumeToken(b, SELF);
    return r;
  }

  /* ********************************************************** */
  // LESS
  //     | LESS_EQUAL
  //     | GREATER
  //     | GREATER_EQUAL
  //     | EQUAL_EQUAL
  //     | BANG_EQUAL
  //     | AMPERSAND_AMPERSAND
  //     | PIPE_PIPE
  //     | BANG
  //     | AMPERSAND
  //     | PIPE
  //     | TILDE
  //     | CARET
  //     | LESS_LESS
  //     | GREATER_GREATER
  //     | PLUS
  //     | MINUS
  //     | STAR
  //     | SLASH
  //     | PERCENT
  //     | DOT
  //     | DOT_DOT
  //     | IS
  //     | AS
  //     | IN
  //     | AND
  //     | OR
  //     | NOT
  //     | IF
  //     | ELSE
  static boolean operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator")) return false;
    boolean r;
    r = consumeToken(b, LESS);
    if (!r) r = consumeToken(b, LESS_EQUAL);
    if (!r) r = consumeToken(b, GREATER);
    if (!r) r = consumeToken(b, GREATER_EQUAL);
    if (!r) r = consumeToken(b, EQUAL_EQUAL);
    if (!r) r = consumeToken(b, BANG_EQUAL);
    if (!r) r = consumeToken(b, AMPERSAND_AMPERSAND);
    if (!r) r = consumeToken(b, PIPE_PIPE);
    if (!r) r = consumeToken(b, BANG);
    if (!r) r = consumeToken(b, AMPERSAND);
    if (!r) r = consumeToken(b, PIPE);
    if (!r) r = consumeToken(b, TILDE);
    if (!r) r = consumeToken(b, CARET);
    if (!r) r = consumeToken(b, LESS_LESS);
    if (!r) r = consumeToken(b, GREATER_GREATER);
    if (!r) r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, STAR);
    if (!r) r = consumeToken(b, SLASH);
    if (!r) r = consumeToken(b, PERCENT);
    if (!r) r = consumeToken(b, DOT);
    if (!r) r = consumeToken(b, DOT_DOT);
    if (!r) r = consumeToken(b, IS);
    if (!r) r = consumeToken(b, AS);
    if (!r) r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, OR);
    if (!r) r = consumeToken(b, NOT);
    if (!r) r = consumeToken(b, IF);
    if (!r) r = consumeToken(b, ELSE);
    return r;
  }

  /* ********************************************************** */
  // L_PAREN [type (COMMA type)*] R_PAREN
  public static boolean parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters")) return false;
    if (!nextTokenIs(b, L_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_PAREN);
    r = r && parameters_1(b, l + 1);
    r = r && consumeToken(b, R_PAREN);
    exit_section_(b, m, PARAMETERS, r);
    return r;
  }

  // [type (COMMA type)*]
  private static boolean parameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_1")) return false;
    parameters_1_0(b, l + 1);
    return true;
  }

  // type (COMMA type)*
  private static boolean parameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && parameters_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA type)*
  private static boolean parameters_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parameters_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameters_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA type
  private static boolean parameters_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RETURN expression
  public static boolean return_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && expression(b, l + 1);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // (top_level_annotation end_of_statement?)* (class_name_declaration | extends_declaration)* top_level_statement*
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = root_0(b, l + 1);
    r = r && root_1(b, l + 1);
    r = r && root_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (top_level_annotation end_of_statement?)*
  private static boolean root_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!root_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_0", c)) break;
    }
    return true;
  }

  // top_level_annotation end_of_statement?
  private static boolean root_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = top_level_annotation(b, l + 1);
    r = r && root_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // end_of_statement?
  private static boolean root_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_0_0_1")) return false;
    end_of_statement(b, l + 1);
    return true;
  }

  // (class_name_declaration | extends_declaration)*
  private static boolean root_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!root_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_1", c)) break;
    }
    return true;
  }

  // class_name_declaration | extends_declaration
  private static boolean root_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_1_0")) return false;
    boolean r;
    r = class_name_declaration(b, l + 1);
    if (!r) r = extends_declaration(b, l + 1);
    return r;
  }

  // top_level_statement*
  private static boolean root_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!top_level_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // assign_statement
  //     | return_statement
  //     | expression_statement
  static boolean script_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_statement")) return false;
    boolean r;
    r = assign_statement(b, l + 1);
    if (!r) r = return_statement(b, l + 1);
    if (!r) r = expression_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // set_or_get [COMMA set_or_get]
  public static boolean set_get(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_get")) return false;
    if (!nextTokenIs(b, "<set get>", GET, SET)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SET_GET, "<set get>");
    r = set_or_get(b, l + 1);
    r = r && set_get_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [COMMA set_or_get]
  private static boolean set_get_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_get_1")) return false;
    set_get_1_0(b, l + 1);
    return true;
  }

  // COMMA set_or_get
  private static boolean set_get_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_get_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && set_or_get(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (SET | GET) EQUAL id
  public static boolean set_or_get(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_or_get")) return false;
    if (!nextTokenIs(b, "<set or get>", GET, SET)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SET_OR_GET, "<set or get>");
    r = set_or_get_0(b, l + 1);
    r = r && consumeToken(b, EQUAL);
    r = r && id(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SET | GET
  private static boolean set_or_get_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_or_get_0")) return false;
    boolean r;
    r = consumeToken(b, SET);
    if (!r) r = consumeToken(b, GET);
    return r;
  }

  /* ********************************************************** */
  // SIGNAL id parameters?
  public static boolean signal_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration")) return false;
    if (!nextTokenIs(b, SIGNAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SIGNAL);
    r = r && id(b, l + 1);
    r = r && signal_declaration_2(b, l + 1);
    exit_section_(b, m, SIGNAL_DECLARATION, r);
    return r;
  }

  // parameters?
  private static boolean signal_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration_2")) return false;
    parameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // signal_declaration end_of_statement
  static boolean signal_declaration_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration_statement")) return false;
    if (!nextTokenIs(b, SIGNAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = signal_declaration(b, l + 1);
    r = r && end_of_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SINGLE_QUOTED_STRING | DOUBLE_QUOTED_STRING
  public static boolean string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string")) return false;
    if (!nextTokenIs(b, "<string>", DOUBLE_QUOTED_STRING, SINGLE_QUOTED_STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING, "<string>");
    r = consumeToken(b, SINGLE_QUOTED_STRING);
    if (!r) r = consumeToken(b, DOUBLE_QUOTED_STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (AT_ICON call) | AT_TOOL
  public static boolean top_level_annotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_level_annotation")) return false;
    if (!nextTokenIs(b, "<top level annotation>", AT_ICON, AT_TOOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TOP_LEVEL_ANNOTATION, "<top level annotation>");
    r = top_level_annotation_0(b, l + 1);
    if (!r) r = consumeToken(b, AT_TOOL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // AT_ICON call
  private static boolean top_level_annotation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_level_annotation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT_ICON);
    r = r && call(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // class_var_declaration_statement
  //     | class_const_declaration_statement
  //     | signal_declaration_statement
  static boolean top_level_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_level_statement")) return false;
    boolean r;
    r = class_var_declaration_statement(b, l + 1);
    if (!r) r = class_const_declaration_statement(b, l + 1);
    if (!r) r = signal_declaration_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // array_type | nested_type
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = array_type(b, l + 1);
    if (!r) r = nested_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // export_annotation call?
  public static boolean var_export(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_export")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR_EXPORT, "<var export>");
    r = export_annotation(b, l + 1);
    r = r && var_export_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // call?
  private static boolean var_export_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_export_1")) return false;
    call(b, l + 1);
    return true;
  }

  private static final Parser block_0_0_parser_ = listOf_$(GDScriptParser::script_statement, GDScriptParser::block_0_0_1);
}
