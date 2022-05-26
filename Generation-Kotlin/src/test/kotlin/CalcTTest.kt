import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class CalcTTest {

    @Test
    fun add() {
        assertEquals(10.0, CalcT.add(8.0 ,2.0))
    }

    @Test
    fun sub() {
        assertEquals(6.0, CalcT.sub(8.0 ,2.0))

    }

    @Test
    fun div() {
        assertEquals(4.0, CalcT.div(8.0 ,2.0))

    }

    @Test
    fun mult() {
        assertEquals(16.0, CalcT.mult(8.0 ,2.0))

    }

    @Test
    fun power() {
        assertEquals(64.0, CalcT.power(8.0, 2.0))

    }

    @Test
    fun root() {
        assertEquals(2.0, CalcT.root(4.0 ))

    }
}