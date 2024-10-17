package Tema2.Bucles;

import java.util.Scanner;

public class EjercicioAcumuladorYFor {

    public static void main(String[] args) {

        //Suma todos los números pares del 1 al 100

        /*
        int total = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                total = total + i;
            }
        }

        System.out.println(total);

         */

        //Pide 5 precios por teclado
        //Imprime el total

        int total = 0;
        int precio = 1;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <=5; i++) {
            System.out.println("Introduce un número");
            precio = Integer.parseInt(sc.nextLine());
            total = total + precio;
        }

        System.out.println(total);




    }
}
