package tomaytotomato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This app checks that two input strings coming from an OCR reader would combine to make a sensible string
 *
 * e.g.
 *
 * Ch2s ee1e --> Cheese
 *
 * Validation rules:
 * <p>
 *
 * The character on each index point of strings cannot be the same
 * The strings must be equal in character length
 */
public class OcrComparator {

    /**
     * Builds a recomponsed string taking the character index points where there are numbers
     * and replacing them with '?' characters
     * @param input string
     * @return string
     */
    public String recomposeString(final String input) {

        List<String> recomposingList = new ArrayList<>();
        //loop through each character of the string and recompose it into one with ? for numerics

        for (int i = 0; i < input.length(); i++) {

            final char thisChar = input.charAt(i);

            //if character is number add list for amount of ? e.g. 2 --> ??
            if(Character.isDigit(thisChar)) {
                recomposingList.add(String.join("", Collections.nCopies(Character.getNumericValue(thisChar), "?")));
            } else {
                recomposingList.add("" + thisChar);
            }
        }
        return String.join("", recomposingList);
    }

    /**
     * Checks that the two strings provided would combine to make a sensible string
     * @param wordA string
     * @param wordB string
     * @return boolean
     */
    public boolean compareOcrStrings(String wordA, String wordB) {

        //if string lengths do not match return false
        if (wordA.length() != wordB.length()) {
            return false;
        } else {

            //regex to split both words into substrings and then join with ?

            final String recomposedStringA = recomposeString(wordA);
            final String recomposedStringB = recomposeString(wordB);

            // two arrays of substrings
            for (int i = 0; i < recomposedStringA.length(); i++) {

                final char charA = recomposedStringA.charAt(i);
                final char charB = recomposedStringB.charAt(i);

                if ((charA != charB) && (charA != '?') && (charB != '?')) {
                    return false;
                }
            }
            return true;
        }
    }


    public static void main(String[] args) {
        final OcrComparator ocrComparator = new OcrComparator();

        System.out.println(ocrComparator.compareOcrStrings("A2Le", "2pL1"));

        System.out.println(ocrComparator.compareOcrStrings("ba1", "1Ad"));
    }
}
