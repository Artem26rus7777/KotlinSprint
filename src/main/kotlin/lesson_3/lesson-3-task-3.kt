package org.example.lesson_3

fun main(){
    println("Введите число:")
    val number = readln().toInt()

    val result = """
      $number * 1 = ${number * 1}
      $number * 2 = ${number * 2}
      $number * 3 = ${number * 3}
      $number * 4 = ${number * 4}
      $number * 5 = ${number * 5}
      $number * 6 = ${number * 6}
      $number * 7 = ${number * 7}
      $number * 8 = ${number * 8}
      $number * 9 = ${number * 9}
      $number * 10 = ${number * 10}
    """.trimIndent()

    println(result)

}