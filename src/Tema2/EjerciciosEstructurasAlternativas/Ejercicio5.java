package Tema2.EjerciciosEstructurasAlternativas;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        /*
        Escribir un programa que lea un año, indicar si es bisiesto. Nota: un año es bisiesto si es un número
        divisible por 4, pero no si es divisible por 100, excepto que también sea divisible por 400.
         */

        int año;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el año");
        año = sc.nextInt();

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }


    }
}
