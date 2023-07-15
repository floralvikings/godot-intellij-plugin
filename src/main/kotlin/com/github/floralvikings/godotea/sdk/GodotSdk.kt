package com.github.floralvikings.godotea.sdk

import com.github.floralvikings.godotea.GodotIcons
import com.github.floralvikings.godotea.language.gdscript.parser.GDScriptParserUtil
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.process.CapturingProcessHandler
import com.intellij.execution.process.ProcessOutput
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.diagnostic.debug
import com.intellij.openapi.progress.ProgressManager
import com.intellij.openapi.projectRoots.*
import com.intellij.openapi.util.SystemInfo
import com.intellij.openapi.util.ThrowableComputable
import com.intellij.util.IconUtil
import com.intellij.util.containers.stream
import org.jdom.Element
import java.io.File
import javax.swing.Icon
import javax.swing.SwingUtilities

class GodotSdk : SdkType("Godot") {
    private val log = Logger.getInstance(GodotSdk::class.java)

    override fun saveAdditionalData(additionalData: SdkAdditionalData, additional: Element) {

    }

    override fun suggestHomePath(): String? {
        // TODO Suggesting a home path breaks SDK detection because creating the CapturingProcessHandler causes
        //      a strange issue in the UI where the "add sdk" dialog immediately closes when the Godot SDK is detected
        return null
    }

    override fun getIcon(): Icon = GodotIcons.GODOT

    override fun isValidSdkHome(path: String): Boolean {
        val file = File(path)
        if (!file.isDirectory) {
            return false
        }
        return file.listFiles().stream().anyMatch { it.name.lowercase() == "godot" }
    }

    override fun suggestSdkName(currentSdkName: String?, sdkHome: String): String = "Godot ${getVersionString(sdkHome)}"

    override fun createAdditionalDataConfigurable(
        sdkModel: SdkModel,
        sdkModificator: SdkModificator
    ): AdditionalDataConfigurable? {
        return null
    }

    override fun getVersionString(sdk: Sdk): String? {
        val homePathFile = File(sdk.homePath!!)
        val godotExecutablePath = homePathFile.listFiles()
            ?.firstOrNull { it.name.lowercase().replace(".exe", "") == "godot" }
            ?.absolutePath
            ?: return null

        return try {
            val godotVersionOutput = runGodotVersionCheck(godotExecutablePath)
            godotVersionOutput.stdout.trim()
        } catch (e: Exception) {
            log.warn("Exception running Godot version check", e)
            null
        }
    }

    override fun getVersionString(sdkHome: String): String? {
        val homePathFile = File(sdkHome)
        val godotExecutablePath = homePathFile.listFiles()
            ?.firstOrNull { it.name.lowercase().replace(".exe", "") == "godot" }
            ?.absolutePath
            ?: return super.getVersionString(sdkHome)

        return try {
            val godotVersionOutput = runGodotVersionCheck(godotExecutablePath)
            godotVersionOutput.stdout.trim()
        } catch (e: Exception) {
            log.warn("Exception running Godot version check", e)
            null
        }
    }

    override fun getPresentableName(): String = "Godot"

    override fun getDownloadSdkUrl(): String = "https://godotengine.org/download/"

    private fun runGodotVersionCheck(godotExecutablePath: String): ProcessOutput {
        val commandLine = GeneralCommandLine()
            .withParentEnvironmentType(GeneralCommandLine.ParentEnvironmentType.CONSOLE)
            .withExePath(godotExecutablePath)
            .withParameters("--version")

        log.debug { "Running command ${commandLine.commandLineString}" }

        val processHandler = CapturingProcessHandler(commandLine)
        val processOutput = if (SwingUtilities.isEventDispatchThread()) {
            ProgressManager.getInstance()
                .runProcessWithProgressSynchronously(
                    ThrowableComputable { processHandler.runProcess(10000) },
                    "Godot version check",
                    false,
                    null
                )
        } else {
            processHandler.runProcess(10000)
        }
        log.debug("Version check output: ${processOutput.stdout.trim()}")
        return processOutput
    }
}