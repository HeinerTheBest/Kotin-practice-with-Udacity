package com.mobileapps.introtokotlin.practice

class Spice (val name : String, val spiciness : String = "mild"){
    val heat : Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }
    fun makeSalt() = Spice("Salt")

}
