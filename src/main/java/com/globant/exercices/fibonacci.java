package com.globant.exercices;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        long numero;

        do {
            System.out.print("Ingrese un número (0 para salir): ");
            numero = leer.nextLong();

            if (numero == 0) {
                System.out.println("Programa finalizado.");
                break;
            }

            if (esPrimo(numero)) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo. Intente nuevamente.");
            }

        } while (numero != 0);
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(long num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

