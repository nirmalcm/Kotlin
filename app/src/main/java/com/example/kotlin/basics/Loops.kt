package com.example.kotlin.basics

fun main() {
    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Mothma")

    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")

    //Looping through arraylist
    for (rebel in rebels) {
        println("Name: $rebel")
    }

    //Looping through maps
    for ((key, value) in rebelVehicles) {
        println("$key gets around in their $value")
    }


    //Same kind of while loop as in java
    var x = 0
    while (x <= 10) {
        println(x)
        x++
    }

    var y = 0
    while (y > 0) {
        println(y)
        y = y-1 //Or we can replace it with y--
    }
}