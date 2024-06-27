package org.example.lesson_4

fun main(){
    val isSunny = true // Солнечная
    val isTenOpen = true // Открыт
    val airHumidity = 20 // Влажность воздуха в процентах
    val currentSeason = "зима" // Текущее время года

    val result = isSunny && isTenOpen && airHumidity == 20 && currentSeason != "зима"

    println("Благоприятный ли условия сейчас для роста бобовых? $result")
}