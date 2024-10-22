package Tema2.Bucles;

import java.util.Scanner;

public class Ejercicio2Bucles {

    public static void main(String[] args) {

        /*
        Algoritmo que pida números hasta que se introduzca un cero.
        Debe imprimir la suma y la media de todos los números introducidos.
         */

        int num;
        int suma = 0;
        int media;
        int cont = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce un número");
            num = sc.nextInt();
            suma = suma + num;
            if (num!=0) {
                cont++;
            }
            media = suma / cont;
        } while (num != 0);

        System.out.println("La suma de los números es: " + suma + " y la media es " + media);

    }
}
