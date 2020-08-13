suspend fun main() {
    if (process.env["JAVA_HOME"].isNullOrBlank()) {
        println("missing JAVA_HOME!")
    }
}
