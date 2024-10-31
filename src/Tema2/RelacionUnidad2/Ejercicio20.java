package Tema2.RelacionUnidad2;

/*
Programa que, dado un número entero positivo introducido por teclado, visualice por pantalla todos los números primos
menore que él. Utiliza la función del ejercicio anterior.
 */

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();



        for (int i = num; i >= 2; i--) {
            if (Ejercicio19.calculoPrimo(i)) {
                System.out.println(i);
            }
        }





    }
}
