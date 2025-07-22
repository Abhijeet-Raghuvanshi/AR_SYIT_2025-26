// Step 1: Car class with required properties
open class Car(
    var make: String,
    var model: String,
    var year: Int,
    var mileage: Double
) {
    // Step 2: Function to print car details
    open fun details() {
        println("Car Details:")
        println("Make: $make")
        println("Model: $model")
        println("Year: $year")
        println("Mileage: $mileage km")
    }

    // Step 4: Function to increment mileage
    fun drive(miles: Double) {
        mileage += miles
        println("Car driven for $miles km. Updated mileage: $mileage km")
    }
}

// Step 5: Subclass ElectricCar with additional property
class ElectricCar(
    make: String,
    model: String,
    year: Int,
    mileage: Double,
    var batteryCapacity: Double
) : Car(make, model, year, mileage) {

    // Step 6: Override details function to include batteryCapacity
    override fun details() {
        super.details()
        println("Battery Capacity: $batteryCapacity kWh")
    }
}

// Step 3 & 7: Main function to demonstrate functionality
fun main() {
    // Creating and using Car class
    val car = Car("Toyota", "Corolla", 2020, 15000.0)
    car.details()
    car.drive(120.0)
    car.details()

    println("-----")

    // Creating and using ElectricCar class
    val eCar = ElectricCar("Tesla", "Model 3", 2023, 8000.0, 75.0)
    eCar.details()
    eCar.drive(250.0)
    eCar.details()
}