package com.myapp.creativeartwork

/**
 * We can define a singleton object inside a class using companion keyword.
 * This makes our code easy and organized
 * we can access the object in the main function using class name . property of singleton object.
 */
class Quiz {
    val question1 = Question<String>("Capital of India is ______", "Delhi", Difficulty.Easy)
    val question2 = Question<Boolean>("2+2 = 4", true, Difficulty.Medium)
    val question3 = Question<Int>("How many days are there in full Moon", 28, Difficulty.Hard)

    companion object Student {
        var total: Int = 10
        var answer: Int = 5
    }
}

// we can use the extension property by  using . operator
//we have define the extension property of Quiz.Student named progressReport of String type.
//The extension property cannot store data so they can get only.
val Quiz.Student.progressReport: String
    get() = "${Quiz.answer} out of ${Quiz.total} answered"

//Now we will use Function extension
/*
Using the extension property and function we can add more properties and methods easily without making any change in the written code.
by using extension function and property we can add additional functionality in a class without changing class code.
 */
fun Quiz.Student.result() {
    repeat(Quiz.answer) { print("*") }
    repeat(Quiz.total - Quiz.answer) { print("_") }
    println()
    println(Quiz.progressReport)
}


fun main() {
    println(Quiz.result())
}