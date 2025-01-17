package com.globant.exercices;

import java.util.Scanner;

public class SoloLetras {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto: ");
        String myString = sc.nextLine();
        boolean todasLetras = true;
        int i = 0;
        while ((i < myString.length()) && (todasLetras)) {

            if (!Character.isLetter(myString.charAt(i))) {
                todasLetras = false;
                System.out.println("No había solo letras");
            }

            i++;
        }
        if (todasLetras) System.out.println("Bien hecho, había solo letras");
        //

    }

}

