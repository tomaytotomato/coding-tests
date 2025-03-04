package tomaytotomato;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class StringTheory
{
    public static String run(String sentence) {
        String replacementString = "pv";
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        Set<Character> notAlphabeticChar = new HashSet<>(Arrays.asList('1', '2','3', '4','5','6','7','8', '9', '0', '_', ',','-',' ', ',', '.'));
        int vowelCount = 0;
        int consonantCount = 0;
        String reversedSentence = "";
        String snakeCaseSentence = "";
        String replacedSentence = "";
        List<String> words = new LinkedList<>(Arrays.asList(sentence.split(" ")));

        LinkedList<String> reversedWords = new LinkedList<>();
        for (String word : words) {
            StringBuilder swappedCase = new StringBuilder();
            for (char c : word.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    swappedCase.append(Character.toLowerCase(c));
                } else if (Character.isLowerCase(c)) {
                    swappedCase.append(Character.toUpperCase(c));
                } else {
                    swappedCase.append(c);
                }
            }
            reversedWords.addFirst(swappedCase.toString());
        }
        reversedSentence = String.join(" ", reversedWords);

        snakeCaseSentence = String.join("-", words);

        StringBuilder pvBuilder = new StringBuilder();
        for (char c : sentence.toCharArray()) {
            if (vowels.contains(c)) {
                pvBuilder.append(replacementString);
            }
            pvBuilder.append(c);
        }
        replacedSentence = pvBuilder.toString();

        //check for vowels and consonants
        for (char character : sentence.toCharArray()) {
            if (vowels.contains(character)) {
                vowelCount++;
            } else if (!notAlphabeticChar.contains(character)) {
                consonantCount++;
            }
        }

        return String.format("%d %d::%s::%s::%s", vowelCount, consonantCount, reversedSentence, snakeCaseSentence, replacedSentence);
    }
}
