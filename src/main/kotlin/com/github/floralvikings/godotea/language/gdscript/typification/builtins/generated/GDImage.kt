
package com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated

import com.github.floralvikings.godotea.language.gdscript.typification.structure.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.placeholder.*
import com.github.floralvikings.godotea.language.gdscript.typification.builtins.generated.enums.*

object GDImage: GDType("Image", {

"data"(GDDictionary)
constructor { }

func("adjust_bcs") {
returns(GDvoid)
"brightness"(GDfloat)
"contrast"(GDfloat)
"saturation"(GDfloat)
}

func("blend_rect") {
returns(GDvoid)
"src"(GDSameType)
"src_rect"(GDRect2i)
"dst"(GDVector2i)
}

func("blend_rect_mask") {
returns(GDvoid)
"src"(GDSameType)
"mask"(GDSameType)
"src_rect"(GDRect2i)
"dst"(GDVector2i)
}

func("blit_rect") {
returns(GDvoid)
"src"(GDSameType)
"src_rect"(GDRect2i)
"dst"(GDVector2i)
}

func("blit_rect_mask") {
returns(GDvoid)
"src"(GDSameType)
"mask"(GDSameType)
"src_rect"(GDRect2i)
"dst"(GDVector2i)
}

func("bump_map_to_normal_map") {
returns(GDvoid)
"bump_scale"(GDfloat)
}

func("clear_mipmaps") {
returns(GDvoid)

}

func("compress") {
returns(GDError)
"mode"(GDCompressMode)
"source"(GDCompressSource)
"astc_format"(GDASTCFormat)
}

func("compress_from_channels") {
returns(GDError)
"mode"(GDCompressMode)
"channels"(GDUsedChannels)
"astc_format"(GDASTCFormat)
}

func("compute_image_metrics") {
returns(GDDictionary)
"compared_image"(GDSameType)
"use_luma"(GDbool)
}

func("convert") {
returns(GDvoid)
"format"(GDFormat)
}

func("copy_from") {
returns(GDvoid)
"src"(GDSameType)
}

func("create") {
returns(GDSameType)
"width"(GDint)
"height"(GDint)
"use_mipmaps"(GDbool)
"format"(GDFormat)
}

func("create_from_data") {
returns(GDSameType)
"width"(GDint)
"height"(GDint)
"use_mipmaps"(GDbool)
"format"(GDFormat)
"data"(GDPackedByteArray)
}

func("crop") {
returns(GDvoid)
"width"(GDint)
"height"(GDint)
}

func("decompress") {
returns(GDError)

}

func("detect_alpha") {
returns(GDAlphaMode)

}

func("detect_used_channels") {
returns(GDUsedChannels)
"source"(GDCompressSource)
}

func("fill") {
returns(GDvoid)
"color"(GDColor)
}

func("fill_rect") {
returns(GDvoid)
"rect"(GDRect2i)
"color"(GDColor)
}

func("fix_alpha_edges") {
returns(GDvoid)

}

func("flip_x") {
returns(GDvoid)

}

func("flip_y") {
returns(GDvoid)

}

func("generate_mipmaps") {
returns(GDError)
"renormalize"(GDbool)
}

func("get_data") {
returns(GDPackedByteArray)

}

func("get_format") {
returns(GDFormat)

}

func("get_height") {
returns(GDint)

}

func("get_mipmap_offset") {
returns(GDint)
"mipmap"(GDint)
}

func("get_pixel") {
returns(GDColor)
"x"(GDint)
"y"(GDint)
}

func("get_pixelv") {
returns(GDColor)
"point"(GDVector2i)
}

func("get_region") {
returns(GDSameType)
"region"(GDRect2i)
}

func("get_size") {
returns(GDVector2i)

}

func("get_used_rect") {
returns(GDRect2i)

}

func("get_width") {
returns(GDint)

}

func("has_mipmaps") {
returns(GDbool)

}

func("is_compressed") {
returns(GDbool)

}

func("is_empty") {
returns(GDbool)

}

func("is_invisible") {
returns(GDbool)

}

func("load") {
returns(GDError)
"path"(GDString)
}

func("load_bmp_from_buffer") {
returns(GDError)
"buffer"(GDPackedByteArray)
}

func("load_from_file") {
returns(GDSameType)
"path"(GDString)
}

func("load_jpg_from_buffer") {
returns(GDError)
"buffer"(GDPackedByteArray)
}

func("load_png_from_buffer") {
returns(GDError)
"buffer"(GDPackedByteArray)
}

func("load_tga_from_buffer") {
returns(GDError)
"buffer"(GDPackedByteArray)
}

func("load_webp_from_buffer") {
returns(GDError)
"buffer"(GDPackedByteArray)
}

func("normal_map_to_xy") {
returns(GDvoid)

}

func("premultiply_alpha") {
returns(GDvoid)

}

func("resize") {
returns(GDvoid)
"width"(GDint)
"height"(GDint)
"interpolation"(GDInterpolation)
}

func("resize_to_po2") {
returns(GDvoid)
"square"(GDbool)
"interpolation"(GDInterpolation)
}

func("rgbe_to_srgb") {
returns(GDSameType)

}

func("rotate_90") {
returns(GDvoid)
"direction"(GDClockDirection)
}

func("rotate_180") {
returns(GDvoid)

}

func("save_exr") {
returns(GDError)
"path"(GDString)
"grayscale"(GDbool)
}

func("save_exr_to_buffer") {
returns(GDPackedByteArray)
"grayscale"(GDbool)
}

func("save_jpg") {
returns(GDError)
"path"(GDString)
"quality"(GDfloat)
}

func("save_jpg_to_buffer") {
returns(GDPackedByteArray)
"quality"(GDfloat)
}

func("save_png") {
returns(GDError)
"path"(GDString)
}

func("save_png_to_buffer") {
returns(GDPackedByteArray)

}

func("save_webp") {
returns(GDError)
"path"(GDString)
"lossy"(GDbool)
"quality"(GDfloat)
}

func("save_webp_to_buffer") {
returns(GDPackedByteArray)
"lossy"(GDbool)
"quality"(GDfloat)
}

func("set_data") {
returns(GDvoid)
"width"(GDint)
"height"(GDint)
"use_mipmaps"(GDbool)
"format"(GDFormat)
"data"(GDPackedByteArray)
}

func("set_pixel") {
returns(GDvoid)
"x"(GDint)
"y"(GDint)
"color"(GDColor)
}

func("set_pixelv") {
returns(GDvoid)
"point"(GDVector2i)
"color"(GDColor)
}

func("shrink_x2") {
returns(GDvoid)

}

func("srgb_to_linear") {
returns(GDvoid)

}
}){

}