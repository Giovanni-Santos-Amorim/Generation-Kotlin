package listadecompras

class Cliente(private var nome: String, private var endereço: String, private var telefone: String)
{
    private val listProd = mutableListOf<String>()

    init
    {
        if(nome == "" ||  endereço == ""|| telefone == "")
        {
            throw Exception("As informações de cadastro estão incorretas!")
        }
    }

    fun add()
    {
        println("Adicione um produto:")
        var item = readln()
        listProd.add(item)
    }

    fun remove()
    {
        println("Remova um produto: ")
        var item = readln()
        listProd.remove(item)
    }

    fun itemList()
    {
        println("Lista de produtos:\n")
        for(i in listProd)
        {
            println(i)
        }
    }
}