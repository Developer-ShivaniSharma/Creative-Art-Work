package com.myapp.creativeartwork

/*fun main(){
    val solarPlanets = mutableSetOf("Earth","Mars","Jupiter","Venus","Sun")
    println(solarPlanets.size)
    println(solarPlanets.add("Pluto"))
    for(planet in solarPlanets){
        println(planet)
    }
}*/
fun main(){
    val solarPlanets = mutableMapOf("Jupiter" to 0,"Mars" to 1,"Pluto" to 4,"Saturan" to 6)
    println(solarPlanets.size)
    solarPlanets["saturan"]=9
    println(solarPlanets["saturan"])
    for (planet in solarPlanets){
        println(planet)
    }
}