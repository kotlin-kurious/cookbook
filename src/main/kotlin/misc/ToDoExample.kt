package misc

// Problem: guarantee to complete a particular function or test.
// Solution: Use the `TODO` function (with an optional reason) that throws an exception if function is not implemented.
class ToDoExample {
    fun main() {
        TODO(reason = "no excuses")
    }

    fun completeThis() {
        TODO()
    }
}