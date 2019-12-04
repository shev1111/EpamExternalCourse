package task1.task14.controller;

import task1.task14.model.Matrix;

import java.util.Random;

public class MatrixGenerator {

    public static Matrix generateSquareMatrixBySize(int size){
        Random random=new Random();
        Matrix matrix = new Matrix(new int[size][size]);
        for(int rowIndex = 0; rowIndex<=size-1;rowIndex++){
            for(int index = 0; index<=size-1;index++){
              matrix.getMatrixValue()[rowIndex][index]= (random.nextInt(65536)-32768);
            }
        }
        return matrix;
    }
}
