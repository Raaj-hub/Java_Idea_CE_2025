package practiceHere;

import java.util.Arrays;

public class zer_matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, -1, 3, 0},
                {4, 5, -2, 1},
                {0, 3, 1, -4},
                {1, -3, 2, 6}
        };
        //System.out.println(Arrays.deepToString(matrix));
       // printMatrix(matrix);
        zeroooMatrix(matrix);
        printMatrix(matrix);

    }

    private static void zeroooMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        boolean[] rows = new boolean[n];
        boolean[] cols = new boolean[m];


        for(int i=0; i<n ; i++)
        {
            for(int j=0; j<m ;j++)
            {
                if(matrix[i][j] == 0)
                {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        for(int i=0 ;i<n ; i++)
        {
            if(rows[i])
            {
                for(int j=0 ;j<m ;j++)
                {
                    matrix[i][j] =0;
                }
            }
        }

        for(int j=0 ;j<m ;j++)
        {
            if(cols[j])
            {
                for (int i=0; i<n ;i++)
                {
                    matrix[i][j] =0;
                }
            }
        }

    }

    private static void printMatrix(int[][] matrix) {
        for(int[] row : matrix)
        {
            System.out.println(Arrays.toString(row));
        }

        for (int[] row : matrix)
        {
            for(int val : row)
            {
                System.out.print(val);
            }
        }
    }
}
