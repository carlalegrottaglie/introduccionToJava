package com.globant.exercices;

import java.util.Scanner;

public class limite{

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un límite inferior: ");
        int n1 = scan.nextInt();

        System.out.println("Ingrese un límite superior: ");
        int n2 = scan.nextInt();

        String mensaje = (n1 < n2) ?
                "El número es: " + (Math.floor(Math.random() * (n2 - n1 + 1)) + n1)
                : "El límite inferior no puede ser mayor que el superior.";

        System.out.println(mensaje);

        scan.close();
    }

}