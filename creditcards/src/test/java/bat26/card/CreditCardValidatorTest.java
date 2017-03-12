package bat26.card;

import bat26.validator.CardValidator;
import bat26.validator.MasterCardValidator;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Validation logic tests
 */
public class CreditCardValidatorTest {

    private final CardValidator cardValidator;

    public CreditCardValidatorTest() {
        cardValidator = new MasterCardValidator();
    }

    @Test
    public void testValidCreditCard() throws Exception {

        final String validCCNumber = "6125529489896754";

        assertTrue("valid cc number failed during test", cardValidator.validateCreditCard(validCCNumber));
    }


}