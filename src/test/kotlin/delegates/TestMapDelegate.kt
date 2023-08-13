package delegates

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

@Test
fun `use map delegate for Project`() {
    val project = Project(
        mutableMapOf(
            "name" to "Learn Kotlin",
            "priority" to 5,
            "completed" to true))
    assertAll(
        { assertEquals("Learn Kotlin", project.name) },
        { assertEquals(5, project.priority) },
        { assertTrue(project.completed) }
    )
}