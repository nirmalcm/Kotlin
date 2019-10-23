package com.example.kotlin.basics

//Strings is a collection of characters
//Two main types are : 1.Escaped String  2.Raw string
fun main(){
    val str = "This is an example"
    println(str)

    //Escaped string -- Strings using escape characters
    // \\ -- Back slash itself
    // \" -- Double quotation
    // \' -- Single quotation
    // \n -- new line
    // \b -- backspace (Removes the just before character)
    // \r -- (Removes everything comes before)
    // \$ -- Dollar symbol

    //Some escape characters have some special purpose while some are only for display

    val escapedString = "He said,\n \"This is an example\""

    //Raw String -- Strings with no escape characters
    //The given below variable rawString is a multiline string
    val rawString = """A long time ago,
        In a galaxy
        far,far, away...
    """
    println(rawString)
    //However the output of the above multiline string looks ugly like with its weird spacing

    //To solve above problem, we can use trimMargin() function, which automatically get rid of white spaces inside our string
    //Also we have to provide an indicator at where we want to do it, by default it will take the below mentioned character
    val rawString1 = """A long time ago,
        |In a galaxy
        |far,far, away...
    """.trimMargin()
    println(rawString1)

    //We can also set different indicators as per our requirement by notifying it to trimMargin function
    val rawString2 = """A long time ago,
        >In a galaxy
        >far,far, away...
    """.trimMargin(">")

    //Looping over string by character by character -- which shows the string is a collection of characters
    for (char in str){
        println(char) //Print each character in string str
    }

    //Comparing strings and checking whether they are equal to each other or not
    val contentEquals = str.contentEquals("This is an example")
    println(contentEquals) //contentEquals will be a boolean value

    //Checking substring or string embedded in another string
    //Ignore case --> asking whether to ignore case sensitivity or not
    val contains = str.contains("Example", false)
    println(contains)

    //Converting string from uppercase to lowercase & vice versa
    //Conversion is like convert every cxharacters to all upper or all lower
    val uppercase = str.toUpperCase()
    val lower = str.toLowerCase()

    println(uppercase)
    println(lower)

    //Comnverting another data type of int to string
    val num = 6
    val stringNum = num.toString() //Now 6 is a string character and no long an integer
    println(stringNum)

    //Extracting a subsequence from string based on start index & end index
    val subsequence = str.subSequence(0, 4)
    println(subsequence) // This will print sequence "This" from the String "This is an example"

    //String templates, which makes it easier to append strings than in java by avoiding all + signs used to append strings
    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "landspeeder"
    val age = 27

    println("$luke has a $lightSaberColor lightsaber and drives a $vehicle and is $age years old")
    //In the above output, age is an int, even though it get converted to string automatically in kotlin

    println("Lukes full name $luke has ${luke.length} characters")
    println("$luke in uppercase will be ${luke.toUpperCase()}")
    //From the above output, we can notice that inside the string a function call also be implemented with ${}
}