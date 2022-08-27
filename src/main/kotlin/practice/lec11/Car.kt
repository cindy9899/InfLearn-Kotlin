package practice.lec11

class Car(
    internal val name: String, //name에 대한 getter를 internal로 만들고 싶다.
    private val owner: String, //owner에 대한 getter와 setter를 private으로 만들고 싶다.
    _price: Int
) {
    var price=_price //price에는 setter에만 private를 붙이고 싶다.
       private set   //price의 getter는 default가 public이다.
}