package com.globant.exercices;

import java.util.Scanner;

public class CadenaDouble {

    public static void main (String[]args){

        Scanner scan = new Scanner(System.in);
        String cadena;
        double d = 0;
        boolean valido = false;

        do {
            System.out.println("Ingrese un número (puede tener decimales ej. 4.77): ");
            cadena = scan.nextLine();

            try {
                d = Double.valueOf(cadena);
                valido = true; // Si la conversión es exitosa, marcamos como válido.
            } catch (NumberFormatException e) {
                System.out.println("Ingresó algún caracter inválido.");
                System.out.println("(Utilice números y un solo punto en caso de querer especificar decimales)");
            }

        } while (!valido); // Repetimos mientras no sea válido.

        System.out.println("El número ingresado es: " + d);
        scan.close();
    }
}