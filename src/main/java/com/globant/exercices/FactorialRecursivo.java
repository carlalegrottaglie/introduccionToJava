package com.globant.exercices;

import java.util.Scanner;

public class FactorialRecursivo {

    static Scanner sc= new Scanner (System.in);
    public static void main(String[] args) {
        calcularFactorial();

        sc.close();
    }

    public static void calcularFactorial (){
        System.out.println("Ingresa un número para calcular su factorial: ");
        int numero = sc.nextInt();

        if (numero<0){
            System.out.println("Debe ingresar un número positivo para calcular el factorial, no números negativos");
        }else{
            System.out.println("El factorial de " + numero + " es " + factorial(numero, 1));
        }
    }
    public static int factorial(int numero, int i){
        if (numero > i) return (numero * factorial(numero-1, i++));
        else return 1;


}

    }