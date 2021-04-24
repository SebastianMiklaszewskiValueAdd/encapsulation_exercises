package SebastianMiklaszewski.Excercises.Core.Exception;

public class NotEnoughMoneyException extends Exception{
    public NotEnoughMoneyException() {
        super("You cannot have less than 0 money in wallet.");
    }
}
