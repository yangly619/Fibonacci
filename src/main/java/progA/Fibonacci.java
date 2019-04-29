package progA;

/**
 * Hello world!
 */
public class Fibonacci {

  double result;

  public double compute(int n) {
    if (n == 1 || n == 2) {
      result = 1;
    } else if (n <= 0) {
      throw new RuntimeException("can not be negative");
    } else {
      result = compute(n - 1) + compute(n - 2);
    }
    return result;
  }
}
