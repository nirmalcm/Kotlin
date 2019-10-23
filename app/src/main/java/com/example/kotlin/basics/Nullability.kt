package com.example.kotlin.basics

fun main(args: Array<String>) {

    //Unlike java, In kotlin it is mandatory to give a value to the variable at the time of declaration
    //Whether it is null or not, it should be initialised at the time of declaration
    //null means nothing in memmory or no value at all
    //null value leads to null pointer exception
    //Kotlin tries its best to get rid all those null pointer exceptions
    //In kotlin, the compiler never let anytrhing to be null unknowingly

    //Some fact abouts null pointer exception
    //The persion responsible for this null pointer exception is Tony Hoare
    //He appologised for inventing the null refrence & he called it as a billon dollar mistake
    //He said that, he coudnt resist the temptation to put a null reference simply because it was very easy to implement
    //This has lead to innumerable errors, vulnerabilities, and system crashes,
    //which have probably caused a billion dollars of pain and damage in the last decades of years

    var name : String = "JonnyB"
//    name = null //We cannot assign a null to variable which is explicitly set by some value

    //4 ways of null pointer exception in kotlin code is,
    //1. Make an explicit call to throw a null pointer exception by operators
    //2. Usage of operators !!
    //3. External java code (Since java & kotlin is inter operable)
    //4. Data inconsistency at the time of initialisation

    //Making a variable nullable
    var nullableName : String? = "Do I really exist?"
    nullableName = null

    // Null Check
    var length = 0
    if (nullableName != null) {
        length = nullableName.length
    } else {
        length = -1
    }
    println(length)

    //Null check compact mode
    val l = if (nullableName != null) nullableName.length else -1

    // Null check Second method by Safe Call Operator ?
    println(nullableName?.length)

    // Null check Third method is Elvis Operator

    val len = nullableName?.length ?: -1 // Returns default integer value if null
    val noName = nullableName ?: "No one knows me..." // Returns default string value if null

    println(noName) //Prints No one knows me since nullableName is assigned as null

    // !!
    //println(nullableName!!.length) //Forcing the app to crash by forcing a null pointer exception

}