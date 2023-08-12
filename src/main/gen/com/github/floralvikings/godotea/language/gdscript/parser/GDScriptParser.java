// This is a generated file. Not intended for manual editing.
package com.github.floralvikings.godotea.language.gdscript.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes.*;
import static com.github.floralvikings.godotea.language.gdscript.parser.GDScriptParserUtil.*;
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
    create_token_set_(ARRAY_EXPRESSION, DICTIONARY_EXPRESSION, DOT_QUALIFIED_EXPRESSION, EXPRESSION,
      ID_EXPRESSION, INVOCATION_EXPRESSION, LAMBDA_EXPRESSION, LUA_DICTIONARY_EXPRESSION,
      PAREN_EXPRESSION),
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
  // L_BRACKET [pattern [(COMMA pattern)+] (COMMA DOT_DOT)?]  R_BRACKET
  public static boolean array_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_pattern")) return false;
    if (!nextTokenIs(b, L_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_BRACKET);
    r = r && array_pattern_1(b, l + 1);
    r = r && consumeToken(b, R_BRACKET);
    exit_section_(b, m, ARRAY_PATTERN, r);
    return r;
  }

  // [pattern [(COMMA pattern)+] (COMMA DOT_DOT)?]
  private static boolean array_pattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_pattern_1")) return false;
    array_pattern_1_0(b, l + 1);
    return true;
  }

  // pattern [(COMMA pattern)+] (COMMA DOT_DOT)?
  private static boolean array_pattern_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_pattern_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pattern(b, l + 1);
    r = r && array_pattern_1_0_1(b, l + 1);
    r = r && array_pattern_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [(COMMA pattern)+]
  private static boolean array_pattern_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_pattern_1_0_1")) return false;
    array_pattern_1_0_1_0(b, l + 1);
    return true;
  }

  // (COMMA pattern)+
  private static boolean array_pattern_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_pattern_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = array_pattern_1_0_1_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!array_pattern_1_0_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "array_pattern_1_0_1_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA pattern
  private static boolean array_pattern_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_pattern_1_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && pattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA DOT_DOT)?
  private static boolean array_pattern_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_pattern_1_0_2")) return false;
    array_pattern_1_0_2_0(b, l + 1);
    return true;
  }

  // COMMA DOT_DOT
  private static boolean array_pattern_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_pattern_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, DOT_DOT);
    exit_section_(b, m, null, r);
    return r;
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
  // ASSERT L_PAREN expression [COMMA string] R_PAREN
  public static boolean assert_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assert_statement")) return false;
    if (!nextTokenIs(b, ASSERT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ASSERT, L_PAREN);
    r = r && expression(b, l + 1);
    r = r && assert_statement_3(b, l + 1);
    r = r && consumeToken(b, R_PAREN);
    exit_section_(b, m, ASSERT_STATEMENT, r);
    return r;
  }

  // [COMMA string]
  private static boolean assert_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assert_statement_3")) return false;
    assert_statement_3_0(b, l + 1);
    return true;
  }

  // COMMA string
  private static boolean assert_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assert_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && string(b, l + 1);
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
  // expression assign_operator [AWAIT] expression
  public static boolean assign_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGN_STATEMENT, "<assign statement>");
    r = expression(b, l + 1);
    r = r && assign_operator(b, l + 1);
    r = r && assign_statement_2(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [AWAIT]
  private static boolean assign_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_statement_2")) return false;
    consumeToken(b, AWAIT);
    return true;
  }

  /* ********************************************************** */
  // AWAIT expression
  public static boolean await_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "await_statement")) return false;
    if (!nextTokenIs(b, AWAIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AWAIT);
    r = r && expression(b, l + 1);
    exit_section_(b, m, AWAIT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // VAR IDENTIFIER
  public static boolean binding_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binding_pattern")) return false;
    if (!nextTokenIs(b, VAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VAR, IDENTIFIER);
    exit_section_(b, m, BINDING_PATTERN, r);
    return r;
  }

  /* ********************************************************** */
  // <<indented <<listOf (&INDEQ script_statement) end_of_block_statement>>>>
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK, "<block>");
    r = indented(b, l + 1, block_0_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // &INDEQ script_statement
  private static boolean block_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block_0_0_0_0(b, l + 1);
    r = r && script_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDEQ
  private static boolean block_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_0_0_0_0")) return false;
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
  // <<indented (SET L_PAREN function_parameter R_PAREN COLON LINE_BREAK block)>>
  public static boolean block_set(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_set")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_SET, "<block set>");
    r = indented(b, l + 1, GDScriptParser::block_set_0_0);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SET L_PAREN function_parameter R_PAREN COLON LINE_BREAK block
  private static boolean block_set_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_set_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SET, L_PAREN);
    r = r && function_parameter(b, l + 1);
    r = r && consumeTokens(b, 0, R_PAREN, COLON, LINE_BREAK);
    r = r && block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BREAK
  public static boolean break_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "break_statement")) return false;
    if (!nextTokenIs(b, BREAK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BREAK);
    exit_section_(b, m, BREAK_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // L_PAREN LINE_BREAK* expression_list R_PAREN
  public static boolean call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CALL, "<call>");
    r = consumeToken(b, L_PAREN);
    p = r; // pin = 1
    r = r && report_error_(b, call_1(b, l + 1));
    r = p && report_error_(b, expression_list(b, l + 1)) && r;
    r = p && consumeToken(b, R_PAREN) && r;
    exit_section_(b, l, m, r, p, GDScriptParser::call_recover);
    return r || p;
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

  /* ********************************************************** */
  // R_PAREN
  static boolean call_recover(PsiBuilder b, int l) {
    return consumeToken(b, R_PAREN);
  }

  /* ********************************************************** */
  // <<indented <<listOf (&INDEQ class_statement) end_of_block_statement>>>>
  public static boolean class_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_BLOCK, "<class block>");
    r = indented(b, l + 1, class_block_0_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // &INDEQ class_statement
  private static boolean class_block_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_block_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_block_0_0_0_0(b, l + 1);
    r = r && class_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDEQ
  private static boolean class_block_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_block_0_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indEq(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // CLASS_NAME id
  public static boolean class_name_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_name_declaration")) return false;
    if (!nextTokenIs(b, CLASS_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLASS_NAME);
    r = r && id(b, l + 1);
    exit_section_(b, m, CLASS_NAME_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // class_var_declaration
  //     | class_const_declaration
  //     | signal_declaration
  //     | enum_declaration
  //     | function_declaration
  //     | extends_declaration
  static boolean class_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_statement")) return false;
    boolean r;
    r = class_var_declaration(b, l + 1);
    if (!r) r = class_const_declaration(b, l + 1);
    if (!r) r = signal_declaration(b, l + 1);
    if (!r) r = enum_declaration(b, l + 1);
    if (!r) r = function_declaration(b, l + 1);
    if (!r) r = extends_declaration(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ((var_export LINE_BREAK*) | (AT_ONREADY LINE_BREAK*))* VAR class_var_name (
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
    r = r && consumeToken(b, VAR);
    r = r && class_var_name(b, l + 1);
    r = r && class_var_declaration_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((var_export LINE_BREAK*) | (AT_ONREADY LINE_BREAK*))*
  private static boolean class_var_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!class_var_declaration_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_var_declaration_0", c)) break;
    }
    return true;
  }

  // (var_export LINE_BREAK*) | (AT_ONREADY LINE_BREAK*)
  private static boolean class_var_declaration_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_var_declaration_0_0_0(b, l + 1);
    if (!r) r = class_var_declaration_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // var_export LINE_BREAK*
  private static boolean class_var_declaration_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_export(b, l + 1);
    r = r && class_var_declaration_0_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean class_var_declaration_0_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_0_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "class_var_declaration_0_0_0_1", c)) break;
    }
    return true;
  }

  // AT_ONREADY LINE_BREAK*
  private static boolean class_var_declaration_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT_ONREADY);
    r = r && class_var_declaration_0_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean class_var_declaration_0_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_0_0_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "class_var_declaration_0_0_1_1", c)) break;
    }
    return true;
  }

  // (COLON(type(
  //         ((LINE_BREAK (block_get|block_set))+)
  //         | ([(EQUAL|INFER) expression])
  //     )))
  //     | (COLON set_get)
  //     | [(EQUAL | INFER) expression]
  private static boolean class_var_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_var_declaration_3_0(b, l + 1);
    if (!r) r = class_var_declaration_3_1(b, l + 1);
    if (!r) r = class_var_declaration_3_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COLON(type(
  //         ((LINE_BREAK (block_get|block_set))+)
  //         | ([(EQUAL|INFER) expression])
  //     ))
  private static boolean class_var_declaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && class_var_declaration_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type(
  //         ((LINE_BREAK (block_get|block_set))+)
  //         | ([(EQUAL|INFER) expression])
  //     )
  private static boolean class_var_declaration_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_3_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && class_var_declaration_3_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((LINE_BREAK (block_get|block_set))+)
  //         | ([(EQUAL|INFER) expression])
  private static boolean class_var_declaration_3_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_3_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_var_declaration_3_0_1_1_0(b, l + 1);
    if (!r) r = class_var_declaration_3_0_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LINE_BREAK (block_get|block_set))+
  private static boolean class_var_declaration_3_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_3_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_var_declaration_3_0_1_1_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!class_var_declaration_3_0_1_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_var_declaration_3_0_1_1_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK (block_get|block_set)
  private static boolean class_var_declaration_3_0_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_3_0_1_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    r = r && class_var_declaration_3_0_1_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // block_get|block_set
  private static boolean class_var_declaration_3_0_1_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_3_0_1_1_0_0_1")) return false;
    boolean r;
    r = block_get(b, l + 1);
    if (!r) r = block_set(b, l + 1);
    return r;
  }

  // [(EQUAL|INFER) expression]
  private static boolean class_var_declaration_3_0_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_3_0_1_1_1")) return false;
    class_var_declaration_3_0_1_1_1_0(b, l + 1);
    return true;
  }

  // (EQUAL|INFER) expression
  private static boolean class_var_declaration_3_0_1_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_3_0_1_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_var_declaration_3_0_1_1_1_0_0(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EQUAL|INFER
  private static boolean class_var_declaration_3_0_1_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_3_0_1_1_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, EQUAL);
    if (!r) r = consumeToken(b, INFER);
    return r;
  }

  // COLON set_get
  private static boolean class_var_declaration_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && set_get(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [(EQUAL | INFER) expression]
  private static boolean class_var_declaration_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_3_2")) return false;
    class_var_declaration_3_2_0(b, l + 1);
    return true;
  }

  // (EQUAL | INFER) expression
  private static boolean class_var_declaration_3_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_3_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_var_declaration_3_2_0_0(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EQUAL | INFER
  private static boolean class_var_declaration_3_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_declaration_3_2_0_0")) return false;
    boolean r;
    r = consumeToken(b, EQUAL);
    if (!r) r = consumeToken(b, INFER);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean class_var_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_var_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, CLASS_VAR_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // CONST id (COLON type)? (EQUAL | INFER) expression
  public static boolean const_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_statement")) return false;
    if (!nextTokenIs(b, CONST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONST);
    r = r && id(b, l + 1);
    r = r && const_statement_2(b, l + 1);
    r = r && const_statement_3(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, CONST_STATEMENT, r);
    return r;
  }

  // (COLON type)?
  private static boolean const_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_statement_2")) return false;
    const_statement_2_0(b, l + 1);
    return true;
  }

  // COLON type
  private static boolean const_statement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_statement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EQUAL | INFER
  private static boolean const_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_statement_3")) return false;
    boolean r;
    r = consumeToken(b, EQUAL);
    if (!r) r = consumeToken(b, INFER);
    return r;
  }

  /* ********************************************************** */
  // CONTINUE
  public static boolean continue_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continue_statement")) return false;
    if (!nextTokenIs(b, CONTINUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONTINUE);
    exit_section_(b, m, CONTINUE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // L_BRACE [key_value_pattern [(COMMA key_value_pattern)+] (COMMA DOT_DOT)?] R_BRACE
  public static boolean dict_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dict_pattern")) return false;
    if (!nextTokenIs(b, L_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_BRACE);
    r = r && dict_pattern_1(b, l + 1);
    r = r && consumeToken(b, R_BRACE);
    exit_section_(b, m, DICT_PATTERN, r);
    return r;
  }

  // [key_value_pattern [(COMMA key_value_pattern)+] (COMMA DOT_DOT)?]
  private static boolean dict_pattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dict_pattern_1")) return false;
    dict_pattern_1_0(b, l + 1);
    return true;
  }

  // key_value_pattern [(COMMA key_value_pattern)+] (COMMA DOT_DOT)?
  private static boolean dict_pattern_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dict_pattern_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = key_value_pattern(b, l + 1);
    r = r && dict_pattern_1_0_1(b, l + 1);
    r = r && dict_pattern_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [(COMMA key_value_pattern)+]
  private static boolean dict_pattern_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dict_pattern_1_0_1")) return false;
    dict_pattern_1_0_1_0(b, l + 1);
    return true;
  }

  // (COMMA key_value_pattern)+
  private static boolean dict_pattern_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dict_pattern_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dict_pattern_1_0_1_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!dict_pattern_1_0_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dict_pattern_1_0_1_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA key_value_pattern
  private static boolean dict_pattern_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dict_pattern_1_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && key_value_pattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA DOT_DOT)?
  private static boolean dict_pattern_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dict_pattern_1_0_2")) return false;
    dict_pattern_1_0_2_0(b, l + 1);
    return true;
  }

  // COMMA DOT_DOT
  private static boolean dict_pattern_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dict_pattern_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, DOT_DOT);
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
  // (invocation_expression | id) (DOT (invocation_expression | id))+
  public static boolean dot_qualified_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_qualified_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOT_QUALIFIED_EXPRESSION, "<dot qualified expression>");
    r = dot_qualified_expression_0(b, l + 1);
    r = r && dot_qualified_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // invocation_expression | id
  private static boolean dot_qualified_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_qualified_expression_0")) return false;
    boolean r;
    r = invocation_expression(b, l + 1);
    if (!r) r = id(b, l + 1);
    return r;
  }

  // (DOT (invocation_expression | id))+
  private static boolean dot_qualified_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_qualified_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dot_qualified_expression_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!dot_qualified_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dot_qualified_expression_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // DOT (invocation_expression | id)
  private static boolean dot_qualified_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_qualified_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && dot_qualified_expression_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // invocation_expression | id
  private static boolean dot_qualified_expression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_qualified_expression_1_0_1")) return false;
    boolean r;
    r = invocation_expression(b, l + 1);
    if (!r) r = id(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ELIF expression COLON statement_or_block
  public static boolean elif_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elif_statement")) return false;
    if (!nextTokenIs(b, ELIF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ELIF_STATEMENT, null);
    r = consumeToken(b, ELIF);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, COLON);
    p = r; // pin = 3
    r = r && statement_or_block(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ELSE COLON statement_or_block
  public static boolean else_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_statement")) return false;
    if (!nextTokenIs(b, ELSE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ELSE_STATEMENT, null);
    r = consumeTokens(b, 2, ELSE, COLON);
    p = r; // pin = 2
    r = r && statement_or_block(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // end_of_statement (((&INDNONE | &INDEQ) LINE_BREAK+)+ | (&INDEQ))
  public static boolean end_of_block_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "end_of_block_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, END_OF_BLOCK_STATEMENT, "<end of block statement>");
    r = end_of_statement(b, l + 1);
    r = r && end_of_block_statement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((&INDNONE | &INDEQ) LINE_BREAK+)+ | (&INDEQ)
  private static boolean end_of_block_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "end_of_block_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = end_of_block_statement_1_0(b, l + 1);
    if (!r) r = end_of_block_statement_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((&INDNONE | &INDEQ) LINE_BREAK+)+
  private static boolean end_of_block_statement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "end_of_block_statement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = end_of_block_statement_1_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!end_of_block_statement_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "end_of_block_statement_1_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (&INDNONE | &INDEQ) LINE_BREAK+
  private static boolean end_of_block_statement_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "end_of_block_statement_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = end_of_block_statement_1_0_0_0(b, l + 1);
    r = r && end_of_block_statement_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE | &INDEQ
  private static boolean end_of_block_statement_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "end_of_block_statement_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = end_of_block_statement_1_0_0_0_0(b, l + 1);
    if (!r) r = end_of_block_statement_1_0_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDNONE
  private static boolean end_of_block_statement_1_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "end_of_block_statement_1_0_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indNone(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // &INDEQ
  private static boolean end_of_block_statement_1_0_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "end_of_block_statement_1_0_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indEq(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LINE_BREAK+
  private static boolean end_of_block_statement_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "end_of_block_statement_1_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "end_of_block_statement_1_0_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // &INDEQ
  private static boolean end_of_block_statement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "end_of_block_statement_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = indEq(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // ENUM id? (L_BRACE LINE_BREAK* enum_entry? LINE_BREAK* (COMMA LINE_BREAK* enum_entry LINE_BREAK*)* COMMA? LINE_BREAK* R_BRACE)?
  public static boolean enum_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration")) return false;
    if (!nextTokenIs(b, ENUM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENUM);
    r = r && enum_declaration_1(b, l + 1);
    r = r && enum_declaration_2(b, l + 1);
    exit_section_(b, m, ENUM_DECLARATION, r);
    return r;
  }

  // id?
  private static boolean enum_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_1")) return false;
    id(b, l + 1);
    return true;
  }

  // (L_BRACE LINE_BREAK* enum_entry? LINE_BREAK* (COMMA LINE_BREAK* enum_entry LINE_BREAK*)* COMMA? LINE_BREAK* R_BRACE)?
  private static boolean enum_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_2")) return false;
    enum_declaration_2_0(b, l + 1);
    return true;
  }

  // L_BRACE LINE_BREAK* enum_entry? LINE_BREAK* (COMMA LINE_BREAK* enum_entry LINE_BREAK*)* COMMA? LINE_BREAK* R_BRACE
  private static boolean enum_declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_BRACE);
    r = r && enum_declaration_2_0_1(b, l + 1);
    r = r && enum_declaration_2_0_2(b, l + 1);
    r = r && enum_declaration_2_0_3(b, l + 1);
    r = r && enum_declaration_2_0_4(b, l + 1);
    r = r && enum_declaration_2_0_5(b, l + 1);
    r = r && enum_declaration_2_0_6(b, l + 1);
    r = r && consumeToken(b, R_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean enum_declaration_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "enum_declaration_2_0_1", c)) break;
    }
    return true;
  }

  // enum_entry?
  private static boolean enum_declaration_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_2_0_2")) return false;
    enum_entry(b, l + 1);
    return true;
  }

  // LINE_BREAK*
  private static boolean enum_declaration_2_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_2_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "enum_declaration_2_0_3", c)) break;
    }
    return true;
  }

  // (COMMA LINE_BREAK* enum_entry LINE_BREAK*)*
  private static boolean enum_declaration_2_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_2_0_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enum_declaration_2_0_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_declaration_2_0_4", c)) break;
    }
    return true;
  }

  // COMMA LINE_BREAK* enum_entry LINE_BREAK*
  private static boolean enum_declaration_2_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_2_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && enum_declaration_2_0_4_0_1(b, l + 1);
    r = r && enum_entry(b, l + 1);
    r = r && enum_declaration_2_0_4_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean enum_declaration_2_0_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_2_0_4_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "enum_declaration_2_0_4_0_1", c)) break;
    }
    return true;
  }

  // LINE_BREAK*
  private static boolean enum_declaration_2_0_4_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_2_0_4_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "enum_declaration_2_0_4_0_3", c)) break;
    }
    return true;
  }

  // COMMA?
  private static boolean enum_declaration_2_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_2_0_5")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // LINE_BREAK*
  private static boolean enum_declaration_2_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_2_0_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "enum_declaration_2_0_6", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // id (EQUAL expression)?
  public static boolean enum_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_entry")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_ENTRY, "<enum entry>");
    r = id(b, l + 1);
    r = r && enum_entry_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (EQUAL expression)?
  private static boolean enum_entry_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_entry_1")) return false;
    enum_entry_1_0(b, l + 1);
    return true;
  }

  // EQUAL expression
  private static boolean enum_entry_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_entry_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUAL);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AT_EXPORT
  //     | AT_EXPORT_CATEGORY
  //     | AT_EXPORT_COLOR_NO_ALPHA
  //     | AT_EXPORT_DIR
  //     | AT_EXPORT_ENUM
  //     | AT_EXPORT_EXP_EASING
  //     | AT_EXPORT_FILE
  //     | AT_EXPORT_FLAGS
  //     | AT_EXPORT_FLAGS_2D_NAVIGATION
  //     | AT_EXPORT_FLAGS_2D_PHYSICS
  //     | AT_EXPORT_FLAGS_2D_RENDER
  //     | AT_EXPORT_FLAGS_3D_NAVIGATION
  //     | AT_EXPORT_FLAGS_3D_PHYSICS
  //     | AT_EXPORT_FLAGS_3D_RENDER
  //     | AT_EXPORT_FLAGS_AVOIDANCE
  //     | AT_EXPORT_GLOBAL_DIR
  //     | AT_EXPORT_GLOBAL_FILE
  //     | AT_EXPORT_GROUP
  //     | AT_EXPORT_MULTILINE
  //     | AT_EXPORT_NODE_PATH
  //     | AT_EXPORT_PLACEHOLDER
  //     | AT_EXPORT_RANGE
  //     | AT_EXPORT_SUBGROUP
  static boolean export_annotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export_annotation")) return false;
    boolean r;
    r = consumeToken(b, AT_EXPORT);
    if (!r) r = consumeToken(b, AT_EXPORT_CATEGORY);
    if (!r) r = consumeToken(b, AT_EXPORT_COLOR_NO_ALPHA);
    if (!r) r = consumeToken(b, AT_EXPORT_DIR);
    if (!r) r = consumeToken(b, AT_EXPORT_ENUM);
    if (!r) r = consumeToken(b, AT_EXPORT_EXP_EASING);
    if (!r) r = consumeToken(b, AT_EXPORT_FILE);
    if (!r) r = consumeToken(b, AT_EXPORT_FLAGS);
    if (!r) r = consumeToken(b, AT_EXPORT_FLAGS_2D_NAVIGATION);
    if (!r) r = consumeToken(b, AT_EXPORT_FLAGS_2D_PHYSICS);
    if (!r) r = consumeToken(b, AT_EXPORT_FLAGS_2D_RENDER);
    if (!r) r = consumeToken(b, AT_EXPORT_FLAGS_3D_NAVIGATION);
    if (!r) r = consumeToken(b, AT_EXPORT_FLAGS_3D_PHYSICS);
    if (!r) r = consumeToken(b, AT_EXPORT_FLAGS_3D_RENDER);
    if (!r) r = consumeToken(b, AT_EXPORT_FLAGS_AVOIDANCE);
    if (!r) r = consumeToken(b, AT_EXPORT_GLOBAL_DIR);
    if (!r) r = consumeToken(b, AT_EXPORT_GLOBAL_FILE);
    if (!r) r = consumeToken(b, AT_EXPORT_GROUP);
    if (!r) r = consumeToken(b, AT_EXPORT_MULTILINE);
    if (!r) r = consumeToken(b, AT_EXPORT_NODE_PATH);
    if (!r) r = consumeToken(b, AT_EXPORT_PLACEHOLDER);
    if (!r) r = consumeToken(b, AT_EXPORT_RANGE);
    if (!r) r = consumeToken(b, AT_EXPORT_SUBGROUP);
    return r;
  }

  /* ********************************************************** */
  // operator? <<listOf operand operator>>
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION, "<expression>");
    r = expression_0(b, l + 1);
    r = r && listOf(b, l + 1, GDScriptParser::operand, GDScriptParser::operator);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // operator?
  private static boolean expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_0")) return false;
    operator(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // expression? LINE_BREAK* (COMMA LINE_BREAK* expression LINE_BREAK*)*
  static boolean expression_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = expression_list_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, expression_list_1(b, l + 1));
    r = p && expression_list_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, GDScriptParser::expression_list_recover);
    return r || p;
  }

  // expression?
  private static boolean expression_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_0")) return false;
    expression(b, l + 1);
    return true;
  }

  // LINE_BREAK*
  private static boolean expression_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "expression_list_1", c)) break;
    }
    return true;
  }

  // (COMMA LINE_BREAK* expression LINE_BREAK*)*
  private static boolean expression_list_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression_list_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_list_2", c)) break;
    }
    return true;
  }

  // COMMA LINE_BREAK* expression LINE_BREAK*
  private static boolean expression_list_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression_list_2_0_1(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && expression_list_2_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean expression_list_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "expression_list_2_0_1", c)) break;
    }
    return true;
  }

  // LINE_BREAK*
  private static boolean expression_list_2_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_2_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "expression_list_2_0_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // COMMA
  static boolean expression_list_recover(PsiBuilder b, int l) {
    return consumeToken(b, COMMA);
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
  // EXTENDS (type | string)
  public static boolean extends_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extends_declaration")) return false;
    if (!nextTokenIs(b, EXTENDS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTENDS);
    r = r && extends_declaration_1(b, l + 1);
    exit_section_(b, m, EXTENDS_DECLARATION, r);
    return r;
  }

  // type | string
  private static boolean extends_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extends_declaration_1")) return false;
    boolean r;
    r = type(b, l + 1);
    if (!r) r = string(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // FOR id IN expression COLON statement_or_block
  public static boolean for_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && id(b, l + 1);
    r = r && consumeToken(b, IN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && statement_or_block(b, l + 1);
    exit_section_(b, m, FOR_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // AT_RPC LINE_BREAK*
  static boolean function_annotations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_annotations")) return false;
    if (!nextTokenIs(b, AT_RPC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT_RPC);
    r = r && function_annotations_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean function_annotations_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_annotations_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "function_annotations_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LINE_BREAK* block
  static boolean function_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_body")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_body_0(b, l + 1);
    r = r && block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean function_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_body_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "function_body_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // function_annotations? STATIC? FUNC function_name function_declaration_parameters function_return_type? COLON function_body
  public static boolean function_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DECLARATION, "<function declaration>");
    r = function_declaration_0(b, l + 1);
    r = r && function_declaration_1(b, l + 1);
    r = r && consumeToken(b, FUNC);
    r = r && function_name(b, l + 1);
    r = r && function_declaration_parameters(b, l + 1);
    r = r && function_declaration_5(b, l + 1);
    r = r && consumeToken(b, COLON);
    p = r; // pin = 7
    r = r && function_body(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // function_annotations?
  private static boolean function_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_0")) return false;
    function_annotations(b, l + 1);
    return true;
  }

  // STATIC?
  private static boolean function_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_1")) return false;
    consumeToken(b, STATIC);
    return true;
  }

  // function_return_type?
  private static boolean function_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_5")) return false;
    function_return_type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // L_PAREN LINE_BREAK* function_parameter_list LINE_BREAK* R_PAREN
  public static boolean function_declaration_parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_parameters")) return false;
    if (!nextTokenIs(b, L_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_PAREN);
    r = r && function_declaration_parameters_1(b, l + 1);
    r = r && function_parameter_list(b, l + 1);
    r = r && function_declaration_parameters_3(b, l + 1);
    r = r && consumeToken(b, R_PAREN);
    exit_section_(b, m, FUNCTION_DECLARATION_PARAMETERS, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean function_declaration_parameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_parameters_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "function_declaration_parameters_1", c)) break;
    }
    return true;
  }

  // LINE_BREAK*
  private static boolean function_declaration_parameters_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_parameters_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "function_declaration_parameters_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean function_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, FUNCTION_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // parameter_name (COLON type)? ((EQUAL | INFER) expression)?
  public static boolean function_parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameter")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter_name(b, l + 1);
    r = r && function_parameter_1(b, l + 1);
    r = r && function_parameter_2(b, l + 1);
    exit_section_(b, m, FUNCTION_PARAMETER, r);
    return r;
  }

  // (COLON type)?
  private static boolean function_parameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameter_1")) return false;
    function_parameter_1_0(b, l + 1);
    return true;
  }

  // COLON type
  private static boolean function_parameter_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameter_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((EQUAL | INFER) expression)?
  private static boolean function_parameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameter_2")) return false;
    function_parameter_2_0(b, l + 1);
    return true;
  }

  // (EQUAL | INFER) expression
  private static boolean function_parameter_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameter_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_parameter_2_0_0(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EQUAL | INFER
  private static boolean function_parameter_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameter_2_0_0")) return false;
    boolean r;
    r = consumeToken(b, EQUAL);
    if (!r) r = consumeToken(b, INFER);
    return r;
  }

  /* ********************************************************** */
  // function_parameter? LINE_BREAK* (COMMA LINE_BREAK* function_parameter LINE_BREAK*)* COMMA?
  static boolean function_parameter_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameter_list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_parameter_list_0(b, l + 1);
    r = r && function_parameter_list_1(b, l + 1);
    r = r && function_parameter_list_2(b, l + 1);
    r = r && function_parameter_list_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // function_parameter?
  private static boolean function_parameter_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameter_list_0")) return false;
    function_parameter(b, l + 1);
    return true;
  }

  // LINE_BREAK*
  private static boolean function_parameter_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameter_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "function_parameter_list_1", c)) break;
    }
    return true;
  }

  // (COMMA LINE_BREAK* function_parameter LINE_BREAK*)*
  private static boolean function_parameter_list_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameter_list_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!function_parameter_list_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_parameter_list_2", c)) break;
    }
    return true;
  }

  // COMMA LINE_BREAK* function_parameter LINE_BREAK*
  private static boolean function_parameter_list_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameter_list_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && function_parameter_list_2_0_1(b, l + 1);
    r = r && function_parameter(b, l + 1);
    r = r && function_parameter_list_2_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean function_parameter_list_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameter_list_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "function_parameter_list_2_0_1", c)) break;
    }
    return true;
  }

  // LINE_BREAK*
  private static boolean function_parameter_list_2_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameter_list_2_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "function_parameter_list_2_0_3", c)) break;
    }
    return true;
  }

  // COMMA?
  private static boolean function_parameter_list_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_parameter_list_3")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // ARROW type
  public static boolean function_return_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_return_type")) return false;
    if (!nextTokenIs(b, ARROW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARROW);
    r = r && type(b, l + 1);
    exit_section_(b, m, FUNCTION_RETURN_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER | INT | FLOAT | BOOL | VOID | NODE_PATH | SUPER
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
    if (!r) r = consumeToken(b, SUPER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // id
  public static boolean id_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ID_EXPRESSION, "<id expression>");
    r = id(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IF expression COLON statement_or_block (LINE_BREAK* elif_statement)* [LINE_BREAK* else_statement]
  public static boolean if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IF_STATEMENT, null);
    r = consumeToken(b, IF);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, COLON);
    p = r; // pin = 3
    r = r && report_error_(b, statement_or_block(b, l + 1));
    r = p && report_error_(b, if_statement_4(b, l + 1)) && r;
    r = p && if_statement_5(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (LINE_BREAK* elif_statement)*
  private static boolean if_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!if_statement_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_statement_4", c)) break;
    }
    return true;
  }

  // LINE_BREAK* elif_statement
  private static boolean if_statement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = if_statement_4_0_0(b, l + 1);
    r = r && elif_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean if_statement_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_4_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "if_statement_4_0_0", c)) break;
    }
    return true;
  }

  // [LINE_BREAK* else_statement]
  private static boolean if_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5")) return false;
    if_statement_5_0(b, l + 1);
    return true;
  }

  // LINE_BREAK* else_statement
  private static boolean if_statement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = if_statement_5_0_0(b, l + 1);
    r = r && else_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean if_statement_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "if_statement_5_0_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // script_statement end_of_statement
  static boolean inline_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inline_statement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = script_statement(b, l + 1);
    r = r && end_of_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LINE_BREAK*  class_block
  static boolean inner_class_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inner_class_body")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = inner_class_body_0(b, l + 1);
    r = r && class_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean inner_class_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inner_class_body_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "inner_class_body_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // CLASS id extends_declaration? COLON inner_class_body
  public static boolean inner_class_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inner_class_declaration")) return false;
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, INNER_CLASS_DECLARATION, null);
    r = consumeToken(b, CLASS);
    r = r && id(b, l + 1);
    r = r && inner_class_declaration_2(b, l + 1);
    r = r && consumeToken(b, COLON);
    p = r; // pin = 4
    r = r && inner_class_body(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // extends_declaration?
  private static boolean inner_class_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inner_class_declaration_2")) return false;
    extends_declaration(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // id call
  public static boolean invocation_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "invocation_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INVOCATION_EXPRESSION, "<invocation expression>");
    r = id(b, l + 1);
    r = r && call(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // string [COLON pattern]
  public static boolean key_value_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_value_pattern")) return false;
    if (!nextTokenIs(b, "<key value pattern>", DOUBLE_QUOTED_STRING, SINGLE_QUOTED_STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEY_VALUE_PATTERN, "<key value pattern>");
    r = string(b, l + 1);
    r = r && key_value_pattern_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [COLON pattern]
  private static boolean key_value_pattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_value_pattern_1")) return false;
    key_value_pattern_1_0(b, l + 1);
    return true;
  }

  // COLON pattern
  private static boolean key_value_pattern_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_value_pattern_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && pattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FUNC id? L_PAREN id? (COMMA id)* R_PAREN COLON (inline_statement | function_body)
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
    r = r && lambda_expression_7(b, l + 1);
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

  // inline_statement | function_body
  private static boolean lambda_expression_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_7")) return false;
    boolean r;
    r = inline_statement(b, l + 1);
    if (!r) r = function_body(b, l + 1);
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
  // IDENTIFIER
  public static boolean local_var_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_var_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, LOCAL_VAR_NAME, r);
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
  // pattern_list COLON statement_or_block (LINE_BREAK* pattern_list COLON statement_or_block)*
  public static boolean match_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATCH_BLOCK, "<match block>");
    r = pattern_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && statement_or_block(b, l + 1);
    r = r && match_block_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (LINE_BREAK* pattern_list COLON statement_or_block)*
  private static boolean match_block_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_block_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!match_block_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "match_block_3", c)) break;
    }
    return true;
  }

  // LINE_BREAK* pattern_list COLON statement_or_block
  private static boolean match_block_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_block_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = match_block_3_0_0(b, l + 1);
    r = r && pattern_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && statement_or_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean match_block_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_block_3_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "match_block_3_0_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // MATCH expression COLON LINE_BREAK* <<indented match_block>>
  public static boolean match_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_statement")) return false;
    if (!nextTokenIs(b, MATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MATCH);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && match_statement_3(b, l + 1);
    r = r && indented(b, l + 1, GDScriptParser::match_block);
    exit_section_(b, m, MATCH_STATEMENT, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean match_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_statement_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "match_statement_3", c)) break;
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
  // LINE_BREAK* block
  static boolean new_line_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_line_block")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = new_line_block_0(b, l + 1);
    r = r && block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean new_line_block_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_line_block_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "new_line_block_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // paren_expression
  //     | array_expression
  //     | dictionary_expression
  //     | lua_dictionary_expression
  //     | lambda_expression
  //     | string
  //     | multiline_string
  //     | dot_qualified_expression
  //     | invocation_expression
  //     | id_expression
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
    r = paren_expression(b, l + 1);
    if (!r) r = array_expression(b, l + 1);
    if (!r) r = dictionary_expression(b, l + 1);
    if (!r) r = lua_dictionary_expression(b, l + 1);
    if (!r) r = lambda_expression(b, l + 1);
    if (!r) r = string(b, l + 1);
    if (!r) r = multiline_string(b, l + 1);
    if (!r) r = dot_qualified_expression(b, l + 1);
    if (!r) r = invocation_expression(b, l + 1);
    if (!r) r = id_expression(b, l + 1);
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
  // IDENTIFIER
  public static boolean parameter_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, PARAMETER_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // L_PAREN expression R_PAREN
  public static boolean paren_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expression")) return false;
    if (!nextTokenIs(b, L_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_PAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, R_PAREN);
    exit_section_(b, m, PAREN_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // string
  //     | multiline_string
  //     | REAL_NUMBER
  //     | BINARY_NUMBER
  //     | HEXADECIMAL_NUMBER
  //     | UNDERSCORE
  //     | NULL
  //     | IDENTIFIER
  //     | binding_pattern
  //     | array_pattern
  //     | dict_pattern
  public static boolean pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN, "<pattern>");
    r = string(b, l + 1);
    if (!r) r = multiline_string(b, l + 1);
    if (!r) r = consumeToken(b, REAL_NUMBER);
    if (!r) r = consumeToken(b, BINARY_NUMBER);
    if (!r) r = consumeToken(b, HEXADECIMAL_NUMBER);
    if (!r) r = consumeToken(b, UNDERSCORE);
    if (!r) r = consumeToken(b, NULL);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = binding_pattern(b, l + 1);
    if (!r) r = array_pattern(b, l + 1);
    if (!r) r = dict_pattern(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // pattern (COMMA pattern)*
  public static boolean pattern_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN_LIST, "<pattern list>");
    r = pattern(b, l + 1);
    r = r && pattern_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA pattern)*
  private static boolean pattern_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!pattern_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pattern_list_1", c)) break;
    }
    return true;
  }

  // COMMA pattern
  private static boolean pattern_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && pattern(b, l + 1);
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
  // LINE_BREAK* (top_level_annotation end_of_statement?)*
  //     LINE_BREAK* ((class_name_declaration | extends_declaration) end_of_statement LINE_BREAK*)* (LINE_BREAK | (top_level_statement end_of_statement))*
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = root_0(b, l + 1);
    r = r && root_1(b, l + 1);
    r = r && root_2(b, l + 1);
    r = r && root_3(b, l + 1);
    r = r && root_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LINE_BREAK*
  private static boolean root_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "root_0", c)) break;
    }
    return true;
  }

  // (top_level_annotation end_of_statement?)*
  private static boolean root_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!root_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_1", c)) break;
    }
    return true;
  }

  // top_level_annotation end_of_statement?
  private static boolean root_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = top_level_annotation(b, l + 1);
    r = r && root_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // end_of_statement?
  private static boolean root_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_1_0_1")) return false;
    end_of_statement(b, l + 1);
    return true;
  }

  // LINE_BREAK*
  private static boolean root_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "root_2", c)) break;
    }
    return true;
  }

  // ((class_name_declaration | extends_declaration) end_of_statement LINE_BREAK*)*
  private static boolean root_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!root_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_3", c)) break;
    }
    return true;
  }

  // (class_name_declaration | extends_declaration) end_of_statement LINE_BREAK*
  private static boolean root_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = root_3_0_0(b, l + 1);
    r = r && end_of_statement(b, l + 1);
    r = r && root_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // class_name_declaration | extends_declaration
  private static boolean root_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_3_0_0")) return false;
    boolean r;
    r = class_name_declaration(b, l + 1);
    if (!r) r = extends_declaration(b, l + 1);
    return r;
  }

  // LINE_BREAK*
  private static boolean root_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_3_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, LINE_BREAK)) break;
      if (!empty_element_parsed_guard_(b, "root_3_0_2", c)) break;
    }
    return true;
  }

  // (LINE_BREAK | (top_level_statement end_of_statement))*
  private static boolean root_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!root_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_4", c)) break;
    }
    return true;
  }

  // LINE_BREAK | (top_level_statement end_of_statement)
  private static boolean root_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_BREAK);
    if (!r) r = root_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // top_level_statement end_of_statement
  private static boolean root_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_4_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = top_level_statement(b, l + 1);
    r = r && end_of_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // var_statement
  //     | const_statement
  //     | if_statement
  //     | for_statement
  //     | while_statement
  //     | match_statement
  //     | return_statement
  //     | continue_statement
  //     | break_statement
  //     | assign_statement
  //     | expression_statement
  //     | assert_statement
  //     | await_statement
  //     | PASS
  static boolean script_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_statement")) return false;
    boolean r;
    r = var_statement(b, l + 1);
    if (!r) r = const_statement(b, l + 1);
    if (!r) r = if_statement(b, l + 1);
    if (!r) r = for_statement(b, l + 1);
    if (!r) r = while_statement(b, l + 1);
    if (!r) r = match_statement(b, l + 1);
    if (!r) r = return_statement(b, l + 1);
    if (!r) r = continue_statement(b, l + 1);
    if (!r) r = break_statement(b, l + 1);
    if (!r) r = assign_statement(b, l + 1);
    if (!r) r = expression_statement(b, l + 1);
    if (!r) r = assert_statement(b, l + 1);
    if (!r) r = await_statement(b, l + 1);
    if (!r) r = consumeToken(b, PASS);
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
  // SIGNAL id signal_parameters?
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

  // signal_parameters?
  private static boolean signal_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration_2")) return false;
    signal_parameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // L_PAREN [type (COMMA type)*] R_PAREN
  public static boolean signal_parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_parameters")) return false;
    if (!nextTokenIs(b, L_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_PAREN);
    r = r && signal_parameters_1(b, l + 1);
    r = r && consumeToken(b, R_PAREN);
    exit_section_(b, m, SIGNAL_PARAMETERS, r);
    return r;
  }

  // [type (COMMA type)*]
  private static boolean signal_parameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_parameters_1")) return false;
    signal_parameters_1_0(b, l + 1);
    return true;
  }

  // type (COMMA type)*
  private static boolean signal_parameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_parameters_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && signal_parameters_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA type)*
  private static boolean signal_parameters_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_parameters_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!signal_parameters_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "signal_parameters_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA type
  private static boolean signal_parameters_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_parameters_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // inline_statement | new_line_block
  static boolean statement_or_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_or_block")) return false;
    boolean r;
    r = inline_statement(b, l + 1);
    if (!r) r = new_line_block(b, l + 1);
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
  // class_var_declaration
  //     | class_const_declaration
  //     | signal_declaration
  //     | enum_declaration
  //     | function_declaration
  //     | inner_class_declaration
  static boolean top_level_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_level_statement")) return false;
    boolean r;
    r = class_var_declaration(b, l + 1);
    if (!r) r = class_const_declaration(b, l + 1);
    if (!r) r = signal_declaration(b, l + 1);
    if (!r) r = enum_declaration(b, l + 1);
    if (!r) r = function_declaration(b, l + 1);
    if (!r) r = inner_class_declaration(b, l + 1);
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

  /* ********************************************************** */
  // VAR local_var_name (COLON type)? ((EQUAL | INFER) AWAIT? expression)?
  public static boolean var_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_statement")) return false;
    if (!nextTokenIs(b, VAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VAR);
    r = r && local_var_name(b, l + 1);
    r = r && var_statement_2(b, l + 1);
    r = r && var_statement_3(b, l + 1);
    exit_section_(b, m, VAR_STATEMENT, r);
    return r;
  }

  // (COLON type)?
  private static boolean var_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_statement_2")) return false;
    var_statement_2_0(b, l + 1);
    return true;
  }

  // COLON type
  private static boolean var_statement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_statement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((EQUAL | INFER) AWAIT? expression)?
  private static boolean var_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_statement_3")) return false;
    var_statement_3_0(b, l + 1);
    return true;
  }

  // (EQUAL | INFER) AWAIT? expression
  private static boolean var_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_statement_3_0_0(b, l + 1);
    r = r && var_statement_3_0_1(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EQUAL | INFER
  private static boolean var_statement_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_statement_3_0_0")) return false;
    boolean r;
    r = consumeToken(b, EQUAL);
    if (!r) r = consumeToken(b, INFER);
    return r;
  }

  // AWAIT?
  private static boolean var_statement_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_statement_3_0_1")) return false;
    consumeToken(b, AWAIT);
    return true;
  }

  /* ********************************************************** */
  // WHILE expression COLON statement_or_block
  public static boolean while_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHILE);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && statement_or_block(b, l + 1);
    exit_section_(b, m, WHILE_STATEMENT, r);
    return r;
  }

  private static final Parser block_0_0_parser_ = listOf_$(GDScriptParser::block_0_0_0, GDScriptParser::end_of_block_statement);
  private static final Parser class_block_0_0_parser_ = listOf_$(GDScriptParser::class_block_0_0_0, GDScriptParser::end_of_block_statement);
}
