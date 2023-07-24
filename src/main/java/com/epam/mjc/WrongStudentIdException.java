package com.epam.mjc;

public class WrongStudentIdException extends IllegalArgumentException {
    public WrongStudentIdException(String message) {
        super(message);
    }
}
