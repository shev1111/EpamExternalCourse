package task1.task14.view;

import task1.task14.model.Matrix;

import java.util.Arrays;

public class MatrixPrinter {

    public static void displayMatrix(Matrix matrix)
    {
        for (int[] row : matrix.getMatrixValue()) {
            System.out.println(Arrays.toString(row));
        }
        System.out.print("\n");
    }
}
