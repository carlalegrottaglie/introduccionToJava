package com.globant.exercices;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero, maestro, que te saco el factorial");

        int numero = sc.nextInt();

        int contador = 1;

        double factorial = 1;

        do { factorial = factorial * contador;
            contador +=1;

        } while (contador <= numero);

        System.out.println("El factorial de tu numero es " + factorial);
    }
}




