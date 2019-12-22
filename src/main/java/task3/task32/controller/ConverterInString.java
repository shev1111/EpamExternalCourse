package task3.task32.controller;

class ConverterInString {

    static <E> String convertArray(E[] array){
        String result = "";
        for (E elem:array) {
            result+=elem.toString();
        }
        return result;

    }

}
