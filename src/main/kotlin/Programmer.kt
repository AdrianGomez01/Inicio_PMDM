class Programmer(name: String, age: Int, private val _language: ProgrammingLang) : Person(name, age) {

    private var programsCreated: MutableList<String> = mutableListOf()

    val language: ProgrammingLang
        get() = _language

    override fun introducePerson() {
        super.introducePerson()
        println("Además, soy programador especialista en ${language.title}")
    }

    fun createProgram(program: String) {
        programsCreated.add(program)
    }

    fun showPrograms() {
        if (programsCreated.size == 0) {
            println("Todavía no he creado ningún programa.")
        } else {
            println("Ya he creado ${programsCreated.size} programas. Estos programas son:")
            programsCreated.forEach {
                println(it)
            }
        }
    }

}

enum class ProgrammingLang(val title: String) {
    JAVA("Java"),
    CPP("C++"),
    KOTLIN("Kotlin"),
    PYTHON("Python")
}