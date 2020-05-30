package tomaytotomato;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Determine whether two words are an anagram of each other
 */
public class Anagram {
    public static void main(String[] args) {
        System.out.println("Anagram App");
    }


    /**
     * Use a hashmap with counter for each char, if hashmap is empty at the end, then its an anagram
     */
    public static boolean isAnagramOptimised(String firstStr, String secondStr) {

        if (isNullOrEmpty(firstStr) || isNullOrEmpty(secondStr)) {
            return false;
        }

        //normalise input
        firstStr = firstStr.toLowerCase();
        secondStr = secondStr.toLowerCase();

        //compare equality
        if (firstStr.equals(secondStr)) {
            return false;
        }

        Map<Character, Integer> charCount = new HashMap<>();
        for (Character chars : firstStr.toCharArray()) {
            charCount.merge(chars, 1, Integer::sum);
        }

        for (Character character : secondStr.toCharArray()) {
            if (charCount.containsKey(character)) {
                int decrementedValue = charCount.get(character) - 1;
                if (decrementedValue < 1) {
                    charCount.remove(character);
                } else {
                    charCount.put(character, decrementedValue);
                }
            } else {
                return false;
            }
        }
        return charCount.size() == 0;
    }

    /**
     * Normalise string and quicksort their characters and compare sorted strings,
     * Not the most optimal way for this use case.
     */
    public static boolean isAnagram(String firstStr, String secondStr) {

        if (isNullOrEmpty(firstStr) || isNullOrEmpty(secondStr)) {
            return false;
        }

        //normalise input
        firstStr = firstStr.toLowerCase();
        secondStr = secondStr.toLowerCase();

        //compare equality
        if (firstStr.equals(secondStr)) {
            return false;
        }

        char[] firstStringSorted = firstStr.toCharArray();
        char[] secondStringSorted = secondStr.toCharArray();
        Arrays.sort(firstStringSorted);
        Arrays.sort(secondStringSorted);

        return (new String(firstStringSorted).equals(new String(secondStringSorted)));
    }

    public static boolean isNullOrEmpty(String string) {
        return string == null || string.isEmpty();
    }

}
