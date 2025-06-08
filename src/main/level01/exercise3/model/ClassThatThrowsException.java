package main.level01.exercise3.model;

public class ClassThatThrowsException {

    public void throwIndexOutOfBounds() throws ArrayIndexOutOfBoundsException {
        int[] numbers = {1, 2, 3};
        int invalidAccess = numbers[5];
    }


}
