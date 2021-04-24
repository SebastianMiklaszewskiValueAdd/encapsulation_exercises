package SebastianMiklaszewski.Excercises.Core.Model;

import SebastianMiklaszewski.Excercises.Core.Exception.NotEnoughMoneyException;
import SebastianMiklaszewski.Excercises.Core.Factory.WalletFactoryInterface;
import SebastianMiklaszewski.Excercises.Core.ValueObject.MoneyValue;
import SebastianMiklaszewski.Excercises.Infrastructure.Entity.Wallet;
import SebastianMiklaszewski.Excercises.Infrastructure.Factory.WalletFactory;

public class WithdrawMoneyFromWallet {
    private final WalletFactoryInterface walletFactory;
    private Wallet wallet;

    public WithdrawMoneyFromWallet() throws NotEnoughMoneyException {
        this.walletFactory = new WalletFactory();
        this.initWallet();
    }

    public void withdrawMoneyFromWallet(MoneyValue toWithdraw) throws NotEnoughMoneyException {
        this.wallet.withdraw(toWithdraw);
    }

    private void initWallet() throws NotEnoughMoneyException {
        this.wallet = this.walletFactory.createWalletWithFiveUsd();
    }
}
