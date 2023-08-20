package com.github.floralvikings.godotea.language.gdscript.inspections

import com.intellij.codeInspection.LocalInspectionTool
import com.intellij.codeInspection.ex.ExternalAnnotatorBatchInspection

class GDScriptCheckInspection : LocalInspectionTool(), ExternalAnnotatorBatchInspection {
    companion object {
        const val SHORT_NAME: String = "GDScriptCheck"
    }
}