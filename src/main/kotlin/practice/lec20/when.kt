package practice.lec20

fun main() {
    val strings = listOf("APPLE", "CAR")
    strings.map{it.length}
        .filter{it>3}
        .let(::println)
      //.let{lengths-> println(lengths)} 위와 동일한 코드

    val str="hello"
    val length = str?.let{
        println(it.uppercase())
        it.length
    }

    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first()
        .let{firstItem ->
            if(firstItem.length>=5) firstItem else "!$firstItem!"
        }.uppercase()
    println(modifiedFirstItem)

//    var person = Person("후", 26).run(
//        hobby = "독서"
//        personRepository::save(this))
//    val person = personRepository.save(Person("후", 26))


//    val person = Person("후", 26)
//    person.apply{this.growOld()}
//        .let{println(it)}
}
//fun createPerson(name: String, age: Int, hobby: String):Person {
//    return Person(
//        name=name,
//        age=age
//    ).apply{
//        this.hobby=hobby
//    }
//}
