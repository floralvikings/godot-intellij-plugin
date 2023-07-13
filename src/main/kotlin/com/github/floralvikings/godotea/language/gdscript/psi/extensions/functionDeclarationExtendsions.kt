package com.github.floralvikings.godotea.language.gdscript.psi.extensions

import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFunctionDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptInnerClassDeclaration
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptTypes
import com.intellij.psi.util.elementType

fun GDScriptFunctionDeclaration.determineQualifiedClassName(): String {
    var currentNode = parent;
    var className = ""
    while (currentNode != null) {
        if (currentNode.elementType == GDScriptTypes.INNER_CLASS_DECLARATION) {
            val classDeclaration = currentNode as GDScriptInnerClassDeclaration
            className = if (className.isEmpty()) {
                "${classDeclaration.id.identifier}"
            } else {
                "${classDeclaration.id.identifier}.$className"
            }
        } else if (currentNode.parent == null) {
            val classNameDeclaration = currentNode.node.findChildByType(GDScriptTypes.CLASS_NAME_DECLARATION)
            if (classNameDeclaration != null) {
                val idNode = classNameDeclaration.findChildByType(GDScriptTypes.ID)
                if (idNode != null) {
                    className = if (className.isEmpty()) {
                        idNode.text
                    } else {
                        "${idNode.text}.$className"
                    }
                }
            }
        }
        currentNode = currentNode.parent
    }

    return className
}
