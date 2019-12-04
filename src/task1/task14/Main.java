package task1.task14;

import task1.task14.controller.MatrixController;
import task1.task14.controller.MatrixGenerator;
import task1.task14.model.Matrix;
import task1.task14.view.MatrixPrinter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix size: ");
        int matrixSize = sc.nextInt();

        Matrix matrix = MatrixGenerator.generateSquareMatrixBySize(matrixSize);
        MatrixPrinter.displayMatrix(matrix);
        MatrixController.rotateMatrix(matrix);
        MatrixPrinter.displayMatrix(matrix);
    }
}