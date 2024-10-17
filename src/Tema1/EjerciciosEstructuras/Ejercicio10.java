package Tema1.EjerciciosEstructuras;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        //Realizar un algoritmo que lea un número y que muestre su raíz cuadrada y su raíz cúbica.
        //PSeInt no tiene ninguna funcion predefinida que permita calcular la raiz cúbica, ¿Cómo se puede calcular?

        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número ");

        numero = sc.nextInt();

        System.out.println("La raiz cuadrada de ese número es: " + Math.sqrt(numero));
        System.out.println("La raiz cúbica de ese número es: " + Math.cbrt(numero));
    }
}
