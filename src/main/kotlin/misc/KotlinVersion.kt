package misc


class KotlinVersion {
    fun main(args: Array<String>) {
        println("The current Kotlin version is ${kotlin.KotlinVersion.Companion.CURRENT}")
    }
}