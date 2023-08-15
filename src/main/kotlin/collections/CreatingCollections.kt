package collections

class CreatingCollections {

    var numList = listOf(3, 1, 4, 1, 5, 9) // Creates an unmodifiable list
    var numSet = setOf(3, 1, 4, 1, 5, 9)  // numSet.size == 5,  an unmodifiable set
    var map = mapOf(1 to "one", 2 to "two", 3 to "three") // immutable map from Pair instances

}