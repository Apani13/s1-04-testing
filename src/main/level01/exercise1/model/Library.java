package main.level01.exercise1.model;

import main.level01.exercise1.exceptions.BookDoesNotExistException;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (!this.books.contains(book)) {
            this.books.add(book);
            sortBooks();
        }
    }

    public List<Book> getBooks() {
        return this.books;
    }

    public String getTitleByIndex(int index) {
        try {
            return this.books.get(index).getTitle();
        } catch (Exception e) {
            throw new IndexOutOfBoundsException("ERROR: index number not valid");
        }
    }

    public void addBookByIndex(int index, Book book) {
        try {
            this.books.add(index, book);
            sortBooks();
        } catch (Exception e) {
            throw new IndexOutOfBoundsException("ERROR: index number not valid");
        }
    }

    public void removeBookByTitle(String title) throws BookDoesNotExistException {
        Iterator<Book> iterator = books.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();

            if (book.getTitle().equals(title)) {
                iterator.remove();
                sortBooks();
                return;
            }

        }

        throw new BookDoesNotExistException();

    }

    public void sortBooks() {
        books.sort(Comparator.comparing(Book::getTitle));
    }

}
