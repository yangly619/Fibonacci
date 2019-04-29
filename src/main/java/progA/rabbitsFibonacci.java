package progA;

public class rabbitsFibonacci {

  public double compute(int number, int month) {
    double result = 1;
    if (month == 1 || month == 2) {
      result = 1;
    } else if (number <= 0 || month <= 0) {
      throw new RuntimeException("error input, can not be 0 o negative");
    } else {
      result = compute(number, month - 1) + compute(number, month - 2) * number;
    }
    return result;
  }
}
