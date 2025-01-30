package com.globant.exercices;

import java.util.Scanner;

public class FibonacciRecursivo {

    // Reorganiza el código extrayendo la lógica en métodos sin alterar su
    // funcionamiento.
    // Después, intenta modificar la lógica para resolverlo de forma recursiva.

    static Scanner sc;
    static int posicion;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la posición");
        posicion = sc.nextInt();
        if (posicion == 0)
            System.out.println("Su numero correspondiente a la posición 0 es 0");
        else if (posicion == 1)
            System.out.println("Su numero correspondiente a la posición 1 es 1");
        else
            System.out.println("Su numero correspondiente a la posición " + posicion + " es " + Fibonacci(0, 1, 2));
    }

    public static int Fibonacci(int a, int b, int contador) {
        int c = a + b;
        if (contador == posicion)
            return c;
        else {
            contador++;
            return Fibonacci(b, c, contador);
        }
    }


}
