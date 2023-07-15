// This is a generated file. Not intended for manual editing.
package com.github.floralvikings.godotea.language.gdscript.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.floralvikings.godotea.language.gdscript.psi.impl.*;

public interface GDScriptTypes {

  IElementType ARRAY_ARGUMENT = new GDScriptElementType("ARRAY_ARGUMENT");
  IElementType ARRAY_EXPRESSION = new GDScriptElementType("ARRAY_EXPRESSION");
  IElementType ARRAY_PATTERN = new GDScriptElementType("ARRAY_PATTERN");
  IElementType ASSERT_STATEMENT = new GDScriptElementType("ASSERT_STATEMENT");
  IElementType ASSIGN_OPERATOR = new GDScriptElementType("ASSIGN_OPERATOR");
  IElementType ASSIGN_STATEMENT = new GDScriptElementType("ASSIGN_STATEMENT");
  IElementType AWAIT_STATEMENT = new GDScriptElementType("AWAIT_STATEMENT");
  IElementType BINDING_PATTERN = new GDScriptElementType("BINDING_PATTERN");
  IElementType BLOCK = new GDScriptElementType("BLOCK");
  IElementType BLOCK_GET = new GDScriptElementType("BLOCK_GET");
  IElementType BLOCK_SET = new GDScriptElementType("BLOCK_SET");
  IElementType BREAK_STATEMENT = new GDScriptElementType("BREAK_STATEMENT");
  IElementType CLASS_BLOCK = new GDScriptElementType("CLASS_BLOCK");
  IElementType CLASS_CONST_DECLARATION = new GDScriptElementType("CLASS_CONST_DECLARATION");
  IElementType CLASS_NAME_DECLARATION = new GDScriptElementType("CLASS_NAME_DECLARATION");
  IElementType CLASS_VAR_DECLARATION = new GDScriptElementType("CLASS_VAR_DECLARATION");
  IElementType CLASS_VAR_NAME = new GDScriptElementType("CLASS_VAR_NAME");
  IElementType CONST_STATEMENT = new GDScriptElementType("CONST_STATEMENT");
  IElementType CONTINUE_STATEMENT = new GDScriptElementType("CONTINUE_STATEMENT");
  IElementType DICTIONARY_ENTRY = new GDScriptElementType("DICTIONARY_ENTRY");
  IElementType DICTIONARY_EXPRESSION = new GDScriptElementType("DICTIONARY_EXPRESSION");
  IElementType DICT_PATTERN = new GDScriptElementType("DICT_PATTERN");
  IElementType ELIF_STATEMENT = new GDScriptElementType("ELIF_STATEMENT");
  IElementType ELSE_STATEMENT = new GDScriptElementType("ELSE_STATEMENT");
  IElementType ENUM_DECLARATION = new GDScriptElementType("ENUM_DECLARATION");
  IElementType ENUM_ENTRY = new GDScriptElementType("ENUM_ENTRY");
  IElementType EXPRESSION = new GDScriptElementType("EXPRESSION");
  IElementType EXPRESSION_STATEMENT = new GDScriptElementType("EXPRESSION_STATEMENT");
  IElementType EXTENDS_DECLARATION = new GDScriptElementType("EXTENDS_DECLARATION");
  IElementType FOR_STATEMENT = new GDScriptElementType("FOR_STATEMENT");
  IElementType FUNCTION_DECLARATION = new GDScriptElementType("FUNCTION_DECLARATION");
  IElementType FUNCTION_NAME = new GDScriptElementType("FUNCTION_NAME");
  IElementType FUNCTION_PARAMETER = new GDScriptElementType("FUNCTION_PARAMETER");
  IElementType FUNCTION_RETURN_TYPE = new GDScriptElementType("FUNCTION_RETURN_TYPE");
  IElementType ID = new GDScriptElementType("ID");
  IElementType IF_STATEMENT = new GDScriptElementType("IF_STATEMENT");
  IElementType INNER_CLASS_DECLARATION = new GDScriptElementType("INNER_CLASS_DECLARATION");
  IElementType INVOCATION_EXPRESSION = new GDScriptElementType("INVOCATION_EXPRESSION");
  IElementType KEY = new GDScriptElementType("KEY");
  IElementType KEY_VALUE_PATTERN = new GDScriptElementType("KEY_VALUE_PATTERN");
  IElementType LAMBDA_EXPRESSION = new GDScriptElementType("LAMBDA_EXPRESSION");
  IElementType LUA_DICTIONARY_ENTRY = new GDScriptElementType("LUA_DICTIONARY_ENTRY");
  IElementType LUA_DICTIONARY_EXPRESSION = new GDScriptElementType("LUA_DICTIONARY_EXPRESSION");
  IElementType MATCH_BLOCK = new GDScriptElementType("MATCH_BLOCK");
  IElementType MATCH_STATEMENT = new GDScriptElementType("MATCH_STATEMENT");
  IElementType PARAMETER_NAME = new GDScriptElementType("PARAMETER_NAME");
  IElementType PATTERN = new GDScriptElementType("PATTERN");
  IElementType PATTERN_LIST = new GDScriptElementType("PATTERN_LIST");
  IElementType RETURN_STATEMENT = new GDScriptElementType("RETURN_STATEMENT");
  IElementType SET_GET = new GDScriptElementType("SET_GET");
  IElementType SET_OR_GET = new GDScriptElementType("SET_OR_GET");
  IElementType SIGNAL_DECLARATION = new GDScriptElementType("SIGNAL_DECLARATION");
  IElementType SIGNAL_PARAMETERS = new GDScriptElementType("SIGNAL_PARAMETERS");
  IElementType STRING = new GDScriptElementType("STRING");
  IElementType TOP_LEVEL_ANNOTATION = new GDScriptElementType("TOP_LEVEL_ANNOTATION");
  IElementType TYPE = new GDScriptElementType("TYPE");
  IElementType VAR_EXPORT = new GDScriptElementType("VAR_EXPORT");
  IElementType VAR_STATEMENT = new GDScriptElementType("VAR_STATEMENT");
  IElementType WHILE_STATEMENT = new GDScriptElementType("WHILE_STATEMENT");

