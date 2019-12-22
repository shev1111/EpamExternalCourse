package task1.task13.controller;

public class PyramidController {
    public static String generatePyramid(int value){
        StringBuilder pyramid = new StringBuilder();
        for (int index = 1; index <= value; index++) {
            int numberOfWhiteSpaces = (value-index)*2;
            printWhiteSpace(pyramid, numberOfWhiteSpaces);

            for(int frontIndex=1; frontIndex<=index; frontIndex++) {
                pyramid.append(frontIndex).append(" ");

            }
            for(int reverseIndex=index-1; reverseIndex>0; reverseIndex--) {
                pyramid.append(reverseIndex).append(" ");
            }
            pyramid.append("\n");

        }
        return pyramid.toString();
    }

    private static void printWhiteSpace(StringBuilder string, int times) {
        for (int j = 0; j < times; j++) {
            string.append(" ");
        }
    }
}
