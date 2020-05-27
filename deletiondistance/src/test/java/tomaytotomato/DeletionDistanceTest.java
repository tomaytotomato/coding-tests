package tomaytotomato;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DeletionDistanceTest
{
    @Test
    public void deletionDistance_LeftStringSmallerThanRight() {
        assertThat(DeletionDistance.deletionDistance("og", "dog")).isEqualTo(1);
        assertThat(DeletionDistance.deletionDistance("ord", "sword")).isEqualTo(2);
    }

    @Test
    public void deletionDistance_RightStringSmallerThanLeft() {
        assertThat(DeletionDistance.deletionDistance("apache", "apach")).isEqualTo(1);
        assertThat(DeletionDistance.deletionDistance("ork", "or")).isEqualTo(1);
    }

    @Test
    public void deletionDistance_BothStringsAlreadyEqual() {
        assertThat(DeletionDistance.deletionDistance("deckard", "deckard")).isEqualTo(0);
    }

    @Test
    public void deletionDistance_EqualLengthDifferentChars() {
        assertThat(DeletionDistance.deletionDistance("thought", "sloughs")).isEqualTo(6);
        assertThat(DeletionDistance.deletionDistance("boat", "got")).isEqualTo(3);

    }

    @Test
    public void deletionDistance_NoMatches() {
        assertThat(DeletionDistance.deletionDistance("xyzw", "abcd")).isEqualTo(8);
    }

    @Test
    public void deletionDistance_BadInput() {
        assertThat(DeletionDistance.deletionDistance(null, null)).isEqualTo(0);
        assertThat(DeletionDistance.deletionDistance(null, "bob")).isEqualTo(0);
        assertThat(DeletionDistance.deletionDistance("foo", null)).isEqualTo(0);
        assertThat(DeletionDistance.deletionDistance("", "")).isEqualTo(0);
    }

}
