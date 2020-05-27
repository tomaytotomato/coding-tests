package tomaytotomato;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LongestFlatTest
{
    @Test
    public void longestFlat_ValidInput() {
        assertThat(LongestFlat.longestFlat(new int[]{1,1,1,1,1})).isEqualTo(5);
        assertThat(LongestFlat.longestFlat(new int[]{6})).isEqualTo(1);
        assertThat(LongestFlat.longestFlat(new int[]{2,2,1,3,3})).isEqualTo(2);
        assertThat(LongestFlat.longestFlat(new int[]{2,4,4,4,4,4,2})).isEqualTo(5);
        assertThat(LongestFlat.longestFlat(new int[]{3,3,4,4,5,5,2})).isEqualTo(2);
    }

    @Test
    public void longestFlat_InvalidInput() {
        assertThat(LongestFlat.longestFlat(new int[]{})).isEqualTo(0);
        assertThat(LongestFlat.longestFlat(null)).isEqualTo(0);

    }

}
