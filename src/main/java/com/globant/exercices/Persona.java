package com.globant.exercices;

public class Persona {

    private String name;
    private int age;
    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void imprimirDatos()
    {
        System.out.println("Nombre: " + this.name + ", Edad: " + this.age);
    }

}
