package Tema2.RelacionUnidad2;

/*
Diseña un metodo que indique si un número entero pasado como parámetro es o no un número primo (devuelve un boolean).
Un número primo es quel que tiene por divisores 1 y el propio número, únicamente.
 */

import java.util.Scanner;

public class Ejercicio19 {

    public static boolean calculoPrimo(int num) {
        boolean primo = true;
        for (int i = num - 1; i>=2;i--) {
            if (num % i == 0) {
                primo = false;
            }
        }

        return primo;
    }

    public static void main(String[] args) {

        int num;
        boolean primo = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        num = sc.nextInt();








    }
}
