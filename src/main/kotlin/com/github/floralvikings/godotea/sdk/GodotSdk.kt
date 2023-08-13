package com.github.floralvikings.godotea.sdk

import com.github.floralvikings.godotea.GodotIcons
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.process.CapturingProcessHandler
import com.intellij.execution.process.ProcessOutput
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.progress.ProgressManager
import com.intellij.openapi.projectRoots.*
import com.intellij.openapi.util.ThrowableComputable
import com.intellij.util.containers.stream
import org.jdom.Element
import java.io.File
import javax.swing.Icon
import javax.swing.SwingUtilities

class GodotSdk : SdkType("Godot") {

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
        val godotExecutablePath = getExecutablePath(sdk) ?: return null

        return try {
            val godotVersionOutput = runGodotVersionCheck(sdk)
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
    
    companion object {
        private val log = Logger.getInstance(GodotSdk::class.java)
        
        fun getExecutablePath(sdk: Sdk): String? {
            val homePathFile = File(sdk.homePath!!)
            val godotExecutablePath = homePathFile.listFiles()
                ?.firstOrNull { it.name.lowercase().replace(".exe", "") == "godot" }
                ?.absolutePath
            return godotExecutablePath
        }
        
        fun runGodotCommand(sdk: Sdk, vararg parameters: String): Pair<String, String>? {
            val executablePath = getExecutablePath(sdk)
            val commandLine = GeneralCommandLine()
                .withParentEnvironmentType(GeneralCommandLine.ParentEnvironmentType.CONSOLE)
                .withExePath(executablePath!!)
                .withParameters(*parameters)

            val processHandler = CapturingProcessHandler(commandLine)
            
            val processOutput = if (SwingUtilities.isEventDispatchThread()) {
                ProgressManager.getInstance()
                    .runProcessWithProgressSynchronously(
                        ThrowableComputable { processHandler.runProcess(10000) },
                        commandLine.commandLineString,
                        false,
                        null
                    )
            } else {
                processHandler.runProcess(10000)
            }
            
            return processOutput.stdout to processOutput.stderr
        }

        fun runGodotVersionCheck(sdk: Sdk): ProcessOutput {
            val executablePath = getExecutablePath(sdk)
            return runGodotVersionCheck(executablePath!!)
        }
        
        fun runGodotVersionCheck(executablePath: String): ProcessOutput {
            val commandLine = GeneralCommandLine()
                .withParentEnvironmentType(GeneralCommandLine.ParentEnvironmentType.CONSOLE)
                .withExePath(executablePath)
                .withParameters("--version")

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
}