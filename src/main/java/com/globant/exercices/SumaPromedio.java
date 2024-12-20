package com.globant.exercices;

import java.util.Scanner;

public class SumaPromedio {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.println("Ingrese el tamaño del array: ");
            int tam = sc.nextInt();

            int[] numeros = new int[tam];

            // System.out.println("Primer numero:");
            // numeros[0] = sc.nextInt();
            // System.out.println("Segundo numero:");
            // numeros[1] = sc.nextInt();
            // System.out.println("Tercer numero:");
            // numeros[2] = sc.nextInt();
            // System.out.println("Cuarto numero:");
            // numeros[3] = sc.nextInt();

            // int suma = numeros[0] + numeros[1] + numeros[2] + numeros[3];
            // double promedio = (double) suma / numeros.length;

            // System.out.println("La suma es: " + suma);
            // System.out.println("El promedio es: " + promedio);

            int suma = 0;

            //Realizamos un for donde le solicitamos al usuario ingresar el numero en cada posicion.
            System.out.println("Ingrese los 4 numeros: ");
            for (int i = 0; i < numeros.length; i++){
                System.out.println("Numero " + (i + 1) + ":");
                numeros[i] = sc.nextInt();
                //suma = suma + numeros[i];
                suma += numeros[i];
            }

            double promedio =  suma / (double) numeros.length;

            System.out.println("La suma es: " + suma);
            System.out.println("El promedio es: " + promedio);


            sc.close();
        }

    }


