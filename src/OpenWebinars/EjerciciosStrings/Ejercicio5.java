package OpenWebinars.EjerciciosStrings;

/*
Escribir un programa en Java que tome una cadena escrita por el usuario y la escriba en mayúsculas y al revés.
 */

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        String cad;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto:");
        cad = sc.nextLine();

        System.out.println(cad.toUpperCase());

        StringBuffer sb = new StringBuffer(cad);

        System.out.println(sb.reverse());




    }
}
