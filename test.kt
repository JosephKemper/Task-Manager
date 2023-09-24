import java.io.File
import java.io.IOException

fun main() {
    val fileName = "example.txt"
    val content = listOf("Hello", "World!")

    try {
        File(fileName).writeText(content.joinToString("\n"))
    } catch (e: IOException) {
        e.printStackTrace()
    }
}
