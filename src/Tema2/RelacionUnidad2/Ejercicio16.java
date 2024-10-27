package Tema2.RelacionUnidad2;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {


        /*
        Programa que lea por teclado una seria de números enteros hasta que introduzca el -1 y obtenga su
        media. Deberá mostrarla por pantalla.
         */

        int num, suma, cont;
        suma = 0;
        num = 0;
        cont = 0;

        Scanner sc = new Scanner(System.in);


        while (num != -1) {
            System.out.println("Escribe un número entero:");
            num = sc.nextInt();
            if (num != -1) {
                suma+=num;
                cont++;
            }


        }
        System.out.println("La media de todos esos números es " + suma/cont);
    }
}
