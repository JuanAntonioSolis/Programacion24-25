package OpenWebinars.EjerciciosEstructurasControl;

import java.util.Scanner;

public class Ejercicio3 {

    /*
    Escribe un programa que pida un número por teclado y diga cuántos dígitos tiene.
     */

    public static void main(String[] args) {

        int num;
        int cont = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número:");
        num = Integer.parseInt(sc.nextLine());

        do {
            num = num / 10;
            cont++;
        } while (num > 0);

        System.out.println("El número tiene " + cont + " dígitos.");

    }
}
