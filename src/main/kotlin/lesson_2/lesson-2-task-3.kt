package org.example.lesson_2

fun main(){
    val hourDepartureTime = 9
    val minuteDepartureTime = 39

//    60 минут в одном часе
    val minutesInOneHour = 60

    val totalTravelTime = 457
    val hourTravelTime = totalTravelTime / minutesInOneHour
    val minuteTravelTime = totalTravelTime % minutesInOneHour



    val sum = (hourDepartureTime * minutesInOneHour) + minuteDepartureTime + totalTravelTime
    val hourArrivalTime = sum / minutesInOneHour
    val minuteArrivalTime = sum % minutesInOneHour

    println("Время выезда: $hourDepartureTime:$minuteDepartureTime")
    println("Время в пути: $hourTravelTime:$minuteTravelTime")
    println("Время прибытия: $hourArrivalTime:$minuteArrivalTime")




}