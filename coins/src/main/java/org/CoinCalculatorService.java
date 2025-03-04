package org;

import java.util.ArrayList;
import java.util.List;

public class CoinCalculatorService {

    public List<Integer> denominations = List.of(200, 100, 50, 20, 10, 5, 2, 1);

    public List<Denomination> calculate(String money) {

        //checking if it has a £ symbol
        List<Denomination> calculatedDenominations = new ArrayList<>();

        if (money.contains("£")) {
            var moneyRawValue = money.replace("£", "");
            var moneyPenceValue = Integer.parseInt(moneyRawValue) * 100;
            calculatedDenominations = calculateLogic(moneyPenceValue);
        } else {

            try {
                int pence = Integer.parseInt(money);
                calculatedDenominations = calculateLogic(pence);
            } catch (NumberFormatException e) {
                //try parsing as double

                //or fail - throw exception
            }
        }
        return calculatedDenominations;
    }

    private List<Denomination> calculateLogic(int moneyPenceValue) {
        var denominationIndex = 0;
        var calculatedDenominations = new ArrayList<Denomination>();
        while (moneyPenceValue > 0) {

            var penceDividing = denominations.get(denominationIndex);
            var remained = moneyPenceValue % penceDividing;

            if (remained == 0) {
                var denomationString = penceToDenomationSymbol(penceDividing);
                var quantity = moneyPenceValue / penceDividing;
                calculatedDenominations.add(new Denomination(quantity, denomationString));
                moneyPenceValue = 0;
            } else {
                var denomationString = penceToDenomationSymbol(penceDividing);
                var quantity = moneyPenceValue / penceDividing;
                if (quantity > 0) {
                    calculatedDenominations.add(new Denomination(quantity, denomationString));
                }
                moneyPenceValue = remained;
            }
            denominationIndex++;
        }
        return calculatedDenominations;
    }

    public String penceToDenomationSymbol(Integer pence) {
        switch (pence) {
            case 200:
                return "£2";
            case 100:
                return "£1";
            case 50:
                return "50p";
            default:
                return "1";
        }
    }
}
