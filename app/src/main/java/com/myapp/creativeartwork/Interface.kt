package com.myapp.creativeartwork

interface StudentProgress{
    val progressReport:String
    fun result()
}
class Quizs:StudentProgress{
    companion object StudentReport {
        var correctAnswer: Int = 5
        var totalQuestions: Int = 10
    }
    override val progressReport: String
        get() = "${Quizs.correctAnswer} out of ${Quizs.totalQuestions} answered"

    override fun result() {
        repeat(Quizs.correctAnswer){ print("*") }
        repeat(Quizs.totalQuestions-Quizs.correctAnswer){ print("_") }
        println()
        println(progressReport)

    }
}
fun main(){
    val quizs:Quizs = Quizs()
    quizs.result()
}