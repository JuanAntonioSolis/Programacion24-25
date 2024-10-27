package Tema2.RelacionUnidad2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio9 {

    public static int digitos (int numero) {
        int cont = 0;
        do {
            numero = numero / 10;
            cont++;
        } while (numero > 0);
        return cont;
    }

    public static void main(String[] args) {

        /*
        Crea un metodo que, dado un número entero pasado como parámetro, devuelva cuántos digitos lo forman.
        P.ej: :el número 54326 consta de 5 dígitos. Pista: cuántas veces se puede dividir entre 10.
         */

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num = Integer.parseInt(sc.nextLine());

        System.out.println("El número " + num + " tiene " + digitos (num) + " digitos.");





    }
}
