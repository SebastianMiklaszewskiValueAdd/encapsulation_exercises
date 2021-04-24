package SebastianMiklaszewski.Excercises.Infrastructure.Entity;

import SebastianMiklaszewski.Excercises.Core.Exception.NotEnoughMoneyException;
import SebastianMiklaszewski.Excercises.Core.ValueObject.Money;
import SebastianMiklaszewski.Excercises.Core.ValueObject.MoneyValue;

public class Wallet {
    private Money money;

    public Wallet(Money money) {
        this.money = money;
    }

    public void withdraw(MoneyValue toWithdraw) throws NotEnoughMoneyException {
        this.money = new Money(
                new MoneyValue(this.money.getMoneyValue().getValue().subtract(toWithdraw.getValue())),
                this.money.getCurrency()
        );
    }
}
