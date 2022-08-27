fun main() {
    val str: String? = "ABC"
//    println(str.length)
    println(str?.length)

    println(str?.length ?: 0)
}

//fun startsWithA1(str: String?): Boolean {
//    if(str==null) {
//        throw IllegalArgumentException("null이 들어왔습니다.");
//    }
//    return str.startsWith("A");
//}
//+safe call +elvis
fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다.");
}

//fun startsWithA2(str: String?): Boolean? {
//    if(str==null) {
//        return null;
//    }
//    return str.startsWith("A");
//}
//+safe call +elvis
fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A");
}


//fun startsWithA3(str: String?): Boolean {
//    if(str==null) {
//        return false;
//    }
//    return str.startsWith("A");
//}
//+safe call +elvis
fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false;
}

fun startsWithA4(str: String?): Boolean {
    return str!!.startsWith("A")
}

