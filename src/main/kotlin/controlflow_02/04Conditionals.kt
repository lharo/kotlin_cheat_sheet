package controlflow_02

fun main(){

//    Kotlin uses == for structural comparison and === for referential comparison.
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)
    println(authors === writers) //False sets don't care about order

    //There are no ternary operators we just use an if
    fun max(a: Int, b: Int) = if (a > b) a else b
    var o = max(1,3)
//    val max = if (a > b) a else b
    println(o)
}