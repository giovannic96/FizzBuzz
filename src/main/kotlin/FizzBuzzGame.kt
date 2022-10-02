import behaviours.FizzBuzzBehaviour

class FizzBuzzGame(private val fizzBuzzBehaviour: FizzBuzzBehaviour) {

    fun play(inputNumbers: List<Int>): String {
        return fizzBuzzBehaviour.apply(inputNumbers)
    }
}
