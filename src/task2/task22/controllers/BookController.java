package task2.task22.controllers;

import task2.task22.model.BookModel;
import task2.task22.view.BookInfoPrinter;
import task2.task22.view.InputData;

public class BookController {
    private BookModel model = new BookModel();
    private BookInfoPrinter view = new BookInfoPrinter();

    public void run(){
        view.print("Program's library\n");

        view.print("-------------------------------------------------------------------------\n");

        view.print(ConverterInString.convertArrayBooks(model.getBooks()));

        view.print("-------------------------------------------------------------------------\n");

        view.print("Enter the author to search for books -->\n");
        String authorName = InputData.input();
        view.print(ConverterInString.convertArrayBooks(model.getBooksByCriteria(authorName, "author")));

        view.print("-------------------------------------------------------------------------\n");
        view.print("enter the publisher to search for books -->\n");
        String publisherName = InputData.input();
        view.print(ConverterInString.convertArrayBooks(model.getBooksByCriteria(publisherName, "publisher")));

        view.print("-------------------------------------------------------------------------\n");
        view.print("Search for publications up to the target year -->\n");
        int year;

            while (!InputData.input.hasNextInt()) {
                InputData.input.nextLine();
                view.print("Enter valid year -->");
            }

        year = InputData.inputInt();

        view.print(ConverterInString.convertArrayBooks(model.getBooksByCriteria(String.valueOf(year), "year")));

        view.print("-------------------------------------------------------------------------\n");

        view.print("Sort books by publishers asc -->\n");
        view.print(ConverterInString.convertArrayBooks(model.sortBooksByPublisher()));

    }
}
