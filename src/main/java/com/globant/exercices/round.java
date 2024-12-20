package com.globant.exercices;
import java.util.Scanner;

public class round {

         public static void main(String[] args) {
// Escribe un programa que pida al usuario un número decimal y muestra en pantalla su valor redondeado utilizando el método round() de la clase Math.
            Scanner numScanner = new Scanner(System.in);
            System.out.println("Ingrese un numero decimal: ");
            double num = numScanner.nextDouble();
            System.out.println("El numero redondeado es: "+ Math.round(num));
            numScanner.close();
        }
    }

