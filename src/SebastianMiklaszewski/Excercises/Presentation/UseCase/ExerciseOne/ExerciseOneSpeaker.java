package SebastianMiklaszewski.Excercises.Presentation.UseCase.ExerciseOne;

import SebastianMiklaszewski.Excercises.Presentation.Shared.AbstractSpeaker;

public class ExerciseOneSpeaker extends AbstractSpeaker {
    public void welcome() {
        super.welcome(1, "Withdraw money from the wallet");
    }

    public void cannotWithdrawMoreThanYouHave() {
        super.output.print("You have not enough money in your wallet.");
    }

    public void howMuchDoYouWantToWithdraw() {
        super.output.print("How much do you want to withdraw? I remind you that you have only 5 USD.");
    }

    public void moneyWithdrawnSuccessful() {
        super.output.print("Money withdrawn successful.");
    }

}
