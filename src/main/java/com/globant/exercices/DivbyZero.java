package com.globant.exercices;

import java.util.Scanner;

public class DivbyZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un primer número.");
        int num1 = sc.nextInt();
        System.out.println("Ingrese un segundo número para dividir");
        int num2 = sc.nextInt();
        int resultado = 0;

        try {
            resultado = num1 / num2;
            System.out.println("La division es: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("La division por 0 no es posible." + e.getMessage());

        }
        sc.close();
    }

}
