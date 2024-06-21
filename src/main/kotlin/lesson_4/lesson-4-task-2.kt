package org.example.lesson_4

fun main(){
    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 100

    val cargo1Weight = 20
    val cargo1Volume = 80

    val cargo2Weight = 50
    val cargo2Volume = 100

    val isCargo1Average = (minWeight < cargo1Weight && maxWeight >= cargo1Weight) && (maxVolume >= cargo1Volume)
    val isCargo2Average = (minWeight < cargo2Weight && maxWeight >= cargo2Weight) && (maxVolume >= cargo2Volume)

    println("Груз с весом $cargo1Weight кг и объемом $cargo1Volume л соответствует категории Average: $isCargo1Average")
    println("Груз с весом $cargo2Weight кг и объемом $cargo2Volume л соответствует категории Average: $isCargo2Average")

}