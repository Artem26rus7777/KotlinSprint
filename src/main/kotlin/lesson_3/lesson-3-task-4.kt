package org.example.lesson_3

fun main(){
    var fromWhere = "E2"
    var toWhere = "E4"
    var strokeNumber = 1

    var moveString = "$fromWhere-$toWhere; Номер хода: $strokeNumber"

    println(moveString)

    fromWhere = "D2"
    toWhere = "D3"
    strokeNumber = 2

    moveString = "$fromWhere-$toWhere; Номер хода: $strokeNumber"

    println(moveString)

    
    // В приложении шахматы, ходы отправляются на сервер в виде строки формата [откуда-куда;номер хода].
    // Игрок начал партию ходом из E2 в E4.
    // Все данные (откуда, куда, номер хода) инициализировать и хранить в отдельных переменных.
}