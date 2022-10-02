import kotlin.random.Random

fun main(args: Array<String>) {
    val game = FizzBuzzGame()

    // read map
    val rules = readRules()

    // add behaviours to the game
    game.addRules(rules)

    // run game
    game.play(List(10) {Random.nextInt()})
}

fun readRules(): List<FizzBuzzRule> {
    // read file

    // build map
    val rules = mapOf(3 to "fizz")

    // return list of rules
    return rules.entries.map { FizzBuzzRule(it.key, it.value) }
}