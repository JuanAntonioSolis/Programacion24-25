package Tema2.RelacionUnidad2;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        /*
        Funcion que calcule el factorial de un número entero positivo pasado cómo parámetro.
         */

        int numero;
        long total = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();

        for (int i = numero; i >= 2; i--) {
            total *= i;
            System.out.println("Factorial: " + i + "  " + total);
        }
        System.out.println("El factorial es: " + total);

    }
}
