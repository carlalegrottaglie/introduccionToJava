package com.globant.exercices;
import java.util.Scanner;

public class divisibilidad {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: " );
        double numero = sc.nextDouble();

        if (numero % 5 ==0) {
            if (numero % 3 == 0) {
                System.out.println("Es divisible por 5 y 3");
            }
            else {
                System.out.println("Es divisible por 5");
            }

        }
        else if (numero % 3 == 0){
            System.out.println("Es divisible por 3");
        }
        else {
            System.out.println("No es divisible ni por 5, ni por 3");
        }
        sc.close();
    }
}