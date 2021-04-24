package SebastianMiklaszewski.Excercises.Core.ValueObject;

import SebastianMiklaszewski.Excercises.Core.Exception.NotEnoughMoneyException;

import java.math.BigDecimal;

public class MoneyValue {
    private final BigDecimal moneyValue;

    public MoneyValue(BigDecimal moneyValue) throws NotEnoughMoneyException {
        this.validate(moneyValue);
        this.moneyValue = moneyValue;
    }

    private void validate(BigDecimal moneyValue) throws NotEnoughMoneyException {
        if (moneyValue.compareTo(BigDecimal.ZERO) < 0) {
            throw new NotEnoughMoneyException();
        }
    }

    public BigDecimal getValue() {
        return this.moneyValue;
    }
}
