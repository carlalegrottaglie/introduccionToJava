package com.globant.exercices;

public class ForEach {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Imprimiento los números");
        for (int number : numbers) {
            System.out.println(number);
        }

        String[] names = {"John", "Jane", "Bob"};
        System.out.println("Imprimiento los nombres");
        for (String name : names) {
            System.out.println(name);
        }
    }

}
