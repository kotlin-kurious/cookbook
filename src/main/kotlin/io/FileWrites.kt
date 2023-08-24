package io

import java.io.File

class FileWrites {
    fun replaceText(fileName: String, data: String) =
        File(fileName).writeText(data)

    fun printData(fileName: String, data: String) =
        File(fileName).printWriter().use { writer ->
            writer.println(data)
        }
}