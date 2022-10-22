package utils

fun IntRange.toIntArray(): IntArray {
    val size = this.last - this.first + 1
    var current = this.first
    return IntArray(size) { current++ }
}
