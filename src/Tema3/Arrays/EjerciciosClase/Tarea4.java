package Tema3.Arrays.EjerciciosClase;

/*
4. Vamos a crear un pequeño diccionario inglés - español.
Nos creamos un array de 10 String con palabras en inglés, y luego un array de 10
String con la traducción de las palabras en español.
En la misma posición de los dos arrays está su palabra y la traducción.
Crea un función->  public function String traducir(String palabraEspañol) que devuelva la traducción al inglés.
La idea es buscar la posición donde está la palabra y devolver la traducción en que está en el otro array.
 */

import java.util.Scanner;

public class Tarea4 {

    public static String traduccion(String espanol) {

        String english[] = {"Screen", "Mouse", "Mousepad", "Keyboard", "Water", "Tissues", "Cat", "Fridge", "Oven", "Desk"};
        String spanish[] = {"Pantalla", "Raton", "Alfombrilla", "Teclado", "Agua", "Pañuelos", "Gato", "Nevera", "Horno", "Escritorio"};

        for (int i = 0; i < spanish.length; i++) {
            if (espanol.equals(spanish[i])) {
                return english[i];
            }
        }
        return "No tenemos esa traducción";

    }

    public static void main(String[] args) {

        String palabra;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la palabra que quieras traducir: ");
        palabra = sc.nextLine();
        System.out.println("La traducción de " + palabra + " es: " + traduccion(palabra));


    }
}
