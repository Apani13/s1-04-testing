package main.level01.exercise1.data;

import main.level01.exercise1.model.Library;
import main.level01.exercise1.model.Book;

public class BooksData {

    public static void populateArrayOfBooks(Library library) {

        library.addBook(new Book("Los hechos de la vida"));
        library.addBook(new Book("Great Expectations"));
        library.addBook(new Book("La metamorfosis"));
        library.addBook(new Book("La vida secreta de los Monstruos"));
        library.addBook(new Book("The violence of the sun"));
        library.addBook(new Book("La náusea"));
        library.addBook(new Book("Rimas y Leyendas"));
        library.addBook(new Book("La vida es Sueño"));

       }

}
