fun main() {
    print("Digite o diametro do círculo: ")
    val d = readln().toDouble()
    val a = d * d / 4 * 3.14
    val p = d * 3.14

    println("Àrea = $a\nPerímetro = $p")
}