package collections

import java.time.LocalDate

class Filtering {

    // Problem: Create a new collection of elements of a specified type from an existing group of mixed types.
    // Solution: Use the extension functions filterIsInstance or filterIsInstanceTo.

    val list1 = listOf("a", LocalDate.now(), 3, 1, 4, "b")
    val listOfStrings = list1.filter { it is String }


    // using the filterIsInstance function
    val list2 = listOf("a", LocalDate.now(), 3, 1, 4, "b")
    val all = list2.filterIsInstance<Any>()
    val strings = list2.filterIsInstance<String>()
    val ints = list2.filterIsInstance<Int>()
    val dates = list2.filterIsInstance(LocalDate::class.java)



}