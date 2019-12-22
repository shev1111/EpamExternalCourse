package task1.task14.controller;

import task1.task14.model.Matrix;

public class MatrixController {

    public static void rotateMatrix(Matrix matrix) {
        int matrixSize = matrix.getMatrixValue().length;
        for (int x = 0; x < matrixSize / 2; x++)
        {

            for (int y = x; y < matrixSize-x-1; y++)
            {
                // temp variable of current cell in
                int temp = matrix.getMatrixValue()[x][y];

                // change values of matrix from right to top
                matrix.getMatrixValue()[x][y] = matrix.getMatrixValue()[y][matrixSize-1-x];

                // change values of matrix from bottom to right
                matrix.getMatrixValue()[y][matrixSize-1-x] = matrix.getMatrixValue()[matrixSize-1-x][matrixSize-1-y];

                // change values of matrix from left to bottom
                matrix.getMatrixValue()[matrixSize-1-x][matrixSize-1-y] = matrix.getMatrixValue()[matrixSize-1-y][x];

                // assign temp value to left value
                matrix.getMatrixValue()[matrixSize-1-y][x] = temp;
            }
        }
    }

}
