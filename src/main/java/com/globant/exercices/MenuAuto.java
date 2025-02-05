package com.globant.exercices;

import java.util.Scanner;

public class MenuAuto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        imprimirMenu();
        Auto miAuto = new Auto();
        int opcion = 0;
        do {
            System.out.print("Ingrese su opción: ");
            if (sc.hasNextInt()) {  // Verifica si la entrada es un número
                opcion = sc.nextInt();
                sc.nextLine(); // Consumir el salto de línea pendiente
            } else {
                System.out.println("Entrada no válida. Intente de nuevo.");
                sc.nextLine(); // Consumir la entrada inválida
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la marca: ");
                    miAuto.setMarca(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Ingrese el modelo: ");
                    miAuto.setModelo(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Ingrese el año: ");
                    if (sc.hasNextInt()) {
                        miAuto.setAnio(sc.nextInt());
                        sc.nextLine(); // Consumir el salto de línea
                    } else {
                        System.out.println("Año no válido.");
                        sc.nextLine(); // Consumir la entrada inválida
                    }
                    break;
                case 4:
                    miAuto.imprimirDatos();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 5);

        sc.close();
    }

    static public void imprimirMenu() {
        System.out.println("1. Ingresar marca");
        System.out.println("2. Ingresar modelo");
        System.out.println("3. Ingresar anio");
        System.out.println("4. Imprimir los valores");
        System.out.println("5. Salir");
    }
}