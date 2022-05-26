package Herança

import Herança.Animal

class cavalo(nome: String, idade: Int) : Animal(nome, idade) {

    override fun Som() {
        println("Barulho de Herança.cavalo!")

    }

    fun correr()
    {
        println("Herança.cavalo corrrendo")
    }

}