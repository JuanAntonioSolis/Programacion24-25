package Tema3.Arrays.Practica4;

/*
Genera aleatoriamente una tabla de 10 elementos numéricos enteros, guardalos en una array. Luego pide por
teclado una posición (entre 0 y 9). Eliminar el elemento situado en la posición dada sin dejar huecos.
PROBABLEMENTE MAL
 */

import java.util.Scanner;

public class Ej8 {

    public static int aleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void main(String[] args) {

        int tabla[] = new int[10];
        int posicion;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = aleatorio(10, 1);
        }

        System.out.println("Escribe una posición (0-9) del vector:");
        posicion = Integer.parseInt(sc.nextLine());

       tabla[posicion] = 0;

        for (int i = 0; i < tabla.length; i++) {
            System.out.println(tabla[i]);
        }







    }
}
