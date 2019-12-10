package task2.task22.model.utils;

import task2.task22.model.Book;
import task2.task22.model.comparators.PublishersComparator;

import java.util.Arrays;

public class BookSorter {
    public static  void sortByPublishers(Book[] books){
        Arrays.sort(books, new  PublishersComparator());
    }
}
