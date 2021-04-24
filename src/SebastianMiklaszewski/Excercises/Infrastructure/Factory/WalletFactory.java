package SebastianMiklaszewski.Excercises.Infrastructure.Factory;

import SebastianMiklaszewski.Excercises.Core.Exception.NotEnoughMoneyException;
import SebastianMiklaszewski.Excercises.Core.Factory.WalletFactoryInterface;
import SebastianMiklaszewski.Excercises.Core.ValueObject.Currency;
import SebastianMiklaszewski.Excercises.Core.ValueObject.Money;
import SebastianMiklaszewski.Excercises.Core.ValueObject.MoneyValue;
import SebastianMiklaszewski.Excercises.Infrastructure.Entity.Wallet;

import java.math.BigDecimal;

public class WalletFactory implements WalletFactoryInterface {
    @Override
    public Wallet createWalletWithFiveUsd() throws NotEnoughMoneyException {
        return new Wallet(new Money(new MoneyValue(BigDecimal.valueOf(5.00)), new Currency("USD")));
    }
}
