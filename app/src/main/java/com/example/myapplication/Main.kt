package com.example.myapplication

import java.util.*

    fun randomDay() : String {
        val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday")
        return week[Random().nextInt(week.size)]
    }

    fun fishFood (day : String) : String {
        return when (day) {
            "Monday" -> "flakes"
            "Wednesday" -> "redworms"
            "Thursday" -> "granules"
            "Friday" -> "mosquitoes"
            "Sunday" -> "plankton"
            else -> "nothing"
        }
    }

    fun fishSize(b:Int, aaa:(Int) -> Int):Int = aaa(b);

    fun feedTheFish() {
        val day = randomDay()
        val food = fishFood(day)
        println ("Today is $day and the fish eat $food")
    }

    fun main(args: Array<String>) {
        feedTheFish()
        println(fishSize(5,{a:Int -> a + 10}))
    }
