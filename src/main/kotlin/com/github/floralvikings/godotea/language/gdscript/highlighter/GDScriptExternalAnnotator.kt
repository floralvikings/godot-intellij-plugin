package com.github.floralvikings.godotea.language.gdscript.highlighter

import com.github.floralvikings.godotea.language.gdscript.highlighter.GDScriptExternalAnnotator.GodotScriptCheckInfo
import com.github.floralvikings.godotea.language.gdscript.highlighter.GDScriptExternalAnnotator.GodotScriptCheckOutput
import com.github.floralvikings.godotea.language.gdscript.inspections.GDScriptCheckInspection
import com.github.floralvikings.godotea.language.gdscript.psi.GDScriptFile
import com.github.floralvikings.godotea.sdk.GodotSdk
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.ExternalAnnotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.projectRoots.Sdk
import com.intellij.openapi.roots.ProjectRootManager
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiDocumentManager
import com.intellij.psi.PsiFile

class GDScriptExternalAnnotator : ExternalAnnotator<GodotScriptCheckInfo, GodotScriptCheckOutput>() {

    companion object {
        fun createGodotScriptCheckOutputFromProcessOutput(
            file: GDScriptFile,
            stdout: String,
            stderr: String
        ): GodotScriptCheckOutput {
            val items = mutableListOf<GodotScriptCheckItem>()

            val lines = stderr.split("\n")
                .map { it.replace(Regex("\\[\\d+(;\\d+)?m"), "").trimEnd().removePrefix(Char(27).toString()) }
            var itemIdx = 0
            while (itemIdx < lines.size) {
                val itemLine = lines[itemIdx]
                if (itemLine.isBlank()) {
                    itemIdx++
                    continue
                }
                val itemType = itemLine.substring(0, itemLine.indexOf(":"))
                val itemMessage = itemLine.substring(itemLine.indexOf(":") + 1)
                var traceIdx = itemIdx + 1
                val trace = mutableListOf<GodotScriptCheckTraceItem>()
                while (traceIdx < lines.size && lines[traceIdx].startsWith(Char(32)) && !lines[traceIdx].isBlank()) {
                    val traceLine = lines[traceIdx]
                    val lineNumberString = traceLine.substring(traceLine.lastIndexOf(":") + 1)
                        .removeSuffix(")${Char(27)}")
                    val lineNumber = lineNumberString.toInt() - 1
                    val document = PsiDocumentManager.getInstance(file.project).getDocument(file)
                    val startOffset = document?.getLineStartOffset(lineNumber) ?: 0
                    val endOffset = document?.getLineEndOffset(lineNumber) ?: (startOffset + 1)

                    val traceItem = GodotScriptCheckTraceItem(file, lineNumber, startOffset, endOffset)
                    trace.add(traceItem)
                    traceIdx++
                }
                val item = GodotScriptCheckItem(file, itemType, itemMessage, trace)
                items.add(item)
                itemIdx = traceIdx
            }

            return GodotScriptCheckOutput(items)
        }

        fun GodotScriptCheckOutput.apply(holder: AnnotationHolder) {
            items.filter { it.trace.isNotEmpty() }
                .forEach { item ->
                    val traceHead = item.trace[0]
                    val severity =
                        if (item.type == "SCRIPT ERROR") HighlightSeverity.ERROR else HighlightSeverity.WARNING

                    val lineStartOffset = traceHead.startOffset
                    val lineEndOffset = traceHead.endOffset
                    val annotationBuilder = holder
                        .newAnnotation(severity, item.message)
                        .range(TextRange(lineStartOffset, lineEndOffset))
                    annotationBuilder.create()
                }
        }
    }

    override fun collectInformation(file: PsiFile): GodotScriptCheckInfo? {
        if (file !is GDScriptFile) {
            return null
        }
        val projectSdk = ProjectRootManager.getInstance(file.project).projectSdk

        val sdkType = projectSdk?.sdkType
        if (sdkType !is GodotSdk) {
            return null
        }

        val path = file.virtualFile.path

        return GodotScriptCheckInfo(projectSdk, file, path)
    }

    override fun doAnnotate(collectedInfo: GodotScriptCheckInfo?): GodotScriptCheckOutput? {
        if (collectedInfo == null) {
            return null
        }
        val (stdout, stderr) = GodotSdk.runGodotCommand(
            collectedInfo.sdk,
            "--headless",
            "--check-only",
            "--script",
            collectedInfo.path
        ) ?: return null

        return createGodotScriptCheckOutputFromProcessOutput(collectedInfo.file, stdout, stderr)
    }

    override fun apply(file: PsiFile, annotationResult: GodotScriptCheckOutput?, holder: AnnotationHolder) {
        annotationResult?.apply(holder)
    }

    override fun getPairedBatchInspectionShortName(): String = GDScriptCheckInspection.SHORT_NAME

    data class GodotScriptCheckInfo(val sdk: Sdk, val file: GDScriptFile, val path: String)

    data class GodotScriptCheckOutput(val items: List<GodotScriptCheckItem>)

    data class GodotScriptCheckItem(
        val file: GDScriptFile,
        val type: String,
        val message: String,
        val trace: List<GodotScriptCheckTraceItem>
    )

    data class GodotScriptCheckTraceItem(
        val file: GDScriptFile,
        val lineNumber: Int,
        val startOffset: Int,
        val endOffset: Int
    )
}
