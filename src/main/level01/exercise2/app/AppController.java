package main.level01.exercise2.app;

import main.level01.exercise2.data.DnisData;
import main.level01.exercise2.model.DniCalculator;

public class AppController {

    private static final String NL = System.lineSeparator();

    public StringBuilder run() {

        StringBuilder message = new StringBuilder();


        message.append("CALCULATE DNI LETTERS...")
                .append(NL);

        for (int dni : DnisData.getDniTest()) {
            message.append("For de dni number ")
                    .append(dni)
                    .append(" the letter is: ")
                    .append(DniCalculator.calculateLetterDni(dni))
                    .append(NL);
        }

    return message;
    }

}
