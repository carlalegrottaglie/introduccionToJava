package com.globant.exercices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RestaConEXc {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1;
        int num2;
        int resta;
        try {

            System.out.println("Ingrese el primer número: ");
            num1 = sc.nextInt();
            System.out.println("Ingrese el segundo número: ");
            num2 = sc.nextInt();
            resta = num1 - num2;
            System.out.println("La resta es: " + resta);
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Ingreso un valor no válido. Intente nuevamente.");
         }
        sc.close();
    }




}
