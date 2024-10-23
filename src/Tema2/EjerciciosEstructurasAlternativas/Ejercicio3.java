package Tema2.EjerciciosEstructurasAlternativas;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        /*
        Crea un programa que pida al usuario dos números y muestre su división si el segundo no es cero,
        o un mensaje de aviso en caso contrario.
         */

        double num1, num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();

        if (num2 != 0){
            System.out.println("La división de los dos números es " + (num1 / num2));
        } else
            System.out.println("ERROR, el segundo número es un 0");

    }
}
