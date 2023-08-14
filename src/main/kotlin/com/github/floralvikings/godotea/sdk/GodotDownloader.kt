package com.github.floralvikings.godotea.sdk

import com.intellij.openapi.components.Service
import java.io.BufferedInputStream
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.net.URL
import java.util.zip.ZipEntry
import java.util.zip.ZipInputStream


@Service
class GodotDownloader {
    companion object {
        fun newFile(destinationDir: File, zipEntry: ZipEntry): File {
            val destFile = File(destinationDir, zipEntry.name)
            val destDirPath = destinationDir.canonicalPath
            val destFilePath = destFile.canonicalPath
            if (!destFilePath.startsWith(destDirPath + File.separator)) {
                throw IOException("Entry is outside of the target dir: " + zipEntry.name)
            }
            return destFile
        }
    }
    
    fun downloadStableGodotBinary(destination: String, version: String): String {
        return downloadStableGodotBinary(destination, version, OS.detect())
    }
    
    fun downloadStableGodotBinary(destination: String, version: String, os: OS): String {
        val destinationDirectory = File(destination)
        if(!destinationDirectory.exists()) {
            destinationDirectory.mkdirs()
        } else if(destinationDirectory.isFile) {
            throw IllegalArgumentException("$destination is not a directory")
        }

        val zipFile = downloadGodotZip(destinationDirectory, version, os)
        extractZipFile(zipFile, destinationDirectory)
        
        val executablePath = when(os) {
            OS.LINUX_X86_64 -> destinationDirectory.canonicalPath + "/Godot_v$version-stable_${os.urlValue}"
            OS.MACOS_UNIVERSAL -> destinationDirectory.canonicalPath + "/Godot.app/Contents/MacOS/Godot"
            OS.WIN64 -> destinationDirectory.canonicalPath + "/Godot_v$version-stable_${os.urlValue}"
        }
        
        return executablePath
    }

    private fun extractZipFile(zipFile: File, extractDestination: File) {
        val buffer = ByteArray(1024)
        val zipStream = ZipInputStream(zipFile.inputStream())
        var zipEntry = zipStream.nextEntry
        while (zipEntry != null) {
            val newFile: File = newFile(extractDestination, zipEntry)
            if (zipEntry.isDirectory) {
                if (!newFile.isDirectory && !newFile.mkdirs()) {
                    throw IOException("Failed to create directory $newFile")
                }
            } else {
                // fix for Windows-created archives
                val parent = newFile.parentFile
                if (!parent.isDirectory && !parent.mkdirs()) {
                    throw IOException("Failed to create directory $parent")
                }

                // write file content
                val fos = FileOutputStream(newFile)
                var len: Int
                while (zipStream.read(buffer).also { len = it } > 0) {
                    fos.write(buffer, 0, len)
                }
                fos.close()
            }
            zipEntry = zipStream.nextEntry
        }
        zipStream.closeEntry()
        zipStream.close()
    }

    private fun downloadGodotZip(destinationDirectory: File, version: String, os: OS): File {
        val zipFile = File(destinationDirectory, "godot.zip")
        if (zipFile.exists()) {
            zipFile.delete()
        }
        zipFile.createNewFile()
        val urlPrefix = "https://downloads.tuxfamily.org/godotengine/$version/Godot_v$version-stable_"
        val zipUrl = "$urlPrefix${os.urlValue}.zip"

        try {
            BufferedInputStream(URL(zipUrl).openStream()).use { stream ->
                FileOutputStream(zipFile).use { fileOutputStream ->
                    val dataBuffer = ByteArray(1024)
                    var bytesRead: Int
                    while (stream.read(dataBuffer, 0, 1024).also { bytesRead = it } != -1) {
                        fileOutputStream.write(dataBuffer, 0, bytesRead)
                    }
                }
            }
        } catch (e: IOException) {
            throw e
        }
        return zipFile
    }

    enum class OS(val urlValue: String) {
        LINUX_X86_64("linux.x86_64"),
        MACOS_UNIVERSAL("macos.universal"),
        WIN64("win64.exe");
        
        companion object {
            fun detect(): OS {
                val osName = System.getProperty("os.name")
                return if(osName.contains("Mac")) {
                    MACOS_UNIVERSAL
                } else if(osName.contains("Windows")) {
                    WIN64
                } else {
                    LINUX_X86_64
                }
            }
        }
    }
}