  IElementType AMPERSAND = new GDScriptTokenType("&");
  IElementType AMPERSAND_AMPERSAND = new GDScriptTokenType("&&");
  IElementType AMPERSAND_EQUAL = new GDScriptTokenType("&=");
  IElementType AND = new GDScriptTokenType("and");
  IElementType ARROW = new GDScriptTokenType("->");
  IElementType AS = new GDScriptTokenType("as");
  IElementType ASSERT = new GDScriptTokenType("assert");
  IElementType AT_EXPORT = new GDScriptTokenType("@export");
  IElementType AT_EXPORT_CATEGORY = new GDScriptTokenType("@export_category");
  IElementType AT_EXPORT_COLOR_NO_ALPHA = new GDScriptTokenType("@export_color_no_alpha");
  IElementType AT_EXPORT_DIR = new GDScriptTokenType("@export_dir");
  IElementType AT_EXPORT_ENUM = new GDScriptTokenType("@export_enum");
  IElementType AT_EXPORT_EXP_EASING = new GDScriptTokenType("@export_exp_easing");
  IElementType AT_EXPORT_FILE = new GDScriptTokenType("@export_file");
  IElementType AT_EXPORT_FLAGS = new GDScriptTokenType("@export_flags");
  IElementType AT_EXPORT_FLAGS_2D_NAVIGATION = new GDScriptTokenType("@export_flags_2d_navigation");
  IElementType AT_EXPORT_FLAGS_2D_PHYSICS = new GDScriptTokenType("@export_flags_2d_physics");
  IElementType AT_EXPORT_FLAGS_2D_RENDER = new GDScriptTokenType("@export_flags_2d_render");
  IElementType AT_EXPORT_FLAGS_3D_NAVIGATION = new GDScriptTokenType("@export_flags_3d_navigation");
  IElementType AT_EXPORT_FLAGS_3D_PHYSICS = new GDScriptTokenType("@export_flags_3d_physics");
  IElementType AT_EXPORT_FLAGS_3D_RENDER = new GDScriptTokenType("@export_flags_3d_render");
  IElementType AT_EXPORT_FLAGS_AVOIDANCE = new GDScriptTokenType("@export_flags_avoidance");
  IElementType AT_EXPORT_GLOBAL_DIR = new GDScriptTokenType("@export_global_dir");
  IElementType AT_EXPORT_GLOBAL_FILE = new GDScriptTokenType("@export_global_file");
  IElementType AT_EXPORT_GROUP = new GDScriptTokenType("@export_group");
  IElementType AT_EXPORT_MULTILINE = new GDScriptTokenType("@export_multiline");
  IElementType AT_EXPORT_NODE_PATH = new GDScriptTokenType("@export_node_path");
  IElementType AT_EXPORT_PLACEHOLDER = new GDScriptTokenType("@export_placeholder");
  IElementType AT_EXPORT_RANGE = new GDScriptTokenType("@export_range");
  IElementType AT_EXPORT_SUBGROUP = new GDScriptTokenType("@export_subgroup");
  IElementType AT_ICON = new GDScriptTokenType("@icon");
  IElementType AT_ONREADY = new GDScriptTokenType("@onready");
  IElementType AT_RPC = new GDScriptTokenType("@rpc");
  IElementType AT_STATIC_UNLOAD = new GDScriptTokenType("@static_unload");
  IElementType AT_TOOL = new GDScriptTokenType("@tool");
  IElementType AT_WARNING_IGNORE = new GDScriptTokenType("@warning_ignore");
  IElementType AWAIT = new GDScriptTokenType("await");
  IElementType BANG = new GDScriptTokenType("!");
  IElementType BANG_EQUAL = new GDScriptTokenType("!=");
  IElementType BINARY_NUMBER = new GDScriptTokenType("BINARY_NUMBER");
  IElementType BOOL = new GDScriptTokenType("bool");
  IElementType BREAK = new GDScriptTokenType("break");
  IElementType BREAKPOINT = new GDScriptTokenType("breakpoint");
  IElementType CARET = new GDScriptTokenType("^");
  IElementType CARET_EQUAL = new GDScriptTokenType("^=");
  IElementType CLASS = new GDScriptTokenType("class");
  IElementType CLASS_NAME = new GDScriptTokenType("class_name");
  IElementType COLON = new GDScriptTokenType(":");
  IElementType COMMA = new GDScriptTokenType(",");
  IElementType CONST = new GDScriptTokenType("const");
  IElementType CONTINUE = new GDScriptTokenType("continue");
  IElementType DOT = new GDScriptTokenType(".");
  IElementType DOT_DOT = new GDScriptTokenType("..");
  IElementType DOUBLE_QUOTED_STRING = new GDScriptTokenType("DOUBLE_QUOTED_STRING");
  IElementType ELIF = new GDScriptTokenType("elif");
  IElementType ELSE = new GDScriptTokenType("else");
  IElementType ENUM = new GDScriptTokenType("enum");
  IElementType EQUAL = new GDScriptTokenType("=");
  IElementType EQUAL_EQUAL = new GDScriptTokenType("==");
  IElementType EXTENDS = new GDScriptTokenType("extends");
  IElementType FALSE = new GDScriptTokenType("false");
  IElementType FLOAT = new GDScriptTokenType("float");
  IElementType FOR = new GDScriptTokenType("for");
  IElementType FUNC = new GDScriptTokenType("func");
  IElementType GET = new GDScriptTokenType("get");
  IElementType GREATER = new GDScriptTokenType(">");
  IElementType GREATER_EQUAL = new GDScriptTokenType(">=");
  IElementType GREATER_GREATER = new GDScriptTokenType(">>");
  IElementType GREATER_GREATER_EQUAL = new GDScriptTokenType(">>=");
  IElementType HEXADECIMAL_NUMBER = new GDScriptTokenType("HEXADECIMAL_NUMBER");
  IElementType IDENTIFIER = new GDScriptTokenType("IDENTIFIER");
  IElementType IF = new GDScriptTokenType("if");
  IElementType IN = new GDScriptTokenType("in");
  IElementType INFER = new GDScriptTokenType(":=");
  IElementType INT = new GDScriptTokenType("int");
  IElementType IS = new GDScriptTokenType("is");
  IElementType LESS = new GDScriptTokenType("<");
  IElementType LESS_EQUAL = new GDScriptTokenType("<=");
  IElementType LESS_LESS = new GDScriptTokenType("<<");
  IElementType LESS_LESS_EQUAL = new GDScriptTokenType("<<=");
  IElementType LINE_BREAK = new GDScriptTokenType("LINE_BREAK");
  IElementType LINE_COMMENT = new GDScriptTokenType("LINE_COMMENT");
  IElementType L_BRACE = new GDScriptTokenType("{");
  IElementType L_BRACKET = new GDScriptTokenType("[");
  IElementType L_PAREN = new GDScriptTokenType("(");
  IElementType MATCH = new GDScriptTokenType("match");
  IElementType MINUS = new GDScriptTokenType("-");
  IElementType MINUS_EQUAL = new GDScriptTokenType("-=");
  IElementType MULTILINE_DOUBLE_QUOTED_STRING = new GDScriptTokenType("MULTILINE_DOUBLE_QUOTED_STRING");
  IElementType MULTILINE_SINGLE_QUOTED_STRING = new GDScriptTokenType("MULTILINE_SINGLE_QUOTED_STRING");
  IElementType NODE_PATH = new GDScriptTokenType("NODE_PATH");
  IElementType NOT = new GDScriptTokenType("not");
  IElementType NULL = new GDScriptTokenType("null");
  IElementType OR = new GDScriptTokenType("or");
  IElementType PASS = new GDScriptTokenType("pass");
  IElementType PERCENT = new GDScriptTokenType("%");
  IElementType PERCENT_EQUAL = new GDScriptTokenType("%=");
  IElementType PIPE = new GDScriptTokenType("|");
  IElementType PIPE_EQUAL = new GDScriptTokenType("|=");
  IElementType PIPE_PIPE = new GDScriptTokenType("||");
  IElementType PLUS = new GDScriptTokenType("+");
  IElementType PLUS_EQUAL = new GDScriptTokenType("+=");
  IElementType REAL_NUMBER = new GDScriptTokenType("REAL_NUMBER");
  IElementType RETURN = new GDScriptTokenType("return");
  IElementType R_BRACE = new GDScriptTokenType("}");
  IElementType R_BRACKET = new GDScriptTokenType("]");
  IElementType R_PAREN = new GDScriptTokenType(")");
  IElementType SELF = new GDScriptTokenType("self");
  IElementType SEMICOLON = new GDScriptTokenType(";");
  IElementType SET = new GDScriptTokenType("set");
  IElementType SIGNAL = new GDScriptTokenType("signal");
  IElementType SINGLE_QUOTED_STRING = new GDScriptTokenType("SINGLE_QUOTED_STRING");
  IElementType SLASH = new GDScriptTokenType("/");
  IElementType SLASH_EQUAL = new GDScriptTokenType("/=");
  IElementType STAR = new GDScriptTokenType("*");
  IElementType STAR_EQUAL = new GDScriptTokenType("*=");
  IElementType STATIC = new GDScriptTokenType("static");
  IElementType SUPER = new GDScriptTokenType("super");
  IElementType TILDE = new GDScriptTokenType("~");
  IElementType TRUE = new GDScriptTokenType("true");
  IElementType UNDERSCORE = new GDScriptTokenType("_");
  IElementType VAR = new GDScriptTokenType("var");
  IElementType VOID = new GDScriptTokenType("void");
  IElementType WHILE = new GDScriptTokenType("while");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARRAY_ARGUMENT) {
        return new GDScriptArrayArgumentImpl(node);
      }
      else if (type == ARRAY_EXPRESSION) {
        return new GDScriptArrayExpressionImpl(node);
      }
      else if (type == ARRAY_PATTERN) {
        return new GDScriptArrayPatternImpl(node);
      }
      else if (type == ASSERT_STATEMENT) {
        return new GDScriptAssertStatementImpl(node);
      }
      else if (type == ASSIGN_OPERATOR) {
        return new GDScriptAssignOperatorImpl(node);
      }
      else if (type == ASSIGN_STATEMENT) {
        return new GDScriptAssignStatementImpl(node);
      }
      else if (type == AWAIT_STATEMENT) {
        return new GDScriptAwaitStatementImpl(node);
      }
      else if (type == BINDING_PATTERN) {
        return new GDScriptBindingPatternImpl(node);
      }
      else if (type == BLOCK) {
        return new GDScriptBlockImpl(node);
      }
      else if (type == BLOCK_GET) {
        return new GDScriptBlockGetImpl(node);
      }
      else if (type == BLOCK_SET) {
        return new GDScriptBlockSetImpl(node);
      }
      else if (type == BREAK_STATEMENT) {
        return new GDScriptBreakStatementImpl(node);
      }
      else if (type == CLASS_BLOCK) {
        return new GDScriptClassBlockImpl(node);
      }
      else if (type == CLASS_CONST_DECLARATION) {
        return new GDScriptClassConstDeclarationImpl(node);
      }
      else if (type == CLASS_NAME_DECLARATION) {
        return new GDScriptClassNameDeclarationImpl(node);
      }
      else if (type == CLASS_VAR_DECLARATION) {
        return new GDScriptClassVarDeclarationImpl(node);
      }
      else if (type == CLASS_VAR_NAME) {
        return new GDScriptClassVarNameImpl(node);
      }
      else if (type == CONST_STATEMENT) {
        return new GDScriptConstStatementImpl(node);
      }
      else if (type == CONTINUE_STATEMENT) {
        return new GDScriptContinueStatementImpl(node);
      }
      else if (type == DICTIONARY_ENTRY) {
        return new GDScriptDictionaryEntryImpl(node);
      }
      else if (type == DICTIONARY_EXPRESSION) {
        return new GDScriptDictionaryExpressionImpl(node);
      }
      else if (type == DICT_PATTERN) {
        return new GDScriptDictPatternImpl(node);
      }
      else if (type == ELIF_STATEMENT) {
        return new GDScriptElifStatementImpl(node);
      }
      else if (type == ELSE_STATEMENT) {
        return new GDScriptElseStatementImpl(node);
      }
      else if (type == ENUM_DECLARATION) {
        return new GDScriptEnumDeclarationImpl(node);
      }
      else if (type == ENUM_ENTRY) {
        return new GDScriptEnumEntryImpl(node);
      }
      else if (type == EXPRESSION) {
        return new GDScriptExpressionImpl(node);
      }
      else if (type == EXPRESSION_STATEMENT) {
        return new GDScriptExpressionStatementImpl(node);
      }
      else if (type == EXTENDS_DECLARATION) {
        return new GDScriptExtendsDeclarationImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new GDScriptForStatementImpl(node);
      }
      else if (type == FUNCTION_DECLARATION) {
        return new GDScriptFunctionDeclarationImpl(node);
      }
      else if (type == FUNCTION_NAME) {
        return new GDScriptFunctionNameImpl(node);
      }
      else if (type == FUNCTION_PARAMETER) {
        return new GDScriptFunctionParameterImpl(node);
      }
      else if (type == FUNCTION_RETURN_TYPE) {
        return new GDScriptFunctionReturnTypeImpl(node);
      }
      else if (type == ID) {
        return new GDScriptIdImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new GDScriptIfStatementImpl(node);
      }
      else if (type == INNER_CLASS_DECLARATION) {
        return new GDScriptInnerClassDeclarationImpl(node);
      }
      else if (type == INVOCATION_EXPRESSION) {
        return new GDScriptInvocationExpressionImpl(node);
      }
      else if (type == KEY) {
        return new GDScriptKeyImpl(node);
      }
      else if (type == KEY_VALUE_PATTERN) {
        return new GDScriptKeyValuePatternImpl(node);
      }
      else if (type == LAMBDA_EXPRESSION) {
        return new GDScriptLambdaExpressionImpl(node);
      }
      else if (type == LUA_DICTIONARY_ENTRY) {
        return new GDScriptLuaDictionaryEntryImpl(node);
      }
      else if (type == LUA_DICTIONARY_EXPRESSION) {
        return new GDScriptLuaDictionaryExpressionImpl(node);
      }
      else if (type == MATCH_BLOCK) {
        return new GDScriptMatchBlockImpl(node);
      }
      else if (type == MATCH_STATEMENT) {
        return new GDScriptMatchStatementImpl(node);
      }
      else if (type == PARAMETER_NAME) {
        return new GDScriptParameterNameImpl(node);
      }
      else if (type == PATTERN) {
        return new GDScriptPatternImpl(node);
      }
      else if (type == PATTERN_LIST) {
        return new GDScriptPatternListImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new GDScriptReturnStatementImpl(node);
      }
      else if (type == SET_GET) {
        return new GDScriptSetGetImpl(node);
      }
      else if (type == SET_OR_GET) {
        return new GDScriptSetOrGetImpl(node);
      }
      else if (type == SIGNAL_DECLARATION) {
        return new GDScriptSignalDeclarationImpl(node);
      }
      else if (type == SIGNAL_PARAMETERS) {
        return new GDScriptSignalParametersImpl(node);
      }
      else if (type == STRING) {
        return new GDScriptStringImpl(node);
      }
      else if (type == TOP_LEVEL_ANNOTATION) {
        return new GDScriptTopLevelAnnotationImpl(node);
      }
      else if (type == TYPE) {
        return new GDScriptTypeImpl(node);
      }
      else if (type == VAR_EXPORT) {
        return new GDScriptVarExportImpl(node);
      }
      else if (type == VAR_STATEMENT) {
        return new GDScriptVarStatementImpl(node);
      }
      else if (type == WHILE_STATEMENT) {
        return new GDScriptWhileStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
