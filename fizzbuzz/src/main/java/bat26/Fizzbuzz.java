package bat26;

import java.util.Scanner;

/**
 * Fizzbuzz, because Fizzing is not worth doing without Buzzing
 *
 */
public class Fizzbuzz
{

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    private static final Scanner stdIo = new Scanner(System.in);

    public static void main( String[] args )
    {
        System.out.println( "Fizz Buzz App, enter maximum number to evaluate with FizzBuzz" );

        final int iterationCount = stdIo.nextInt();
        final Fizzbuzz fb = new Fizzbuzz();

        for (int i = 1; i <= iterationCount; i++) {
            System.out.println(fb.fizzBuzz(i));
        }
    }

    /**
     * Determine whether int value is Fizz, Buzz, both or not
     * @param value int
     * @return FizzBuzz | Fizz | Buzz | int value
     */
    public String fizzBuzz(int value) {

        if (value % 3 == 0 && value % 5 == 0) {
            return FIZZ + BUZZ;
        } else if (value %3 == 0) {
            return FIZZ;
        } else if (value %5 == 0) {
            return BUZZ;
        } else {
            return String.valueOf(value);
        }
    }

}