import org.junit.Test
import kotlin.test.assertEquals

class ArithmeticTest {

    @Test
    fun multiplication (){
        assertEquals(4, 2*2)
    }

    @Test
    fun division(){
        assertEquals(6, 12/2)
    }
    @Test
    fun sum(){
        assertEquals(10, 6+4)
    }
    @Test
    fun subtraction(){
        assertEquals(3, 10-7)
    }
}