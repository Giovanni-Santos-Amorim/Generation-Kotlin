var stock = mutableListOf<String>()

fun main()
{
    while(true)
    {
        println("\nDigite:\n1 para adicionar\n2 para remover\n3 para atualizar\n4 para apresentar os dados\n5 para sair")
        val operation = readln().toInt()
        when(operation)
        {
            1 -> add()
            2 -> remove()
            3 -> update()
            4 -> for(i in stock){println(i)}
            5 -> break
        }
    }
}

fun add()
{
    println("Digite o item: ")
    val item = readln()
    stock.add(item)
}

fun remove()
{
    println("Digite um item: ")
    val item = readln()
    stock.remove(item)
}

fun update()
{
    println("digite a posição: ")
    val index = readln().toInt()
    println("Digite o item: ")
    val item = readln()
    stock[index] = item
}