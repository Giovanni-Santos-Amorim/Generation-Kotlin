fun main(){
    println("digite 3 números: ")
    var arrayNum = Array<Int>(3) { readln().toInt() }
    var y = 0
    for(x in arrayNum)
    {
        if(x>y)
        {
            y = x
        }

    }
    print("O maior número é: $y")
}
