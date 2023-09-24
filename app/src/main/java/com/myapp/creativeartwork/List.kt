package com.myapp.creativeartwork

import androidx.compose.runtime.mutableStateOf

/*fun main(){
    var states = listOf<String>("J&K","Haryana","Himachal","Rajasthan")
    var capital = listOf<String>("Kashmir","Chandigarh","Shimla","Jaipur")
    println(states.size)
    println(capital.get(2))
    println(states.indexOf("Rajasthan"))
    for(state in states){
        println(state)
    }
}*/

fun main(){
    var states  = mutableListOf("J&&K","Haryana","Himachal","Rajasthan")
    println(states.add("UK"))
    println(states.add(2,"MP"))
    for(state in states){
        println(state)
    }
    println("------")
    println(states.isEmpty())
    println(states.contains("Himachal"))
    println(states.remove("UK"))
    println("_-------")
    for(state in states){
        println(state)
    }
    println("Haryana" in states)
}
