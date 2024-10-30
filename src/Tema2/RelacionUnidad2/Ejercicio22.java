package Tema2.RelacionUnidad2;

/*
Pedir un número entre 1 y 9999 y decir si es capicúa.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {

        int num;
        boolean error = true;
        Scanner sc = new Scanner(System.in);

        while (error) {
            try {
                System.out.println("Ingrese un numero entre 1 y 9999: ");
                num = sc.nextInt();
                if (num < 1 || num > 9999) {
                    throw new Exception("Valor incorrecto");
                }
                error = false;

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        /*
        try {
            System.out.println("Ingrese un numero entre 1 y 9999: ");
            num = sc.nextInt();
            if (num < 1 || num > 9999) {
                throw new Exception("Valor incorrecto");
            }
            error = false;

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

         */



    }
}
