package com.globant.exercices;

import java.util.Scanner;

public class MaxArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tam;

        System.out.println("Ingrese el tamaño del array: ");
        tam = sc.nextInt();

        int[] numeros = new int[tam];
        int suma = 0;
        int max = Integer.MIN_VALUE; //-2147483648

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Ingrese el numero " + (i + 1) + " : ");

            numeros[i] = sc.nextInt();
            suma += numeros[i];

            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
            double promedio = suma / (double) numeros.length;

            System.out.println("La suma es: " + suma);
            System.out.println("El promedio es: " + promedio);
            System.out.println("El valor maximo " + max);

            sc.close();


    }
}
