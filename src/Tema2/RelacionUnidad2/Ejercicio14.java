package Tema2.RelacionUnidad2;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {


        /*
        Programa que lea dos números positivos e imprima por pantalla todos los números pares que estén entre los dos
        números dados. También debe indicar cuántos números pares hay en ese intervalo.


         */

        int num1, num2, contPares, cambio;

        contPares = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el primer número:");
        num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Escribe el segundo número:");
        num2 = Integer.parseInt(sc.nextLine());

        if (num1 > num2) {
            cambio = num2;
            num2 = num1;
            num1 = cambio;
        }

        for (int i = num1; i < num2; i++) {
            if (i % 2 == 0) {
                contPares++;
                System.out.println(i);
            }
        }
        System.out.println("Hay " + contPares + " números pares");



    }
}
