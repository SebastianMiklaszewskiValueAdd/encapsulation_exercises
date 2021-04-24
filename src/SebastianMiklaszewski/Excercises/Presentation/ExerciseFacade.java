package SebastianMiklaszewski.Excercises.Presentation;

import SebastianMiklaszewski.Excercises.Presentation.Shared.Exception.InvalidArgumentException;
import SebastianMiklaszewski.Excercises.Presentation.UseCase.ExerciseOne.ExerciseOneHandler;

public class ExerciseFacade {
    private final ExerciseOneHandler exerciseOneHandler;

    public ExerciseFacade() throws InvalidArgumentException {
        this.exerciseOneHandler = new ExerciseOneHandler();
    }

    public void exerciseOne() {
        this.exerciseOneHandler.handle();
    }
}
