package Tema3.Arrays.EjerciciosClase;

/*
Programa que declare tres vectores de enteros,
10 elementos cada uno, pida por teclado los valores de vector1 y vector2 y
calcule vector3 como la suma de los anteriores y lo pinte por pantalla.

 */

import java.util.Scanner;

public class Tarea2 {

    public static void main(String[] args) {

        int vect1[] = new int[10];
        int vect2[] = new int[10];
        int vect3[] = new int[10];

        Scanner sc = new Scanner(System.in);



        for (int i = 0; i < vect1.length; i++) {
            System.out.println("Introduce un valor del primer vector:" );
            vect1[i] = Integer.parseInt(sc.nextLine());
            System.out.println("Introduce un valor del segundo vector:");
            vect2[i] = Integer.parseInt(sc.nextLine());
            vect3[i] = vect1[i] + vect2[i];
        }

        for (int i = 0; i < vect3.length; i++) {
            System.out.println(vect3[i]);
        }






    }
}
