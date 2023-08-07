
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDHTTPClient: GDType("HTTPClient", {

"blocking_mode_enabled"(GDbool)
"connection"(GDStreamPeer)
"read_chunk_size"(GDint)
constructor { }

func("close") {
returns(GDvoid)

}

func("connect_to_host") {
returns(GDError)
"host"(GDString)
"port"(GDint)
"tls_options"(GDTLSOptions)
}

func("get_response_body_length") {
returns(GDint)

}

func("get_response_code") {
returns(GDint)

}

func("get_response_headers") {
returns(GDPackedStringArray)

}

func("get_response_headers_as_dictionary") {
returns(GDDictionary)

}

func("get_status") {
returns(GDStatus)

}

func("has_response") {
returns(GDbool)

}

func("is_response_chunked") {
returns(GDbool)

}

func("poll") {
returns(GDError)

}

func("query_string_from_dict") {
returns(GDString)
"fields"(GDDictionary)
}

func("read_response_body_chunk") {
returns(GDPackedByteArray)

}

func("request") {
returns(GDError)
"method"(GDMethod)
"url"(GDString)
"headers"(GDPackedStringArray)
"body"(GDString)
}

func("request_raw") {
returns(GDError)
"method"(GDMethod)
"url"(GDString)
"headers"(GDPackedStringArray)
"body"(GDPackedByteArray)
}

func("set_http_proxy") {
returns(GDvoid)
"host"(GDString)
"port"(GDint)
}

func("set_https_proxy") {
returns(GDvoid)
"host"(GDString)
"port"(GDint)
}
}){

}