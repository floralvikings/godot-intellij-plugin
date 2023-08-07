
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorFeatureProfile: GDType("EditorFeatureProfile", {


constructor { }

func("get_feature_name") {
returns(GDString)
"feature"(GDFeature)
}

func("is_class_disabled") {
returns(GDbool)
"class_name"(GDStringName)
}

func("is_class_editor_disabled") {
returns(GDbool)
"class_name"(GDStringName)
}

func("is_class_property_disabled") {
returns(GDbool)
"class_name"(GDStringName)
"property"(GDStringName)
}

func("is_feature_disabled") {
returns(GDbool)
"feature"(GDFeature)
}

func("load_from_file") {
returns(GDError)
"path"(GDString)
}

func("save_to_file") {
returns(GDError)
"path"(GDString)
}

func("set_disable_class") {
returns(GDvoid)
"class_name"(GDStringName)
"disable"(GDbool)
}

func("set_disable_class_editor") {
returns(GDvoid)
"class_name"(GDStringName)
"disable"(GDbool)
}

func("set_disable_class_property") {
returns(GDvoid)
"class_name"(GDStringName)
"property"(GDStringName)
"disable"(GDbool)
}

func("set_disable_feature") {
returns(GDvoid)
"feature"(GDFeature)
"disable"(GDbool)
}
}){

}