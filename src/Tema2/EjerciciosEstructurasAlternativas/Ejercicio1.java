package Tema2.EjerciciosEstructurasAlternativas;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        /*
        Algoritmo que pida dos números e indique si el primero es mayor que el segundo o no.
         */

        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el 1er número: ");
        num1 = sc.nextInt();
        System.out.println("Introduce el 2do número: ");
        num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println("El primer número es mayor que el segundo");

        } else
            System.out.println("El primer número es menor que el segundo");

        
    }
}
