package task2.task22.model.utils;

import task2.task22.model.Book;

public class BookSearcher {

    public static boolean  ifBookByAuthor(Book book, String author){
         return author.equals(book.getAuthor());
    }

    public static boolean  ifBookByPublisher(Book book, String publisher){
         return publisher.equals(book.getPublisher());
    }

    public static boolean  ifBookBeforeYear(Book book, int year){
         return book.getYear()<year;
    }



}
