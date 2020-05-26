package tomaytotomato;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Unit test for power of 2
 */
public class PowerOfTwoTest {

    final PowerOfTwo powerOfTwo;

    public PowerOfTwoTest() {
        powerOfTwo = new PowerOfTwo();
    }

    @Test
    public void calculatePowerTest() {
        // 2 --> 4
        assertEquals(powerOfTwo.shiftByOne(2), 4);
        // 8 --> 16
        assertEquals(powerOfTwo.shiftByOne(8), 16);
    }

    @Test
    public void calculateSumOfPowersTest() throws Exception {
        assertEquals(6, powerOfTwo.calculateSumOfPowers(2));
        assertEquals(14, powerOfTwo.calculateSumOfPowers(3));
        assertEquals(510, powerOfTwo.calculateSumOfPowers(8));
    }

    @Test(expected = Exception.class)
    public void calculateSumOfPowersExceptionTest() throws Exception {

        powerOfTwo.calculateSumOfPowers(56);
    }
}
