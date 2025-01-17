package com.globant.exercices;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BusquedaBinaria {

    public static void main(String[] args) {

     //   La búsqueda binaria es un algoritmo eficiente para encontrar un elemento en una lista ordenada de elementos. La clase Arrays ya incluye su implementación mediante el método binarySearch(). Escribe un programa que realice una búsqueda binaria en un arreglo ordenado de enteros utilizando el método Arrays.binarySearch(). El programa debe imprimir el arreglo generado originalmente, solicitar al usuario el valor buscado e imprimir el índice del valor buscado si está presente en el arreglo.

                int[] arreglo = new int[10];
                Random num = new Random();

                for(int i=0; i< arreglo.length; i++){
                    arreglo[i] = num.nextInt(100) + 1;
                }

                System.out.println("Arreglo original: ");
                System.out.println(Arrays.toString(arreglo));

                Arrays.sort(arreglo);
                System.out.println(Arrays.toString(arreglo));
                Scanner sc = new Scanner(System.in);

                System.out.println("Indique un número (del 1 al 10) y le diremos que elemento hay");
                int indice = sc.nextInt();
                System.out.println(Arrays.binarySearch(arreglo,indice));
            }
        }






