
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDEditorExportPlugin: GDType("EditorExportPlugin", {


constructor { }

func("_begin_customize_resources") {
returns(GDbool)
"platform"(GDEditorExportPlatform)
"features"(GDPackedStringArray)
}

func("_begin_customize_scenes") {
returns(GDbool)
"platform"(GDEditorExportPlatform)
"features"(GDPackedStringArray)
}

func("_customize_resource") {
returns(GDResource)
"resource"(GDResource)
"path"(GDString)
}

func("_customize_scene") {
returns(GDNode)
"scene"(GDNode)
"path"(GDString)
}

func("_end_customize_resources") {
returns(GDvoid)

}

func("_end_customize_scenes") {
returns(GDvoid)

}

func("_export_begin") {
returns(GDvoid)
"features"(GDPackedStringArray)
"is_debug"(GDbool)
"path"(GDString)
"flags"(GDint)
}

func("_export_end") {
returns(GDvoid)

}

func("_export_file") {
returns(GDvoid)
"path"(GDString)
"type"(GDString)
"features"(GDPackedStringArray)
}

func("_get_customization_configuration_hash") {
returns(GDint)

}

func("_get_export_features") {
returns(GDPackedStringArray)
"platform"(GDEditorExportPlatform)
"debug"(GDbool)
}

func("_get_export_options") {
returns(GDTypedArray(GDDictionary::class))
"platform"(GDEditorExportPlatform)
}

func("_get_name") {
returns(GDString)

}

func("_should_update_export_options") {
returns(GDbool)
"platform"(GDEditorExportPlatform)
}

func("add_file") {
returns(GDvoid)
"path"(GDString)
"file"(GDPackedByteArray)
"remap"(GDbool)
}

func("add_ios_bundle_file") {
returns(GDvoid)
"path"(GDString)
}

func("add_ios_cpp_code") {
returns(GDvoid)
"code"(GDString)
}

func("add_ios_embedded_framework") {
returns(GDvoid)
"path"(GDString)
}

func("add_ios_framework") {
returns(GDvoid)
"path"(GDString)
}

func("add_ios_linker_flags") {
returns(GDvoid)
"flags"(GDString)
}

func("add_ios_plist_content") {
returns(GDvoid)
"plist_content"(GDString)
}

func("add_ios_project_static_lib") {
returns(GDvoid)
"path"(GDString)
}

func("add_macos_plugin_file") {
returns(GDvoid)
"path"(GDString)
}

func("add_shared_object") {
returns(GDvoid)
"path"(GDString)
"tags"(GDPackedStringArray)
"target"(GDString)
}

func("get_option") {
returns(GDVariant)
"name"(GDStringName)
}

func("skip") {
returns(GDvoid)

}
}){

}