package org.example.lesson_2

fun main() {
    // Исходные данные
    val crystalOre = 7
    val ironOre = 11

    // Бафф в процентах
    val buffPercentage = 20

    // Расчет бонусных материалов
    val bonusCrystalOre = (crystalOre * buffPercentage / 100)
    val bonusIronOre = (ironOre * buffPercentage / 100)

    // Вывод результатов
    println("Бонусная кристаллическая руда: $bonusCrystalOre")
    println("Бонусная железная руда: $bonusIronOre")
}