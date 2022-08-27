package practice.lec13

fun main(){

}

class House(
    private val address: String,
    private val livingRoom: LivingRoom
    ){
    //코틀린은 static이 없어서 그냥 클래스를 쓰면 된다.
    inner class LivingRoom(
        private val area: Double
    ){
        val addrss: String
            get()=this@House.address
    }
}