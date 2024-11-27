package Tema3.Cadenas.Practica5;

/*
Crea un programa en Java que solicite al usuario la introducción de una cadena de caracteres y
devuelva esta cadena invertida. Haz dos versiones, una con String y otra con StringBuffer.
 */


import java.util.Scanner;

public class act1 {

    public static void main(String[] args) {

        String cadena;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una palabra");
        cadena = sc.nextLine();

        for (int i = cadena.length()-1; i >= 0; i--) {
            System.out.print(cadena.charAt(i));
        }
        System.out.println();

        StringBuffer sb = new StringBuffer(cadena);
        System.out.println(sb.reverse());

    }
}
