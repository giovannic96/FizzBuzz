package core

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class FizzBuzzRuleTest {

    private val rule = FizzBuzzRule("3", "fizz")

    @Test
    internal fun `should return true when apply rule on a number divisible by input rule`() {
        assertTrue(rule.apply(3))
    }

    @Test
    internal fun `should return false when apply rule on a number not divisible by input rule`() {
        assertFalse(rule.apply(7))
    }

    @Test
    internal fun `output rule should be the given output`() {
        assertEquals("fizz", rule.output)
    }
}
