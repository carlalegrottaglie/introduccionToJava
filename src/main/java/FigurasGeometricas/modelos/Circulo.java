package FigurasGeometricas.modelos;

public class Circulo {

    private double radio;

    public Circulo(double radio){
        this.radio=radio;
    }
    public Circulo(){
    }

    public double calcularArea(){
        return Math.PI*radio*radio;
    }
    public double calcularPerimetro(){
        return 2*Math.PI*radio;
    }
    public void imprimirDatos() {
        System.out.println("El circulo creado tiene las siguientes características: \n" +
                "Radio: " + this.radio + "\n" +
                "Perímetro: " + calcularPerimetro() + "\n" +
                "Área: " + calcularArea());
    }

}




