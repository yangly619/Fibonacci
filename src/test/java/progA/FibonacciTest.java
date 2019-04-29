package progA;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Unit test for simple App.
 */
public class FibonacciTest
{
    /**
     * Rigorous Test :-)
     */
    Fibonacci fibonacci;
    @Before
    public void setup() {
        fibonacci=new Fibonacci();
    }
    @Test
    public void should3Return2()
    {
        int expected=2;
        assertEquals(expected,fibonacci.compute(3));
    }
    @Test
    public void should4Return3()
    {
        int expected=3;
        assertEquals(expected,fibonacci.compute(4));
    }
    @Test
    public void should9Return34()
    {
        int expected=34;
        assertEquals(expected,fibonacci.compute(9));
    }
    @Test(expected=RuntimeException.class)
    public void shouldNegativeThrowException()
    {
        fibonacci.compute(-1);
    }

}
