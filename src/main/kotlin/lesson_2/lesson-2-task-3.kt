package org.example.lesson_2

fun main(){
    val hourDepartureTime = 9
    val minuteDepartureTime = 39

    val totalTravelTime = 457
    val hourTravelTime = totalTravelTime / 60
    val minuteTravelTime = totalTravelTime % 60

    val sum = (hourDepartureTime * 60) + minuteDepartureTime + totalTravelTime
    val hourArrivalTime = sum / 60
    val minuteArrivalTime = sum % 60

    println("Время выезда: $hourDepartureTime:$minuteDepartureTime")
    println("Время в пути: $hourTravelTime:$minuteTravelTime")
    println("Время прибытия: $hourArrivalTime:$minuteArrivalTime")




}