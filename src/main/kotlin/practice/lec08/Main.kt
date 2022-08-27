fun max(a: Int, b: Int): Int {
    return if(a>b){
        a
    }else{
        b
    }
}

fun repeat(str: String, num: Int=3, useNewLine: Boolean=true) {
    for(i in 1..num){
        if(useNewLine){
            println(str)
        }else{
            println(str)
        }
    }
}

//fun main(){
//    repeat("Hello", useNewLine = false)
//}

fun printAll(vararg strings: String) {
    for(str in strings){
        println(str)
    }
}

fun main() {
    printAll("A", "B", "C")

    val array=arrayOf("A", "B", "C")
    printAll(*array)
}
