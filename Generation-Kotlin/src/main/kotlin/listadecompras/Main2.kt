import listadecompras.Cliente

fun main() {
    while (true) {

        println("Digite seu nome:")
        val nome = readln()

        println("Digite seu endereço:")
        val endereço = readln()

        println("Digite seu telefone:")
        val telefone = readln()

        try {
            val cliente = Cliente(nome, endereço, telefone)
            while(true)
            {
                println("\nDigite:\n1 para adicionar\n2 para remover\n3 para apresentar a lista\n4 para sair")
                val operation = readln().toInt()

                when (operation)
                {
                    1 -> cliente.add()
                    2 -> cliente.remove()
                    3 -> cliente.itemList()
                    4 -> break
                }
            }
        } catch (e: Exception) {
            println(e.message)
        }
        break
    }

}

