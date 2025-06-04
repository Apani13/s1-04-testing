package main.level01.exercise1;

import main.level01.exercise1.app.AppController;

public class Main {
    public static void main(String[] args) {

        StringBuilder message;
        AppController appController = new AppController();

        message = appController.run();

        System.out.println(message);

    }
}
