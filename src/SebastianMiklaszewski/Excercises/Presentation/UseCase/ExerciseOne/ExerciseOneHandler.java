package SebastianMiklaszewski.Excercises.Presentation.UseCase.ExerciseOne;

import SebastianMiklaszewski.Excercises.Core.Exception.NotEnoughMoneyException;
import SebastianMiklaszewski.Excercises.Core.Model.WithdrawMoneyFromWallet;
import SebastianMiklaszewski.Excercises.Core.ValueObject.MoneyValue;
import SebastianMiklaszewski.Excercises.Presentation.Shared.Exception.InvalidArgumentException;

import java.math.BigDecimal;

public class ExerciseOneHandler {

    private final ExerciseOneSpeaker speaker;
    private final WithdrawMoneyFromWallet model;
    private final MoneyToWithdrawInput input;

    public ExerciseOneHandler() throws InvalidArgumentException {
        this.speaker = new ExerciseOneSpeaker();
        try {
            this.model = new WithdrawMoneyFromWallet();
        } catch (NotEnoughMoneyException e) {
            throw new InvalidArgumentException(e.getMessage());
        }
        this.input = new MoneyToWithdrawInput();
    }

    public void handle() {
        this.speaker.welcome();

        this.speaker.howMuchDoYouWantToWithdraw();
        BigDecimal toWithdraw = this.input.inputMoneyToWithdraw();

        try {
            this.model.withdrawMoneyFromWallet(new MoneyValue(toWithdraw));
        } catch (NotEnoughMoneyException e) {
            this.speaker.cannotWithdrawMoreThanYouHave();
            return;
        }

        this.speaker.moneyWithdrawnSuccessful();
    }
}
