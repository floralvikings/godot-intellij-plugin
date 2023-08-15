package com.github.floralvikings.godotea.language.gdscript.formatting.style

import com.github.floralvikings.godotea.language.gdscript.GDScriptLanguage
import com.intellij.psi.codeStyle.CodeStyleSettings

val CodeStyleSettings.gdScriptCommonSettings: GDScriptCommonCodeStyleSettings
    get() = getCommonSettings(GDScriptLanguage.INSTANCE) as GDScriptCommonCodeStyleSettings

val CodeStyleSettings.gdScriptCustomSettings: GDScriptCodeStyleSettings
    get() = getCustomSettings(GDScriptCodeStyleSettings::class.java)
