package main.level01.exercise3.app;

import main.level01.exercise3.model.ClassThatThrowsException;

public class AppController {

    private final ClassThatThrowsException demo = new ClassThatThrowsException();

    public void run() {

        System.out.println("=== Mini-demo of ClassThatThrowsException ===");

        try {
            demo.throwIndexOutOfBounds();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        }
    }
}
