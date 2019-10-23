package com.example.kotlin.basics

//In kotlin, a variable (val or var) is kind of a bucket that holds everything put on it (ie it holds every data types)
//Buckets or variables will be having name or labels on them to retrieve the contents later

//Default main entry point of our kotlin file
//Since kotlin 1.3 parameters are not necessary, so we are not passing args: Array<String>
fun main(){

    //Var -- Mutable variable (Can be changed)
    //Val -- Immutable variable (Cannot be changed or constant)

    //In kotlin, we dont have to or it is not necessary to explicitly say what type a variable is,
    // so a variable automatically or implicitly converts to its assigned data type
    val name = "Leo"

    val lastName : String = "Messi" //Explicitly setting type of the variable

    var isMale = true

    println("Is "+name+lastName+" male ?"+"Answer :"+isMale)

    var a=3
    var  b=6
    println(a+b)

    val doubleNum = 123.45 //64 bit number
    val floatNum = 123.45f //32 bit

    val longNum = 12234456677885L //64 bit

    //To convert from one type to another
    val aDouble = a.toDouble() // Converting 'a' of type int to another variable of type double
    val aString = a.toString() //Converting int to string

    //Declaring a variable without setting a value to it
    var hero : String

    //Setting values for above variable hero later
    hero = "JARVIS"
    hero = "Ironman"
    println(hero)
}