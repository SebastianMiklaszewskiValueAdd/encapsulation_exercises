package SebastianMiklaszewski.Excercises.Presentation.Shared.Input;

import java.io.IOException;

public interface InputInterface {
    String getStringInput();

    int getKeyValue() throws IOException;
}
