package SebastianMiklaszewski.Excercises.Core.ValueObject;

public class Money {
    private final MoneyValue moneyValue;
    private final Currency currency;

    public Money(MoneyValue moneyValue, Currency currency) {
        this.moneyValue = moneyValue;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return String.join(" ", this.moneyValue.toString(), this.currency.toString());
    }

    public MoneyValue getMoneyValue() {
        return this.moneyValue;
    }

    public Currency getCurrency() {
        return this.currency;
    }
}
