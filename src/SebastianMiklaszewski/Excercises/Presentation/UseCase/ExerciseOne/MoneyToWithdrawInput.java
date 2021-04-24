package SebastianMiklaszewski.Excercises.Presentation.UseCase.ExerciseOne;

import SebastianMiklaszewski.Excercises.Infrastructure.Adapter.Input.ConsoleInputAdapter;
import SebastianMiklaszewski.Excercises.Presentation.Shared.Input.InputInterface;

import java.math.BigDecimal;

public class MoneyToWithdrawInput {
    private final InputInterface input;

    public MoneyToWithdrawInput() {
        this.input = new ConsoleInputAdapter();

    }

    public BigDecimal inputMoneyToWithdraw() {
        return new BigDecimal(this.input.getStringInput());
    }
}
