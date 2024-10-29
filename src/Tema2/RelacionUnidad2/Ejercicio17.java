package Tema2.RelacionUnidad2;

import java.util.Scanner;

public class Ejercicio17 {

    /*
    Programa que lea un entero positivo introducido por el usuario y que muestre por pantalla
    todos su divisores.
     */

    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un número entero positivo:");
        num = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                System.out.println(i + " es divisor de " + num);
            }

        }
    }


}
