package task2.task22.model.comparators;

import task2.task22.model.Book;
import java.util.Comparator;

public class AuthorsComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getAuthor().compareTo(book2.getAuthor());
    }
}
