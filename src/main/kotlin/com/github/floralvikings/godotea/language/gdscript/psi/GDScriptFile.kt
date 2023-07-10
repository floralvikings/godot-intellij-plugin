package com.github.floralvikings.godotea.language.gdscript.psi

import com.github.floralvikings.godotea.language.gdscript.GDScriptFileType
import com.github.floralvikings.godotea.language.gdscript.GDScriptLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class GDScriptFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, GDScriptLanguage.INSTANCE) {
    override fun getFileType(): FileType = GDScriptFileType.INSTANCE

    override fun toString(): String = "GDScript File"
}