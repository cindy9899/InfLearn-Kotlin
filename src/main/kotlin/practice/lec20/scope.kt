package practice.lec20

fun printPerson(person: Person?){
    person?.let{
        println(it.name)
        println(it.age)
    }
}

fun main(){
    val person = Person("후", 26)
    val value1 = person.let{
        it.age
    }
    val value1_1 = person.let{p->
        p.age
    }
    val value2 = person.run{
        this.age
    }
    val value2_1 = person.run{
        age
    }
    val value3 = person.also{
        it.age
    }
    val value4 = person.apply{
        this.age
    }
//    val person = Person("후", 26)
//    with(person) {
//        println(name)
//        println(this.age)
//    }
}