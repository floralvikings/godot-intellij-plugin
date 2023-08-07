
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDStringName: GDType("StringName", {



constructor {

}

constructor {
"from"(GDSameType)
}

constructor {
"from"(GDString)
}

func("begins_with") {
returns(GDbool)
"text"(GDString)
}

func("bigrams") {
returns(GDPackedStringArray)

}

func("bin_to_int") {
returns(GDint)

}

func("c_escape") {
returns(GDString)

}

func("c_unescape") {
returns(GDString)

}

func("capitalize") {
returns(GDString)

}

func("casecmp_to") {
returns(GDint)
"to"(GDString)
}

func("contains") {
returns(GDbool)
"what"(GDString)
}

func("count") {
returns(GDint)
"what"(GDString)
"from"(GDint)
"to"(GDint)
}

func("countn") {
returns(GDint)
"what"(GDString)
"from"(GDint)
"to"(GDint)
}

func("dedent") {
returns(GDString)

}

func("ends_with") {
returns(GDbool)
"text"(GDString)
}

func("erase") {
returns(GDString)
"position"(GDint)
"chars"(GDint)
}

func("find") {
returns(GDint)
"what"(GDString)
"from"(GDint)
}

func("findn") {
returns(GDint)
"what"(GDString)
"from"(GDint)
}

func("format") {
returns(GDString)
"values"(GDVariant)
"placeholder"(GDString)
}

func("get_base_dir") {
returns(GDString)

}

func("get_basename") {
returns(GDString)

}

func("get_extension") {
returns(GDString)

}

func("get_file") {
returns(GDString)

}

func("get_slice") {
returns(GDString)
"delimiter"(GDString)
"slice"(GDint)
}

func("get_slice_count") {
returns(GDint)
"delimiter"(GDString)
}

func("get_slicec") {
returns(GDString)
"delimiter"(GDint)
"slice"(GDint)
}

func("hash") {
returns(GDint)

}

func("hex_decode") {
returns(GDPackedByteArray)

}

func("hex_to_int") {
returns(GDint)

}

func("indent") {
returns(GDString)
"prefix"(GDString)
}

func("insert") {
returns(GDString)
"position"(GDint)
"what"(GDString)
}

func("is_absolute_path") {
returns(GDbool)

}

func("is_empty") {
returns(GDbool)

}

func("is_relative_path") {
returns(GDbool)

}

func("is_subsequence_of") {
returns(GDbool)
"text"(GDString)
}

func("is_subsequence_ofn") {
returns(GDbool)
"text"(GDString)
}

func("is_valid_filename") {
returns(GDbool)

}

func("is_valid_float") {
returns(GDbool)

}

func("is_valid_hex_number") {
returns(GDbool)
"with_prefix"(GDbool)
}

func("is_valid_html_color") {
returns(GDbool)

}

func("is_valid_identifier") {
returns(GDbool)

}

func("is_valid_int") {
returns(GDbool)

}

func("is_valid_ip_address") {
returns(GDbool)

}

func("join") {
returns(GDString)
"parts"(GDPackedStringArray)
}

func("json_escape") {
returns(GDString)

}

func("left") {
returns(GDString)
"length"(GDint)
}

func("length") {
returns(GDint)

}

func("lpad") {
returns(GDString)
"min_length"(GDint)
}

func("lstrip") {
returns(GDString)
"chars"(GDString)
}

func("match") {
returns(GDbool)
"expr"(GDString)
}

func("matchn") {
returns(GDbool)
"expr"(GDString)
}

func("md5_buffer") {
returns(GDPackedByteArray)

}

func("md5_text") {
returns(GDString)

}

func("naturalcasecmp_to") {
returns(GDint)
"to"(GDString)
}

func("naturalnocasecmp_to") {
returns(GDint)
"to"(GDString)
}

func("nocasecmp_to") {
returns(GDint)
"to"(GDString)
}

func("pad_decimals") {
returns(GDString)
"digits"(GDint)
}

func("pad_zeros") {
returns(GDString)
"digits"(GDint)
}

func("path_join") {
returns(GDString)
"file"(GDString)
}

func("repeat") {
returns(GDString)
"count"(GDint)
}

func("replace") {
returns(GDString)
"what"(GDString)
"forwhat"(GDString)
}

func("replacen") {
returns(GDString)
"what"(GDString)
"forwhat"(GDString)
}

func("rfind") {
returns(GDint)
"what"(GDString)
"from"(GDint)
}

func("rfindn") {
returns(GDint)
"what"(GDString)
"from"(GDint)
}

func("right") {
returns(GDString)
"length"(GDint)
}

func("rpad") {
returns(GDString)
"min_length"(GDint)
}

func("rsplit") {
returns(GDPackedStringArray)
"delimiter"(GDString)
"allow_empty"(GDbool)
"maxsplit"(GDint)
}

func("rstrip") {
returns(GDString)
"chars"(GDString)
}

func("sha1_buffer") {
returns(GDPackedByteArray)

}

func("sha1_text") {
returns(GDString)

}

func("sha256_buffer") {
returns(GDPackedByteArray)

}

func("sha256_text") {
returns(GDString)

}

func("similarity") {
returns(GDfloat)
"text"(GDString)
}

func("simplify_path") {
returns(GDString)

}

func("split") {
returns(GDPackedStringArray)
"delimiter"(GDString)
"allow_empty"(GDbool)
"maxsplit"(GDint)
}

func("split_floats") {
returns(GDPackedFloat64Array)
"delimiter"(GDString)
"allow_empty"(GDbool)
}

func("strip_edges") {
returns(GDString)
"left"(GDbool)
"right"(GDbool)
}

func("strip_escapes") {
returns(GDString)

}

func("substr") {
returns(GDString)
"from"(GDint)
"len"(GDint)
}

func("to_ascii_buffer") {
returns(GDPackedByteArray)

}

func("to_camel_case") {
returns(GDString)

}

func("to_float") {
returns(GDfloat)

}

func("to_int") {
returns(GDint)

}

func("to_lower") {
returns(GDString)

}

func("to_pascal_case") {
returns(GDString)

}

func("to_snake_case") {
returns(GDString)

}

func("to_upper") {
returns(GDString)

}

func("to_utf8_buffer") {
returns(GDPackedByteArray)

}

func("to_utf16_buffer") {
returns(GDPackedByteArray)

}

func("to_utf32_buffer") {
returns(GDPackedByteArray)

}

func("to_wchar_buffer") {
returns(GDPackedByteArray)

}

func("trim_prefix") {
returns(GDString)
"prefix"(GDString)
}

func("trim_suffix") {
returns(GDString)
"suffix"(GDString)
}

func("unicode_at") {
returns(GDint)
"at"(GDint)
}

func("uri_decode") {
returns(GDString)

}

func("uri_encode") {
returns(GDString)

}

func("validate_filename") {
returns(GDString)

}

func("validate_node_name") {
returns(GDString)

}

func("xml_escape") {
returns(GDString)
"escape_quotes"(GDbool)
}

func("xml_unescape") {
returns(GDString)

}
}){

}