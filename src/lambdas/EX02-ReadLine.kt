package lambdas

fun main(args: Array<String>) {
    print("Digite o primeiro numero: ")
    val X = readLine()!!.toInt()

    // NullPointerException

    print("Digite o segundo numero: ")
    val Y = readLine()!!.toInt()

    val resultado =  multiplica(X, Y)

    println("O resultado da multiplicação é = $resultado")
}

fun multiplica(x: Int, y: Int): Any {
    return x * y
}
