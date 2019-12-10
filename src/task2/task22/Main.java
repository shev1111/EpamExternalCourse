package task2.task22;

import task2.task22.model.Book;
import task2.task22.model.utils.BooksGenerator;

public class Main {
    public static void main(String[] args) {
        Book[] books = BooksGenerator.getBooksArray(20);

        for (Book book: books) {
            System.out.println(book);
        }
    }
}
