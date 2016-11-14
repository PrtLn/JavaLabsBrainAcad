package com.brainacad.lab_2_02_Methods.lab_2_2_2;

public class Matrix2 {

    private static int[][] mx;

    private static int[][] m1;
    private static int[][] m2;

    public Matrix2(int[][] mx) {
        this.mx = mx;
    }

    public static int[][] getMx() {
        return mx;
    }

    public static Matrix add(Matrix m1, Matrix m2) {
        int size =  m1.getMatrix().length;
        Matrix2.m1 = m1.getMatrix();
        Matrix2.m2 = m2.getMatrix();

        int[][] res = new int[size][size];
        Matrix resMatrix = new Matrix(res);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                res[i][j] = m1.getMatrix()[i][j] + m2.getMatrix()[i][j];
            }
        }
        return resMatrix;
    }

    public static Matrix multply(Matrix m1, Matrix m2) {
        int size =  m1.getMatrix().length;
        Matrix2.m1 = m1.getMatrix();
        Matrix2.m2 = m2.getMatrix();

        int[][] res = new int[size][size];
        Matrix resMatrix = new Matrix(res);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                res[i][j] = m1.getMatrix()[i][j] * m2.getMatrix()[i][j];
            }
        }
        return resMatrix;
    }
}
