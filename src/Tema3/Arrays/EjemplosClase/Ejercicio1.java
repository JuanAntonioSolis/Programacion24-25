package Tema3.Arrays.EjemplosClase;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        /*
        Pide 5 números double por teclado
        Guardalos en una array
        Pinta el array entero.
         */

        double numeros[] = new double[5];
        Scanner sc = new Scanner (System.in);

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Escribe un valor:");
            numeros[i] = Double.parseDouble(sc.nextLine());
        }

        for (int i = 0;i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}
