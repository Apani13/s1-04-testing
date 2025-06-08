package test.level01.exercise3;

import main.level01.exercise3.model.ClassThatThrowsException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ClassThatThrowsExceptionTest {

    @Test
    void givenArray_whenAccessingInvalidIndex_thenThrowsArrayIndexOutOfBoundsException() {
        ClassThatThrowsException obj = new ClassThatThrowsException();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            obj.throwIndexOutOfBounds();
        });

    }

}
