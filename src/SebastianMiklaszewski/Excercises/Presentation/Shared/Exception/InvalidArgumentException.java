package SebastianMiklaszewski.Excercises.Presentation.Shared.Exception;

import javax.security.auth.login.LoginException;

public class InvalidArgumentException extends LoginException {
    public InvalidArgumentException(String msg) {
        super(msg);
    }
}
