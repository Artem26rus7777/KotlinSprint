package org.example.lesson_4

fun main(){
    val totalTables = 13
    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9

    val resultToday = totalTables > reservedTablesToday
    val resultTomorrow = totalTables > reservedTablesTomorrow

    println("Доступность столиков на сегодня: $resultToday\nДоступность столиков на завтра: $resultTomorrow")
}