private const val FIZZ_NUMBER_DIVISOR = 3
private const val BUZZ_NUMBER_DIVISOR = 5

class FizzBuzz {

    fun play(input: Int): String {
        return when {
            divisibleByFizzAndBuzzDivisors(input) -> "fizzBuzz"
            divisibleByFizzDivisor(input) -> "fizz"
            divisibleByBuzzDivisor(input) -> "buzz"
            else -> input.toString()
        }
    }

    private fun divisibleByFizzAndBuzzDivisors(input: Int) =
        divisibleByFizzDivisor(input) && divisibleByBuzzDivisor(input)

    private fun divisibleByFizzDivisor(input: Int) = input % FIZZ_NUMBER_DIVISOR == 0

    private fun divisibleByBuzzDivisor(input: Int) = input % BUZZ_NUMBER_DIVISOR == 0
}
