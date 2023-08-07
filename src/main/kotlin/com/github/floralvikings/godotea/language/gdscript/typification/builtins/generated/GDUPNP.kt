
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDUPNP: GDType("UPNP", {

"discover_ipv6"(GDbool)
"discover_local_port"(GDint)
"discover_multicast_if"(GDString)
constructor { }

func("add_device") {
returns(GDvoid)
"device"(GDUPNPDevice)
}

func("add_port_mapping") {
returns(GDint)
"port"(GDint)
"port_internal"(GDint)
"desc"(GDString)
"proto"(GDString)
"duration"(GDint)
}

func("clear_devices") {
returns(GDvoid)

}

func("delete_port_mapping") {
returns(GDint)
"port"(GDint)
"proto"(GDString)
}

func("discover") {
returns(GDint)
"timeout"(GDint)
"ttl"(GDint)
"device_filter"(GDString)
}

func("get_device") {
returns(GDUPNPDevice)
"index"(GDint)
}

func("get_device_count") {
returns(GDint)

}

func("get_gateway") {
returns(GDUPNPDevice)

}

func("query_external_address") {
returns(GDString)

}

func("remove_device") {
returns(GDvoid)
"index"(GDint)
}

func("set_device") {
returns(GDvoid)
"index"(GDint)
"device"(GDUPNPDevice)
}
}){

}