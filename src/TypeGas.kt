class TypeGas : Car {
    override var TypeOfFuel: String = "Gas"

    override var TypeOfEngine: String = "Carburettor"

    fun allInro (){
        println("Type Of Fuel: $TypeOfFuel")
        println("Type of engine: $TypeOfEngine")
        println("Show max speed: ${showMaxSpeed()}")
        println("Color of car: ${colorOfCar()}")
        println("Number of doors: ${numberOfDoors()}")
    }
}