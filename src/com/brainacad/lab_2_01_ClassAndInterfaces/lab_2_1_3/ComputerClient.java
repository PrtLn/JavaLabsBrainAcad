package com.brainacad.lab_2_01_ClassAndInterfaces.lab_2_1_3;

/**
 * Created by L.Pikalova on 28.09.2016.
 */

public class ComputerClient {

        private int id;

        public ComputerClient(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Computer " + "{" +
                    "id = " + (id + 1) + "}";
        }
}
