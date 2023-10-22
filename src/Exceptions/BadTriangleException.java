package Exceptions;

public class BadTriangleException extends Exception{
    public BadTriangleException(String errorMessage) {
        super(errorMessage);
    }
}