package Herança

class cachorro(nome: String, idade: Int) : Animal(nome, idade)
{
    override fun Som() {
        println("Barulho de Herança.cachorro!")}
    fun correr()
    {
        println("Cachorro correndo")
    }
}