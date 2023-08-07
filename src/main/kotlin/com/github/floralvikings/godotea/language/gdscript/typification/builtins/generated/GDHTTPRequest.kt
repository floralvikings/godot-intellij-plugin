
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDHTTPRequest: GDType("HTTPRequest", {

"accept_gzip"(GDbool)
"body_size_limit"(GDint)
"download_chunk_size"(GDint)
"download_file"(GDString)
"max_redirects"(GDint)
"timeout"(GDfloat)
"use_threads"(GDbool)
constructor { }

func("cancel_request") {
returns(GDvoid)

}

func("get_body_size") {
returns(GDint)

}

func("get_downloaded_bytes") {
returns(GDint)

}

func("get_http_client_status") {
returns(GDStatus)

}

func("request") {
returns(GDError)
"url"(GDString)
"custom_headers"(GDPackedStringArray)
"method"(GDMethod)
"request_data"(GDString)
}

func("request_raw") {
returns(GDError)
"url"(GDString)
"custom_headers"(GDPackedStringArray)
"method"(GDMethod)
"request_data_raw"(GDPackedByteArray)
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

func("set_tls_options") {
returns(GDvoid)
"client_options"(GDTLSOptions)
}
}){

}