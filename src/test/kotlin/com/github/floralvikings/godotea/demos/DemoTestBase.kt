package com.github.floralvikings.godotea.demos

import com.github.floralvikings.godotea.language.gdscript.inspections.GDScriptCheckInspection
import com.github.floralvikings.godotea.sdk.GodotDownloader
import com.github.floralvikings.godotea.sdk.GodotSdk
import com.intellij.codeInspection.ex.InspectionProfileImpl
import com.intellij.openapi.application.runWriteAction
import com.intellij.openapi.components.service
import com.intellij.openapi.projectRoots.ProjectJdkTable
import com.intellij.openapi.projectRoots.Sdk
import com.intellij.openapi.projectRoots.impl.MockSdk
import com.intellij.openapi.roots.ProjectRootManager
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.vfs.isFile
import com.intellij.testFramework.HeavyPlatformTestCase
import com.intellij.testFramework.ParsingTestUtil
import com.intellij.testFramework.fixtures.CodeInsightTestFixture
import com.intellij.testFramework.fixtures.IdeaTestFixtureFactory
import com.intellij.testFramework.utils.vfs.getPsiFile
import com.intellij.util.containers.MultiMap
import java.io.File


abstract class DemoTestBase(val demoPath: String) : HeavyPlatformTestCase() {

    val demoProjectPath: String = "src/test/testData/demos/$demoPath"

    lateinit var godotExecutablePath: String

    lateinit var sdk: Sdk

    override fun setUp() {
        super.setUp()

        InspectionProfileImpl.INIT_INSPECTIONS = true
        val executable = getGodotExecutable()
        godotExecutablePath = if (executable?.exists() == true) {
            executable.canonicalPath
        } else {
            downloadGodotBinary()
        }

        sdk = MockSdk(
            "Godot 4.0.4",
            File(godotExecutablePath).parent,
            "4.0.4",
            MultiMap.empty(),
            GodotSdk()
        )

        runWriteAction {
            ProjectJdkTable.getInstance().addJdk(sdk)
            ProjectRootManager.getInstance(project).projectSdk = sdk
        }
    }

    override fun tearDown() {
        super.tearDown()
        InspectionProfileImpl.INIT_INSPECTIONS = false
    }

    fun getGodotExecutable(): File? {
        val osName = System.getProperty("os.name")
        return if (osName.contains("Mac")) {
            File("godot/Godot.app/Contents/MacOS/Godot")
        } else if (osName.contains("Windows")) {
            File("godot/").listFiles()?.firstOrNull { it.endsWith("win64.exe") }
        } else {
            File("godot/").listFiles()?.firstOrNull() { it.endsWith("linux.x86_64") }
        }
    }

    fun downloadGodotBinary(): String {
        val destination = File("godot")
        if (destination.exists()) {
            destination.deleteRecursively()
        }

        destination.mkdirs()
        val downloader = project.service<GodotDownloader>()
        return downloader.downloadStableGodotBinary("godot/", "4.0.4")
    }

    fun configureDemoProject(fixture: CodeInsightTestFixture, pathToOpen: String): VirtualFile {
        fixture.enableInspections(GDScriptCheckInspection())
        val rootFile = fixture.copyDirectoryToProject(".", ".")
        val fileToOpen = rootFile.findFileByRelativePath(pathToOpen)
        if (fileToOpen != null) {
            fixture.openFileInEditor(fileToOpen)
        }
        return rootFile
    }

    fun createFixture(): CodeInsightTestFixture {
        val projectBuilder = IdeaTestFixtureFactory.getFixtureFactory().createFixtureBuilder(
            name
        )
        val fixture = IdeaTestFixtureFactory.getFixtureFactory()
            .createCodeInsightFixture(projectBuilder.fixture)
        fixture.testDataPath = demoProjectPath
        return fixture
    }

    fun doGodotDemoFileTest() {
        val fixture = createFixture()
        fixture.setUp()

        val rootDirectory = configureDemoProject(fixture, getTestName(false))
        
        val testName = getTestName(false)
        val fileUnderTest = rootDirectory.findAllChildrenWithExtension("gd")
            .first { it.name == "$testName.gd" }
        
        ParsingTestUtil.ensureNoErrorElements(fileUnderTest.getPsiFile(project))
        
        fixture.tearDown()
        runWriteAction {
            ProjectJdkTable.getInstance().removeJdk(sdk)
        }
    }

    fun VirtualFile.findAllChildrenWithExtension(extension: String): List<VirtualFile> {
        val childrenWithExtension = mutableListOf<VirtualFile>()
        children.forEach { 
            if(it.isFile && it.extension == extension) {
                childrenWithExtension.add(it)
            } else if(it.isDirectory) {
                childrenWithExtension.addAll(it.findAllChildrenWithExtension(extension))
            }
        }
        return childrenWithExtension
    }
}