
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDPackedByteArray: GDType("PackedByteArray", {



constructor {

}

constructor {
"from"(GDSameType)
}

constructor {
"from"(GDArray)
}

func("append") {
returns(GDbool)
"value"(GDint)
}

func("append_array") {
returns(GDvoid)
"array"(GDSameType)
}

func("bsearch") {
returns(GDint)
"value"(GDint)
"before"(GDbool)
}

func("clear") {
returns(GDvoid)

}

func("compress") {
returns(GDSameType)
"compression_mode"(GDint)
}

func("count") {
returns(GDint)
"value"(GDint)
}

func("decode_double") {
returns(GDfloat)
"byte_offset"(GDint)
}

func("decode_float") {
returns(GDfloat)
"byte_offset"(GDint)
}

func("decode_half") {
returns(GDfloat)
"byte_offset"(GDint)
}

func("decode_s8") {
returns(GDint)
"byte_offset"(GDint)
}

func("decode_s16") {
returns(GDint)
"byte_offset"(GDint)
}

func("decode_s32") {
returns(GDint)
"byte_offset"(GDint)
}

func("decode_s64") {
returns(GDint)
"byte_offset"(GDint)
}

func("decode_u8") {
returns(GDint)
"byte_offset"(GDint)
}

func("decode_u16") {
returns(GDint)
"byte_offset"(GDint)
}

func("decode_u32") {
returns(GDint)
"byte_offset"(GDint)
}

func("decode_u64") {
returns(GDint)
"byte_offset"(GDint)
}

func("decode_var") {
returns(GDVariant)
"byte_offset"(GDint)
"allow_objects"(GDbool)
}

func("decode_var_size") {
returns(GDint)
"byte_offset"(GDint)
"allow_objects"(GDbool)
}

func("decompress") {
returns(GDSameType)
"buffer_size"(GDint)
"compression_mode"(GDint)
}

func("decompress_dynamic") {
returns(GDSameType)
"max_output_size"(GDint)
"compression_mode"(GDint)
}

func("duplicate") {
returns(GDSameType)

}

func("encode_double") {
returns(GDvoid)
"byte_offset"(GDint)
"value"(GDfloat)
}

func("encode_float") {
returns(GDvoid)
"byte_offset"(GDint)
"value"(GDfloat)
}

func("encode_half") {
returns(GDvoid)
"byte_offset"(GDint)
"value"(GDfloat)
}

func("encode_s8") {
returns(GDvoid)
"byte_offset"(GDint)
"value"(GDint)
}

func("encode_s16") {
returns(GDvoid)
"byte_offset"(GDint)
"value"(GDint)
}

func("encode_s32") {
returns(GDvoid)
"byte_offset"(GDint)
"value"(GDint)
}

func("encode_s64") {
returns(GDvoid)
"byte_offset"(GDint)
"value"(GDint)
}

func("encode_u8") {
returns(GDvoid)
"byte_offset"(GDint)
"value"(GDint)
}

func("encode_u16") {
returns(GDvoid)
"byte_offset"(GDint)
"value"(GDint)
}

func("encode_u32") {
returns(GDvoid)
"byte_offset"(GDint)
"value"(GDint)
}

func("encode_u64") {
returns(GDvoid)
"byte_offset"(GDint)
"value"(GDint)
}

func("encode_var") {
returns(GDint)
"byte_offset"(GDint)
"value"(GDVariant)
"allow_objects"(GDbool)
}

func("fill") {
returns(GDvoid)
"value"(GDint)
}

func("find") {
returns(GDint)
"value"(GDint)
"from"(GDint)
}

func("get_string_from_ascii") {
returns(GDString)

}

func("get_string_from_utf8") {
returns(GDString)

}

func("get_string_from_utf16") {
returns(GDString)

}

func("get_string_from_utf32") {
returns(GDString)

}

func("get_string_from_wchar") {
returns(GDString)

}

func("has") {
returns(GDbool)
"value"(GDint)
}

func("has_encoded_var") {
returns(GDbool)
"byte_offset"(GDint)
"allow_objects"(GDbool)
}

func("hex_encode") {
returns(GDString)

}

func("insert") {
returns(GDint)
"at_index"(GDint)
"value"(GDint)
}

func("is_empty") {
returns(GDbool)

}

func("push_back") {
returns(GDbool)
"value"(GDint)
}

func("remove_at") {
returns(GDvoid)
"index"(GDint)
}

func("resize") {
returns(GDint)
"new_size"(GDint)
}

func("reverse") {
returns(GDvoid)

}

func("rfind") {
returns(GDint)
"value"(GDint)
"from"(GDint)
}

func("set") {
returns(GDvoid)
"index"(GDint)
"value"(GDint)
}

func("size") {
returns(GDint)

}

func("slice") {
returns(GDSameType)
"begin"(GDint)
"end"(GDint)
}

func("sort") {
returns(GDvoid)

}

func("to_float32_array") {
returns(GDPackedFloat32Array)

}

func("to_float64_array") {
returns(GDPackedFloat64Array)

}

func("to_int32_array") {
returns(GDPackedInt32Array)

}

func("to_int64_array") {
returns(GDPackedInt64Array)

}
}){

}