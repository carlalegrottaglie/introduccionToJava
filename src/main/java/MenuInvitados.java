import java.util.HashSet;
import java.util.Scanner;

public class MenuInvitados {

    public static class RegistroDeInvitados {
        private HashSet<String> invitados ;

        public void agregarInvitado(String nombre) {
            invitados.add(nombre);
        }

        public RegistroDeInvitados() {
            this.invitados = new HashSet<>();
        }

        public void eliminarInvitado(String nombre) {
            invitados.remove(nombre);
        }

        public void mostrarInvitado() {
            for (String nombre : invitados) {
                System.out.println(nombre);
            }
        }

    }

    public static void main(String[] args) {
        int opcionMenu =0;
        RegistroDeInvitados mInvitados = new RegistroDeInvitados();
        mInvitados.agregarInvitado("Angelina Jolie");
        mInvitados.agregarInvitado("Brad Pitt");
        mInvitados.agregarInvitado("Jeniffer Aniston");
        mInvitados.agregarInvitado("Jeniffer Lopez");
        mInvitados.agregarInvitado("Ben Affleck");

        Scanner input = new Scanner (System.in);
        do {
            System.out.println("Menu \n " +
                    "1.Agregar Invitados \n " +
                    "2.Eliminar Invitados \n " +
                    "3.Mostrar Invitados \n " +
                    "4.Salir \n" +
                    "Ingrese la opcion deseada");
            opcionMenu = input.nextInt();
            input.nextLine();

            switch (opcionMenu) {
                case 1: System.out.println("Por favor ingrese el nombre del invitado a agregar.");
                    mInvitados.agregarInvitado(input.nextLine());
                      break;
                case 2: System.out.println("Por favor ingrese el nombre del invitado a eliminar.");
                    mInvitados.eliminarInvitado(input.nextLine());
                    break;
                    case 3:
                        mInvitados.mostrarInvitado();
                    break;
                    case 4:
                        System.out.println("Chau, gracias!");
                        break;
                default:
                    System.out.println("Ingresar opción valida");
                    break;
            }

        } while (opcionMenu != 4);


    }

}
