package progA;

/**
 * Hello world!
 *
 */
public class Fibonacci {

    int r;

    public int compute(int n) {
        if (n == 1 || n == 2) {
            r = 1;
        } else if(n<=0){
            throw new RuntimeException("can not be negative");
        }
            else
            r = compute(n - 1) + compute(n - 2);
        return r;
    }
}
