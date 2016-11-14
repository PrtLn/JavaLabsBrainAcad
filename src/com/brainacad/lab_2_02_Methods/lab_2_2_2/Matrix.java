package com.brainacad.lab_2_02_Methods.lab_2_2_2;


/**
 * Created by L.Pikalova on 10/4/2016.
 */

public class Matrix {

    private int[][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix add(Matrix matrix) {
        int[][] result = new int[this.matrix.length][this.matrix.length];
        for (int i = 0; i < this.getMatrix().length; i++) {
            for (int j = 0; j < this.matrix.length; j++) {
               result[i][j] = matrix.getMatrix()[i][j] + this.matrix[i][j];
            }
        }
        return new Matrix(result);
    }

    public Matrix multiply(Matrix matrix) {
        int[][] result = new int[this.matrix.length][this.matrix.length];
        for (int i = 0; i < this.getMatrix().length; i++) {
            for (int j = 0; j < this.matrix.length; j++) {
                result[i][j] = matrix.getMatrix()[i][j] * this.matrix[i][j];
            }
        }
        return new Matrix(result);
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


