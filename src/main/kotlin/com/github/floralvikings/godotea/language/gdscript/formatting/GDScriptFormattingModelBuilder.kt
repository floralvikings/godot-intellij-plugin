package com.github.floralvikings.godotea.language.gdscript.formatting

import com.github.floralvikings.godotea.language.gdscript.GDScriptLanguage
import com.github.floralvikings.godotea.language.gdscript.formatting.blocks.GDScriptFileBlock
import com.github.floralvikings.godotea.language.gdscript.util.ASSIGNMENT_OPERATORS
import com.intellij.formatting.*
import com.intellij.psi.codeStyle.CodeStyleSettings

class GDScriptFormattingModelBuilder : FormattingModelBuilder {
    override fun createModel(formattingContext: FormattingContext): FormattingModel {
        val settings = formattingContext.codeStyleSettings
        val block = GDScriptFileBlock(
            formattingContext.node,
            Wrap.createWrap(WrapType.NONE, false),
            Alignment.createAlignment(),
            createSpacingBuilder(settings)
        )
        val file = formattingContext.containingFile
        return FormattingModelProvider.createFormattingModelForPsiFile(file, block, settings)
    }

    companion object {
        fun createSpacingBuilder(codeStyleSettings: CodeStyleSettings): SpacingBuilder {
            val commonGDScriptStyleSettings = codeStyleSettings.getCommonSettings(GDScriptLanguage.INSTANCE.id)
            return SpacingBuilder(codeStyleSettings, GDScriptLanguage.INSTANCE)
                .around(ASSIGNMENT_OPERATORS)
                .spaceIf(commonGDScriptStyleSettings.SPACE_AROUND_ASSIGNMENT_OPERATORS)
        }
    }
}