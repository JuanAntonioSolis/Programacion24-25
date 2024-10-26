package Tema2.RelacionUnidad2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        /*
        Programa que lea un número por teclado e indique si es múltiplo de 2, 3 5 o 7.
         */

        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");

        num = sc.nextInt();

        if (num % 2 == 0 ) {
            System.out.println("Es múltiplo de 2");
        }

        if (num % 3 == 0) {
            System.out.println("Es múltiplo de 3");
        }

        if (num % 5 == 0) {
            System.out.println("Es múltiplo de 5");
        }

        if (num % 7 == 0) {
            System.out.println("Es múltiplo de 7");
        }


    }
}
