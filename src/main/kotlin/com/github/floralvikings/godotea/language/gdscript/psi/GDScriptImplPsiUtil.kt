package com.github.floralvikings.godotea.language.gdscript.psi

class GDScriptImplPsiUtil {
    companion object {



        @JvmStatic
        fun getClassName(element: GDScriptClassNameDeclaration): String? {
            val idNode = element.node.findChildByType(GDScriptTypes.ID)
            if(idNode != null) {
                return idNode.text
            }
            return null
        }

        @JvmStatic
        fun getClassName(element: GDScriptInnerClassDeclaration): String? {
            val idNode = element.node.findChildByType(GDScriptTypes.ID)
            if(idNode != null) {
                return idNode.text
            }
            return null
        }
    }
}
