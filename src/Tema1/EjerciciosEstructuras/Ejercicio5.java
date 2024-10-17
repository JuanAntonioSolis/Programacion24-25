package Tema1.EjerciciosEstructuras;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        //Calcular la media de 3 números pedidos por teclado:

        int num1, num2, num3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 3 números : ");

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        System.out.println("La media de esos 3 números es: " + ((num1 + num2 + num3) / 3));
    }
}
