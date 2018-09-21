package icu.cyclone.alex;

public class Matrix {
    private int[][] matrix;

    Matrix(int[][] matrix) {
        this.matrix = check(matrix);
    }

    public static int[][] check(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != matrix.length) {
                throw new IllegalArgumentException("Incorrect array size");
            }
        }
        return matrix;
    }

    public void rotate() {
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0 + i; j < matrix.length - i - 1 ; j++) {
                int x = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - 1 - j][i];
                matrix[matrix.length - 1 - j][i] = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
                matrix[matrix.length - 1 - i][matrix.length - 1 - j] = matrix[j][matrix.length - 1 - i];
                matrix[j][matrix.length - 1 - i] = x;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            sb.append("[");
            for (int j = 0; j < matrix.length; j++) {
                sb.append(matrix[i][j]);
                if(j < matrix.length - 1) {
                    sb.append(",");
                }
            }
            sb.append("]").append(System.lineSeparator());
        }
        return sb.toString();
    }
}
