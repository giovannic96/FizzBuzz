package core

class FizzBuzzGame(private val rules: MutableList<FizzBuzzRule> = mutableListOf()) {

    fun play(vararg inputNumbers: Int): List<String> {
        return inputNumbers.map { calculateOutput(it) }
    }

    private fun calculateOutput(inputNumber: Int): String {
        return rules
            .firstOrNull { it.apply(inputNumber) }
            ?.output
            ?: inputNumber.toString()
    }

    fun addRules(rules: List<FizzBuzzRule>) {
        this.rules.addAll(rules)
    }
}
