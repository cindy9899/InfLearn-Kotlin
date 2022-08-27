package practice.lec10

class Cat(species: String) : Animal(species, 4){
    override fun move(){
        println("사뿐사뿐 고양이")
    }
}