import core.FizzBuzzGame
import core.RulesFileReader
import io.ConsolePrinter
import utils.toIntArray

fun main(args: Array<String>) {
    val printer = ConsolePrinter()
    val rulesFileReader = RulesFileReader("src/main/resources/rules.txt")
    val game = FizzBuzzGame()

    game.addRules(rulesFileReader.readRules())
    val result = game.play(*(1..55).toIntArray())

    printer.print(result)
}
