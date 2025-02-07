package FigurasGeometricas.modelos;

import java.util.Scanner;

public class FigurasGeometricas {

    public static void main(String[] args) {

        menu();


    }


    public static void  menu(){
        System.out.println("Menu");
        System.out.println("Seleccionar una figura geometrica");
        System.out.println("1 Rectangulo");
        System.out.println("2 Circulo");
        System.out.println("3 Triangulo");
        System.out.println("Elije tu opción:");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        sc.nextLine();
        do {

            switch (opcion) {

                case 1:
                    Rectangulo miRectangulo = new Rectangulo();
                    System.out.println("Ingrese el alto");
                    miRectangulo.setAlto(sc.nextDouble());
                    sc.nextLine();
                    System.out.println("Ingrese el ancho");
                    miRectangulo.setAncho(sc.nextDouble());
                    sc.nextLine();
                    miRectangulo.imprimirDatos();
                    break;
                default:
                    System.out.println("");
            }


        }while (opcion!=7);


    }

}
