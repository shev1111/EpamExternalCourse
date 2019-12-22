package task2.task22.controllers;


import task2.task22.model.Book;

class ConverterInString {


    static String convertArrayBooks(Book[] books){
        String result = "";
        for (Book book:books) {
            result+=book;
        }
        return result;

    }
}
