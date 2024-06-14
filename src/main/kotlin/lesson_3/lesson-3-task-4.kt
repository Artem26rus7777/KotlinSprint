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
}