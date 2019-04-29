package progA;
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
    @Test
    public void should3Return2()
    {
        Fibonacci fibonacci=new Fibonacci();
        int expected=2;
        assertEquals(expected,fibonacci.compute(3));
    }
}
