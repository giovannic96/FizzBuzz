import java.io.File

fun main(args: Array<String>) {
    val game = FizzBuzzGame()

    game.addRules(readRules())

    game.play((1..11).toList())
}

fun readRules(): List<FizzBuzzRule> {
    val lines = File("src/main/resources/rules.txt").readLines()

    return lines
        .associate { it.split(",").first().toInt() to it.split(",").last() }.entries
        .map { FizzBuzzRule({x -> (x%(it.key)) == 0}, it.value) }
}