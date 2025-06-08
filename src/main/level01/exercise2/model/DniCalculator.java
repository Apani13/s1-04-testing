package main.level01.exercise2.model;

import java.util.List;

public class DniCalculator {

    private static final List<Character> LETTERS_DNI = List.of('T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E');

    public static char calculateLetterDni(int dni) {
        return LETTERS_DNI.get(dni % 23);
    }

}
