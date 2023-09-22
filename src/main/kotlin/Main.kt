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
    val intMutableListReto: MutableList<Int> = mutableListOf()

    //Con Step cogemos solo los pares
    for (i in 0..100 step 2) {
        intMutableListReto.add(0, i)
    }
    print("Los numeros son:")
    intMutableListReto.forEach { i ->
        print("$i, ")
    }


}