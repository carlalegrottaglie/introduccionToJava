package com.globant.exercices;


    import java.util.Scanner;


    public class figurasGeometricas {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa una opción");
            System.out.println("1.Circulo");
            System.out.println("2.Cuadrado");
            System.out.println("3.Triangulo");
            int opc = sc.nextInt();
            double area = 0;


            switch (opc) {
                case 1:
                    System.out.println("Ingresa el radio");
                    float radio = sc.nextFloat();
                    area = Math.PI * radio * radio;
                    break;
                case 2:
                    System.out.println("Ingresa el lado");
                    float lado = sc.nextFloat();
                    area = lado * lado;
                    break;
                case 3:
                    System.out.println("Ingresa la base");
                    float base = sc.nextFloat();
                    System.out.println("Ingresa la altura");
                    float altura = sc.nextFloat();
                    area = (base * altura)/2;
                    break;


                default:
                    System.out.println("Opción invalida");
                    break;
            }


            System.out.println("El area es: "+ area);


            sc.close();
        }


    }

