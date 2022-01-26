package controlflow_02

fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(`01When`())
    cases("hello")

    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(`01When`()))

}

fun cases(obj: Any) {
//    This is a when statement.
    when (obj) {

        1 -> println("One")                     //   Checks whether obj equals to one.
        "Hello" -> println("Greeting")          //   Checks whether obj equals to Hello.
        is Long -> println("Long")              //  Performs type checking.
        !is String -> println("Not a string")   //  Performs inverse type checking.
        else -> println("Unknown")              //  Default statement (might be omitted).
    }
}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {                   // 1
        1 -> "one"                              // 2
        "Hello" -> 1                            // 3
        is Long -> false                        // 4
        else -> 42                              // 5
    }
    return result
}

class `01When`