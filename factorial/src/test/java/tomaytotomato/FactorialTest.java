package tomaytotomato;

import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        final BigInteger result = new BigInteger("25852016738884976640000");
        assertEquals(result, factorial.largeFactorial(23));
    }

    /**
     * Tests comparison of both methods on a small factor to check they both work
     *
     * Factorial of 5 => 120
     */
    @Test
    public void testFactorials() {
        assertTrue(BigInteger.valueOf(factorial.smallFactorial(5)).equals(factorial.largeFactorial(5)));
    }

}
