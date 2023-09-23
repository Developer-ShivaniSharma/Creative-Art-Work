package com.myapp.creativeartwork

class Test {
    val question1 = Question<String>("Capital of India is ______", "Delhi", Difficulty.Easy)
    val question2 = Question<Boolean>("2+2 = 4", true, Difficulty.Medium)
    val question3 = Question<Int>("How many days are there in full Moon", 28, Difficulty.Hard)
    fun printQiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        print("----------------")
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        print("-----------------")
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
    }
}
fun main(){
   /*
    val quizes:Test=Test()
    quizes.printQiz()
  */
    // 2nd scope fnction use, as there is no use of class instance so we use scope function direct with class name
    Test().apply {
        printQiz()

    }
}