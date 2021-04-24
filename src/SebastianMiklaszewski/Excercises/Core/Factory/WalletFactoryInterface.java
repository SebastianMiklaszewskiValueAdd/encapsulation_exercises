package SebastianMiklaszewski.Excercises.Core.Factory;

// Yeah, I know that I'm using Infrastructure in Core but for now I have no idea how to handle it.
import SebastianMiklaszewski.Excercises.Core.Exception.NotEnoughMoneyException;
import SebastianMiklaszewski.Excercises.Infrastructure.Entity.Wallet;

public interface WalletFactoryInterface {
    Wallet createWalletWithFiveUsd() throws NotEnoughMoneyException;
}
