package bat26;

import com.carrotsearch.junitbenchmarks.BenchmarkRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple Fibonacci.
 *
 * Ref - http://www.maths.surrey.ac.uk/hosted-sites/R.Knott/Fibonacci/fibtable.html
 */
public class FibonacciTest {


    private Fibonacci fibonacci;

    @Before
    public void setup() {
        fibonacci = new Fibonacci();
    }

    @Rule
    public TestRule benchmarkRun = new BenchmarkRule();

    @Test
    public void testZero() {

        assertEquals(BigInteger.ZERO, fibonacci.fibonacciRecursive(0));
        assertEquals(BigInteger.ZERO, fibonacci.fibonacciIterative(0));
        assertEquals(BigInteger.ZERO, fibonacci.fibonacciIterativeMemoized(0));
    }

    @Test
    public void testOne() {
        final Integer expectedLastNumber = 1;

        assertEquals(BigInteger.ONE, fibonacci.fibonacciRecursive(1));
        assertEquals(BigInteger.ONE, fibonacci.fibonacciIterative(1));
        assertEquals(BigInteger.ONE, fibonacci.fibonacciIterativeMemoized(1));
    }

    /**
     * Testing with 5 which should produce 5 as the last fibonacci number in the sequence
     */
    @Test
    public void testFibonacci() {
        final int number = 5;
        final BigInteger expectedLastNumber = BigInteger.valueOf(5);

        assertEquals(expectedLastNumber, fibonacci.fibonacciRecursive(number));
        assertEquals(expectedLastNumber, fibonacci.fibonacciIterative(number));
        assertEquals(expectedLastNumber, fibonacci.fibonacciIterativeMemoized(number));

    }

    @Test
    public void testFibonacciRecursive() {
        final Integer number = 30;
        final BigInteger expectedLastNumber = BigInteger.valueOf(832040);

        assertEquals(expectedLastNumber, fibonacci.fibonacciRecursive(number));
    }

    @Test
    public void testFibonacciIterative() {
        final Integer number = 30;
        final BigInteger expectedLastNumber = BigInteger.valueOf(832040);

        assertEquals(expectedLastNumber, fibonacci.fibonacciIterative(number));
    }

    @Test
    public void testFibonacciMemoized() {
        final Integer number = 30;
        final BigInteger expectedLastNumber = BigInteger.valueOf(832040);

        assertEquals(expectedLastNumber, fibonacci.fibonacciIterativeMemoized(number));
    }

}
