package Matrixxx;

import java.util.Arrays;

public class MatrixZero {
    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        System.out.println(n +" : "+m);

        boolean[] rows = new boolean[n];
        boolean[] cols = new boolean[m];
        
        // Step 1: Identify which rows and columns have zeros
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                    System.out.println(i +" "+j);
                }
            }
        }

        // Step 2: Set the identified rows to zero
        for (int i = 0; i < n; i++) {
            if (rows[i]) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = 0;
                   // printMatrix(matrix);
                }
            }
        }

        // Step 3: Set the identified columns to zero
        for (int j = 0; j < m; j++) {
            if (cols[j]) {
                for (int i = 0; i < n; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 0, 7, 8},
            {9, 10, 11, 0}
          //  {13, 14, 15, 0}
        };
//        int[][] matrix = {
//                {1, 2, 3},
//                {0, 6, 0},
//                {7, 8, 9}
//        };

        System.out.println("Original matrix:");
        printMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));
        setZeroes(matrix);
        
        System.out.println("\nMatrix after setting rows and columns to zero:");
        printMatrix(matrix);

        for(int[] row : matrix)
        {
            System.out.println(Arrays.toString(row));
        }



    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }


}
