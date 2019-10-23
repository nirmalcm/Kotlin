package com.example.kotlin.basics

fun main() {

    val a = 2
    val b = 3

    if (a == b) {
        println("A does in fact equal B")
    }

    if (a != b) {
        println("A does not equal B")
    }

    val accountBalance = 100
    val price = 150

    if (accountBalance >= price) {
        println("You can buy this!")
    } else {
        println("Sorry, you cant!")
    }

    val degrees = 20


    // ==  !=  >   <   >=   <=
    if (degrees >= 25) {
        println("This is some nice weather")
    } else if (degrees <25 && degrees >= 10) {
        println("Grab a sweater")
    } else {
        println("Aww ... its very cold!")
    }

    val isHungry = false
    val isBored = true

    //Implicit equality check
    //The below condition statement Implicitly say (isHungry & isBored) = true as like in java
    if (isHungry || isBored) {
        println("Lets get pizza!")
    }

    //Same as switch in other languages, which is the replacement for long else if chains
    val x = 3
    when (x) {
        1 -> println("x == 1") //Execute if x=1
        2 -> println("x == 2") //Execute if x=2
        else -> println("x does not equal 1 or 2") //Execute if x not equal to 1 or 2
    }

    fun heIsFeeling(mood: String = "angry") {
        if (mood == "angry") {
            println("run for the hills, he is $mood")
        } else {
            println("whatever you do, dont make him angry")
        }
    }

    heIsFeeling("happy")
}