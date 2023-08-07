
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDCrypto: GDType("Crypto", {


constructor { }

func("constant_time_compare") {
returns(GDbool)
"trusted"(GDPackedByteArray)
"received"(GDPackedByteArray)
}

func("decrypt") {
returns(GDPackedByteArray)
"key"(GDCryptoKey)
"ciphertext"(GDPackedByteArray)
}

func("encrypt") {
returns(GDPackedByteArray)
"key"(GDCryptoKey)
"plaintext"(GDPackedByteArray)
}

func("generate_random_bytes") {
returns(GDPackedByteArray)
"size"(GDint)
}

func("generate_rsa") {
returns(GDCryptoKey)
"size"(GDint)
}

func("generate_self_signed_certificate") {
returns(GDX509Certificate)
"key"(GDCryptoKey)
"issuer_name"(GDString)
"not_before"(GDString)
"not_after"(GDString)
}

func("hmac_digest") {
returns(GDPackedByteArray)
"hash_type"(GDHashType)
"key"(GDPackedByteArray)
"msg"(GDPackedByteArray)
}

func("sign") {
returns(GDPackedByteArray)
"hash_type"(GDHashType)
"hash"(GDPackedByteArray)
"key"(GDCryptoKey)
}

func("verify") {
returns(GDbool)
"hash_type"(GDHashType)
"hash"(GDPackedByteArray)
"signature"(GDPackedByteArray)
"key"(GDCryptoKey)
}
}){

}