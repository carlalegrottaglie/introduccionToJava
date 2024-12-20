package com.globant.exercices;

import java.util.Scanner;

public class pow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la base: \n");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa el exponente: \n");
        int num2 = scanner.nextInt();
        System.out.println("La resultante es: " + (int) (Math.pow(num1, num2)));

    }
}