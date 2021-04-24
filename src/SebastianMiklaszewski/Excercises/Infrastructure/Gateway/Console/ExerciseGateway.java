package SebastianMiklaszewski.Excercises.Infrastructure.Gateway.Console;

import SebastianMiklaszewski.Excercises.Infrastructure.Exception.InvalidChoiceException;
import SebastianMiklaszewski.Excercises.Presentation.ExerciseFacade;
import SebastianMiklaszewski.Excercises.Presentation.Shared.Exception.InvalidArgumentException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ExerciseGateway {
    private final BufferedReader streamReader;
    private final ExerciseFacade facade;

    public ExerciseGateway() throws InvalidArgumentException {
        this.streamReader = new BufferedReader(new InputStreamReader(System.in));
        this.facade = new ExerciseFacade();
    }

    public void chooseExercise() throws IOException {
        System.out.println("Choose the exercise: \n");
        this.getExercises().forEach(System.out::println);

        int choice = selectExercise();

        switch (choice) {
            case 1 -> facade.exerciseOne();
            default -> {
                System.out.println("Unavailable exercise. Try again.");

                chooseExercise();
            }
        }
    }

    private int selectExercise() throws IOException {
        System.out.print("Exercise no.");
        int choice = this.streamReader.read();

        if (!Character.isDigit(choice)) {
            throw new InvalidChoiceException("Invalid choice. Must be a number.");
        }

        return Character.getNumericValue(choice);
    }

    private List<String> getExercises() {
        return List.of("1: Exercise 1");
    }
}
