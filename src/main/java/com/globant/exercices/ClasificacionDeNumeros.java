package com.globant.exercices;
import java.util.Scanner;
public class ClasificacionDeNumeros {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese un numero: " );
            double numero = scanner.nextDouble();

            if(numero>0) {
                System.out.println("Su numero es positivo");
            }
            else if(numero==0) {
                System.out.println("Su numero es cero ");
            }
            else {
                System.out.println("Su numero es negativo ");
            }
            scanner.close();
        }

    }

