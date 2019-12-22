package task2.task22.model.utils;

import task2.task22.model.Book;
import java.util.Random;

public class BooksGenerator {
    private static Random random = new Random();

    public static Book[] getBooksArray(int arrayLength){
        Book[] books = new Book[arrayLength];
        for (int bookIndex = 0; bookIndex<arrayLength; bookIndex++) {
            Book book = new Book();
            book.setName(BooksList.BOOKS[random.nextInt(BooksList.LENGTH)]);
            book.setAuthor(AuthorsList.NAMES[random.nextInt(AuthorsList.LENGTH)]);
            book.setPublisher(PublishersList.PUBLISHERS[random.nextInt(PublishersList.LENGTH)]);
            book.setYear(random.nextInt(26)+1993);
            book.setPagesNumber(random.nextInt(500)+100);
            book.setPrice(random.nextInt(700)+100);
            books[bookIndex]=book;
        }
        return books;
    }


}
