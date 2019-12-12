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

    static String convertDouble(double value, String message){
        return String.format("%s = %.2f",message, value);
    }
}
