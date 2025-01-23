/*package com.globant.exercices;

import java.util.Objects;
import java.util.Scanner;

public class Oraciones {


    static Scanner sc;
    static String sentence="";
    static String[] list;


    public static void main(String[] args) {

        sc = new Scanner(System.in);
        Activity();
        sc.close();
    }

    private static void Activity() {

        int opc = -1;

        while (opc != 9) {
            ShowMenu();
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    MakeSentence();
                    break;
                case 2:
                    //NumberOfChar();
                    break;
                case 6:
                    buscarPalabra();
                    break;
                default:
                    System.out.println("Por favor ingresa una opción valida");
                    break;
            }
        }

    }

    private static void ShowMenu() {
        System.out.println("\nMenú de opciones:");
        System.out.println("1. Crear oración o Borrar oración");
        System.out.println("2. Cantidad de caracteres de la oración");
        System.out.println("3. Cantidad de palabras de la oración");
        System.out.println("4. Mostrar palabras ordenadas alfabéticamente");
        System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
        System.out.println("6. Buscar palabra dentro de la oración");
        System.out.println("7. Modificar palabra dentro de la oración");
        System.out.println("8. Agregar contenido a la oración");
        System.out.println("9. Salir");
        System.out.print("Selecciona una opción: ");
    }

    private static void MakeSentence() {
        if (sentence.isEmpty()) {
            System.out.println("Ingresa una oracion");
            sc.nextLine();
            sentence = sc.nextLine();
            list = sentence.split("\\s");
            System.out.println("La oracion ingresada es: " + sentence);
        } else {
            System.out.println("Borrar la oracion");
            sentence = "";
        }
    }

    private void NumberOfChar() {

    }

    private static void buscarPalabra() {
        int contador = 0;
        if (sentence.isEmpty()){

            System.out.println("La oración esta vacía, por favor elija menú la opcion 1 para ingresar la oración");
        } else {
            System.out.println("Ingrese la palabra que desea buscar: ");
            String palabra = sc.nextLine();
            boolean encontrada = false;
            do {
                if (Objects.equals(palabra, list[contador])) {
                    encontrada = true;
                }
                contador++;

            } while (!encontrada && contador <= list.length);

            if (encontrada)
                System.out.println("La palabra se encuentra en la posición: " + contador);
            else
                System.out.println("La palabra no se encuentra");
        }
    }

}

*/
    