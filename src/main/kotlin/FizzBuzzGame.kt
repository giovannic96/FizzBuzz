class FizzBuzzGame(private val rules: MutableList<FizzBuzzRule> = mutableListOf()) {

    fun play(inputNumbers: List<Int>) {
        inputNumbers.forEach { inputNumber ->
            this.rules
                .firstOrNull { it.apply(inputNumber) }
                .also { println(it?.output ?: inputNumber) }
        }
    }

    fun addRules(rules: List<FizzBuzzRule>) {
        this.rules.addAll(rules)
    }
}
