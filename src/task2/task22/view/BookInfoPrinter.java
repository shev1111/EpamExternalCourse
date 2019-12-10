package task2.task22.view;

import task2.task22.model.Book;

public class BookInfoPrinter {

    public static void printBooks(Book[] books){
        for (Book book:books) {
            System.out.println(book);
        }
    }

    public static void printAuthorsBooks(Book[] books, String author){
        int findResult = 0;
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book);
                findResult++;
            }
        }
        if(findResult==0) System.out.println("We are sorry, our  library does not have appropriate publisher books (((");

    }

    public static void printPublishersBooks(Book[] books, String publisher){
        int findResult = 0;
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)){
                System.out.println(book);
                findResult++;
            }
        }
        if(findResult==0) System.out.println("We are sorry, our  library does not have appropriate publisher books (((");
    }


    public static void printBooksBeforeDefinedYear(Book[] books, int year){
        int findResult = 0;
        for (Book book : books) {
            if (book.getYear()<year){
                System.out.println(book);
                findResult++;
            }
        }
        if(findResult==0) System.out.println("We are sorry, our  library does not have appropriate publisher books (((");
    }

    public static void printMessage(String mesage){
        System.out.println(mesage);
    }



}
