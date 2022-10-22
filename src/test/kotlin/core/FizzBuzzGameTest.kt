package core

import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals


internal class FizzBuzzGameTest {

    private val rulesFileReader = RulesFileReader("src/test/resources/rules.txt")
    private val game = FizzBuzzGame()

    init {
        game.addRules(rulesFileReader.readRules())
    }

    @Test
    internal fun `should print input number when fizzBuzz number 1`() {
        assertEquals(listOf("1"), game.play(1))
    }

    @Test
    internal fun `should return fizz when fizzBuzz number 3`() {
        assertEquals(listOf("fizz"), game.play(3))
    }

    @Test
    internal fun `should return buzz when fizzBuzz number 5`() {
        assertEquals(listOf("buzz"), game.play(5))
    }

    @Test
    internal fun `should return fizzBuzz when fizzBuzz number 15`() {
        assertEquals(listOf("fizzBuzz"), game.play(15))
    }

    @Test
    internal fun `should return puff when fizzBuzz number 11`() {
        assertEquals(listOf("puff"), game.play(11))
    }

    @ParameterizedTest
    @CsvSource(value = ["2,2", "6,fizz", "10,buzz", "30,fizzBuzz", "55,buzzPuff"])
    internal fun `should print the expected value for a given input`(actual: Int, expected: String) {
        assertEquals(listOf(expected), game.play(actual))
    }
}
