class TypeDiesel : Car {

    override var TypeOfFuel: String = "Diesel"

    override var TypeOfEngine: String = "Diesel"

    fun allInfo (){
        println("Type Of Fuel: $TypeOfFuel")
        println("Type of engine: $TypeOfEngine")
        println("Show max speed: ${showMaxSpeed()}")
        println("Color of car: ${colorOfCar()}")
        println("Number of doors: ${numberOfDoors()}")
    }
}