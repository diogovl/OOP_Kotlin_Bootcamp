package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Diogo"
    var cpf: String = "123.123.123.11"

    inner class Endereco {
        var rua: String = "Rua Teste"
    }
}

fun main() {
    val Diogo = Pessoa()

    println(Diogo.nome)
    println(Diogo.cpf)

    println(Diogo.Endereco().rua)
}