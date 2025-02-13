/*package Empleados;

// main
import modelos.Empleado;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Sistema de Gestion");

        Empleado[] empleados = new Empleado[10];

        Empleado emp1 = new Empleado("Juan Pérez", 30, 45000.50, "Ventas");
        Empleado emp2 = new Empleado("María López", 25, 38000.75, "Marketing");
        Empleado emp3 = new Empleado("Carlos Gómez", 40, 55000.00, "Finanzas");
        Empleado emp4 = new Empleado("Ana Torres", 35, 50000.25, "Recursos Humanos");


        empleados[0] = emp1;
        empleados[1] = emp2;
        empleados[2] = emp3;
        empleados[3] = emp4;

        Empleado.imprimirEmpleados(empleados);
    }


    int opcion;
        do {
        System.out.println("\nAdministración de empleados");
        System.out.println("1. Añadir empleados");
        System.out.println("2. Ver información de empleados");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.print("Seleccione una opción: ");
        opcion = leer.nextInt();
        leer.nextLine();

        switch (opcion) {
            case 1:

                break;
            case 2:

                break;
            case 3:
                int filtro = Integer.parseInt(JOptionPane.showInputDialog(null, """
                            Filtro de empleados
                            1. Filtrar por nombre
                            2. Filtrar por edad
                            3. Filtrar por salario
                            4. Filtrar por departamento
                            """));
                switch (filtro){
                    case 1:
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre a filtrar:");
                        Empleado.filtrarEmpleadosNombre(empleados, nombre);
                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    default:
                        System.out.println("Opción inválida. Intente de nuevo.");
                }
        } while (opcion != 5);
    }


// clase empleado
package modelos;

    public class Empleado {
        private String nombre;
        private int edad;
        private double salario;
        private String departamento;

        public Empleado() {
        }

        public Empleado(String nombre, int edad, double salario, String departamento) {
            this.nombre = nombre;
            this.edad = edad;
            this.salario = salario;
            this.departamento = departamento;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public String getDepartamento() {
            return departamento;
        }

        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }

        @Override
        public String toString() {
            return "Empleado [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", departamento="
                    + departamento + "]";


            public static void mostrarEmpleados(Empleado[] empleados, int contadorEmpleados) {
                System.out.println("\nNo. | Nombre          | Edad | Salario    | Departamento");
                System.out.println("----------------------------------------------------");
                for (int i = 0; i < contadorEmpleados; i++) {
                    System.out.println((i + 1) + empleados[i].toString());
                }
            }



            public static void imprimirEncabezado() {
                System.out.println( "Empleado [nombre          Edad          Salario          Departamento]");
            }

            public static void imprimirEmpleados(Empleado[]  empleados) {
                imprimirEncabezado();
                for (int i = 0; i < empleados.length; i++) {
                    if (empleados[i] != null) {
                        System.out.println(empleados[i].toString());
                    }
                }
            }



 */