import java.lang.Exception

fun main(args: Array<String>) {
    //println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    // println("Program arguments: ${args.joinToString()}")

//    println("Hola, como te llamas??")
    //Declaracion completa de un valor fijo (val), si fuera variable seria (var)
//    val namePerson: String = readln()
    // println("Bueno, $namePerson hemos terminado...")

    //Usando readLine puede tener valores nulos
//  val namePerson = readLine()

    //indicamos que el valor puede ser nulo al llamar a la variable añadiendo (?) tras el nombre de la variable
//    namePerson?.let { nombre ->
//        println("Bueno, $nombre hemos terminado...")
//
//    }

//    println("Hola, como te llamas?")
//    val namePerson: String = readln()
//
//    var agePerson: Int? = null
//    do {
//        try {
//            println("Cuantos años tienes?")
//            agePerson = readln().toInt()
//        } catch (e: NumberFormatException) {
//            println("Error, introduce una edad válida")
//        }
//    } while (agePerson == null)
//
//    if (agePerson >= 18) {
//        println("$namePerson, eres mayor de edad")
//    } else {
//        println("$namePerson, eres menor de edad")
//    }
//
//    //Comprobamos si la edad está comprendida en un rango y mostramos un mensaje dependiendo del rango
//    //When sería el equivalente al Switch-Case de Java
//    when (agePerson) {
//        in 0..10 -> println("Eres un chiquitin")
//        in 11..18 -> println("Eres un adolescente")
//        in 19..50 -> println("Eres un adulto")
//        else -> print("Eres un viejete")
//    }

//    //Lista de enteros de tipo enteros en rango
//    val intRange: IntRange = 0..20
//    val intRange2: IntRange = 0 until 20
//    val intArrayList: ArrayList<Int> = arrayListOf(0, 2, 4, 6, 8, 10)
//    val intMutableList: MutableList<Int> = mutableListOf()

    //Reto, crear una mutable list de enteros y llenar otra mutable list de strings con la primera
//    val intMutableListReto: MutableList<Int> = mutableListOf()
//
//    //Con Step cogemos solo los pares
//    for (i in 0..100 step 2) {
//        intMutableListReto.add(0, i)
//    }
//    print("Los numeros son:")
//    intMutableListReto.forEach { i ->
//        print("$i, ")
//    }
//
//    //Filtro para los numeros pares con .filter
//    val pares = intMutableListReto.filter { x ->
//        x % 2 == 0;
//    }
//
//    print("Los numeros son:")
//    pares.forEach { i ->
//        print("$i, ")
//    }
//
//    val nombres : List<String> = pares.map { i ->
//        "pepe${2*i}"
//    }
//    println()
//    print("Los numeros son:")
//    nombres.forEach { i ->
//        print("$i, ")
//    }

    //ejercicioBasico1()

    //ejercicioBasico2()

    carObjects()

    //personObjects()

}

fun personObjects(){

    val designer1 = Designer("Paco", 20)
    println(designer1)
    designer1.introducePerson()

    val programmer1 = Programmer("Juan", 28, ProgrammingLang.KOTLIN)
    programmer1.introducePerson()

    programmer1.showPrograms()

    programmer1.createProgram("Calculadora")
    programmer1.createProgram("Pokemon GO")
    programmer1.createProgram("Noticias")

    programmer1.showPrograms()


}

fun carObjects(){
    val myEngine = Car.Engine(2000)

    val myCar = Car("Seat")
    val myCar2 = Car("Seat", "600", 1955, myEngine)

    val myInsurance = myCar2.Insurance(InsuranceCarrier.MAPFRE, 340.5f)

    //println("El precio del seguro de mi ${myCar2.brand + " " + myCar2.model} es ${myInsurance.amount}")
    println(myInsurance.amountString)

    myCar2.navigate("Albufeira")
    myCar2.place()
}

fun ejercicioBasico1() {

    var numLimite: Int? = null
    do {
        println("Introduce un numero:")
        try {
            numLimite = readln().toInt()
        } catch (e: Exception) {
            println("Error, introduzca un valor numérico")
        }
    } while (numLimite == null || numLimite < 1)

    for (i in 1..numLimite) {
        when {
            (i % 3 == 0 && i % 5 == 0) -> println("PIM PAM")
            (i % 3 == 0) -> println("PIM")
            (i % 5 == 0) -> println("PAM")
            else -> print("$i ")
        }
    }
}

fun ejercicioBasico2() {
    var num: Int? = null
    val listaOriginal: MutableList<Int> = mutableListOf()
    val listaOrdenada: MutableList<Int> = mutableListOf()
    print("Introduce los números que desees añadir a la lista. Pulse 0 para salir \n")
    do {
        println("Introduce un numero:")
        try {
            num = readln().toInt()
            if (num != 0) {
                listaOriginal.add(num)
            }
        } catch (e: Exception) {
            println("Error, introduzca un valor numérico entero")
        }
    } while (num != 0)

    listaOrdenada.addAll(listaOriginal)
    listaOrdenada.sort()

    println("Lista Original: $listaOriginal")
    println("Lista Ordenada: $listaOrdenada")

}