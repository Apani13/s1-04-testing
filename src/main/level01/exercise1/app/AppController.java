package main.level01.exercise1.app;

import main.level01.exercise1.data.BooksData;
import main.level01.exercise1.exceptions.BookDoesNotExistException;
import main.level01.exercise1.model.Library;
import main.level01.exercise1.model.Book;

public class AppController {

   private static final String NL = System.lineSeparator();

   public StringBuilder run() {

      Library library = new Library();

      StringBuilder message = new StringBuilder();

      message.append("LOADING BOOKS INTO LIBRARY...")
              .append(NL);

      BooksData.populateArrayOfBooks(library);

      message.append("ADD BOOK...")
               .append(NL);

      library.addBook(new Book("Hamlet"));

      message.append("ADD BOOK BY INDEX...")
              .append(NL);

      library.addBookByIndex(2, new Book("La historia Interminable"));

      message.append("REMOVE BOOK BY TITLE...")
               .append(NL);

      try {
         library.removeBookByTitle("La náusea");
      } catch (BookDoesNotExistException e) {
         message.append(e.getMessage())
                 .append("\n");
      }

      message.append("GET BOOK BY INDEX...")
              .append(NL);

      message.append(library.getTitleByIndex(3))
              .append(NL);

      message.append("GET ALL BOOKS...")
              .append(NL);

      message.append(library.getBooks());


      return message;
   }

}
