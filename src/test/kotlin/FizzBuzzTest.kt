
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class FizzBuzzTest {

    private val fizzBuzz = FizzBuzz()

    @Test
    fun `should return input string when fizzBuzz number 1`() {
        assertEquals("1", fizzBuzz.play(1))
    }

    @Test
    fun `should return fizz when fizzBuzz number 3`() {
        assertEquals("fizz", fizzBuzz.play(3))
    }

    @Test
    fun `should return buzz when fizzBuzz number 5`() {
        assertEquals("buzz", fizzBuzz.play(5))
    }

    @Test
    fun `should return fizzBuzz when fizzBuzz number 15`() {
        assertEquals("fizzBuzz", fizzBuzz.play(15))
    }

    @ParameterizedTest
    @CsvSource(value = ["2,2", "6,fizz", "10,buzz", "30,fizzBuzz"])
    fun `should generate the expected value for a given input`(actual: Int, expected: String) {
        assertEquals(expected, fizzBuzz.play(actual))
    }
}
