package task2.task22.controllers;

import task2.task22.model.BookModel;
import task2.task22.view.BookInfoPrinter;

public class BookController {
    private BookModel model = new BookModel();
    private BookInfoPrinter view = new BookInfoPrinter();

    public void run(){
        view.print(ConverterInString.convertArrayBooks(model.getBooks()));

        view.print("-------------------------------------------------------------------------\n");

        view.print(ConverterInString.convertArrayBooks(model.getBooksByCriteria("Айн Рэнд", "author")));

        view.print("-------------------------------------------------------------------------\n");

        view.print(ConverterInString.convertArrayBooks(model.getBooksByCriteria("Абрис", "publisher")));

        view.print("-------------------------------------------------------------------------\n");

        view.print(ConverterInString.convertArrayBooks(model.getBooksByCriteria("2000", "year")));

    }
}
