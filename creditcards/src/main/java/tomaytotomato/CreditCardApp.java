package tomaytotomato;

import tomaytotomato.validator.CardValidator;
import tomaytotomato.validator.MasterCardValidator;

import java.util.Scanner;

/**
 * Credit card validator cli app
 */
public class CreditCardApp
{
    private static final Scanner stdIo = new Scanner(System.in);

    public static void main( String[] args )
    {
        final CardValidator cardValidator = new MasterCardValidator();

        System.out.println( "Credit Card App Number Validator" );
        System.out.println( "\n\n\n Enter a Master card number" );

        final String ccNumber = stdIo.next();

        try {
            if (cardValidator.validateCreditCard(ccNumber)) {
                System.out.println("Card number is valid");
            } else {
                System.out.println("Card number is invalid!");
            }
        } catch (Exception e) {
            System.out.println("Error! - " + e.getMessage());
        }
    }
}
