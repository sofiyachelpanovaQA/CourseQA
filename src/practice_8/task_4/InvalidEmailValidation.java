package practice_8.task_4;

import practice_8.task_3.InvalidAgeException;

public class InvalidEmailValidation extends RuntimeException {
    public InvalidEmailValidation(String message) {
        super(message);
    }
}
