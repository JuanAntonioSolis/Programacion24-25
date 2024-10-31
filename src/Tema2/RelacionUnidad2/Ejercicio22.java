package Tema2.RelacionUnidad2;

/*
Pedir un número entre 1 y 9999 y decir si es capicúa.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio22 {

    public static int capicua (int num) {

        int unidades, decenas, centenas, miles;
        unidades = num / 1000;
        num = num % 1000;
        decenas = num / 100;
        num = num % 100;
        centenas = num / 10;
        num = num % 10;
        miles = num;

        num = (miles * 1000) + (centenas * 100) + (decenas * 10) + unidades;

        return capicua(num);
    }

    public static void main(String[] args) {

       int numero = 0;

       Scanner sc = new Scanner(System.in);


        System.out.println(capicua(numero));











    }
}
