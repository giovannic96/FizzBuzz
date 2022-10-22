package core

import java.io.File

class RulesFileReader(private val rulesFilePath: String) {

    private val ruleValidator = RuleValidator()

    fun readRules(): List<FizzBuzzRule> {
        val lines = File(rulesFilePath).readLines().toMutableList()

        ruleValidator.validate(lines)
        ruleValidator.sort(lines)

        return lines
            .asMap(",")
            .map { FizzBuzzRule(it.key, it.value) }
    }

    private fun List<String>.asMap(delimiter: String): Set<Map.Entry<String, String>> {
        return this
            .associate { it.split(delimiter).first() to it.split(delimiter).last() }
            .entries
    }
}
