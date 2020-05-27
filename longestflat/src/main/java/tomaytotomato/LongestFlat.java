package tomaytotomato;

public class LongestFlat {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static int longestFlat(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        int longestFlat = 1;
        int precedingNumber = numbers[0];
        int counter = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (precedingNumber == numbers[i]) {
                counter++;
            } else {
                counter = 1;
                precedingNumber = numbers[i];
            }
            if (counter > longestFlat) {
                longestFlat = counter;
            }
        }
        return longestFlat;
    }
}
