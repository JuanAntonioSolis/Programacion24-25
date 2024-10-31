package Tema2.RelacionUnidad2;

/*
Pedir un número entre 1 y 9999 y decir si es capicúa.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio22 {

    public static int capicua (int num) {
        int numeroBS = 0;
        int unidades, decenas, centenas, miles;



        unidades = num / 1000;
        num = num % 1000;
        decenas = num / 100;
        num = num % 100;
        centenas = num / 10;
        miles = num % 10;




/*
        unidades = num / 1000;
        decenas = (num % 1000) / 100;
        centenas = ((num % 1000) % 100) / 10;
        miles = ((num % 1000) % 100) % 10;

 */



        //numeroBS = (miles * 1000) + (centenas * 100) + (decenas * 10) + unidades;



        numeroBS = miles + centenas * 10 + decenas * 100 + unidades * 1000;

        return numeroBS;
    }

    public static void main(String[] args) {

       int numero = 0;

       Scanner sc = new Scanner(System.in);

       try {
           System.out.println("introduce un número.");
           numero = Integer.parseInt(sc.nextLine());
       } catch (Exception e) {
           System.out.println("Error con el número");
       }

        System.out.println(capicua(numero));
        System.out.println(numero);

       if (capicua(numero) == numero) {
           System.out.println("Es un número capicúa");
       } else
           System.out.println("No es un número capicúa");











    }
}
