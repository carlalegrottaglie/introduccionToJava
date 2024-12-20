package com.globant.exercices;
import java.util.Scanner;

    public class notas {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese un número: " );
            double numero = sc.nextDouble();

            if (numero >= 90 && numero <= 100) {
                System.out.println("Su clasificación es: A");
            } else if ((numero >= 80) && (numero <= 89)) {
                System.out.println("Su clasificación es: B");
            } else if ((numero >= 70) && (numero <= 79)) {
                System.out.println("Su clasificación es: C");
            } else if ((numero >= 60) && (numero <= 69)) {
                System.out.println("Su clasificación es: D");
            } else if((numero >= 0) && (numero < 60)) {
                System.out.println("Su clasificación es: F");
            } else {System.out.println("Su número ingresado está fuera del rango válido.");}

            sc.close();

        }
    }

