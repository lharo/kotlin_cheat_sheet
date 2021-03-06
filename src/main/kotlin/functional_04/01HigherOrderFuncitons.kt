package functional_04

//Declares a higher-order function. It takes two integer parameters, x and y.
// Additionally, it takes another function operation as a parameter.
// The operation parameters and return type are also defined in the declaration.
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
//    The higher order function returns the result of operation invocation with the supplied arguments.
    return operation(x, y)
}

//Declares a function that matches the operationsignature.
fun sum(x: Int, y: Int) = x + y

fun main() {
//    Invokes the higher-order function passing in two integer values and the
//    function argument ::sum. :: is the notation that references a function by name in Kotlin.
    val sumResult = calculate(4, 5, ::sum)
//    Invokes the higher-order function passing in a lambda as a function argument. Looks clearer, doesn't it?
    val mulResult = calculate(4, 5) { a, b -> a * b }
    println("sumResult $sumResult, mulResult $mulResult")
}