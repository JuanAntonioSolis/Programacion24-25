package Tema2.EjerciciosEstructurasAlternativas;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        /*
        Escribe un programa que lea un número e indique si es par o impar.
         */

        int numero;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número:");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else
            System.out.println("El número es impar");
    }
}
