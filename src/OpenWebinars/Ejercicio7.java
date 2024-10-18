package OpenWebinars;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        /*
        Escribe un programa que lea dos números enteros por teclado, y realice las operaciones básicas de una
        calculadora con ellos: suma, resta, multiplicación, división y resto. Debe mostrar todos los resultados
        por consola.
         */

        int num1, num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número.");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo número.");
        num2 = sc.nextInt();

        System.out.println("La suma de esos 2 números es = " + (num1 + num2));
        System.out.println("La resta de esos 2 números es = " + (num1 - num2));
        System.out.println("La multiplicación de esos 2 números es = " + (num1 * num2));
        System.out.println("La división de esos 2 números es = " + (num1 / num2));
        System.out.println("El resto de la división de esos 2 números es = " + (num1 % num2));

    }
}
