package core

import exception.RuleFormatException
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import kotlin.test.assertEquals

internal class RuleValidatorTest {

    // TODO add constraint for rules (and add related tests also): input numbers in rules.txt must be prime numbers
    // TODO add constraint for rules (and add related tests also): input numbers must not be duplicated

    private val ruleValidator = RuleValidator()

    @ParameterizedTest
    @ValueSource(strings = ["3,fizz", "3&5,fizz"])
    internal fun `should not throw exception when validate the given input rules`(actualRule: String) {
        assertDoesNotThrow { ruleValidator.validate(actualRule) }
    }

    @ParameterizedTest
    @ValueSource(strings = ["3,3,fizz", "3fizz", "fizz,fizz", "3&,fizz", "3&&5,fizz", "3&5&7,fizz"])
    internal fun `should throw RuleFormatException when validate the given input rules`(actualRule: String) {
        assertThrows<RuleFormatException> { ruleValidator.validate(actualRule) }
    }

    @Test
    internal fun `should not change the order when sort two rules without two divisors`() {
        val rules = mutableListOf("3,fizz", "5,buzz")

        ruleValidator.sort(rules)

        assertEquals(listOf("3,fizz", "5,buzz"), rules)
    }

    @Test
    internal fun `should return first the rule with two divisors`() {
        val rules = mutableListOf("3,fizz", "3&5,fizzBuzz")

        ruleValidator.sort(rules)

        assertEquals(listOf("3&5,fizzBuzz", "3,fizz"), rules)
    }
}
