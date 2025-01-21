package com.globant.exercices;

import java.util.Arrays;
import java.util.Random;

public class OrdenarCalificaciones {

        public static void main(String[] args) {
            //  creamos el tamaño del de array
            int notaa = 10;

            // definimos el principal que el que definimos
            String[] calificaciones = new String[notaa];

            // creamos los 3 para que guardaran las notas segun su rango
            String[] desaprobado = new String[notaa];
            String[] aprobado = new String[notaa];
            String[] excelente = new String[notaa];

            // usamos random para generarnlas calificaciones
            Random rand = new Random();
            for (int i = 0; i < notaa; i++) {
                calificaciones[i] = String.format("%.2f", rand.nextDouble() * 10);
                // usamos maximo de 10 en nota y lo definimos 2 f float para que los valores sean en decimales

            }

            // definimos contadores para almacenar las notas segun las
            // condicones
            int indexDesaprobado = 0, indexAprobado = 0, indexExcelente = 0;
            double calificacion;

            for (int i = 0; i < notaa; i++) {
                calificacion = Double.parseDouble(calificaciones[i].replace(",", "."));
                if (calificacion < 4) {
                    desaprobado[indexDesaprobado++] = calificaciones[i];
                } else if (calificacion >= 4 && calificacion < 10) {
                    aprobado[indexAprobado++] = calificaciones[i];
                } else {
                    excelente[indexExcelente++] = calificaciones[i];
                }
            }
            System.out.println(Arrays.toString(desaprobado));
                desaprobado = Arrays.copyOf(desaprobado, indexDesaprobado);
                System.out.println(Arrays.toString(desaprobado));
            aprobado = Arrays.copyOf(aprobado, indexAprobado);
            System.out.println(Arrays.toString(aprobado));
            excelente = Arrays.copyOf(excelente, indexExcelente);
            System.out.println(Arrays.toString(excelente));

            // Calculamos promedios
            double promedioOriginal = calcularPromedio(calificaciones, notaa);
            double promedioDesaprobado = calcularPromedio(desaprobado, indexDesaprobado);
            double promedioAprobado = calcularPromedio(aprobado, indexAprobado);
            double promedioExcelente = calcularPromedio(excelente, indexExcelente);

            // Imprimimos los resultadps
            System.out.println("Calificaciones Originales:");
            imprimirArreglo(calificaciones, notaa);

            System.out.println("\nCalificaciones Desaprobadas (< 4):");
            imprimirArreglo(desaprobado, indexDesaprobado);

            System.out.println("\nCalificaciones Aprobadas (>= 4 y < 10):");
            imprimirArreglo(aprobado, indexAprobado);

            System.out.println("\nCalificaciones Excelentes (>= 10):");
            imprimirArreglo(excelente, indexExcelente);

            System.out.println("\nPromedios:");
            System.out.println("Promedio del arreglo original: " + promedioOriginal);
            System.out.println("Promedio de desaprobados: " + promedioDesaprobado);
            System.out.println("Promedio de aprobados: " + promedioAprobado);
            System.out.println("Promedio de excelentes: " + promedioExcelente);
        }

        // funcion para calcular el promedi0
        public static double calcularPromedio(String[] arreglo, int longitud) {
            if (longitud == 0 || arreglo.length == 0) {
                return 0;  // Evita errores si el arreglo está vacío
            }
            double suma = 0;
            int contador = 0;
            int i = 0;

                do {
                    if (arreglo[i] != null) {
                        suma += Double.parseDouble(arreglo[i].replace(",", "."));
                        contador++;
                    }
                    i++;
                } while (i < longitud);

            return contador == 0 ? 0 : suma / contador;
        }

        //imprimimos ek arreglo
        public static void imprimirArreglo(String[] arreglo, int longitud) {
            for (int i = 0; i < longitud; i++) {
                if (arreglo[i] != null) {
                    System.out.print(arreglo[i] + " ");
                }
            }
            System.out.println();
        }
    }




