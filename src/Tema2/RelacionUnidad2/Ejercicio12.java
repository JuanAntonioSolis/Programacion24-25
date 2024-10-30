package Tema2.RelacionUnidad2;


/*
Programa (utilizando bucles) que muestre por pantalla la siguiente figura. Debe funcionar para n =
número de líneas, que se pida por teclado
 */


import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        /*
           *
          ***
         *****
        *******
         */

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cuántas líneas quieres pintar:");
        n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 4; j <= i; j++) {}
        }


    }
}
