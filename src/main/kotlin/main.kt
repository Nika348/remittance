const val PENNIES = 100

fun main() {
    print("Введите смму перевода: ")
    var price = readLine()!!.toDouble()
    price = (price * 0.75) / 100
    if(price < 35){
        println("Невозможная сумма перевода")
    }
    else {
        val amount = (price * PENNIES).toInt()
        println("Сумма комиссии составила: $amount копеек")
    }
}