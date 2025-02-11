package ArrayList1;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCiudades {

    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<>();
    String respuesta = "SI";
        Scanner sc= new Scanner(System.in);
      while (respuesta=="SI")
      {
          System.out.println("Quiere ingresar una ciudad Si/No");
          respuesta= sc.nextLine().toUpperCase();
          System.out.println("Ingrese la ciudad: ");
          ciudades.add(sc.nextLine();
      }




        }

    }
}
