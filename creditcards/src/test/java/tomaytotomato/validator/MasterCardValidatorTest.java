package tomaytotomato.validator;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Tests for Mastercard implementation
 */
public class MasterCardValidatorTest {

    private final MasterCardValidator cardValidator;

    private final String VALID_CC_NUMBER = "2861747566959730";
    private final String INVALID_CC_NUMBER_SHORT = "442562948";
    private final String INVALID_CC_NUMBER = "4425629485896732";


    public MasterCardValidatorTest() {
        cardValidator = new MasterCardValidator();
    }

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void validateCreditCard() throws Exception {

    }

    @Test
    public void validateCardNumberLengthValid() throws Exception {
        assertTrue("valid length cc number failed", cardValidator.validateCardNumberLength(VALID_CC_NUMBER));
    }

    @Test
    public void validateCardNumberLengthInvalid() throws Exception {
        assertFalse("invalid length cc number failed", cardValidator.validateCardNumberLength(INVALID_CC_NUMBER_SHORT));
    }

    @Test
    public void validateOddDigitSum() throws Exception {
        final int validSum = 49;
        assertEquals(validSum, cardValidator.calculateSumOfOddDigits(VALID_CC_NUMBER));
    }

    /**
     * Tests that even digits are selected
     * Each digit is multiplied by 2
     * If the result is a double digit, then the sum of that is added and used e.g. 15 --> 1 + 5 = 6
     *
     * @throws Exception test exception
     */
    @Test
    public void validateEvenDigitCalculation() throws Exception {
        final int validSum = 27;
        assertEquals(validSum, cardValidator.calculateSumOfEvenDigits(VALID_CC_NUMBER));
    }

    @Test
    public void validCardNumber() throws Exception {
        assertTrue(cardValidator.validateCreditCard(VALID_CC_NUMBER));
    }

    @Test
    public void invalidCardNumber() throws Exception {
        assertFalse(cardValidator.validateCreditCard(INVALID_CC_NUMBER));
    }
}