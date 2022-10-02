import java.util.function.Predicate

class FizzBuzzRule(private val predicate: Predicate<Int>, val output: String) {

    fun apply(inputNumber: Int): Boolean {
        return predicate.test(inputNumber)
    }
}
