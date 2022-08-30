package practice.lec19

data class Person (
  val name: String,
  val age: Int
)

fun main() {
  val person = Person("후", 26)
  val (name, age) = person
  println("이름 : ${name}, 나이: ${age}")
}
