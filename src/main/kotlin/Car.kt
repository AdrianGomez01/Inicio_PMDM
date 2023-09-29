import java.time.Year

class Car(brand: String) : Vehicle{

    //Al declararlo en el cuerpo de la clase, en su constructor no puede declararse, aunque sí llamarse por lo que no lleva "val"
    var brand: String
    var model: String = ""
    var year: Int? = null
    var engine : Engine? = null

    //Bloque de inicialización. Se puede eliminar por la inicialización en la propia declaración.
    init {
        this.brand = brand
    }

    //constructor secundario.
    constructor(brand: String, model: String, year: Int?, engine: Engine) : this(brand) {
        this.model = model
        this.year = year
        this.engine = engine
    }

    //Clase anidada para el motor. Las clases privadas comienzan con "_" por convención.
    class Engine(private val _powerHorse: Int) {

        //De esta forma podemos darle visibilidad al valor de _powerHorse aunque sea privado, encapsulándolo
        val powerHorse: Int
            get() = _powerHorse
    }

    //clase interna (InnerClass) -> Puede acceder a atributos de la clase externa.
    inner class Insurance(
        private var _insuranceCarrier: InsuranceCarrier,
        private var _amount: Float
    ) {

        //getters
        val insuranceCarrier: InsuranceCarrier
            get() = _insuranceCarrier //Devuelve el valor completo
        val insurance: String
            get() = _insuranceCarrier.title //Devuelve el titulo solo
        val amount: Float
            get() = _amount
        val amountString: String
            get() = "El precio del seguro del coche $brand $model del año $year es $amount euros."

    }

    //Implementaciones de la interfaz.
    override val vehicle: String
        get() = "coche"

    override fun navigate(destiny : String) {
        println("El coche se está dirigiendo hacia $destiny")
    }



}