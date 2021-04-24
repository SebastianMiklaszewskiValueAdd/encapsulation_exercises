package SebastianMiklaszewski.Excercises.Core.ValueObject;

public class Currency {
    private final String currency;

    public Currency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return this.currency;
    }
}
