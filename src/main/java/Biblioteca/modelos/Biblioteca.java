package Biblioteca.modelos;

public class Biblioteca {

    private String nombre;
    private Libro[] libros;
    private int cantidadLibros = 0;

    public Biblioteca(String nombre, int tamano) {
        this.nombre = nombre;
        this.libros = new Libro[tamano];

    }

    /*agregarLibro(Libro libro): Verifica si hay espacio disponible en el arreglo.
Si lo hay, agrega el libro y aumenta cantidadLibros. Si el libro ya existe
(mismo título y autor), muestra un mensaje de error.*/
    public void agregarLibro(Libro nuevoLibro) {
        if (cantidadLibros == libros.length) {
            System.out.println("No hay espacio en la biblioteca para agregar un nuevo libro U_u");
        } else {

            cantidadLibros++;
        }

    }

    public boolean existeLibro(Libro libro2) {
        for (int i = 0; i < cantidadLibros; i++) {
            if (libro2.equals(libros[i])) {
                System.out.println("Ya existe en la biblioteca");
                return true;
            }
        }
        return false;

    }
    /*mostrarLibros(): Recorre el arreglo y muestra los datos de cada libro almacenado.*/
    public void mostrarLibros(){
        for (int i = 0; i < cantidadLibros; i++) {
            System.out.println(libros[i].toString());

        }
    }

    /*prestarLibro(String titulo): Busca un libro por su título en el arreglo.
Si está disponible, cambia su estado a false. Si no lo encuentra o no está
disponible, muestra un mensaje de error.*/
    public void prestarLibro(String titulo){
        for (int i = 0; i < cantidadLibros; i++) {
            if (titulo == libros[i].getTitulo()) {
                if (libros[i].isDisponible()) {
                    libros[i].setDisponible(false);
                }else{
                    System.out.println("No esta disponible ");
                }

            }

        }

    }




}

