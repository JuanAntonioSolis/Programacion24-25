package Tema2.Bucles;

import java.util.Scanner;

public class EjercicioNumerosPrimos {

    public static void main(String[] args) {

        /*
        Introduce un número y di es un número primo o no.
        Primo: solo divisible entre él mismo y el 1.
        Indicador.
        Ex. 7 --> 7/6 resto =! 0, 7/5 resto != 0,...7/2 != 0.
        Si algun resto da 0, significa que no es primo.
         */

        int numero;
        boolean primo = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        numero = sc.nextInt();

        for (int i = numero - 1; i >= 2; i--) {
            if (numero % i == 0) {
                primo = false;
            }
        }

        if (primo) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }


    }
}
