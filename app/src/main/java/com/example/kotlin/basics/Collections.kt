package com.example.kotlin.basics

fun main() {

    //Collection is a collection of multiple objects
    //Kotlin does not have built in collection classes, they are built from java by extending its functionality
    //Arrays , maps , queues , sets etc,.. are examples
    //Collections also have mutable & immutable types
    val imperials = listOf("Emperor","Darth Vader", "Boba Fett", "Tarkin") //List of strings
    println(imperials.sorted()) //Sorts the array (albhabetical order in case of strings, Ascending order in case of integers)
    println(imperials[2]) //Print the third element -- as index starts from 0
    println(imperials.last()) //Print the last one
    println(imperials.contains("Luke")) //Returns boolean if the array contains this specific element
    println(imperials)

    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Mothma")
    println(rebels.size) //Prints the overall size or number of elements
    rebels.add("Chewbacca") //Add new element
    println(rebels)
    rebels.add(0, "Lando") //Adding to a specific index, this actually does not overwrites
    println(rebels)
    println(rebels.indexOf("Luke")) //Returns the index of luke

    rebels.remove("Han Solo") //Removing by element (Removing by index is also available)
    println(rebels)

    //Lists are ordered sequential number of items where as a map is a collection of unordered key value pair
    //The below example is a map of type <string , string>
    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")
    println(rebelVehiclesMap["Solo"]) //Print value of given key
    println(rebelVehiclesMap.get("Solo")) //Same as above
    //println(rebelVehiclesMap.getOrDefault("Leiah", "This ship doesnt exist")) //preventing crash by supplying default value
    println(rebelVehiclesMap.values)

    //The below example is a mutable map
    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")
    rebelVehicles["Luke"] = "XWing" //Changing the value of key luke
    rebelVehicles.put("Leiah", "Tantive IV") // Adding a new key & value to map
    println(rebelVehicles)
    rebelVehicles.remove("Boba Fett") //Removing the given key & its corresponding value
    println(rebelVehicles)
    rebelVehicles.clear() //Clears the entire map
    rebelVehicles.isEmpty() //Returns true if map is empty
}