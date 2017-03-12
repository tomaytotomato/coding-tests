package bat26.validator;

import bat26.card.CreditCard;

/**
 * All business logic for validating a Credit Card is contained within this class
 * <p>
 * The creditCard card number is broken down into two sets of digits:
 * A - digits in odd positions in the cc number
 * B - digits in even positions of the cc number multiplied by two
 */
public class MasterCardValidator implements CardValidator {

    private CreditCard creditCard;

    public MasterCardValidator() {
    }

    /**
     * Performs the actual validation of the card number
     * @param ccNumber string
     * @return true | false
     */
    public boolean validateCreditCard(final String ccNumber) throws Exception {

        creditCard = new CreditCard(ccNumber);

        return validateCardNumberLength(creditCard.getCcNumber())
                && creditCardCheckSum();
    }

    /**
     * Check that the Sum of A + B is a multiple of 10
     * @return true | false
     */
    boolean creditCardCheckSum() {
        return (calculateSumOfOddDigits(creditCard.getReversedNumber())
                + calculateSumOfEvenDigits(creditCard.getReversedNumber())) % 10 == 0 ;
    }

    boolean validateCardNumberLength(final String ccNumber) {
        return ccNumber.length() == 16;
    }

    /**
     * Explode string into char array, get sum of ASCII values at odd positions and divide by 10 to convert
     * to the integer value from that character
     * <p>
     * Note due to Java 8's API using IntStream we have to cast char to get the true integer value of that char and
     * not the ASCII value
     *
     * @return int sum
     */
    int calculateSumOfOddDigits(final String ccNumber) {
        int sum = 0;
        for (int i = 0; i < ccNumber.length(); i += 2) {
            sum += ccNumber.charAt(i) - '0';
        }
        return sum;
    }

    /**
     * Compared with the above function this one has a bit more involvement
     *
     * Firstly it loops over and gets the digits on even index positions and multiplies by 2
     * If the result of that multiplication is a two digit number then get the sum of the split digits
     * i.e. 16 --> 1 + 6 = 7
     * @param ccNumber string
     * @return int sum
     */
    int calculateSumOfEvenDigits(final String ccNumber) {
        int sum = 0;
        for (int i = 1; i < ccNumber.length(); i += 2) {

            int multipleOfTwo = (ccNumber.charAt(i) - '0') * 2;

            // if its a double digit then get the product of the two split values
            if (multipleOfTwo > 9) {
                while(multipleOfTwo > 0) {
                    sum += multipleOfTwo % 10;
                    multipleOfTwo /= 10;
                }
            } else {
                sum += multipleOfTwo;
            }
        }
        return sum;
    }
}
