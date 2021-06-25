package com.example.happybirthday

class Dice (val numSides: Int) {

    fun roll() : Int {
        return (1..numSides).random()
    }
}

fun main(){
    val myFirstDice = Dice(6)
    val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.numSides} sided dice rolled ${diceRoll}!")
}