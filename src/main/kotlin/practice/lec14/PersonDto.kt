package practice.lec14

fun main() {
    val dto1 = PersonDto("후", 26)
    val dto2 = PersonDto("후", 24)
    println(dto1==dto2)

}

data class PersonDto( //자동으로 equals, hashCode, toString을 만들어준다.
    val name: String,
    val age: Int
) {}