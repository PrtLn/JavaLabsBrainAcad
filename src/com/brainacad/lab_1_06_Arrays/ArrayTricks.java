package com.brainacad.lab_1_06_Arrays;

import java.util.Arrays;

/**
 * Created by L.Pikalova on 15.09.2016.
 */
public class ArrayTricks {

    public static void main(String[] args) {

        int[] arr = {34,200,36,14,45,315};

        int n = arr.length;

        /* // вычисление среднего значения массива (половина суммы всех значений)
        double sum = 0.0;

        for (int i = 0; i < n; i++)
            sum += arr[i];
        double average = sum / n;

        System.out.println(average);
        */

        // перестановка элементов массива в обратном порядке
        System.out.print("reverse massive: ");
        for (int i = 0; i < n; i++) {
            int tempt = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-i-1] = tempt;
        }
        System.out.print(Arrays.toString(arr));
    }
}