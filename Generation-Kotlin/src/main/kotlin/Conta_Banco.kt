 data class ContaBanco(var titular: String, val agencia: String, val conta: String, var saldo: Double)
 {
     fun saldo() {
         print("Saldo da conta: ")
         println("R$$saldo")
     }
     fun saque(valor: Double) {
         if (valor > 0.0 && valor <= saldo) {
             saldo -= valor
             println("Saque de R$$valor realizado com sucesso!\n")
         } else {
             println("Saque de R$$valor impossível de ser realizado!\n")
         }
     }
     fun deposito(valor: Double) {
         if (valor > 0.0) {
             saldo += valor
             println("Depósito de R$$valor realizado com sucesso!\n")
         } else {
             println("Depósito de R$$valor impossível de ser realizado!\n")
         }
     }
 }