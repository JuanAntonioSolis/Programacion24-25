package Tema3.Arrays.Practica4;

/*
Crear un programa que lea por teclado una tabla de 5 números enteros y la desplace una posición hacia la
derecha: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. Igual que el
anterior, pero desplazando N posiciones (N es un número introducido por el usuario).
DUDA PROFESOR
 */

import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {

        int tabla[] = new int[5]; // 8, 9, 10, 4, 5
                                  // 5, 8, 9, 10, 4

        int n;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Escribe un valor para el array: ");
            tabla[i] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < tabla.length; i++) {
            System.out.println(tabla[tabla.length -1 - i]);
        }

        System.out.println("Escribe cuántas posiciones quieres desplazar el vector: ");
        n = Integer.parseInt(sc.next());






    }
}
