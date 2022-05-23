   data class empregado(var salh : Double, var name: String, var func: String, var hourWorked: Double ){
       fun payment() {
           val pay = hourWorked * salh
           println("Payment: $pay")
       }

   }