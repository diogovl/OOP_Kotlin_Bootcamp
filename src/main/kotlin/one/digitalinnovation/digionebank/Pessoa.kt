package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Diogo"
    var cpf: String = "123.123.123.11"
    private set
}

fun main() {
    val diogo = Pessoa()
    println(diogo.nome)
    println(diogo.cpf)


}