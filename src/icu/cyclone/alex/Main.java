package icu.cyclone.alex;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(fillMatrix(7));
        System.out.println(matrix);
        matrix.rotate();
        System.out.println(matrix);
    }

    public static int[][] fillMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (i + 1) * 10 + j + 1;
            }
        }
        return matrix;
    }
}
