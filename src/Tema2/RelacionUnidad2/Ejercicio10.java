package Tema2.RelacionUnidad2;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        /*
        Programa (utilizando bucles) que muestre por pantalla la siguiente figura. Debe funcionar para n = numero
        de líneas, que se pida por teclado.
        *
        **
        ***
        ****
        *****
         */

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cuántas líneas quieres pintar:");
        n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
