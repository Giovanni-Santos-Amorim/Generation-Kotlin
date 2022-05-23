fun main(){
    println("Entre sua idade: ")
    val idade = readln().toInt()

    if(idade in 10..14)
    {
        println("infantil")

    }
    else if(idade in 15..17)
    {
        println("juvenil")

    }
    else if(idade in 18..25)
    {
        println("adulto")
    }
    else
    {
        print("Nenhuma categoria")
    }
}
