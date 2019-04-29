package progA;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class rabbitsFibonacciTest {

  private static final double epsilon = 0.000001;
  private rabbitsFibonacci rabbits;

  @Before
  public void setup() {
    rabbits = new rabbitsFibonacci();
  }

  @Test
  public void should2MonthReturn1() {
    int expected = 1;
    assertEquals(expected, rabbits.compute(3, 2), epsilon);
  }

  @Test
  public void should3MonthReturn4() {
    int expected = 4;
    assertEquals(expected, rabbits.compute(3, 3), epsilon);
  }

  @Test
  public void should4MonthReturn7() {

    int expected = 7;
    assertEquals(expected, rabbits.compute(3, 4), epsilon);
  }

  @Test
  public void should5MonthReturn19() {

    int expected = 19;
    assertEquals(expected, rabbits.compute(3, 5), epsilon);
  }

  @Test(expected = RuntimeException.class)
  public void shouldNegativeReturnException() {
    rabbits.compute(2, -3);
  }

}
