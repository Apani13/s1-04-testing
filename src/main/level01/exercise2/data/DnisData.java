package main.level01.exercise2.data;

import main.level01.exercise1.model.Book;
import main.level01.exercise1.model.Library;

import java.util.List;

public class DnisData {

    private static final List<Integer> DNI_LIST = List.of(
            45676543,
            66666666,
            23678745,
            63434334,
            70088816,
            22222222,
            33333333,
            99999999,
            62939200,
            76311233);

    public static List<Integer> getDniTest() {
        return DNI_LIST;
    }


}
