package Tema2.Bucles;

import java.util.Scanner;

public class EjemploDoWhile {

    public static void main(String[] args) {

        //Pide contraseña por teclado menor de 8 carácteres.
        /*

        Scanner sc = new Scanner(System.in);

        String contraseña;

        do{
            System.out.println("Escribe una contraseña");
            contraseña = sc.nextLine();
        } while (contraseña.length() < 8);

        System.out.println("Tu contraseña es " + contraseña);

         */

        //Muestra los números del 1 al 10 usando Do While.

        int numero = 1;

        do{
            System.out.println(numero);
            numero++;
        } while (numero <= 10);
    }
}
