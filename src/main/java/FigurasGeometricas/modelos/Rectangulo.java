package FigurasGeometricas.modelos;

public class Rectangulo {
    private double ancho;
    private double alto;

    // Constructor
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Constructor por defecto
    public Rectangulo() {
        this.ancho = 0;
        this.alto = 0;
    }

    // Getter y Setter
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    // Método para calcular área
    public double area() {
        return ancho*alto;
    }

    // Método para calcular perímetro
    public double perimetro() {
        return 2*(ancho+alto);
    }

    // Método para imprimirDatos
    public void imprimirDatos(){
        System.out.println("Figura: Rectángulo");
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto);
        System.out.println("Área: " + this.area());
        System.out.println("Perímetro: " + this.perimetro());
    }

}

