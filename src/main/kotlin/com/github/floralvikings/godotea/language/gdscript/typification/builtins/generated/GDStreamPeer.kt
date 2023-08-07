
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDStreamPeer: GDType("StreamPeer", {

"big_endian"(GDbool)
constructor { }

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

func("get_available_bytes") {
returns(GDint)

}

func("get_data") {
returns(GDArray)
"bytes"(GDint)
}

func("get_double") {
returns(GDfloat)

}

func("get_float") {
returns(GDfloat)

}

func("get_partial_data") {
returns(GDArray)
"bytes"(GDint)
}

func("get_string") {
returns(GDString)
"bytes"(GDint)
}

func("get_u8") {
returns(GDint)

}

func("get_u16") {
returns(GDint)

}

func("get_u32") {
returns(GDint)

}

func("get_u64") {
returns(GDint)

}

func("get_utf8_string") {
returns(GDString)
"bytes"(GDint)
}

func("get_var") {
returns(GDVariant)
"allow_objects"(GDbool)
}

func("put_8") {
returns(GDvoid)
"value"(GDint)
}

func("put_16") {
returns(GDvoid)
"value"(GDint)
}

func("put_32") {
returns(GDvoid)
"value"(GDint)
}

func("put_64") {
returns(GDvoid)
"value"(GDint)
}

func("put_data") {
returns(GDError)
"data"(GDPackedByteArray)
}

func("put_double") {
returns(GDvoid)
"value"(GDfloat)
}

func("put_float") {
returns(GDvoid)
"value"(GDfloat)
}

func("put_partial_data") {
returns(GDArray)
"data"(GDPackedByteArray)
}

func("put_string") {
returns(GDvoid)
"value"(GDString)
}

func("put_u8") {
returns(GDvoid)
"value"(GDint)
}

func("put_u16") {
returns(GDvoid)
"value"(GDint)
}

func("put_u32") {
returns(GDvoid)
"value"(GDint)
}

func("put_u64") {
returns(GDvoid)
"value"(GDint)
}

func("put_utf8_string") {
returns(GDvoid)
"value"(GDString)
}

func("put_var") {
returns(GDvoid)
"value"(GDVariant)
"full_objects"(GDbool)
}
}){

}