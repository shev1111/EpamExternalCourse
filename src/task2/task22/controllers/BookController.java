package task2.task22.controllers;

import task2.task22.model.Book;
import task2.task22.model.utils.BookSorter;
import task2.task22.view.BookInfoPrinter;

public class BookController {

    public static void getAuthorsBooks(Book[] books, String author){
        BookInfoPrinter.printAuthorsBooks(books, author);
    }

    public static void getPublishersBooks(Book[] books, String publisher){
        BookInfoPrinter.printPublishersBooks(books, publisher);
    }

    public static void getBooksPublishedAfterDefinedYear(Book[] books, int year){
        BookInfoPrinter.printBooksBeforeDefinedYear(books, year);
    }

    public static void sortBooksByPublishers(Book[] books){
        BookSorter.sortByPublishers(books);
        BookInfoPrinter.printBooks(books);
    }

    public static void returnMessage(String message){
        BookInfoPrinter.printMessage(message);
    }


}
