//5- Crie um programa que leia um número do teclado até que encontre um
//número igual a zero. No final, mostre a soma dos números
//digitados.(DO...WHILE)

fun main()
{
    var x = 0.0
    var y = 0.0

    do{
        x = readln().toDouble()
        y += x
    }while(x != 0.0)
    print("A soma dos números é: $y")
}