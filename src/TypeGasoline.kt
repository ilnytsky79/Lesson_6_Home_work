class TypeGasoline : Car {

    override var TypeOfFuel: String = "Gasoline"

    override var TypeOfEngine: String = "carburetor"

    fun allInro (){
        println("Type Of Fuel: $TypeOfFuel")
        println("Type of engine: $TypeOfEngine")
        println("Show max speed: ${showMaxSpeed()}")
        println("Color of car: ${colorOfCar()}")
        println("Number of doors: ${numberOfDoors()}")
    }
}