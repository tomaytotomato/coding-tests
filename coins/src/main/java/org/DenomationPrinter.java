package org;

import java.util.List;
import java.util.stream.Collectors;

public class DenomationPrinter {


    public String printToString(List<Denomination> denomations) {

        var stringList = denomations.stream().map(d -> {
            return d.getQuantity() + " " + d.getCoinDenomination();
        }).collect(Collectors.joining(","));

        return stringList;
    }
}
