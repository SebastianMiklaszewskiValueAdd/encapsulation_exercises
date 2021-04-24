package SebastianMiklaszewski.Excercises.Infrastructure.Adapter.Input;

import SebastianMiklaszewski.Excercises.Presentation.Shared.Exception.InvalidInputException;
import SebastianMiklaszewski.Excercises.Presentation.Shared.Input.InputInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputAdapter implements InputInterface {
    private final BufferedReader streamReader;

    public ConsoleInputAdapter() {
        this.streamReader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public String getStringInput() {
        try {
            return this.streamReader.readLine();
        } catch (IOException e) {
            throw new InvalidInputException(e.getMessage());
        }
    }

    @Override
    public int getKeyValue() throws IOException {
        return this.streamReader.read();
    }
}
