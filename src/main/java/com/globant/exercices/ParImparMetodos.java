package com.globant.exercices;
import java.util.Scanner;
public class ParImparMetodos {


        public static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {

            esPar(solicitarNumero());

        }


        private static int solicitarNumero(){
            System.out.println("Ingrese un número: ");
            return sc.nextInt();
        }

        private static boolean esPar(int num){
            if (num % 2 == 0) {
                //System.out.println("El "+ num+" es par");
                System.out.print("El número " + num + " es par");
                return true; }
            else {
                System.out.print("El número " + num + " es impar");
                return false;
            }


        }

    }



