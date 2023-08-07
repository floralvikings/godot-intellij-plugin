
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDFileAccess: GDType("FileAccess", {

"big_endian"(GDbool)
constructor { }

func("close") {
returns(GDvoid)

}

func("eof_reached") {
returns(GDbool)

}

func("file_exists") {
returns(GDbool)
"path"(GDString)
}

func("flush") {
returns(GDvoid)

}

func("get_8") {
returns(GDint)

}

func("get_16") {
returns(GDint)

}

func("get_32") {
returns(GDint)

}

func("get_64") {
returns(GDint)

}

func("get_as_text") {
returns(GDString)
"skip_cr"(GDbool)
}

func("get_buffer") {
returns(GDPackedByteArray)
"length"(GDint)
}

func("get_csv_line") {
returns(GDPackedStringArray)
"delim"(GDString)
}

func("get_double") {
returns(GDfloat)

}

func("get_error") {
returns(GDError)

}

func("get_file_as_bytes") {
returns(GDPackedByteArray)
"path"(GDString)
}

func("get_file_as_string") {
returns(GDString)
"path"(GDString)
}

func("get_float") {
returns(GDfloat)

}

func("get_length") {
returns(GDint)

}

func("get_line") {
returns(GDString)

}

func("get_md5") {
returns(GDString)
"path"(GDString)
}

func("get_modified_time") {
returns(GDint)
"file"(GDString)
}

func("get_open_error") {
returns(GDError)

}

func("get_pascal_string") {
returns(GDString)

}

func("get_path") {
returns(GDString)

}

func("get_path_absolute") {
returns(GDString)

}

func("get_position") {
returns(GDint)

}

func("get_real") {
returns(GDfloat)

}

func("get_sha256") {
returns(GDString)
"path"(GDString)
}

func("get_var") {
returns(GDVariant)
"allow_objects"(GDbool)
}

func("is_open") {
returns(GDbool)

}

func("open") {
returns(GDSameType)
"path"(GDString)
"flags"(GDModeFlags)
}

func("open_compressed") {
returns(GDSameType)
"path"(GDString)
"mode_flags"(GDModeFlags)
"compression_mode"(GDCompressionMode)
}

func("open_encrypted") {
returns(GDSameType)
"path"(GDString)
"mode_flags"(GDModeFlags)
"key"(GDPackedByteArray)
}

func("open_encrypted_with_pass") {
returns(GDSameType)
"path"(GDString)
"mode_flags"(GDModeFlags)
"pass"(GDString)
}

func("seek") {
returns(GDvoid)
"position"(GDint)
}

func("seek_end") {
returns(GDvoid)
"position"(GDint)
}

func("store_8") {
returns(GDvoid)
"value"(GDint)
}

func("store_16") {
returns(GDvoid)
"value"(GDint)
}

func("store_32") {
returns(GDvoid)
"value"(GDint)
}

func("store_64") {
returns(GDvoid)
"value"(GDint)
}

func("store_buffer") {
returns(GDvoid)
"buffer"(GDPackedByteArray)
}

func("store_csv_line") {
returns(GDvoid)
"values"(GDPackedStringArray)
"delim"(GDString)
}

func("store_double") {
returns(GDvoid)
"value"(GDfloat)
}

func("store_float") {
returns(GDvoid)
"value"(GDfloat)
}

func("store_line") {
returns(GDvoid)
"line"(GDString)
}

func("store_pascal_string") {
returns(GDvoid)
"string"(GDString)
}

func("store_real") {
returns(GDvoid)
"value"(GDfloat)
}

func("store_string") {
returns(GDvoid)
"string"(GDString)
}

func("store_var") {
returns(GDvoid)
"value"(GDVariant)
"full_objects"(GDbool)
}
}){

}