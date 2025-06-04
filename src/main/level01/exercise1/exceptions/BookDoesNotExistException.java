package main.level01.exercise1.exceptions;

public class BookDoesNotExistException extends Exception{
    public BookDoesNotExistException() {
        super("ERROR: book does not exist");
    }
}
