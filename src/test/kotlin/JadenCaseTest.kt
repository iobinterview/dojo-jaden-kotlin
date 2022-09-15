import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class JadenCaseTest {
    private val jadenCase = JadenCase()

    @Test
    fun casingTest1() {
        assertEquals("Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"))
    }

    @Test
    fun casingTest2() {
        assertEquals(
            "How Can Mirrors Be Real If Our Eyes Aren't Real",
            jadenCase.toJadenCase("How can mirrors be real if our eyes aren't real")
        )
    }

    @Test
    fun testNullArg() {
        Assertions.assertNull(jadenCase.toJadenCase(null))
    }

    @Test
    fun testEmptyArg() {
        Assertions.assertNull(jadenCase.toJadenCase(""))
    }
}
