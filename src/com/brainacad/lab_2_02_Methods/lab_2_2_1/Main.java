package com.brainacad.lab_2_02_Methods.lab_2_2_1;

public class Main {

    public static void main(String[] args) {

        Matrix1 matrix1 = new Matrix1(new int[][]{{1, 2},{3, 4}});
        Matrix1 matrix2 = new Matrix1(new int[][]{{5, 6},{7, 8}});

        System.out.println("Matrix one " + matrix1);
        System.out.println("Matrix two " + matrix2);
        System.out.println();

        // variant 1
        Matrix1 resultMatrix1 = matrix1.add(matrix2);
        System.out.println("Result of addition of two matrices is " + resultMatrix1);

        resultMatrix1 = matrix1.multiply(matrix2);
        System.out.println("Result of multiplication of two matrices is " + resultMatrix1);
    }
}
