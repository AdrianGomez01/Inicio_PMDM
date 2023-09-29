open class Person (protected var name : String, protected var age : Int) {

    //Las funciones Open permiten ser modificadas por los hijos de la clase
    open fun introducePerson(){
        println("Hola, me llamo $name y tengo $age años")
    }


}