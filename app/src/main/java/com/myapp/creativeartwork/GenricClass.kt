package com.myapp.creativeartwork

data class Question <T>(
    val questionText:String,
    val answer:T,
    val difficulty:Difficulty
)

/**
 * By using the enum class we define that the possible types of difficulty property will be only three.
 * Now user can't use any value apart from these three.
 */
enum class Difficulty{
    Easy,Medium,Hard
}
fun main() {
    val question1 = Question<String>("Capital of India is ______", "Delhi", Difficulty.Easy)
    val question2 = Question<Boolean>("2+2 = 4", true, Difficulty.Medium)
    val question3 = Question<Int>("How many days are there in full Moon", 28, Difficulty.Hard)
    println(question1.toString()) // By using data class we can use many inbuit methods like toString(),copy() etc.
   println("--------------")
   val result = nonmain()
    println("$result")
   println( "${Counter.getCount()}")
}
fun nonmain(){
    println("${Counter.getCount()}")
}


object Counter {
    private var count = 0

    fun getCount(): Int {
        count++
        return count
    }
}

