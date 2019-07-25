package com.mobileapps.introtokotlin.practice

import java.util.*

fun main (args : Array<String>)
{
    /*println("Hello Heiner is the Best")
    println("${args[0]}")
    println(getFortuneCookie())

    var fortune: String

    fortune = getFortuneCookie()
    println("\nYour fortune is: $fortune")
    while (fortune.contains("Take it easy")) {
        fortune = getFortuneCookie()
        println("\nYour fortune is: $fortune")
    }*/

    /*println(canAddFish(10.0, listOf(3,3,3)))
    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1,1,3), 3))
    println(canAddFish(10.0, listOf(), 7, true))*/


    println(whatShouldIDoToday(readLine()!!))

}


fun whatShouldIDoToday(mood:String, weather: String = "Sunny", temperature : Int = 24 ) : String
{


    val goForAWal = mood == "happy" && weather == "Sunny"
    val stayInBed = mood == "sad" && weather == "rainy" && temperature == 0
    val goSwimming  = temperature > 35


    return when
    {
        goForAWal -> "go for a walk"
        stayInBed -> "stay in bed"
        goSwimming -> "go swimming"
        else -> "Stay home and read."
    }
}

fun dayOfWeek()
{
    println("WHat day is today?")
    when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK) )
    {
        0 -> println("Sunday")
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        else -> println("How this happened :O")
    }

}

fun getFortuneCookie() : String
{
    val listOfFortune  = listOf (
        "You will have a great day!" ,
        "Things will go well for you today.",
        "Enjoy a wonderful day of success." ,
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    val index = when (getBirthday()) {
        in 1..7 -> 4
        in 12..19 -> 5
        20 -> 1
        28, 31 -> 2
        else -> getBirthday().rem(listOfFortune.size)
    }
    return listOfFortune[index]
}

fun getBirthday() : Int
{
    print("Enter your birthDay")
    return readLine()?.toIntOrNull()?:1
}

fun canAddFish(tankSize : Double, currentFish :List<Int>, fishSize : Int = 2, hasDecorations : Boolean = true) : Boolean {
    var freeSpace : Double = if (hasDecorations) tankSize - tankSize*0.2 else tankSize
    for (i in 0 until currentFish.size) freeSpace -= currentFish[i]
    return freeSpace >= fishSize }