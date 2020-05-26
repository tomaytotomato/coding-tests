package tomaytotomato;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Unit test for simple OcrComparator.
 */
public class OcrComparatorTest {

    private final OcrComparator ocrComparator;

    public OcrComparatorTest() {
        ocrComparator = new OcrComparator();
    }

    @Test
    public void testRecomposeString() throws Exception {
        final String input = "2XXYZZ";
        final String expectedOutput = "??XXYZZ";

        assertEquals(expectedOutput, ocrComparator.recomposeString(input));
    }


    @Test
    public void testCompareOcrStringsValid() throws Exception {
        final String validA = "A2Le";
        final String validB = "2pL1";

        assertTrue(ocrComparator.compareOcrStrings(validA, validB));
    }


    @Test
    public void testCompareOcrStringsInvalid() throws Exception {
        final String validA = "ba1";
        final String validB = "1Ad";

        assertFalse(ocrComparator.compareOcrStrings(validA, validB));
    }

    @Test
    public void testCompareOcrStringsInvalidLength() throws Exception {
        final String validA = "2rse";
        final String validB = "Ho3";

        assertFalse(ocrComparator.compareOcrStrings(validA, validB));
    }
}
