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

        int posicion = 0;
        int cont = 0;

        while (posicion >= 0) {
            posicion = cadena.indexOf(cadenaBuscar, posicion);
            if (posicion == -1)
                break;
            posicion++;
            cont++;
        }

        System.out.println("La cadena " + cadenaBuscar + " aparece " + (cont-1) + " veces");



    }
}
