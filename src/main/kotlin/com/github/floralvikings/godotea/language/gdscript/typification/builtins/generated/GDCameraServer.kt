
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDCameraServer: GDType("CameraServer", {


constructor { }

func("add_feed") {
returns(GDvoid)
"feed"(GDCameraFeed)
}

func("feeds") {
returns(GDTypedArray(GDCameraFeed::class))

}

func("get_feed") {
returns(GDCameraFeed)
"index"(GDint)
}

func("get_feed_count") {
returns(GDint)

}

func("remove_feed") {
returns(GDvoid)
"feed"(GDCameraFeed)
}
}){

}