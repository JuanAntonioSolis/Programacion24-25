package Tema2.EjerciciosEstructurasAlternativas;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        /*
        Escribe un programa que resuelva una ecuación de segundo grado del tipo AX^2 + BX + C
         */

        int a;
        int b;
        int c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de a");
        a = sc.nextInt();
        System.out.println("Introduce el valor de b");
        b = sc.nextInt();
        System.out.println("Introduce el valor de c");
        c = sc.nextInt();

        double comprobacion = (Math.pow(b,2) - 4*a*c);

        if (a == 0){
            System.out.println("Error");
        } else {
            if ( comprobacion >= 0) {
                System.out.println((-b + Math.sqrt(comprobacion)) / (2*a));
                System.out.println((-b - Math.sqrt(comprobacion)) / (2*a));
            } else {
                System.out.println("Error 2");
            }
        }
    }
}
