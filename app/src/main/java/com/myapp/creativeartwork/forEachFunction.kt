package com.myapp.creativeartwork

class Cookies(
    val cookieName:String,
    val cookieDelicious:Boolean,
    val cookiePrice:Int
)
var cookie = listOf(Cookies("PriyaGold",true,20),
                    Cookies("Unibic",true,43),
                    Cookies("Britania",false,30),
                    Cookies("Nutri",    true,80)
)
fun main(){
    // in this map we convert one type to another
    val fullMenue = cookie.map { "${it.cookieName}-$${it.cookiePrice}" }
    println("FullMenue")
    fullMenue.forEach { println(it) }
    //cookie.forEach { println("Menu Item: ${it.cookieName},is delicious ${it.cookieDelicious},and price:${it.cookiePrice}") }
}

