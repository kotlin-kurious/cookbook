package collections

class Sorting {

    // Problem :  Sort a class by one property, and then equal values by a second property, and so on.
    // Solution : Use the sortedWith and compareBy functions

    data class QuarterBack(val score: Int, val first: String, val last: String)
    val qbs = listOf(
        QuarterBack(70, "Tom", "Brady"),
        QuarterBack(68, "Patrick", "Mahomes"),
        QuarterBack(68, "Peyton", "Manning"),
        QuarterBack(70, "Joe", "Burrow")
    )

    val sorted = qbs.sortedWith(
        compareBy({ it.score }, { it.last }, { it.first })
    )
    // sorted.forEach { println(it) }


    // Chaining comparators together
    val comparator = compareBy<QuarterBack>(QuarterBack::score)
        .thenBy(QuarterBack::last)
        .thenBy(QuarterBack::first)

    //qbs.sortedWith(comparator)
    // .forEach(::println)

}