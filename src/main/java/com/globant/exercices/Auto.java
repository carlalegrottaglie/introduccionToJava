package com.globant.exercices;

public class Auto {
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    private String marca;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    private String modelo;
    private int anio;

   /* Constructor que inicialice marca, modelo y año

    Constructor que inicialice marca y modelo

    Constructor que inicialice solamente la marca

    Constructor sin parámetros*/

    public Auto(String marca, String modelo, int anio){
        this.marca= marca;
        this.modelo= modelo;
        this.anio= anio;

    }
    public Auto(String marca, String modelo){
        this.marca= marca;
        this.modelo= modelo;
        this.anio=0;
    }

    public Auto(String marca){
        this.marca= marca;
        this.modelo= "Desconocido";
        this.anio=0;
    }

    public Auto(){
        this.marca= "Desconocida";
        this.modelo= "Desconocido";
        this.anio=0;
    }

    public void imprimirDatos()
    {
        if (this.marca==null) System.out.println("Este objeto fue inicializado por el constructor " +
                "sin parametros");
        else if (this.modelo==null) System.out.println("La marca es " + this.marca);
        else if(this.anio==0) System.out.println("La marca es " + this.marca + " y el modelo es "
                + this.modelo);
        else System.out.println("La marca es " + this.marca + " y el modelo es " + this.modelo +
                    " y el año es " + this.anio);

    }


}
