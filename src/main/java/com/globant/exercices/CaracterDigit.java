package com.globant.exercices;

import java.util.Scanner;

public class CaracterDigit {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un numero entero para sumar ");
        int num = sc.nextInt();
        System.out.println("Ingrese un numero decimal para sumar (usar coma para decimal): ");
        double dnum = sc.nextDouble();

        double suma = Integer.valueOf(num) + Double.valueOf(dnum);

        System.out.println("La suma de los dos números es: " + suma);

        sc.close();

    }
}
