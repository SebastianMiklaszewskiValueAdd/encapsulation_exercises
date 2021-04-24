package SebastianMiklaszewski.Excercises.Presentation.Shared;

import SebastianMiklaszewski.Excercises.Infrastructure.Adapter.Output.ConsoleOutputAdapter;
import SebastianMiklaszewski.Excercises.Presentation.Shared.Output.OutputInterface;

abstract public class AbstractSpeaker {
    protected final OutputInterface output;

    public AbstractSpeaker() {
        this.output = new ConsoleOutputAdapter();
    }

    protected void welcome(int numOfExercise, String title) {
        this.output.print("Hi! This is exercise" + numOfExercise + " : " + title);
    }
}
