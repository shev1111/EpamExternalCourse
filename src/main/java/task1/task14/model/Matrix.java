package task1.task14.model;

public class Matrix {
    private int [][] matrixValue;

    public Matrix() {
        this(new int[0][0]);
    }

    public Matrix(int[][] matrixValue) {
        this.matrixValue = matrixValue;
    }

    public int[][] getMatrixValue() {
        return matrixValue;
    }

    public void setMatrixValue(int[][] matrixValue) {
        this.matrixValue = matrixValue;
    }
}
