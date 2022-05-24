fun main() {
    val cleber = empregado(salh = 100.0, name = "Cleber", func = "Desenvolvedor Mobile", hourWorked = 200.0)

    cleber.payment()
    println("\n\n$cleber\n\n")

    val contaBanco = ContaBanco("Cleber", "1234", "123-45", 10000.00)

    contaBanco.saque(10.0)
    contaBanco.deposito(100000.0)

    print("\n\n$contaBanco")

}