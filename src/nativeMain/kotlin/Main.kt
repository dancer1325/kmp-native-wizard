import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
private data class Message(
    val topic: String,
    val content: String,
)

private val PrettyPrintJson = Json {
    prettyPrint = true
}

fun String.countDistinctCharacters() = lowercase().toList().distinct().count()

fun main() {
    val message = Message(
        topic = "Kotlin/Native",
        content = "Hello!"
    )
    println(PrettyPrintJson.encodeToString(message))

    // 1. Read the input value.
    println("Hello, enter your name:")
    val name = readln()
    // 2. Count the letters in the name.
    name.replace(" ", "").let {
        println("Your name contains ${it.length} letters")

        // 3. Print the number of unique letters
        println("Your name contains ${it.countDistinctCharacters()} unique letters")
    }
}
