package test.level01.exercise1;

import main.level01.exercise1.data.BooksData;
import main.level01.exercise1.model.Book;
import main.level01.exercise1.model.Library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LibraryTest {

    private Library library;
    private

    @BeforeEach
    void setUp() {
        library = new Library();
        BooksData.populateArrayOfBooks(library);
    }

    @Test
    void givenListOfBooks_whenCheckingBookList_thenBookListIsNotNull() {
        assertNotNull(library.getBooks(), "book list should not be empty");
    }

    @Test
    void givenListOfBooksAdded_whenCheckingArraySize_thenSizeIsCorrect() {
        assertEquals(8, library.getBooks().size(), "List should have 8 books");
    }

    @Test
    void givenListOfBooks_whenGettingTitleByIndex_thenReturnCorrectBook() {
        String expectedTitle = "The violence of the sun";
        String actualTitle = library.getTitleByIndex(0);

        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    void givenListOfBooks_WhenAddingDuplicateBooks_thenArrayStaysSameLength() {
        library.addBook(new Book("La historia interminable"));

        assertEquals(8, library.getBooks().size(), "Array should maintain same length");
    }

    @Test
    void givenListOfBooks_WhenGettingTitleByIndex_thenReturnsCorrectBook() {
            String expectedTitle = "Rimas y Leyendas";
            String actualTittle = library.getTitleByIndex(6);

            assertEquals(expectedTitle, actualTittle, "The title at index 6 should match the expected title.");

    }

    @Test
    public void givenBookAdded_whenCheckingLibrarySize_thenArraySizeIsCorrect() {
        library.addBook(new Book("Java para principiantes"));

        assertEquals(9, library.getBooks().size(), "Array length should be 9");
    }

    @Test
    public void givenBookRemoved_whenCheckingLibrarySize_thenArraySizeIsCorrect() {

        try {
            String bookTitleToRemove = library.getTitleByIndex(5);
            library.removeBookByTitle(bookTitleToRemove);
        } catch (Exception e) {
            fail("An exception was thrown while trying to remove the book: " + e.getMessage());
        }

        assertEquals(7, library.getBooks().size(), "Array length should be 7 after removing one book");

    }

    @Test
    public void givenBooksAdded_WhenCheckingAlphabeticalOrder_thenOrderRemainsCorrect() {
        library.addBook(new Book("La zapatera prodigiosa"));

        assertEquals("Great Expectations", library.getTitleByIndex(0));
        assertEquals("La metamorfosis", library.getTitleByIndex(1));
        assertEquals("La náusea", library.getTitleByIndex(2));
        assertEquals("La vida es Sueño", library.getTitleByIndex(3));
        assertEquals("La vida secreta de los Monstruos", library.getTitleByIndex(4));
        assertEquals("La zapatera prodigiosa", library.getTitleByIndex(5));
        assertEquals("Los hechos de la vida", library.getTitleByIndex(6));
        assertEquals("Rimas y Leyendas", library.getTitleByIndex(7));
        assertEquals("The violence of the sun", library.getTitleByIndex(8));
    }

    @Test
    public void givenBooksRemoved_WhenCheckingAlphabeticalOrder_thenOrderRemainsCorrect() {

        try {
            library.removeBookByTitle("La vida secreta de los Monstruos");
        } catch (Exception e) {
            fail("An exception was thrown while trying to remove the book: " + e.getMessage());
        }

        assertEquals("Great Expectations", library.getTitleByIndex(0));
        assertEquals("La metamorfosis", library.getTitleByIndex(1));
        assertEquals("La náusea", library.getTitleByIndex(2));
        assertEquals("La vida es Sueño", library.getTitleByIndex(3));
        assertEquals("Los hechos de la vida", library.getTitleByIndex(4));
        assertEquals("Rimas y Leyendas", library.getTitleByIndex(5));
        assertEquals("The violence of the sun", library.getTitleByIndex(6));

    }









}
