package org;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * |Input| Output |
 * |£2 | 1 £2 |
 * |253 | 1 £2, 1 50p, 1 2p, 1 1p |
 * |5.23 | 2 £2, 1 £1, 1 20p, 1 2p, 1 1p |
 * |$23 | Throw sensible exception |
 *
 * £2, £1, 50p, 20p, 10p, 5p, 2p, 1p
 */
public class CoinCalculatorServiceTest {

    private CoinCalculatorService service;

    @BeforeEach
    public void setUp() {
        service = new CoinCalculatorService();
    }

    @Test
    public void calculate_WhenValidCurrencySymbolAndValue_ThenReturnCorrectCurrencyDenomination() {

        //given
        var money = "£2";

        //when
        var result = service.calculate(money);

        //then
        assertThat(result).containsExactly(new Denomination(1, "£2"));
    }

    @Test
    public void calculate_WhenValidCurrencyWithNoSymbolPence_ThenReturnCorrectCurrencyDenomination() {
        //given
        var money = "250";

        //when
        var result = service.calculate(money);

        //then
        assertThat(result).containsExactly(new Denomination(1, "£2"), new Denomination(1, "50p"));

    }

    @Test
    public void calculate_WhenNull_ThenReturnInvalidCurrencyException() {

    }

    @Test
    public void calculate_WhenInvalidCurencySymbol_ThenReturnInvalidCurrencyException() {}

}
