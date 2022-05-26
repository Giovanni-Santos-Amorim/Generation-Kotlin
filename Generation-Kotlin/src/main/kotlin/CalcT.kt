import kotlin.math.pow
import kotlin.math.sqrt

class CalcT
{
    companion object {

        fun add(n1: Double, n2: Double): Double {
            return n1 + n2
        }

        fun sub(n1: Double, n2: Double): Double {
            return n1 - n2
        }

        fun div(n1: Double, n2: Double): Double {
            return n1 / n2
        }

        fun mult(n1: Double, n2: Double): Double {
            return n1 * n2
        }

        fun power(n1: Double, n2: Double): Double {
            return n1.pow(n2)
        }

        fun root(n1: Double): Double {
            return sqrt(n1)
        }
    }
}