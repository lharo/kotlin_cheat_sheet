package introduction_01

fun strLength(notNull: String): Int {
    return notNull.length
}

//Deal with nullables either interacting with Java Code or truly null value
fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

fun main(){
    var neverNull: String = "This can't be null"
//    neverNull = null

    var nullable: String? = "You can keep a null here"
    nullable = null

    var inferredNonNull = "The compiler assumes non-null"
//    inferredNonNull = null

    strLength(neverNull)
//    strLength(nullable)
}