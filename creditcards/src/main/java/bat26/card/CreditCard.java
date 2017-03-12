package bat26.card;

import org.apache.commons.lang3.StringUtils;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Models a Credit card and provides some useful getters
 * Some basic validation for sanity checking is done here
 */
public class CreditCard {

    private final String ccNumber;

    public CreditCard(final String ccNumber) throws Exception {
        this.ccNumber = checkNotNull(ccNumber, "credit card ccNumber required");

        // validation and sanity checking
        if(!StringUtils.isNumeric(this.ccNumber)) {
            throw new Exception("Credit Card ccNumber given is not numeric : " + ccNumber);
        }
    }

    public String getCcNumber() {
        return ccNumber;
    }


    public String getReversedNumber() {
        return StringUtils.reverse(ccNumber);
    }
}
