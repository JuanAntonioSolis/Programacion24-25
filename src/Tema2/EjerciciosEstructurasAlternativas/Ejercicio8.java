package Tema2.EjerciciosEstructurasAlternativas;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        /*

        Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras
        y muestre por pantalla el número en letras (dato cadena) de la casa opuesta al resultado obtenido.

        Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
        Nota 2: Si el nñumero del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje
        "Error: número incorrecto.".
        Ejemplo:
            Introduzca un número del dado: 5.
            En la cara opuesta está el "dos".

         */

        int valorDado;

        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el valor del dado:");
        valorDado = sc.nextInt();

        if (valorDado == 1) {
            System.out.println("En la cara opuesta está el 6");
        } else if (valorDado == 2) {
            System.out.println("En la cara opuesta está el 5");
        } else if (valorDado == 3) {
            System.out.println("En la cara opuesta está el 4");
        } else if (valorDado == 4) {
            System.out.println("En la cara opuesta está el 3");
        } else if (valorDado == 5) {
            System.out.println("En la cara opuesta está el 2");
        } else if (valorDado == 6) {
            System.out.println("En la cara opuesta está el 1");
        } else {
            System.out.println("Error: número incorrecto");
        }
    }
}
