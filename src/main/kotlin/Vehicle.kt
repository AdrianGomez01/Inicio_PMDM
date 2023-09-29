interface Vehicle {
    val vehicle: String
    fun navigate(destiny: String)
    fun place() {
        println("He estacionado el $vehicle.")
    }
}
