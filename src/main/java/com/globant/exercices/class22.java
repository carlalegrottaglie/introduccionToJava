package com.globant.exercices;

import java.util.Scanner;

public class class22 {

    public static void main(String[] args) {
        float a;
        float b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        a= sc.nextFloat();
        System.out.print("Ingrese el segundo número: ");
        b= sc.nextFloat();
        if (a > b) {
            System.out.println(String.format("¿El número %.2f es mayor que %.2f? Verdadero", a, b));
        } else {
            System.out.println(String.format("¿El número %.2f es mayor que %.2f? Falso", a, b));
        }


        /*resultado = a - b;
        System.out.println("La resta de los dos valores es = " + resultado);
        resultado = a * b;
        System.out.println("La multiplicación de los dos valores es = " + resultado);
        resultado = a / b;
        System.out.println("La división de los dos valores es = " + resultado);
    */
    }

}
