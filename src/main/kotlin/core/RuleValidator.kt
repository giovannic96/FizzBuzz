package core

import exception.RuleFormatException

class RuleValidator {

    fun validate(rule: String) {
        val regex = """^\d+(&\d+)?(,[A-Za-z0-9]+)$""".toRegex()

        if(!regex.matches(rule))
            throw RuleFormatException("Rule $rule is not valid")
    }

    fun validate(rules: List<String>) {
        rules.forEach { validate(it) }
    }

    fun sort(rules: MutableList<String>) {
        rules.sortWith(compareByDescending { it.split(",")[0].length })
    }
}
