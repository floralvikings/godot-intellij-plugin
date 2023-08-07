
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDString: GDType("String", {



constructor {

}

constructor {
"from"(GDSameType)
}

constructor {
"from"(GDNodePath)
}

constructor {
"from"(GDStringName)
}

func("begins_with") {
returns(GDbool)
"text"(GDSameType)
}

func("bigrams") {
returns(GDPackedStringArray)

}

func("bin_to_int") {
returns(GDint)

}

func("c_escape") {
returns(GDSameType)

}

func("c_unescape") {
returns(GDSameType)

}

func("capitalize") {
returns(GDSameType)

}

func("casecmp_to") {
returns(GDint)
"to"(GDSameType)
}

func("chr") {
returns(GDSameType)
"char"(GDint)
}

func("contains") {
returns(GDbool)
"what"(GDSameType)
}

func("count") {
returns(GDint)
"what"(GDSameType)
"from"(GDint)
"to"(GDint)
}

func("countn") {
returns(GDint)
"what"(GDSameType)
"from"(GDint)
"to"(GDint)
}

func("dedent") {
returns(GDSameType)

}

func("ends_with") {
returns(GDbool)
"text"(GDSameType)
}

func("erase") {
returns(GDSameType)
"position"(GDint)
"chars"(GDint)
}

func("find") {
returns(GDint)
"what"(GDSameType)
"from"(GDint)
}

func("findn") {
returns(GDint)
"what"(GDSameType)
"from"(GDint)
}

func("format") {
returns(GDSameType)
"values"(GDVariant)
"placeholder"(GDSameType)
}

func("get_base_dir") {
returns(GDSameType)

}

func("get_basename") {
returns(GDSameType)

}

func("get_extension") {
returns(GDSameType)

}

func("get_file") {
returns(GDSameType)

}

func("get_slice") {
returns(GDSameType)
"delimiter"(GDSameType)
"slice"(GDint)
}

func("get_slice_count") {
returns(GDint)
"delimiter"(GDSameType)
}

func("get_slicec") {
returns(GDSameType)
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

func("humanize_size") {
returns(GDSameType)
"size"(GDint)
}

func("indent") {
returns(GDSameType)
"prefix"(GDSameType)
}

func("insert") {
returns(GDSameType)
"position"(GDint)
"what"(GDSameType)
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
"text"(GDSameType)
}

func("is_subsequence_ofn") {
returns(GDbool)
"text"(GDSameType)
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
returns(GDSameType)
"parts"(GDPackedStringArray)
}

func("json_escape") {
returns(GDSameType)

}

func("left") {
returns(GDSameType)
"length"(GDint)
}

func("length") {
returns(GDint)

}

func("lpad") {
returns(GDSameType)
"min_length"(GDint)
}

func("lstrip") {
returns(GDSameType)
"chars"(GDSameType)
}

func("match") {
returns(GDbool)
"expr"(GDSameType)
}

func("matchn") {
returns(GDbool)
"expr"(GDSameType)
}

func("md5_buffer") {
returns(GDPackedByteArray)

}

func("md5_text") {
returns(GDSameType)

}

func("naturalcasecmp_to") {
returns(GDint)
"to"(GDSameType)
}

func("naturalnocasecmp_to") {
returns(GDint)
"to"(GDSameType)
}

func("nocasecmp_to") {
returns(GDint)
"to"(GDSameType)
}

func("num") {
returns(GDSameType)
"number"(GDfloat)
"decimals"(GDint)
}

func("num_int64") {
returns(GDSameType)
"number"(GDint)
"base"(GDint)
"capitalize_hex"(GDbool)
}

func("num_scientific") {
returns(GDSameType)
"number"(GDfloat)
}

func("num_uint64") {
returns(GDSameType)
"number"(GDint)
"base"(GDint)
"capitalize_hex"(GDbool)
}

func("pad_decimals") {
returns(GDSameType)
"digits"(GDint)
}

func("pad_zeros") {
returns(GDSameType)
"digits"(GDint)
}

func("path_join") {
returns(GDSameType)
"file"(GDSameType)
}

func("repeat") {
returns(GDSameType)
"count"(GDint)
}

func("replace") {
returns(GDSameType)
"what"(GDSameType)
"forwhat"(GDSameType)
}

func("replacen") {
returns(GDSameType)
"what"(GDSameType)
"forwhat"(GDSameType)
}

func("rfind") {
returns(GDint)
"what"(GDSameType)
"from"(GDint)
}

func("rfindn") {
returns(GDint)
"what"(GDSameType)
"from"(GDint)
}

func("right") {
returns(GDSameType)
"length"(GDint)
}

func("rpad") {
returns(GDSameType)
"min_length"(GDint)
}

func("rsplit") {
returns(GDPackedStringArray)
"delimiter"(GDSameType)
"allow_empty"(GDbool)
"maxsplit"(GDint)
}

func("rstrip") {
returns(GDSameType)
"chars"(GDSameType)
}

func("sha1_buffer") {
returns(GDPackedByteArray)

}

func("sha1_text") {
returns(GDSameType)

}

func("sha256_buffer") {
returns(GDPackedByteArray)

}

func("sha256_text") {
returns(GDSameType)

}

func("similarity") {
returns(GDfloat)
"text"(GDSameType)
}

func("simplify_path") {
returns(GDSameType)

}

func("split") {
returns(GDPackedStringArray)
"delimiter"(GDSameType)
"allow_empty"(GDbool)
"maxsplit"(GDint)
}

func("split_floats") {
returns(GDPackedFloat64Array)
"delimiter"(GDSameType)
"allow_empty"(GDbool)
}

func("strip_edges") {
returns(GDSameType)
"left"(GDbool)
"right"(GDbool)
}

func("strip_escapes") {
returns(GDSameType)

}

func("substr") {
returns(GDSameType)
"from"(GDint)
"len"(GDint)
}

func("to_ascii_buffer") {
returns(GDPackedByteArray)

}

func("to_camel_case") {
returns(GDSameType)

}

func("to_float") {
returns(GDfloat)

}

func("to_int") {
returns(GDint)

}

func("to_lower") {
returns(GDSameType)

}

func("to_pascal_case") {
returns(GDSameType)

}

func("to_snake_case") {
returns(GDSameType)

}

func("to_upper") {
returns(GDSameType)

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
returns(GDSameType)
"prefix"(GDSameType)
}

func("trim_suffix") {
returns(GDSameType)
"suffix"(GDSameType)
}

func("unicode_at") {
returns(GDint)
"at"(GDint)
}

func("uri_decode") {
returns(GDSameType)

}

func("uri_encode") {
returns(GDSameType)

}

func("validate_filename") {
returns(GDSameType)

}

func("validate_node_name") {
returns(GDSameType)

}

func("xml_escape") {
returns(GDSameType)
"escape_quotes"(GDbool)
}

func("xml_unescape") {
returns(GDSameType)

}
}){

}