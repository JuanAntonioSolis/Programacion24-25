package Tema1.EjerciciosEstructuras;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        //Pide al usuario dos números y muestra la "distancia" entre ellos (el valor absoluto de su
        //diferencia, de modo que el resultado sea siempre positivo)

        int num1;
        int num2;
        int distancia;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos números para calcular su distancia");

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        distancia = Math.abs(num1 - num2);

        System.out.println("La distancia entre los 2 números es = " + distancia);
    }
}
