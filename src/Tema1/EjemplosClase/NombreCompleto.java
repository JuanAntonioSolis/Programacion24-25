import java.util.Scanner;

public class NombreCompleto {

    public static void main(String[] args) {

        String nombre;
        String apellido1;
        String apellido2;

        //Variable para leer de teclado
        Scanner sc = new Scanner(System.in);

        //Aqui se escribe, en la primera linea el nombre, luego el 1er apellido, luego el 2do.
        System.out.println("Escribe tu nombre y appelidos: ");

        //Lee lo escrito y lo guarda en las variables
        nombre = sc.nextLine();
        apellido1 = sc.nextLine();
        apellido2 = sc.nextLine();

        //Muestra en pantalla las variables con sus nuevos valores
        System.out.println("Tu nombre es " + apellido1 + " " + apellido2 + ", " + nombre);
    }
}
