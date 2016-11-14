package com.brainacad.lab_2_02_Methods.lab_2_2_2;

import static com.brainacad.lab_2_02_Methods.lab_2_2_2.Matrix2.add;
import static com.brainacad.lab_2_02_Methods.lab_2_2_2.Matrix2.multply;

/**
 * Created by L.Pikalova on 10/4/2016.
 * * Lab Work 2-2-2
 Goal
    Getting a practical experience in
        Use of methods of class
 Task
    Write class that create instances of class Matrix_old and execute his methods.

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to create class’s instances;
        how to use class’s methods;

 Execute following steps:
    Student should create a new blank Java Project in IDE.
    Student should create his or her own Java class and provide all necessary code in a method main()

 Evaluation	the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Main {

    public static void main(String[] args) {

        Matrix matrix1 = new Matrix(new int[][]{{1, 2},{3, 4}});
        Matrix matrix2 = new Matrix(new int[][]{{5, 6},{7, 8}});

        System.out.println("Matrix one " + matrix1);
        System.out.println("Matrix two " + matrix2);
        System.out.println();

        // variant 1
        System.out.println("Variant 1: \"matrix1.add(matrix2);\"");
        Matrix resultMatrix = matrix1.add(matrix2);
        System.out.println("Result of addition of two matrices is " + resultMatrix);

        resultMatrix = matrix1.multiply(matrix2);
        System.out.println("Result of multiplication of two matrices is " + resultMatrix);
        System.out.println();

        // variant 2
        System.out.println("Variant 2: \"add(matrix1, matrix2);\"");
        Matrix resultMatrixAdd = add(matrix1, matrix2);
        System.out.println("Result of addition of two matrices is " + resultMatrixAdd);

        Matrix resultMatrixMultiply = multply(matrix1, matrix2);
        System.out.println("Result of multiplication of two matrices is " + resultMatrixMultiply);
    }
}


