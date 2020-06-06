package firstClass

class Person {
    var str: String = "Arun iyyadurai"
    var age: Int = 36
    /* Methods FUNCTION CALLED IN CLASS CALLED METHOD */
    fun Speak() {
        println("Hello world")
    }

//    fun getYearOfBirth(): Int {
//        return 2020 - age
//    }

    fun getYearOfBirth() = 2020 - age
}

fun main(args: Array<String>) {

    val Person = Person()
    Person.Speak()
    println(Person.str)
    println(Person.getYearOfBirth())
}