package tomaytotomato;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StockpriceTest {

    @Test
    public void stockRuns_RisingPrices() {
        assertThat(Stockprice.stockRuns(new int[] {1, 2, 3})).isEqualTo(3);
    }

    @Test
    public void stockRuns_NoPrices() {
        assertThat(Stockprice.stockRuns(new int[] {})).isEqualTo(0);
    }

    @Test
    public void stockRuns_SinglePriceNoChange() {
        assertThat(Stockprice.stockRuns(new int[] {1})).isEqualTo(1);
    }

    @Test
    public void stockRuns_UpAndDownPrices() {
        assertThat(Stockprice.stockRuns(new int[] {3, 4, 5, 4, 3, 2})).isEqualTo(4);
    }

    @Test
    public void stockRuns_NoPriceChanges() {
        assertThat(Stockprice.stockRuns(new int[] {2, 2, 2, 2, 2, 2, 2})).isEqualTo(1);
    }

    @Test
    public void stockRuns_PricesGoDownThenPlateauThenDownAgain() {
        assertThat(Stockprice.stockRuns(new int[] {3, 2, 2, 1})).isEqualTo(2);
        assertThat(Stockprice.stockRuns(new int[] {5, 2, 2, 2, 2, 2, 1})).isEqualTo(2);
    }

    @Test
    public void stockRuns_PricesGoUpThenPlateauThenUpAgain() {
        assertThat(Stockprice.stockRuns(new int[] {3, 5, 5, 6, 6, 6, 6, 6})).isEqualTo(2);
        assertThat(Stockprice.stockRuns(new int[] {5, 6, 6, 6, 6, 6, 7})).isEqualTo(2);
    }
}