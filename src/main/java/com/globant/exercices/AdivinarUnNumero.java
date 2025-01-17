package com.globant.exercices;

import java.util.Scanner;

//Escribe un programa que genere un número aleatorio entre 1 y 20, y muestra por consola un mensaje pidiéndote que adivines ese número utilizando un bucle do-while. El programa te indicará si el número que ingresas es mayor o menor que el número aleatorio, y seguirá pidiéndote que adivines hasta que lo hagas correctamente.
public class AdivinarUnNumero {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aleatorio= (int) (Math.random()*(21));
        int opcion=0;
        do {
            System.out.println("Por favor adivine el número generado: ");
            opcion = sc.nextInt();
            if(aleatorio > opcion) System.out.println("El numero ingresado es menor");
            if (aleatorio < opcion) System.out.println("El numero ingresado es mayor");

        } while (aleatorio != opcion);
        System.out.println("Correcto adivinaste!");
    }
}
