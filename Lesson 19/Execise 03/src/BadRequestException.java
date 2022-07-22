/**
 * BadRequestException (Hierarchy of exceptions)
 */
/*
Create a class named BadRequestException with the constructor that takes
String message as an argument and passes the message to the superclass. The
BadRequestException class must inherit from a checked exception.
 */
public class BadRequestException extends Exception{
    public BadRequestException(String message) {
        super(message);
    }
}