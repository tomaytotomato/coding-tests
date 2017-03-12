package bat26.validator;

/**
 * Interface for
 */
public interface CardValidator {

    /**
     * Validate a credit card string
     * @param ccNumber string
     * @return true if valid cc number | false if invalid
     */
    boolean validateCreditCard(String ccNumber) throws Exception;
}
