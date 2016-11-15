package com.brainacad.lab_2_05_InitializationSections.ex5;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            InitTest inst = new InitTest();
            System.out.println(inst.getId());
        }
        System.out.println(new InitTest().getId());
    }
}
