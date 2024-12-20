package com.globant.exercices;


/*
En esta actividad, vas a desarrollar un programa que mostrará un menú con las siguientes opciones:
Opción 1: "Guardar"
Opción 2: "Cargar"
Opción 3: "Salir"
El programa solicitará al usuario que ingrese un número del 1 al 3 para seleccionar una opción.
Utilizarás la estructura "switch" para implementar este programa y mostrar en pantalla el mensaje
correspondiente
 */

import java.util.Scanner;

public class opcion {

    public static void main(String[] args) {
        System.out.println("Por favor ingrese la opción deseada");
        System.out.println("Opción 1: \"Guardar\"");
        System.out.println("Opción 2: \"Cargar\"");
        System.out.println("Opción 3: \"Salir\"");

        Scanner sc=new Scanner(System.in);
        int opcion = sc.nextInt();
        switch(opcion)
            {
                case 1: System.out.println("Has seleccionado la opción Guardar"); break;
                case 2: System.out.println("Has seleccionado la opción Cargar"); break;
                case 3: System.out.println("Has seleccionado la opción Salir"); break;
                default: System.out.println("Opción no válida, intente nuevamente");
            }


        sc.close();

    }

}