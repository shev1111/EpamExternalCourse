package task3.task31.controller;

import task2.task21.model.Shape;

class ConverterInString {

    static <E> String convertArray(E[] array){
        String result = "";
        for (E elem:array) {
            result+=elem.toString();
        }
        return result;

    }

}
