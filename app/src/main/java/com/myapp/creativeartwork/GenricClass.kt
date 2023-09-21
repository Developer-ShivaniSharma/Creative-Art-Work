package com.myapp.creativeartwork

class Question <T>(
    val questionText:String,
    val answer:T,
    val difficulty:String
)
fun main(){
    val question1 = Question<String>("Capital of India is ______","Delhi","Easy")
    val question2 =Question<Boolean>("2+2 = 4",true,"Medium")
    val question3 = Question<Int>("How many days are there in full Moon",28,"difficult")
     println("$question1")
    println("$question2")
    println("$question3")
}