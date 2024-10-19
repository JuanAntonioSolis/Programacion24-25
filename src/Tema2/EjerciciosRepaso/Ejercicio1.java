package Tema2.EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        /*
        Realiza un programa que vaya pidiendo números enteros mientras no introduzcas el -1. Como resultado
        debe devolver la cantidad de números introducidos y la suma de esos números.
         */

        int numero = 1;
        int contador = 0;
        int suma = 0;

        Scanner sc = new Scanner(System.in);

        while (numero != -1) {
            System.out.println("Ingrese un numero: ");
            numero = sc.nextInt();
            contador++;
            suma += numero;

        }
        System.out.println("Has introducido " + contador + " números.");
        System.out.println("La suma de esos números es igual a " + suma);

    }
}
