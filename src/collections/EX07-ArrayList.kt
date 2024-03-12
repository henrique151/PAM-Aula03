package collections

data class Frutas (var nome: String, var preco: Double)

fun main(args: Array<String>) {
    val frutas = arrayListOf(Frutas("Banana", 1.50), Frutas("Morcango", 3.20))

    for(fruta in frutas) {
        println("${fruta.nome} - R$ ${fruta.preco}")
    }
}
