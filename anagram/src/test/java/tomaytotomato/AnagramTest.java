package tomaytotomato;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AnagramTest {

    @Test
    public void isAnagram_ValidInputAndIsTrue() {
        assertThat(Anagram.isAnagramOptimised("Save", "Vase")).isTrue();
        assertThat(Anagram.isAnagramOptimised("Bored", "Robed")).isTrue();
        assertThat(Anagram.isAnagramOptimised("inch", "Chin")).isTrue();
        assertThat(Anagram.isAnagramOptimised("52", "25")).isTrue();
    }

    @Test
    public void isAnagram_ValidInputAndIsFalse() {
        assertThat(Anagram.isAnagramOptimised("Gerrard", "Batten")).isFalse();
        assertThat(Anagram.isAnagramOptimised("Tank", "Submarine")).isFalse();
        assertThat(Anagram.isAnagramOptimised("Tank", "Tonk")).isFalse();
        assertThat(Anagram.isAnagramOptimised("Seagull", "seagull")).isFalse();
        assertThat(Anagram.isAnagramOptimised("bear", "PEAR")).isFalse();
        assertThat(Anagram.isAnagramOptimised("DOG", "dog")).isFalse();
    }

    @Test
    public void isAnagram_InvalidInputIsFalse() {
        assertThat(Anagram.isAnagramOptimised("", "Trex")).isFalse();
        assertThat(Anagram.isAnagramOptimised("", "")).isFalse();
        assertThat(Anagram.isAnagramOptimised(null, "Fish")).isFalse();
        assertThat(Anagram.isAnagramOptimised(null, null)).isFalse();
        assertThat(Anagram.isAnagramOptimised("16", "17")).isFalse();
    }


}
