package com.globant.exercices;

public class ArrayMin {

    /*
Actividad: Encontrando el valor mínimo
Escribe un programa que recorra un array de enteros y encuentre el valor mínimo presente en el array.
El tamaño y los números a contener pueden ser de tu elección.
*/

        public static void main(String[] args) {
            int[] array = {355, 850, 2134, 12, 867, 1676, 23, 24};

            int min = array[0];
            for (int i : array) if (i<min) min =i;

            System.out.println("Mínimo: " + min);
        }
    }

