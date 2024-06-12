package org.example.lesson_3

fun main(){
    val horizontalArea = "E"
    val verticalArea = 2

    val fromWhere = horizontalArea + verticalArea

    val toWhere = horizontalArea + verticalArea + 2
    val strokeNumber = 2

    println("Откуда: $fromWhere - Куда: $toWhere; Номер хода: $strokeNumber")

    
    // В приложении шахматы, ходы отправляются на сервер в виде строки формата [откуда-куда;номер хода].
    // Игрок начал партию ходом из E2 в E4.
    // Все данные (откуда, куда, номер хода) инициализировать и хранить в отдельных переменных.
}