package com.example.kotlin.basics

fun main() {

    //Syntax of functions in kotlin
    fun sampleFunction()  {
        println("This is the output of the sample function")
    }

    sampleFunction()

    //Function with parameters or aguments and no return type
    fun makeMessage(message: String) {
        println(message)
    }

    makeMessage("Learn Learn Learn")

    //Here int is the return type and rebels & ewoks (both ints) are the arguments
    fun calculateNumberOfGoodGuys(rebels: Int, ewoks: Int): Int {
        val goodGuys = rebels + ewoks
        return goodGuys
    }

    val rebels = calculateNumberOfGoodGuys(5, 7)
    // val rebels = 12
    println("Government faced off against $rebels")
    println("Government faced off against ${calculateNumberOfGoodGuys(5,7)}")
    //Both outputs are same, ie while printing, within the string, function can be called directly also

    //Assigning default value to arguments when no data is passed
    fun heIsFeeling(mood: String = "angry") {
        println(mood)
    }

    heIsFeeling()
    heIsFeeling("meh")

}