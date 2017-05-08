package bat26;

import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple Factorial.
 */
public class FactorialTest {

    private Factorial factorial;

    @Before
    public void setup() {
        factorial = new Factorial();
    }

    /**
     * Factorial of 4 => 24
     */
    @Test
    public void testSmallFactorial() {
        assertEquals(24, factorial.smallFactorial(4));
    }

    @Test
    public void testOneAndZero() {
        assertEquals(1, factorial.smallFactorial(0));
        assertEquals(1, factorial.smallFactorial(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSmallFactorialTooBig() {
        factorial.smallFactorial(23);
    }

    @Test
    public void testLargeFactorial() {
        final BigInteger result = new BigInteger("20880467999847912034355032910567");
        assertEquals(result, factorial.largeFactorial(23));
    }

    public void testFactorial() {

    }

}
