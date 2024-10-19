package Tema2.EjerciciosRepaso;

import java.sql.SQLOutput;

public class Ejercicio2 {

    public static void main(String[] args) {

        /*
        Realizar un programa que genere 20 números aleatorios entre 1 y 200, que diga cuántos números pares
        han salido y cuántos impares.




        int numero = 1;
        int cuentaPar = 0;
        int cuentaImpar = 0;

        for (int i = 1; i <= 20; i++) {
            numero = (int) (Math.random() * (200-1+1)+1);
            System.out.println(numero);
            if (numero % 2 == 0) {
                cuentaPar++;
            } else
                cuentaImpar++;
        }

        System.out.println("Se han generado " + cuentaPar + " números pares");
        System.out.println("Se han generado " + cuentaImpar + " números impares");

         */



        int numero = 1;
        int i = 0;
        int cuentaPar = 0;
        int cuentaImpar = 0;

        while (i <= 20) {
            numero = (int) (Math.random()*(200-1+1)+1);
            System.out.println(numero);
            if (numero%2==0) {
                cuentaPar++;
            } else
                cuentaImpar++;
            i++;
        }

        System.out.println("Se han generado " + cuentaPar + " números pares");
        System.out.println("Se han generado " + cuentaImpar + " números impares");






    }
}
