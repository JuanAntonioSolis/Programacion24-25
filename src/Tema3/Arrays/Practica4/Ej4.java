package Tema3.Arrays.Practica4;

/*
Programa Java para leer la altura de N personas y calcular la altura media. Calcular cuántas personas tienen una
altura superior a la media y cuántas tienen una altura inferior a la media. El valor de N se pide por teclado y debe
ser entero positivo.
 */

import java.util.Scanner;

public class Ej4 {

    public static double aleatorio(double mayor, double menor) {
        return (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void main(String[] args) {

        int numeroPersonas;
        double media = 1.62;
        int contBajos = 0;
        int contAltos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe de cuántas personas quieres calcular las alturas: ");
        numeroPersonas = Integer.parseInt(sc.nextLine());


        double alturas[] = new double[numeroPersonas];

        for (int i = 0; i < alturas.length; i++) {
            alturas[i] = aleatorio(1.95,1.45);
            if (alturas[i] > media) {
                contAltos++;
            } else
                contBajos++;
        }

        System.out.println(contAltos + " están por encima de la media");
        System.out.println(contBajos + " están por debajo de la media");


    }
}
