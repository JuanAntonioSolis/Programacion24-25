package Tema3.Arrays.Practica4;

/*
Leer 10 números enteros y a continuación mostrar la media de los números introducidos, el mayor valor y el
menor valor. Usar un array para almacenar los valores y sacar toda la información en una sola iteración del array.
Si puedes mejóralo implementando una función para cada tarea (media, mayor, menor), pasando el array.
 */

import java.util.Scanner;

public class Ej5 {

    public static int media(int valor[]) {

        int suma = 0;

        for (int i = 0; i < valor.length; i++) {
            suma += valor[i];
        }

        return suma / valor.length;
    }

    public static int mayor(int valor[]) {

        int big = valor[0];

        for (int i = 1; i < valor.length; i++) {
            if (valor[i] > big) {
                big = valor[i];
            }
        }

        return big;
    }

    public static int menor(int valor[]) {
        int min = valor[0];

        for (int i = 1; i < valor.length; i++) {
            if (valor[i] < min) {
                min = valor[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {

        int valores[] = new int[10];
        int suma = 0;
        Scanner sc = new Scanner (System.in);

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Introduce un valor para el array.");
            valores[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }

        System.out.println("La media de los valores del array es: " + media(valores));
        System.out.println("El mayor valor del array es: " + mayor(valores));
        System.out.println("El menor valor del array es: " + menor(valores));




    }
}
