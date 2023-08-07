
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDAnimationNode: GDType("AnimationNode", {

"filter_enabled"(GDbool)
constructor { }

func("_get_caption") {
returns(GDString)

}

func("_get_child_by_name") {
returns(GDSameType)
"name"(GDStringName)
}

func("_get_child_nodes") {
returns(GDDictionary)

}

func("_get_parameter_default_value") {
returns(GDVariant)
"parameter"(GDStringName)
}

func("_get_parameter_list") {
returns(GDArray)

}

func("_has_filter") {
returns(GDbool)

}

func("_is_parameter_read_only") {
returns(GDbool)
"parameter"(GDStringName)
}

func("_process") {
returns(GDfloat)
"time"(GDfloat)
"seek"(GDbool)
"is_external_seeking"(GDbool)
"test_only"(GDbool)
}

func("add_input") {
returns(GDbool)
"name"(GDString)
}

func("blend_animation") {
returns(GDvoid)
"animation"(GDStringName)
"time"(GDfloat)
"delta"(GDfloat)
"seeked"(GDbool)
"is_external_seeking"(GDbool)
"blend"(GDfloat)
"looped_flag"(GDLoopedFlag)
}

func("blend_input") {
returns(GDfloat)
"input_index"(GDint)
"time"(GDfloat)
"seek"(GDbool)
"is_external_seeking"(GDbool)
"blend"(GDfloat)
"filter"(GDFilterAction)
"sync"(GDbool)
"test_only"(GDbool)
}

func("blend_node") {
returns(GDfloat)
"name"(GDStringName)
"node"(GDSameType)
"time"(GDfloat)
"seek"(GDbool)
"is_external_seeking"(GDbool)
"blend"(GDfloat)
"filter"(GDFilterAction)
"sync"(GDbool)
"test_only"(GDbool)
}

func("find_input") {
returns(GDint)
"name"(GDString)
}

func("get_input_count") {
returns(GDint)

}

func("get_input_name") {
returns(GDString)
"input"(GDint)
}

func("get_parameter") {
returns(GDVariant)
"name"(GDStringName)
}

func("is_path_filtered") {
returns(GDbool)
"path"(GDNodePath)
}

func("remove_input") {
returns(GDvoid)
"index"(GDint)
}

func("set_filter_path") {
returns(GDvoid)
"path"(GDNodePath)
"enable"(GDbool)
}

func("set_input_name") {
returns(GDbool)
"input"(GDint)
"name"(GDString)
}

func("set_parameter") {
returns(GDvoid)
"name"(GDStringName)
"value"(GDVariant)
}
}){

}