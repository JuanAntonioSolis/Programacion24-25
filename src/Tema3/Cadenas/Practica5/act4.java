package Tema3.Cadenas.Practica5;

/*
Crea un programa en Java que solicite al usuario dos cadenas de caracteres y que devuelva la primera cadena,
pero transformando en mayúsculas la parte que coincide con la segunda cadena introducida.
Por ejemplo, si se introducen las cadenas
“Esta es mi amiga Ana” y “amiga” devolverá “Esta es mi AMIGA Ana”.
 */

import java.util.Scanner;

public class act4 {

    public static void main(String[] args) {

        String cadena1;
        String cadena2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la primera cadena");
        cadena1 = sc.nextLine();
        System.out.println("Escribe la segunda cadena");
        cadena2 = sc.nextLine();

        cadena2.toUpperCase();


        System.out.println(cadena1.replace("amiga","AMIGA"));











    }
}
