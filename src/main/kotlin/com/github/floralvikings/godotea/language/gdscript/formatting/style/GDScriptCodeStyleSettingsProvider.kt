package com.github.floralvikings.godotea.language.gdscript.formatting.style

import com.github.floralvikings.godotea.language.gdscript.GDScriptLanguage
import com.intellij.application.options.CodeStyleAbstractConfigurable
import com.intellij.application.options.CodeStyleAbstractPanel
import com.intellij.application.options.TabbedLanguageCodeStylePanel
import com.intellij.lang.Language
import com.intellij.psi.codeStyle.CodeStyleConfigurable
import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.psi.codeStyle.CodeStyleSettingsProvider
import com.intellij.psi.codeStyle.CustomCodeStyleSettings

class GDScriptCodeStyleSettingsProvider : CodeStyleSettingsProvider() {
    override fun getLanguage(): Language = GDScriptLanguage.INSTANCE

    override fun createCustomSettings(settings: CodeStyleSettings): CustomCodeStyleSettings =
        GDScriptCodeStyleSettings(settings)

    override fun getConfigurableDisplayName(): String = "GDScript"

    override fun createConfigurable(
        settings: CodeStyleSettings,
        modelSettings: CodeStyleSettings
    ): CodeStyleConfigurable {
        return object : CodeStyleAbstractConfigurable(settings, modelSettings, configurableDisplayName) {
            override fun createPanel(settings: CodeStyleSettings): CodeStyleAbstractPanel {
                return GDScriptStyleMainPanel(currentSettings, settings)
            }
        }
    }

    class GDScriptStyleMainPanel(currentSettings: CodeStyleSettings?, settings: CodeStyleSettings) :
        TabbedLanguageCodeStylePanel(
            GDScriptLanguage.INSTANCE,
            currentSettings,
            settings
        )
}