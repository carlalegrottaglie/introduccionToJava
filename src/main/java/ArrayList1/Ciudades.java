package ArrayList1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JavaArrayList {

    private Scanner scanner;

    public JavaArrayList() {
        scanner = new Scanner(System.in);
    }

    public void Activity1() {

        ArrayList<String> cities = new ArrayList<>();
        String userOption;

        do {
            System.out.print("Ingresa el nombre de una ciudad: ");
            String cityName = scanner.nextLine();
            cities.add(cityName);
            System.out.print("¿Deseas agregar otra ciudad? y/n): ");
            userOption = scanner.nextLine().toLowerCase();
        } while (userOption.equals("y"));

        System.out.println("Lista completa de ciudades:");
        for (String city : cities) {
            System.out.println(city);
        }

    }

    public void Activity2() {

        ArrayList<Integer> grades = new ArrayList<>();
        String userOption;

        do {
            int grade;
            System.out.print("Ingrese una nota (1-10): ");
            grade = scanner.nextInt();
            grades.add(grade);

            System.out.print("¿Desea agregar otra nota? (y/n): ");
            userOption = scanner.next();
        } while (userOption.equalsIgnoreCase("y"));

        Collections.sort(grades);
        System.out.println("Notas ascendente: " + grades);

        Collections.sort(grades, Collections.reverseOrder());
        System.out.println("Notas descendente: " + grades);

    }

    public void closeScanner() {
        scanner.close();
    }

    public static void main(String[] args) {
        JavaArrayList jv = new JavaArrayList();

        jv.Activity1();
        jv.Activity2();

        jv.closeScanner();
    }
}