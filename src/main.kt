fun main () {

    val fuel : String= "Gasoline"

    val dieselCar=TypeDiesel()
    val gasCar=TypeGas()
    val gasolineCar=TypeGasoline()


    when (fuel) {
        "Diesel" -> dieselCar.allInfo()
        "Gas" -> gasCar.allInro()
        "Gasoline" -> gasolineCar.allInro()
        else -> println("Error")

    }


}
