package interviewQ;

public class convert_to_zero {
        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {0, 6, 0},
                    {7, 8, 9}
            };

            zeroMatrix(matrix);

            // Print result
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void zeroMatrix(int[][] matrix) {
            boolean[] zeroRows = new boolean[3];
            boolean[] zeroCols = new boolean[3];

            // Identify rows and columns that contain zero
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matrix[i][j] == 0) {
                        zeroRows[i] = true;
                        zeroCols[j] = true;
                        System.out.println(i +" "+j);
                    }
                }
            }

            // Set entire row to zero if row has zero
            for (int i = 0; i < 3; i++) {
                if (zeroRows[i]) {
                    for (int j = 0; j < 3; j++) {
                        matrix[i][j] = 0;
                    }
                }
            }

            // Set entire column to zero if column has zero
            for (int j = 0; j < 3; j++) {
                if (zeroCols[j]) {
                    for (int i = 0; i < 3; i++) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }

