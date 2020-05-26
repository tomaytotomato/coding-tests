package tomaytotomato;

import java.math.BigInteger;

/**
 * Fibonacci using three strategies to solve
 * <p/>
 * Strategy 1 - recursive
 * Strategy 2 - iterative brute force
 * Strategy 3 - iterative with memoization i.e. storing the previous result for the next calculation
 * <p/>
 * Note max value of Integer is = 2147483647 (Integer.MAX_VALUE)
 */
public class Fibonacci {

    /**
     * Recursive approach
     * <p/>
     * This is not the most optimal as it requires the recalculation
     * of the previous value before the next value in the sequence can be added
     * <p/>
     * Plus there is the risk of having stackoverflow in the java call stack
     *
     * @param num number of fibonacci additions to do
     * @return big integer
     */
    public BigInteger fibonacciRecursive(final int num) {

        //check for edge cases
        if (num <= 0) {
            return BigInteger.ZERO;
        } else if (num == 1) {
            return BigInteger.ONE;
        } else {
            return fibonacciRecursive(num - 1).add(fibonacciRecursive(num - 2));
        }
    }

    /**
     * The iterative, brute force approach
     * <p/>
     * Calculate the fibonacci value, updates the previous calculation then adds them
     *
     * @param num number of fibonacci additions
     * @return big integer
     */
    public BigInteger fibonacciIterative(final int num) {
        //check for edge cases
        if (num <= 0) {
            return BigInteger.ZERO;
        } else if (num == 1) {
            return BigInteger.ONE;
        }

        BigInteger previous = BigInteger.ZERO;
        BigInteger fib = BigInteger.ONE;
        for (int i = 0; i <= num; i++) {
            previous = previous.add(fib);
            fib = previous.subtract(fib);
        }
        return fib;
    }

    /**
     * The most optimal way,
     *
     * Store the previous calculations in memory for quick addition
     * @param num int
     * @return big integer
     */
    public BigInteger fibonacciIterativeMemoized(final int num) {
        //check for edge cases
        if (num <= 0) {
            return BigInteger.ZERO;
        } else if (num == 1) {
            return BigInteger.ONE;
        } else {
            BigInteger fib[] = new BigInteger[num + 1];
            fib[0] = BigInteger.ZERO;
            fib[1] = BigInteger.ONE;
            for (int i = 2; i < num + 1; i++) {
                fib[i] = fib[i - 1].add(fib[i - 2]);
            }
            return fib[num];
        }
    }

    public static void main(String[] args) {
    }
}
