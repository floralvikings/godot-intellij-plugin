
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDObject: GDType("Object", {


constructor { }

func("_get") {
returns(GDVariant)
"property"(GDStringName)
}

func("_get_property_list") {
returns(GDTypedArray(GDDictionary::class))

}

func("_init") {
returns(GDvoid)

}

func("_notification") {
returns(GDvoid)
"what"(GDint)
}

func("_property_can_revert") {
returns(GDbool)
"property"(GDStringName)
}

func("_property_get_revert") {
returns(GDVariant)
"property"(GDStringName)
}

func("_set") {
returns(GDbool)
"property"(GDStringName)
"value"(GDVariant)
}

func("_to_string") {
returns(GDString)

}

func("add_user_signal") {
returns(GDvoid)
"signal"(GDString)
"arguments"(GDArray)
}

func("call") {
returns(GDVariant)
"method"(GDStringName)
}

func("call_deferred") {
returns(GDVariant)
"method"(GDStringName)
}

func("callv") {
returns(GDVariant)
"method"(GDStringName)
"arg_array"(GDArray)
}

func("can_translate_messages") {
returns(GDbool)

}

func("cancel_free") {
returns(GDvoid)

}

func("connect") {
returns(GDError)
"signal"(GDStringName)
"callable"(GDCallable)
"flags"(GDint)
}

func("disconnect") {
returns(GDvoid)
"signal"(GDStringName)
"callable"(GDCallable)
}

func("emit_signal") {
returns(GDError)
"signal"(GDStringName)
}

func("free") {
returns(GDvoid)

}

func("get") {
returns(GDVariant)
"property"(GDStringName)
}

func("get_class") {
returns(GDString)

}

func("get_incoming_connections") {
returns(GDTypedArray(GDDictionary::class))

}

func("get_indexed") {
returns(GDVariant)
"property_path"(GDNodePath)
}

func("get_instance_id") {
returns(GDint)

}

func("get_meta") {
returns(GDVariant)
"name"(GDStringName)
"default"(GDVariant)
}

func("get_meta_list") {
returns(GDTypedArray(GDStringName::class))

}

func("get_method_list") {
returns(GDTypedArray(GDDictionary::class))

}

func("get_property_list") {
returns(GDTypedArray(GDDictionary::class))

}

func("get_script") {
returns(GDVariant)

}

func("get_signal_connection_list") {
returns(GDTypedArray(GDDictionary::class))
"signal"(GDStringName)
}

func("get_signal_list") {
returns(GDTypedArray(GDDictionary::class))

}

func("has_meta") {
returns(GDbool)
"name"(GDStringName)
}

func("has_method") {
returns(GDbool)
"method"(GDStringName)
}

func("has_signal") {
returns(GDbool)
"signal"(GDStringName)
}

func("has_user_signal") {
returns(GDbool)
"signal"(GDStringName)
}

func("is_blocking_signals") {
returns(GDbool)

}

func("is_class") {
returns(GDbool)
"class"(GDString)
}

func("is_connected") {
returns(GDbool)
"signal"(GDStringName)
"callable"(GDCallable)
}

func("is_queued_for_deletion") {
returns(GDbool)

}

func("notification") {
returns(GDvoid)
"what"(GDint)
"reversed"(GDbool)
}

func("notify_property_list_changed") {
returns(GDvoid)

}

func("property_can_revert") {
returns(GDbool)
"property"(GDStringName)
}

func("property_get_revert") {
returns(GDVariant)
"property"(GDStringName)
}

func("remove_meta") {
returns(GDvoid)
"name"(GDStringName)
}

func("set") {
returns(GDvoid)
"property"(GDStringName)
"value"(GDVariant)
}

func("set_block_signals") {
returns(GDvoid)
"enable"(GDbool)
}

func("set_deferred") {
returns(GDvoid)
"property"(GDStringName)
"value"(GDVariant)
}

func("set_indexed") {
returns(GDvoid)
"property_path"(GDNodePath)
"value"(GDVariant)
}

func("set_message_translation") {
returns(GDvoid)
"enable"(GDbool)
}

func("set_meta") {
returns(GDvoid)
"name"(GDStringName)
"value"(GDVariant)
}

func("set_script") {
returns(GDvoid)
"script"(GDVariant)
}

func("to_string") {
returns(GDString)

}

func("tr") {
returns(GDString)
"message"(GDStringName)
"context"(GDStringName)
}

func("tr_n") {
returns(GDString)
"message"(GDStringName)
"plural_message"(GDStringName)
"n"(GDint)
"context"(GDStringName)
}
}){

}