package com.brainacad.lab_2_02_Methods.lab_2_2_1;

/*
 * Created by L.Pikalova on 9/10/2016.
Lab Work 2-2-1
 Goal
    Getting a practical experience in
        Writing simple class with fields and methods.
 Task
    Create class Matrix_old with 2D array (int, size 2x2) field
        and methods: addition and multiplication of matrices;

 Preparation  No special preparation

 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to create class with fields and methods;
    Execute following steps:
        Student should create a new blank Java Project in IDE.
        Student should create his or her own Java class with fields and methods.

 Evaluation	 No special evaluation
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Matrix1 {

    private int[][] matrix;

    public Matrix1(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] getMatrix1() {
        return matrix;
    }

    public void setMatrix1(int[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix1 add(Matrix1 matrix) {
        int[][] result = new int[this.matrix.length][this.matrix.length];
        for (int i = 0; i < this.getMatrix1().length; i++) {
            for (int j = 0; j < this.matrix.length; j++) {
                result[i][j] = matrix.getMatrix1()[i][j] + this.matrix[i][j];
            }
        }
        return new Matrix1(result);
    }

    public Matrix1 multiply(Matrix1 matrix) {
        int[][] result = new int[this.matrix.length][this.matrix.length];
        for (int i = 0; i < this.getMatrix1().length; i++) {
            for (int j = 0; j < this.matrix.length; j++) {
                result[i][j] = matrix.getMatrix1()[i][j] * this.matrix[i][j];
            }
        }
        return new Matrix1(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < matrix.length; i++) {
            sb.append("[");
            for (int j = 0; j < matrix.length; j++) {
                sb.append(matrix[i][j] + ",");
            }
            sb.append("]");
        }
        sb.append("]");
        return sb.toString();
    }
}
