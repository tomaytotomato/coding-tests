package org;

import java.util.Objects;

public class Denomination {

    private final Integer quantity;
    private final String coinDenomination;

    public Denomination(int quantity, String coinDenomination) {
        this.quantity = quantity;
        this.coinDenomination = coinDenomination;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getCoinDenomination() {
        return coinDenomination;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Denomination that = (Denomination) o;
        return Objects.equals(quantity, that.quantity) && Objects.equals(coinDenomination, that.coinDenomination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, coinDenomination);
    }

    @Override
    public String toString() {
        return "Denomination{" +
            "quantity=" + quantity +
            ", coinDenomination='" + coinDenomination + '\'' +
            '}';
    }
}
