package practice.lec14

fun handleCountry(country: Country) {
    when (country){
        Country.KOREA -> TODO()
        Country.AMERIA -> TODO()
        //어떤 값이 들어올지 아니까
        // 추가적으로 else를 해줄 필요는 없다.
    }
}

enum class Country(private val code:String) {
    KOREA("KO"),
    AMERIA("US");
}