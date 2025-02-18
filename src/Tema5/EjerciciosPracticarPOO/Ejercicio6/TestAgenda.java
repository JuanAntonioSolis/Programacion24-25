package Tema5.EjerciciosPracticarPOO.Ejercicio6;

import javax.naming.Name;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TestAgenda {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Agenda phoneBook = new Agenda();

        int option = -1;

        while (option !=6) { // En cuanto la opción sea 6 se sale del bucle. 6 porque es la opción de salir.

            //Pintar opciones
            System.out.println("AGENDA TELEFÓNICA");
            System.out.println();
            System.out.println("1. Añadir nuevo contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Estado de la agenda");
            System.out.println("6. Salir");
            System.out.println("Introduce opción elegida:");
            option = Integer.parseInt(sc.nextLine());


            switch (option) {
                case 1:
                    System.out.println("Escribe el nombre del contacto que quieres añadir");
                     String name = sc.nextLine();
                    System.out.println("Inserta el teléfono del contacto a añadir");
                     int tlf = Integer.parseInt(sc.nextLine());

                     phoneBook.addContacto(new Contacto(name,tlf));

                    break;
                case 2:
                    phoneBook.listarContactos();

                    break;
                case 3:
                    System.out.println("Escribe el nombre del contacto que quieres buscar");
                    name = sc.nextLine();

                    phoneBook.buscarContacto(name);

                    break;
                case 4:
                    System.out.println("Inserta que contacto quieres eliminar");
                    name = sc.nextLine();


                    break;
                case 5:
                    System.out.println("Adiós, gracias por participar");
                    break;
                default:
                    System.out.println("Error, oción incorrecta");
            }
            sc.nextLine();

        }
    }
}
