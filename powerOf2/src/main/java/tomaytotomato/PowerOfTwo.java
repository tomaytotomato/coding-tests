package tomaytotomato;

import java.util.Scanner;

/**
 * Prints the powers of two to a specified limit
 *
 * Note Java 8 uses int with a word size of 32bits so max value or iteration
 * is 2^31 = 2147483647
 *
 * note: depends on machine / compiler version
 */
public class PowerOfTwo {

    private static final Scanner stdIo = new Scanner(System.in);


    PowerOfTwo() {}

    public int shiftByOne(final int value) {
        return value << 1;
    }

    /**
     *
     * @param loops the amount of powers of two to sum
     * @return sum of powers
     */
    public int calculateSumOfPowers(final int loops) throws Exception {
        int sum = 0;
        int power = 1;

        if (loops > 31) {
            throw new Exception("Java max bit size is 32 i.e. 2^32");
        }

        for (int i = 0; i < loops; i++) {
            power = shiftByOne(power);
            System.out.println("2 to the power of " + (i+1) + " = " + power);
            sum += power;
        }
        System.out.println("The sum of powers is : " + sum + "\n\n\n");
        return sum;
    }

    public static void main(String[] args) {

        System.out.println( "\nPower of 2s" );
        System.out.println( "Enter the max number of powers of two to sum ");
        final PowerOfTwo powerOfTwo = new PowerOfTwo();

        final int loops = stdIo.nextInt();

        try {
            System.out.println("Sum of power of 2s up to " + loops + " = " + powerOfTwo.calculateSumOfPowers(loops));
        } catch (Exception e) {
            System.out.print("Error you entered a value outside of 2^32, try again");
            main(null);
        }
    }
}
