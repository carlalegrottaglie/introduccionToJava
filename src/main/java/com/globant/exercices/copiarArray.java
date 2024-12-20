package com.globant.exercices;

import java.util.Scanner;

public class copiarArray {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] arrayOriginal = {5, 10, 15};

            int[] arrayNuevo = {arrayOriginal[0],arrayOriginal[1],arrayOriginal[2],0,0};

            System.out.println("Ingrese el primer numero");
            arrayNuevo[3] = sc.nextInt();
            System.out.println("Ingrese el segundo numero");
            arrayNuevo[4] = sc.nextInt();

            System.out.println("Contenido del nuevo array:");
            System.out.println("Posicion 1: " + arrayNuevo[0]);
            System.out.println("Posicion 2: " + arrayNuevo[1]);
            System.out.println("Posicion 3: " + arrayNuevo[2]);
            System.out.println("Posicion 4: " + arrayNuevo[3]);
            System.out.println("Posicion 5: " + arrayNuevo[4]);



    }

}
