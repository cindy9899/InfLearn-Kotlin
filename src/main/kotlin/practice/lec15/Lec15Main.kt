package practice.lec15

fun main() {
//    val array= arrayOf(100, 200)
//
//    for(i in array.indices) {
//        println("${i} ${array[i]}")
//    }
//
//    for((idx, value) in array.withIndex()) {
//        println("${idx} ${array[idx]}")
//    }

    val numbers = listOf(100, 200)
//    printNumbers(emptyList<Int>())

    //하나 가져오기
    println(numbers[0])

    //For Each
    for(number in numbers){
        println(number)
    }

    for((idx, value) in numbers.withIndex()){
        println("${idx} ${value}")
    }
    //------------------------------------

    val setNumbers = setOf(100, 200)

    //For Each
    for(number in setNumbers){
        println(number)
    }
    //전통적인 for문
    for((index, number) in setNumbers.withIndex()){
        println("${index} ${number}")
    }

    //---------------------------------------------
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1]="MONDAY"
    oldMap[2]="TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")
    //-----------------------------------
    for(key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }
}

//private fun printNumbers(numbers : List<Int>){}