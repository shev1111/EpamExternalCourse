package task2.task22;

import task2.task22.controllers.BookController;
import task2.task22.model.Book;
import task2.task22.model.utils.BooksGenerator;
import java.time.Year;
import java.util.Scanner;

public class Main {
    private static final String HELP =
            "-author '-author some author' to find author's book\n" +
            "-publisher '-publisher some publisher' to find all books published by specific publisher\n" +
            "-before_year '-before_year year' to get list of books published before defined year\n" +
            "-sort_publishers '-sort_publishers' to sort books by publishers in alphabetical order (asc)\n" +
            "-exit '-exit' to leave program\n";

    public static void main(String[] args) {
        BookController controller = new BookController();
        controller.run();
        /*Book[] books = BooksGenerator.getBooksArray(10);
        Scanner scanner = new Scanner(System.in);
        //BookController.returnMessage("Specify a command key:");
        workWithConsole(books, scanner);*/
    }

    /*private static void workWithConsole(Book[] books, Scanner scanner) {
        while (true) {
            String key;
            String parameter;
            String[] validKeyParameters = new String[2];
            String[] keyWithParameters = scanner.nextLine().split(" ");

            if (!initKeyAndParameters(validKeyParameters, keyWithParameters)) continue;
            key=validKeyParameters[0];
            parameter=validKeyParameters[1];

            switch(key){
                case "-author":
                    System.out.println(parameter);
                    BookController.getAuthorsBooks(books,parameter);break;
                case "-publisher":BookController.getPublishersBooks(books,parameter);break;
                case "-before_year":
                    int year = getYearFromString(parameter);
                    if(year==0)break;
                    BookController.getBooksPublishedAfterDefinedYear(books,year);break;
                case "-sort_publishers":BookController.sortBooksByPublishers(books);break;
                case "-help": BookController.returnMessage(HELP);break;
                case "-exit": System.out.println(); System.exit(0);
                default: BookController.returnMessage("Invalid key! Please read help '-help'");break;
            }
            BookController.returnMessage("Specify a command key:");
        }
    }

    private static boolean initKeyAndParameters(String[] validParameters, String[] keyWithParameters) {
        if(keyWithParameters.length<2) {
            if(keyWithParameters[0].equals("-sort_publishers")||
                    keyWithParameters[0].equals("-exit")||keyWithParameters[0].equals("-help")){
                validParameters[0] = keyWithParameters[0];
                validParameters[1] = "default";
            }else {
                BookController.returnMessage("Specify a command key with parameter:");
                return false;
            }
        }else{
            StringBuilder parameter = new StringBuilder();
            for (int parameterIndex =1;parameterIndex<keyWithParameters.length;parameterIndex++){
                parameter.append(keyWithParameters[parameterIndex]);
                parameter.append(" ");
            }
            validParameters[0] = keyWithParameters[0];
            validParameters[1] = parameter.toString().trim();
        }
        return true;
    }

    private static int getYearFromString(String parameter) {
        int year = 0;

        try {
            year = Integer.valueOf(parameter);
            if(year> Year.now().getValue()){
                BookController.returnMessage("For key '-before_year' you can't specify year greater then current");
                return 0;
            }
        } catch (NumberFormatException e) {
            BookController.returnMessage("For key '-before_year' you should specify number parameter");
        }
        return year;
    }*/
}
