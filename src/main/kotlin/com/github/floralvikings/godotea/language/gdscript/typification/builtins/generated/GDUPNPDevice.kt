
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDUPNPDevice: GDType("UPNPDevice", {

"description_url"(GDString)
"igd_control_url"(GDString)
"igd_our_addr"(GDString)
"igd_service_type"(GDString)
"igd_status"(GDIGDStatus)
"service_type"(GDString)
constructor { }

func("add_port_mapping") {
returns(GDint)
"port"(GDint)
"port_internal"(GDint)
"desc"(GDString)
"proto"(GDString)
"duration"(GDint)
}

func("delete_port_mapping") {
returns(GDint)
"port"(GDint)
"proto"(GDString)
}

func("is_valid_gateway") {
returns(GDbool)

}

func("query_external_address") {
returns(GDString)

}
}){

}