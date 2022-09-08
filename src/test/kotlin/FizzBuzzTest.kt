
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FizzBuzzTest {

    private val fizzBuzz = FizzBuzz()

    @Test
    fun `should return input string when fizzBuzz number 1`() {
        assertEquals("1", fizzBuzz.play(1))
    }

    @Test
    fun `should return input string when fizzBuzz number 2`() {
        assertEquals("2", fizzBuzz.play(2))
    }

    @Test
    fun `should return input string when fizzBuzz number 4`() {
        assertEquals("4", fizzBuzz.play(4))
    }

    @Test
    fun `should return fizz when fizzBuzz number 3`() {
        assertEquals("fizz", fizzBuzz.play(3))
    }

    @Test
    fun `should return fizz when fizzBuzz number 6`() {
        assertEquals("fizz", fizzBuzz.play(6))
    }

    @Test
    fun `should return fizz when fizzBuzz number 9`() {
        assertEquals("fizz", fizzBuzz.play(9))
    }

    @Test
    fun `should return buzz when fizzBuzz number 5`() {
        assertEquals("buzz", fizzBuzz.play(5))
    }

    @Test
    fun `should return buzz when fizzBuzz number 10`() {
        assertEquals("buzz", fizzBuzz.play(10))
    }

    @Test
    fun `should return fizzBuzz when fizzBuzz number 15`() {
        assertEquals("fizzBuzz", fizzBuzz.play(15))
    }

    @Test
    fun `should return fizzBuzz when fizzBuzz number 30`() {
        assertEquals("fizzBuzz", fizzBuzz.play(30))
    }
}
