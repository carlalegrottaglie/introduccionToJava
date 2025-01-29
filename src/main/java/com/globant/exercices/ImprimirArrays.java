package com.globant.exercices;

import java.util.Arrays;

public class ImprimirArrays {
   // 4. Imprimir array: Crea un programa que utilice un método "imprimirArray(int[] array)" que se encargue de imprimir un array por consola. El método debe recibir como parámetro un arreglo de tipo "int" y no devolver nada. Luego, crea una sobrecarga del método para que acepte arrays de tipo String y arreglos bidimensionales de tipo "int" y de tipo "String".

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Inicializa el array con valores definidos.
        String[] array2 = {"Hola", "Mundo", "Java", "es", "genial", "aprendiendo", "arreglos", "de", "Strings", "!"};
        int[][] array3 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        String[][] array4 = {
                {"Hola", "Mundo", "Java", "es"},
                {"una", "matriz", "de", "Strings"},
                {"¡Genial!", "¿Cómo", "te", "va?"}
        };
        imprimirArray(array);
        imprimirArray(array2);
        imprimirArray(array3);
        imprimirArray(array4);

    }

    static void imprimirArray(int[] array){
        System.out.println("Imprimiento array de enteros");

            System.out.println(Arrays.toString(array));

    }

    static void imprimirArray(String[] array){
        System.out.println("Imprimiento array de Strings");

            System.out.println(Arrays.toString(array));


    }


    static void imprimirArray(int[][] array){
        System.out.println("Imprimiento array bidimencional de enteros");
        for( int[] i: array)
            System.out.println(Arrays.toString(i));

    }

    static void imprimirArray(String[][] array){
        System.out.println("Imprimiento array bidimencional de String");
        for(String[] i: array)
        {
            System.out.println(Arrays.toString(i));
        }

    }
}
