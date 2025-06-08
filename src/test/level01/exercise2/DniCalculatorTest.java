package test.level01.exercise2;

import main.level01.exercise2.model.DniCalculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DniCalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "45676543, S",
            "66666666, Q",
            "23678745, S",
            "63434334, N",
            "70088816, L",
            "22222222, J",
            "33333333, P",
            "99999999, R",
            "62939200, E",
            "76311233, Q"
    })

    void givenValidDniNumber_WhenCalculatingLetter_thenReturnsCorrectLetter(int dni, char expectedLetter) {
        assertEquals(expectedLetter, DniCalculator.calculateLetterDni(dni));
    }


}
