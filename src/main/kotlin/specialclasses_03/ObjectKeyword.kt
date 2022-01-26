package specialclasses_03

import java.util.Random

//Defines a blueprint.
class LuckDispatcher {
//    Defines a method.
    fun getNumber() {
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

//Defines a class.
class BigBen {
//    Defines a companion. Its name can be omitted.
    companion object Bonger {
//    Defines a companion object method.
        fun getBongs(nTimes: Int) {
            for (i in 1 .. nTimes) {
                print("BONG ")
            }
        }
    }
}

fun main() {
//    Creates instances.
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

//    Calls the method on instances.
    d1.getNumber()
    d2.getNumber()

//    Calls the companion object method via the class name.
//    Equivalent to static functions in java
    BigBen.getBongs(12)
}

//In Kotlin you also have the object keyword. It is used to obtain a data type with a single implementation.

//If you are a Java user and want to understand what "single" means,
// you can think of the Singleton pattern: it ensures you that only
// one instance of that class is created even if 2 threads try to create it.
//To achieve this in Kotlin, you only need to declare an object:
// no class, no constructor, only a lazy instance. Why lazy?
// Because it will be created once when the object is accessed.
// Otherwise, it won't even be created.

//Creates a function with parameters.
fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {

//    Creates an object to use when calculating the result value.
    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

//    Accesses the object's properties.
    val total = dayRates.standard + dayRates.festivity + dayRates.special       //3

    print("Total price: $$total")                                               //4

}
