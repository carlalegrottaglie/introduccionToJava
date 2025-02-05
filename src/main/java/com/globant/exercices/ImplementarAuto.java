package com.globant.exercices;

public class ImplementarAuto {

    public static void main(String[] args) {

        Auto auto1 = new Auto();
        Auto auto2 = new Auto("Toyota");
        Auto auto3 = new Auto("Ford","Falcon");
        Auto auto4 = new Auto("BMW","M5",2025);

        auto1.imprimirDatos();
        auto2.imprimirDatos();
        auto3.imprimirDatos();
        auto4.imprimirDatos();
    }
}
