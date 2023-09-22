package com.myapp.creativeartwork

/**
 * We can define a singleton object inside a class using companion keyword.
 * This makes our code easy and organized
 * we can access the object in the main function using class name . property of singleton object.
 */
class Quiz{
    val question1 = Question<String>("Capital of India is ______", "Delhi", Difficulty.Easy)
    val question2 = Question<Boolean>("2+2 = 4", true, Difficulty.Medium)
    val question3 = Question<Int>("How many days are there in full Moon", 28, Difficulty.Hard)

    companion object Student{
        var total :Int = 10
        var answer:Int = 5
    }
}
fun main(){
    println("${Quiz.answer} out of ${Quiz.total} answered")
}