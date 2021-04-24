package SebastianMiklaszewski.Excercises.Infrastructure.Adapter.Output;

import SebastianMiklaszewski.Excercises.Presentation.Shared.Output.OutputInterface;

public class ConsoleOutputAdapter implements OutputInterface {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
