package com.globant.exercices;
import java.util.Scanner;

public class BuscarElemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {10,20,30};

        System.out.println("Ingrese un numero entero: ");
        int valor = sc.nextInt();

        /*if (valor == numeros[0]){

            System.out.println("El valor si se encuentra :D ");
        }
        else if (valor == numeros[1]){

            System.out.println("El valor si se encuentra :D ");
        }
        else if (valor == numeros[2]){

            System.out.println("El valor si se encuentra :D ");
        }
        else{
            System.out.println("El valor no se encuentra");
        }*/


        if(valor == numeros[0] || valor == numeros[1] || valor == numeros[2] ){
            System.out.println("El valor si se encuentra :D ");
        }
        else{
            System.out.println("El valor no se encuentra :( ");
        }


        sc.close();
    }
}



