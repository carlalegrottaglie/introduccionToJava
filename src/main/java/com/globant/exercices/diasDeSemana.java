package com.globant.exercices;
import java.util.Scanner;
public class diasDeSemana {
     public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingresa un número entre 1 y 7");
            int numero=entrada.nextInt();
            String respuesta = switch(numero){
                case 1 -> "Lunes";
                case 2 -> "Martes";
                case 3 -> "Miércoles";
                case 4 -> "Jueves";
                case 5 -> "Viernes";
                case 6 -> "Sábado";
                case 7 -> "Domingo";
                default -> "No existe";
            };
            System.out.println("El día de la semana es : "+respuesta);
            entrada.close();
        }

    }

