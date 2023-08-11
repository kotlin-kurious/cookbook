package delegates

class LazyDelegate {

    val ultimateAnswer: Int by lazy {
        println("computing the answer")
        42
    }
}