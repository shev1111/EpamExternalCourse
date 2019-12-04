package task1.task14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] q = {1,2,45};
        int[] w = {5,8,35};
        int[] r = {4,7,25};
        int[][] t = {q,w,r};
        //rotateMatrix(3,t);
        displayMatrix(3,t);
    }
    static void rotateMatrix(int[][] n){
        int  matrixSize = n.length;
        int [] firstTempRowOfMatrix;
        int [] secondTempRowOfMatrix;
        for (int index=0; index<=matrixSize-1;index++){
            firstTempRowOfMatrix = n[index].clone();
            //if(index+1!=matrixSize-1)secondTempRowOfMatrix = n[index+1].clone();
            //https://javabypatel.blogspot.com/2016/11/rotate-matrix-by-90-degree-java.html


        }


    }
    /*static void rotateMatrix(int N, int mat[][]) {
        // Consider all squares one by one
        for (int x = 0; x < N / 2; x++)
        {
            // Consider elements in group of 4 in
            // current square
            for (int y = x; y < N-x-1; y++)
            {
                // store current cell in temp variable
                int temp = mat[x][y];

                // move values from right to top
                mat[x][y] = mat[y][N-1-x];

                // move values from bottom to right
                mat[y][N-1-x] = mat[N-1-x][N-1-y];

                // move values from left to bottom
                mat[N-1-x][N-1-y] = mat[N-1-y][x];

                // assign temp to left
                mat[N-1-y][x] = temp;
            }
        }
    }*/

    static void displayMatrix(int N, int mat[][])
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(" " + mat[i][j]);

            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
