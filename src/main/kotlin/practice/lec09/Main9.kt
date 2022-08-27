package practice.lec09

//class Person constructor(name: String, age: Int) {
//    val name:String = name;
//    var age: Int = age;
//}

fun main() {
    val person=Person("후", 26);
    var person2=Person("피곤쓰") //1살인 객체
}

class Person(name: String, var age: Int){
    var name=name
        set(value){
            field=value.uppercase()
        }

    init{
        if(age<=0){
            throw IllegalArgumentException("나이는 ${age}일 수 없다.")
        }
    }

    constructor(name: String): this(name, 1); //생성자 블록

    constructor(): this("신디")
}