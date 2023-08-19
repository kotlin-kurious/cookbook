package functional

class Fold {

    // Problem :  implement an iterative algorithm in a functional way.
    // Solution : Use the fold function to reduce a sequence or collection to a single value.

    fun sum(vararg nums: Int) =
        nums.fold(0) { acc, n -> acc + n }
}