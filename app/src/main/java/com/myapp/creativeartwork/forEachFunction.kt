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
    cookie.forEach { println("Menu Item: ${it.cookieName},is delicious ${it.cookieDelicious},and price:${it.cookiePrice}") }
    println()
    println("-----------Map--------------")
    // in this map we convert one type to another
    val fullMenue = cookie.map { "${it.cookieName}-$${it.cookiePrice}" }
    println("FullMenue")
    fullMenue.forEach { println(it) }
    println()
    println("-----------Filter------------------")
    //Now when we want to filter our list then we use filter() function
    val cookieMenue = cookie.filter { it.cookieDelicious }
    println("CookieMenue")
    cookieMenue.forEach {println("${it.cookieName}-$${it.cookiePrice}") }
    println()
    println("-----------GroupBy------------------")
    val deliciousCookieMenu = cookie.groupBy { it.cookieDelicious }
    val softCookie = deliciousCookieMenu[true]?: listOf()
    val hardcookie = deliciousCookieMenu[false]?: listOf()
    println("Soft cookie manue")
    softCookie.forEach { println("${it.cookieName}-$${it.cookiePrice}") }
    println("Hard Cookie Menue")
    hardcookie.forEach { println("${it.cookieName}-$${it.cookiePrice}") }
    println()
    println("---------Fold-------------------")
    val totalPrice = cookie.fold(0.0){total,cookie->total+cookie.cookiePrice}
    println("totalPrice:$${totalPrice}")
    println()
    println("-----------Sortedby-------------")
    val albhabeticalMenue = cookie.sortedBy { it.cookieName }
    println("AlphabeticalMenue")
    albhabeticalMenue.forEach { println("${it.cookieName}") }
}

