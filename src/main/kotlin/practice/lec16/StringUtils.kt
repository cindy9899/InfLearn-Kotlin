package practice.lec16

fun main() {
    val str="ABC"
    println(str.lastChar())
}

fun String.lastChar(): Char {
    return this[this.length-1]
}

fun Int.add(other: Int): Int {
    return this+other
}

infix fun Int.add2(other: Int): Int {
    return this+other
}