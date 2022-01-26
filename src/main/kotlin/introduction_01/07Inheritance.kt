package introduction_01

//Kotlin classes are final by default.
// If you want to allow the class inheritance, mark the class with the open modifier.
open class Dog {
//    Kotlin methods are also final by default.
//    As with the classes, the open modifier allows overriding them.
    open fun sayHello() {       // 2
        println("wow wow!")
    }
}

//A class inherits a superclass when you specify the : SuperclassName() after its name.
// The empty parentheses () indicate an invocation of the superclass default constructor.
class Yorkshire : Dog() {
    //    Overriding methods or attributes requires the override modifier.
    override fun sayHello() {   // 4
        println("woof woof!")
    }
}

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

//If you want to use a parameterized constructor of the superclass when creating a subclass,
// provide the constructor arguments in the subclass declaration.
class SiberianTiger : Tiger("Siberia")

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

//name in the Asiatic declaration is neither a var nor val:
// it's a constructor argument, whose value is passed to the name property of the superclass Lion.
class Asiatic(name: String) : Lion(name = name, origin = "India")

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()

    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()

//    Creates an Asiatic instance with the name Rufo.
//    The call invokes the Lion constructor with arguments Rufo and India.
    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()
}