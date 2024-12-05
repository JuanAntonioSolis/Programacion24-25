package Tema3.Cadenas.Practica5;

/*
Crea un metodo que determine si una cadena es un palíndromo,
o sea, se lee igual en los dos sentidos.
 */

import java.util.Scanner;

public class act6 {

    public static void main(String[] args) {

        String cadena;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una cadena:");
        cadena = sc.nextLine();

        cadena = cadena.toLowerCase();

        while (cadena.indexOf(" ") != -1){
            cadena.trim();
        }

        StringBuffer sb = new StringBuffer(cadena);

        while (sb.indexOf(" ") != -1){
            sb.deleteCharAt(sb.indexOf(" "));
        }

        sb.reverse();

        if (cadena.equalsIgnoreCase(sb.toString())) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }









    }
}
