package sort

fun main() {
    val vehicles = mutableListOf<Vehicle>()
    vehicles.add(Vehicle("Alpine", "a110", 6_500_000, 2000))
    vehicles.add(Vehicle("Ford", "mustang", 16_500_000, 5000))
    vehicles.add(Vehicle("Mclaren", "765Lt", 66_500_000, 6000))
    vehicles.add(Vehicle("Porsche", "911 Dakar", 46_500_000, 4200))
    vehicles.add(Vehicle("Aston Martin", "Db007", 56_500_000, 6000))
    vehicles.add(Vehicle("Subaru", "Impreza wrx sti", 4_500_000, 2000))
    vehicles.add(Vehicle("Bentley", "continental gt", 76_500_000, 4000))
    vehicles.add(Vehicle("Ferrari", "488 pista", 48_500_000, 4000))
    vehicles.add(Vehicle("Porsche ", "911 gtrs2", 86_500_000, 3200))
    vehicles.add(Vehicle("Lamborghini", "aventador", 48_800_000, 5200))
    vehicles.add(Vehicle("bmw", "m2 cs", 6_500_000, 2800))

//    println(vehicles)
    vehicles.sortedBy { it.make }.forEach{ println(it) }
    vehicles.sortedBy { it.price }.forEach{println(it)}
    vehicles.sortedWith(compareBy<Vehicle> { it.make }.thenBy { it.model }.thenBy { it.price }.thenBy { it.engineSize }).forEach{ println(it) }
}

data class Vehicle(val make: String, val model: String, val price: Int, val engineSize: Int)