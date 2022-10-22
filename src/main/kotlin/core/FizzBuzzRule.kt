package core

import java.util.function.Predicate

class FizzBuzzRule(
    private val input: String,
    val output: String
) {

    private val predicate: Predicate<Int> = buildPredicate()

    private fun buildPredicate(): Predicate<Int> {
        return if (input.contains("&")) {
            val firstDivisor = input.split("&").first().toInt()
            val secondDivisor = input.split("&").last().toInt()
            Predicate { x -> (x % firstDivisor) == 0 && (x % secondDivisor) == 0 }
        } else
            Predicate { x -> (x % (input.toInt())) == 0 }
    }

    fun apply(inputNumber: Int): Boolean {
        return predicate.test(inputNumber)
    }
}
