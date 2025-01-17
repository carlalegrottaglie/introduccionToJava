package com.globant.exercices;

import java.util.Scanner;

public class CantidadDigitos {

    public static void main(String[] args) {


        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero para verificar la cantidad de digitos: ");
        int num = leer.nextInt();
        int cifras = 0;

        if (num == 0) {
            cifras++;
        }
        while (num != 0) {
            num = num / 10;
            cifras++;
        }
        System.out.println("La cantidad de digitos es : " + cifras);


    }
}