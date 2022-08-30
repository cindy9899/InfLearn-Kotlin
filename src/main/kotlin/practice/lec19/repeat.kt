package practice.lec19

fun main() {
    run{
        val numbers = listOf(1, 2, 3)
        numbers.map{number->number+1}
            .forEach{
                number->println(number)
                if(number==3){
                    return@run
                }
            }
    }


    loop@ for(i in 1..100){
        for(j in 1..100){
            if(j==2){
                break@loop
            }
            println("${i} ${j}")
        }
    }

}
fun getNumberOrNull(number: Int): Int? {
    return if(number<=0){
        null
    } else{
        number
    }
}

fun getNumberOrNull2(number: Int): Int? {
    return number.takeIf{it>0}
}
fun getNumberOrNull3(number: Int): Int? {
    return number.takeUnless { it<=0 }
}