package Tema2.EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        /*
        Realiza una función que calcule el máximo de 3 números. Pruébala.
         */

        int num1, num2, num3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        num1 = sc.nextInt();
        System.out.println("Ingresa el segundo número:");
        num2 = sc.nextInt();
        System.out.println("Ingresa el tercer número:");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El máximo es " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El máximo es " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.printf("El máximo es " + num3);
        }




    }
}
