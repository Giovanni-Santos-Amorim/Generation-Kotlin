//3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//idade for =-99. (WHILE)

fun main()
{
    var x = 0
    var y = 0
    var idade = 0
    while(idade != -99)
    {
        idade = readln().toInt()
        if(idade < 21 && idade != -99)
        {
            x++
        }
        else if(idade > 50)
        {
            y++
        }
    }
    println("Pessoas om menos de 21: $x\nPessoas com mais de 50: $y")
}
