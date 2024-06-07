package lessons_2

fun main() {
    val workers = 50
    val salary = 30000
    val intern = 30
    val internSalary = 20000

    val costsWorkers = workers * salary
    val totalCosts = (workers + intern) * (salary + internSalary)
    val averageSalary = salary / 23 // 23 рабочих дня, если у работник 8 выходных в месяц

    println("Расходы на выплату зарплаты постоянных сотрудников: $costsWorkers")
    println("Общие расходы по ЗП после прихода стажеров: $totalCosts")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary")

}