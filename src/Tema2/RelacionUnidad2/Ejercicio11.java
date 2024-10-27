package Tema2.RelacionUnidad2;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        /*
        Programa (utilizando bucles) que muestre por pantalla la siguiente figura. Debe funcionar para n =
        número de líneas, que se pida por teclado.

            *
           **
          ***
         ****

         */

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe cuantas lineas quieres pintar:");
        n = sc.nextInt();

        for (int fila = 1; fila <= n; fila++) {
            for (int espacios = n-fila; espacios > 0; espacios--) {
                System.out.print(" ");
            }

            for (int asterisco = 1; asterisco <= fila; asterisco++) {
                System.out.print("*");
            }

            if (fila > 1) {
                for (int nuevo = 1; nuevo <= fila - 1; nuevo++) {
                    System.out.print("*");
                }
            }




            System.out.println();
        }


    }
}
