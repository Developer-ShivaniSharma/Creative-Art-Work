package com.myapp.creativeartwork

fun main(){
    var rockPlanet = arrayOf("Mercury","Earth","Mars","Venus")
    var gasPlanet = arrayOf("Jupitor","Saturn","Uranus","Neptune")
    var solarSystem = rockPlanet+gasPlanet
    solarSystem[2]="Little Earth"
    println(solarSystem[0])
    println(solarSystem[1])
    println(solarSystem[2])
    println(solarSystem[3])
    println(solarSystem[4])
    println(solarSystem[5])
}