package Tema2.RelacionUnidad2;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        /*
        Programa que lea los números hasta que le den al cero, y que diga cuál ha sido el mayor y cuál el menor de los
        números introducidos (sin tener en cuenta el cero).
         */

        int num, mayor, menor;
        mayor = 0;
        menor = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();

        mayor = num;
        menor = num;

        while (num != 0) {
            System.out.println("Escribe otro número:");
            num = sc.nextInt();

           if (num > mayor) {
               mayor = num;
           }
           if (num != 0) {
               if (num < menor) {
                   menor = num;

               }
           }

        }

        System.out.println("Has introducido un 0");

        System.out.println("El número mayor ha sido " + mayor);
        System.out.println("El menor número ha sido el " + menor);


    }
}
