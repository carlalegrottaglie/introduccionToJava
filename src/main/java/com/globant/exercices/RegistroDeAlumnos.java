package com.globant.exercices;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class RegistroDeAlumnos {

    static int opcion = 0;
    static String[] arrayAlumnos;

    static Scanner sc;
    static double[] arrayNotas;

    public static void main(String[] args) {

        // scanner
        sc = new Scanner(System.in);
        arrayAlumnos = new String[]{
                "Ana López", "Luis Fernández", "Carlos Gómez", "Marta Sánchez", "Javier Pérez",
                "Sofia Ramírez", "Diego Torres", "Lucia Herrera", "Andres Vargas", "Paula Ruiz"
        };

        arrayNotas = new double[]{
                8.5, 7.2, 6.8, 9.0, 5.4,
                7.8, 6.0, 8.1, 7.0, 9.5
        };
        // Menú
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Registrar alumno");
            System.out.println("2. Mostrar todos los alumnos");
            System.out.println("3. Mostrar promedio de notas");
            System.out.println("4. Buscar alumno por nombre");
            System.out.println("5. Modificar nota por nombre de alumno");
            System.out.println("6. Eliminar alumno por nombre");
            System.out.println("7. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                // crear o borrar alumnos
                case 1:
                    System.out.println("Ingrese el nombre de un alumno: ");
                    arrayAlumnos = Arrays.copyOf(arrayAlumnos, arrayAlumnos.length + 1);
                    arrayAlumnos[arrayAlumnos.length - 1] = sc.nextLine();

                    System.out.println("Ingrese la nota del alumno: ");
                    arrayNotas = Arrays.copyOf(arrayNotas, arrayNotas.length + 1);
                    arrayNotas[arrayNotas.length - 1] = sc.nextDouble();


                    break;
                case 2:
                    MostrarAlumnos();
                    break;
                case 3:
                    PromedioNotas();
                    break;
                case 4:
                    BuscarAlumno();
                    break;
            }

        } while (opcion != 7);

    }

    static void MostrarAlumnos() {
        System.out.println("Lista de alumnos registrados:");
        for (int i = 0; i < arrayAlumnos.length; i++) {
            System.out.println("Nombre " + arrayAlumnos[i] + " - Nota: " + arrayNotas[i]);
        }
        System.out.println("Presione cualquier tecla para continuar");
        sc.nextLine();
    }

    static void PromedioNotas() {
        double suma = 0;
        for (double arrayNota : arrayNotas) {
            suma += arrayNota;
        }
        double promedio = (suma / arrayNotas.length);
        System.out.println("Promedio de notas: " + promedio);

        System.out.println("Presione cualquier tecla para continuar");
        sc.nextLine();
    }


    public static void BuscarAlumno() {
        int contador = 0;
        if (arrayAlumnos.length == 0) {

            System.out.println("No hay alumnos registrados, vaya al menú la opcion 1 para ingresar la oración");
        } else {
            System.out.println("Ingrese el nombre alumno que desea buscar: ");
            String palabra = sc.nextLine();
            boolean encontrada = false;
            do {
                if (Objects.equals(palabra, arrayAlumnos[contador])) {
                    encontrada = true;
                }
                contador++;

            } while (!encontrada && contador < arrayAlumnos.length);

            if (encontrada)
             System.out.println("Se encontró el alumno");
            else
                System.out.println("El alumno no se encuentra");
        }


    }
}