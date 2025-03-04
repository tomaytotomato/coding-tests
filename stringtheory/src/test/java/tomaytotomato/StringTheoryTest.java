package tomaytotomato;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StringTheoryTest {

    @Test
    void run_WhenValidInput_ThenReturnCalculatedStringOutput() {

        //given
        String input = "ThIs is p";
        String expected = "2 5::P IS tHiS::ThIs-is-p::ThpvIs pvis p";

        //when
        String result = StringTheory.run(input);

        //then
        assertEquals(expected, result);
    }

    @Test
    void run_WhenOnlyVowels_ThenReturnCalculatedStringOutput() {

        //given
        String input = "aeiou";
        String expected = "5 0::AEIOU::aeiou::pvapvepvipvopvu";

        //when
        String result = StringTheory.run(input);

        //then
        assertEquals(expected, result);
    }

    @Test
    void run_WhenOnlyConsonants_ThenReturnCalculatedStringOutput() {
        //given
        String input = "bcdfg";
        String expected = "0 5::BCDFG::bcdfg::bcdfg";

        //when
        String result = StringTheory.run(input);

        //then
        assertEquals(expected, result);
    }

    @Test
    void run_WhenEmptyOrNull_ThenReturnCalculatedStringOutput() {
        //given
        String input = "";
        String expected = "0 0::::::";

        //when
        String result = StringTheory.run(input);

        //then
        assertEquals(expected, result);
    }
}
