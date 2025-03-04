package org;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DenomationPrinterTest {

    private DenomationPrinter printer;

    @BeforeEach
    public void setUp() {
        printer = new DenomationPrinter();
    }

    @Test
    public void print_WhenValidListOfDenomations_ThenPrintResult() {

        //given
        var denomations = List.of(new Denomination(1, "£2"));

        // when
        String result = printer.printToString(denomations);

        //then
        assertThat(result).isNotBlank()
            .contains("1 £2");
    }

    @Test
    public void print_WhenValidListOfDenomationsY_ThenPrintResult() {

        //given
        var denomations = List.of(new Denomination(1, "£2"), new Denomination(3, "£1"));

        // when
        String result = printer.printToString(denomations);

        //then
        assertThat(result).isNotBlank()
            .contains("1 £2,3 £1");
    }

}
