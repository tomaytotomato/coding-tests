package bat26;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Factorial App
 * <p/>
 * Calculates the product of an integer by adding it and all numbers below it
 * <p/>
 * factorial(1) = 1
 * factorial(2) = 2 * 1 = 2
 * factorial(3) = 3 * 2 * 1 = 6
 * etc..
 */
public class Factorial {

    private static final Scanner stdIo = new Scanner(System.in);

    /**
     * Recursive function that returns the factorial of the given number
     *
     * @param num int
     * @return int
     * @throws IllegalArgumentException if number is greater than 16, which is bigger than 32bit int alloc
     */
    public int smallFactorial(int num) {

        if (num <= 1) {
            return 1;
        } else if (num > 16) {
            throw new IllegalArgumentException("The factorial : " + num + "" +
                    " is too large for small int, use largeFactorial function");
        } else {
            return num * (smallFactorial(num - 1));
        }
    }

    /**
     * The problems of doing a larger num can be solved using a BigInt
     * However you have other issues to be concerned about, such as stackoverflow if doing recursion
     * Using a loop instead is less performant but will not suffer a call stack limit
     */
    public BigInteger largeFactorial(int num) {
        BigInteger result = BigInteger.ONE;
        if (num > 1) {
            for(int i = 0; i < num; i++) {
                result = result.multiply(BigInteger.valueOf(num));
            }
        }
        return result;
    }

    /**
     * If num is greater than 15 then true
     * @param num int
     * @return bool
     */
    public boolean useLargeFactorial(int num) {
        return num > 15;
    }

    public static void main(String[] args) {
        System.out.println( "Factorial App" );
        System.out.println( "\n\n\n Enter a number to calculate the Factorial of" );

        final Factorial factorial = new Factorial();

        final int number = stdIo.nextInt();
        final BigInteger result;

        if (factorial.useLargeFactorial(number)) {
            System.out.println("Large number given, using large Factorial calculation");

            result = factorial.largeFactorial(number);
        } else {
            result = BigInteger.valueOf(factorial.smallFactorial(number));
        }
        System.out.println("Result is : " + result);
    }
}
