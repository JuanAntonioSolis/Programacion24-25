package Tema2.RelacionUnidad2;

import java.util.Scanner;

public class Ejercicio1 {

    public static int mayor (int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else if (c > a && c > b) {
            return c;
        } else
            return c;
    }

    public static int mayorDeCuatro (int a, int b, int c, int d) {
        return mayor( mayor(a,b,c), mayor(d,d,d), mayor(0,0,0) );
    }



    public static void main(String[] args) {

        /*
        Crea una función (método) que reciba como parámetros tres números enteros y devuelva el mayor de
        los tres números. Utilizar esa función para el calcular el mayor de cuatro números enteros. Sería así:
        public int mayor (int a, int b, int c) { … }
         */

        int num1 = 5;
        int num2 = 8;
        int num3 = 3;
        int num4 = 10;

        //Scanner sc = new Scanner(System.in);
        //System.out.println("Introduce el 1er número");
        //num1 = Integer.parseInt(sc.nextLine());
        //System.out.println("Introduce el 2do número");
        //num2 = Integer.parseInt(sc.nextLine());
        //System.out.println("Introduce el 3er número");
        //num3 = Integer.parseInt(sc.nextLine());



        System.out.println("El mayor de los 3 números es el " + mayor(num1, num2 ,num3));

        System.out.println("El mayor de los 4 números es el " + mayorDeCuatro(num1, num2, num3, num4));



    }
}
