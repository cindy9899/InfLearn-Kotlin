package practice.lec03

fun main() {
    val number1: Int?=3
    val number2:Long=number1?.toLong() ?: 0

    val person = Person("최대현")
    println("이름 : ${person.name}")

    val name="홍길동"
    println("이름 : $name")

    """
        ABC
        EFG
        ${name}
    """.trimIndent()

    val str="ABCDE"
    val ch = str[1]
}

//fun printAgeIfPerson(obj: Any) {
//    if(obj is Person) {
//        val person=obj as Person
//        println(person.age)
//    }
//
//    //스마트 캐스트
//    if(obj is Person) {
//        println(person.age)
//    }
//}
//
//fun printAgeIfPerson2(obj: Any?) {
//    val person = obj as? Person
//    println(person?.age)
//}