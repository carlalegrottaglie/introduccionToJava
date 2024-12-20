package com.globant.exercices;

import java.util.Scanner;

    public class ParImpar {
        public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);

            System.out.println("Ingrese un número entero para saber si es par o impar:");

            int numParImp = leer.nextInt();

/* if (numParImp%2 == 0) {System.out.println("El número es par.");}
else {System.out.println("El número es impar.");} */

            System.out.println((numParImp%2 == 0) ? "El número es par." : "El número es impar.");


            //String mensaje = (numParImp % 2 == 0) ? "El número es par." : "El número es impar.";
            //System.out.println(mensaje);

            leer.close();
        }
    }
