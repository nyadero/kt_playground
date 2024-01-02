package classes

fun main() {
   val tv = SmartDevice("Samsung Qled Tv", 124354.03, false)
//    tv.brand = "Samsung Qled "
//    tv.price = 124353.42
    println(tv)
    println("${tv.brand} costs ${tv.price}")
    tv.turnOn()
    val phone = SmartDevice("Apple Iphone 15 Pro", 250_000.74,false)
//    phone.brand = "Apple Iphone 15"
//    phone.price = 212464.90
    println(phone)
    println("${phone.brand} costs ${phone.price}")
    phone.turnOn()
    phone.getDeviceState()

    val laptop = SmartDevice();
    println("${laptop.brand} costs ${laptop.price}")

}

class SmartDevice(
    //    properties -> var and val
    var brand: String? = null,
    var price: Double = 0.0,
    var isSwitchedOn: Boolean = false
) {

    //    behaviors -> functions
    fun turnOn(){
        println("$brand is switching on")
        isSwitchedOn = true
    }

    fun turnOff(){
        println("$brand is switching off")
        isSwitchedOn = false
    }

    fun getDeviceState(){
        println("$brand is on: $isSwitchedOn")
    }

    override fun toString(): String {
        return "SmartDevice(brand=$brand, price=$price, isSwitchedOn=$isSwitchedOn)"
    }


}