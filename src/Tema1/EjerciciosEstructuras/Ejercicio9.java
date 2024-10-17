package Tema1.EjerciciosEstructuras;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        //Pide al usuario dos pares de números (x1, y1) y (x2, y2), que representen dos puntos en el plano.
        //Calcula  y muestra la diferencia entre ellos.

        int x1, y1, x2, y2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el valor de x1:");
        x1 = sc.nextInt();
        System.out.println("Escribe el valor de y1:");
        y1 = sc.nextInt();
        System.out.println("Escribe el valor de x2:");
        x2 = sc.nextInt();
        System.out.println("Escribe el valor de y2:");
        y2 = sc.nextInt();

        double  distancia = Math.sqrt( Math.pow(x2-x1,2) + Math.pow (y2-y1,2));

        System.out.println("La distancia entre (" + x1 + ", " + y1 + ") y (" + x2 + ", " + y2 + ") es igual a " + distancia);
    }
}
