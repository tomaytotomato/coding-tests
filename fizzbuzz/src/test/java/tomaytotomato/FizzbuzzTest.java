package tomaytotomato;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * FizzBuzz unit tests
 */
public class FizzbuzzTest {
    private static Fizzbuzz fizzbuzz;

    public FizzbuzzTest() {
        fizzbuzz = new Fizzbuzz();
    }

    /**
     * This assertion is shared throughout all the tests to handle cases where multiples of 15 are encountered
     *
     * @param fizzBuzzNumber multiple of 15 number
     */
    public void assertFizzBuzz(int fizzBuzzNumber) {
        assertEquals("FizzBuzz", fizzbuzz.fizzBuzz(fizzBuzzNumber));
    }

    @Test
    public void assertFizzBuzzForZero() {
        assertFizzBuzz(0);
    }

    @Test
    public void assertFizzForMultiplesOfThree() {
        for (int i = 3; i < 100; i += 3) {
            if (i % 15 == 0) {
                assertFizzBuzz(i);
            } else {
                assertEquals("Fizz", fizzbuzz.fizzBuzz(i));
            }
        }
    }

    @Test
    public void assertBuzzForMultiplesOfFive() {
        for (int i = 55; i < 100; i += 5) {
            if (i % 15 == 0) {
                assertFizzBuzz(i);
            } else {
                assertEquals("Buzz", fizzbuzz.fizzBuzz(i));
            }
        }
    }

    @Test
    public void assertFizzBuzzForMultiplesOfFifteen() {
        for (int i = 15; i < 100; i += 15) {
            assertFizzBuzz(i);
        }
    }
}
