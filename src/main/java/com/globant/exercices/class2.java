package com.globant.exercices;

import java.util.Scanner;

public class class2 {

    public static void main(String[] args) {
        float a= 45;
        float b= 89;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        a= sc.nextFloat();
        System.out.print("Ingrese el segundo número: ");
        b= sc.nextFloat();
        float resultado= a + b;
        System.out.println("La suma de los dos valores es = " + resultado);
        resultado = a - b;
        System.out.println("La resta de los dos valores es = " + resultado);
        resultado = a * b;
        System.out.println("La multiplicación de los dos valores es = " + resultado);
        resultado = a / b;
        System.out.println("La división de los dos valores es = " + resultado);
    }
}
