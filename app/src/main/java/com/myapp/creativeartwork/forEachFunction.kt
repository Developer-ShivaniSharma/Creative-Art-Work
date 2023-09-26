package com.myapp.creativeartwork

class Cookies(
    var cookieName:String,
    var cookieDelicious:Boolean,
    var cookiePrice:Int
)
var cookie = listOf(Cookies("PriyaGold",true,20),
                    Cookies("Unibic",true,43),
                    Cookies("Britania",false,30),
                    Cookies("Nutri",    true,80)
)
fun main(){
    cookie.forEach { println("Menu Item: ${it.cookieName},is delicious ${it.cookieDelicious},and price:${it.cookiePrice}") }
}