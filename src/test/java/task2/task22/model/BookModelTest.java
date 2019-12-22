package task2.task22.model;

import org.junit.BeforeClass;
import org.junit.Test;
import task2.task22.model.utils.BooksGenerator;

import static org.junit.Assert.*;

public class BookModelTest {
    private static BookModel bookModel;
    @BeforeClass
    public static void init(){
        Book[] books = new Book[]{
                new Book("Шантарам","Rey Bredbery","Абрис"),
                new Book("Цветы для Элджернона","Даниел Киз","Фактор"),
                new Book("Айн Рэнд","Лев Толстой","Сонат")
        };
        bookModel = new BookModel(books);
    }
    @Test
    public void getBooks() throws Exception {
        Book[] books = BooksGenerator.getBooksArray(10);
        assertEquals(10, books.length);
    }

    @Test
    public void getBooksByCriteria() throws Exception {
        assertEquals(
                "Rey Bredbery",
                bookModel.getBooksByCriteria("Rey Bredbery", "author")[0].getAuthor());
        assertEquals(
                "Сонат",
                bookModel.getBooksByCriteria("Сонат", "publisher")[0].getPublisher());
    }

    @Test
    public void sortBooksByPublisher() throws Exception {
        assertEquals("Абрис", bookModel.sortBooksByPublisher()[0].getPublisher());
    }

}