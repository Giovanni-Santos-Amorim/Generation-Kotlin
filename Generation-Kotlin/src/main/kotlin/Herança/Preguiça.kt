package Herança

import Herança.Animal

class preguiça(nome: String, idade: Int) : Animal(nome, idade) {

    override fun Som() {
        println("Barulho de Herança.preguiça!")

    }

    fun SubiremÁrvore()
    {
        println("Preguiça subindo em uma árvore")
    }

}