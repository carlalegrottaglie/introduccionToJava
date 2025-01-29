package com.globant.exercices;

import java.util.Scanner;

    public class Calculadora {
        public static Scanner sc = new Scanner(System.in);
        static double num1, num2;

        public static void main(String[] args) {
            menu();
            System.out.println("Gracias por usar la calculadora!");
        }

        public static void menu(){
            int opcion;
            double resultado = 0;

            do {
                System.out.println("");
                System.out.println("1- Ingresar números");
                System.out.println("2- Suma");
                System.out.println("3- Resta");
                System.out.println("4- Multiplicar");
                System.out.println("5- Dividir");
                System.out.println("6- Salir");
                System.out.println("Ingrese una opción: ");
                opcion = sc.nextInt();

                switch (opcion){
                    case 1:
                        num1 = solicitarNumero();
                        num2 = solicitarNumero();
                        break;
                    case 2:
                        resultado = sumar(num1,num2);
                        System.out.println("El resultado de la suma es " +resultado);
                        break;
                    case 3:
                        resultado = restar(num1,num2);
                        System.out.println("El resultado de la resta es " +resultado);
                        break;
                    case 4:
                        resultado = multiplicar(num1,num2);
                        System.out.println("El resultado de la multiplicación es " +resultado);
                        break;
                    case 5:
                        resultado = dividir(num1,num2);
                        System.out.println("El resultado de la división es " +resultado);
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Ingresó un número inválido");
                }
            } while (opcion != 6);
        }

        public static double sumar(double a, double b) {
            return a + b;
        }

        public static double restar(double a, double b) {
            return a - b;
        }

        public static double multiplicar(double a, double b) {
            return a * b;
        }

        public static double dividir(double a, double b) {
            if (b == 0) {
                System.out.println("no se puede dividir por 0");
                return 0;
            } else {
                return a / b;
            }
        }

        private static int solicitarNumero() {
            System.out.println("Ingrese un número: ");
            return sc.nextInt();
        }

    }

