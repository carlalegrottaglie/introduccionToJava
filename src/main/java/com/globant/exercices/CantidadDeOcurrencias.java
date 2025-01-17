package com.globant.exercices;

import java.util.Scanner;

public class CantidadDeOcurrencias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       char[] array = "Ella durmió al calor de las masas y yo desperté queriendo soñarla.".toCharArray();
        System.out.println("Ingrese en caracter del que quiere saber sus ocurrencias, Gracias!");
        char letra= sc.next().charAt(0);
        int cantidad= 0;
        for(char buscar: array)
         if(buscar == letra) cantidad++;

        System.out.println("La cantidad de ocurrencias de " + letra + " es " + cantidad);
    }


    }
