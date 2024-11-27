package Tema3.Cadenas.Practica5;

/*
Diseña un programa en Java que solicite al usuario una cadena en la que buscará y otra que será la
cadena buscada. El programa indicará cuántas veces aparece la segunda cadena en la primera.
 */

import java.util.Scanner;

public class act3 {

    public static void main(String[] args) {

        String cadena = "";
        String cadenaBuscar = "";


        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una cadena donde buscarás: ");
        cadena = sc.nextLine();
        System.out.println("Escribe que cadena quieres buscar: ");
        cadenaBuscar = sc.nextLine();

        int posición = cadena.indexOf(cadenaBuscar);
        int cont = 0;

        while (posición > 0) {
            cadena.indexOf(cadenaBuscar);
        }



    }
}
