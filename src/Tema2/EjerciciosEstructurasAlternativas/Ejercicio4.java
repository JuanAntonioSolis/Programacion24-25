package Tema2.EjerciciosEstructurasAlternativas;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        /*
        Realiza un algoritmo que calcule la potencia, para ello pide por teclado
        la base y el exponente. Pueden ocurrir tres cosas:

        El exponente sea positivo, sólo tienes que imprimir la potencia.
        El exponente sea 0, el resultado es 1.
        El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.
         */

        double base;
        double exponente;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el valor de la base:");
        base = sc.nextDouble();
        System.out.println("Escriba el valor del exponente:");
        exponente = sc.nextDouble();

        if (exponente > 0 ) {
            System.out.println("La potencia es = " + Math.pow(base, exponente));
        } else if (exponente == 0) {
            System.out.println("El resultado es 1");
        } else if (exponente < 0) {
            System.out.println("La potencia es = " + 1 / (Math.pow(base, -exponente)));
        }

    }
}
