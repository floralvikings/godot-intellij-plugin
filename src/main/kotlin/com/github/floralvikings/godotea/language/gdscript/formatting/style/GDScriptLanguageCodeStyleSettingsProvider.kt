package com.github.floralvikings.godotea.language.gdscript.formatting.style

import com.github.floralvikings.godotea.language.gdscript.GDScriptLanguage
import com.intellij.lang.Language
import com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable
import com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider

class GDScriptLanguageCodeStyleSettingsProvider : LanguageCodeStyleSettingsProvider() {
    override fun getLanguage(): Language = GDScriptLanguage.INSTANCE

    override fun customizeSettings(consumer: CodeStyleSettingsCustomizable, settingsType: SettingsType) {
        if(settingsType == SettingsType.SPACING_SETTINGS) {
            consumer.showStandardOptions("SPACE_AROUND_ASSIGNMENT_OPERATORS");
        }
    }

    override fun getCodeSample(settingsType: SettingsType): String = """
        var vector2 = Vector2()
    """.trimIndent()

}