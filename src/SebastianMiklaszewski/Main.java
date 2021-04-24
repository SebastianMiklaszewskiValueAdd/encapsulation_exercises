package SebastianMiklaszewski;

import SebastianMiklaszewski.Excercises.Infrastructure.Gateway.Console.ExerciseGateway;
import SebastianMiklaszewski.Excercises.Presentation.Shared.Exception.InvalidArgumentException;

import java.io.IOException;

public class Main {

    private static ExerciseGateway facade;

    public static void main(String[] args) throws IOException, InvalidArgumentException {
        boot();

        System.out.println("ENCAPSULATION EXERCISES");
        System.out.println("=======================");

        facade.chooseExercise();
    }

    private static void boot() throws InvalidArgumentException {
        facade = new ExerciseGateway();
    }
}
