package com.brainacad.lab_2_01_Class_and_Interfaces;

/**
 * Created by L.Pikalova on 14.09.2016.
 */
public class Yolka {
    public static void main(String[] args) {


        int[][] olka = new int[5][5];
        int h = olka.length;

        for (int i = 0; i < h; i++) {

            for (int j = 0; j < h - i; j++) {
                System.out.print(" |");
                }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            for (int j = i - 1; j > 0; j--) {
            }
            System.out.println();
            }

        // asterisk yolka
        for (int i = 0; i < h; i++) {

            for (int j = 0; j < h - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(" *");
            }
            for (int j = i - 1; j > 0; j--) {
            }
            System.out.println();
        }

        // mirror number yolka
        for (int i = 0; i < h; i++) {

            for (int j = 0; j < h - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
    }


