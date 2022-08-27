package practice.lec12

fun main() {
    println(Singleton.a)
    Singleton.a+=10
    println(Singleton.a)

}

class Person private constructor(var name:String, var age: Int) {
    //kotlin에는 static이라는 개념이 없다.
    companion object Factory{
        val MIN_AGE=1;
        fun newBaby(name: String): Person{
            return Person(name, MIN_AGE)
        }
    }
//    companion object {
//        val MIN_AGE = 1;
//
//        @JvmStatic
//        fun newBaby(name: String): Person{
//            return Person(name, MIN_AGE)
//        }
//    }
}

object Singleton{
    var a: Int=0
}