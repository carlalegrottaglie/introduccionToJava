package com.globant.exercices;

import java.util.Scanner;

public class ValidarContrasenia {

    // Escribe un programa que solicite que ingreses una contraseña y la valide utilizando un bucle while.
    // La contraseña correcta es "secreto". Continuará pidiéndote que ingreses la contraseña hasta que sea correcta.

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        String contrasena = "";

        while (!contrasena.equals("secreto")) {
            System.out.println("Ingresa la contraseña nuevamente: ");
            contrasena = teclado.nextLine();
        }
    }

}
