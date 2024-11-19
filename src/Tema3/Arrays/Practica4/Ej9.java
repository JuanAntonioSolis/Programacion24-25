package Tema3.Arrays.Practica4;

/*
Realizar un programa que lea los tiempos en los que de 10 corredores han acabado una carrera. El programa debe
determinar qué corredores tienen el primer, segundo y último puesto, así como cuál es el tiempo medio en que
se ha corrido la carrera. Pista: ordénalo antes.

DUDA PROFESOR
 */

import java.util.Arrays;

public class Ej9 {

    public static int aleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static double primero(double arr[]) {
        double first = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < first) {
                first = arr[i];
            }
        }

        return first;
    }


    public static double ultimo(double arr[]) {
        double last = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > last) {
                last = arr[i];
            }
        }

        return last;
    }



    public static void main(String[] args) {

        int tiempos[] = new int[9];
        double tiemposOrdenados[] = new double[9];
        int suma = 0;

        /*
        for (int i = 0; i < tiempos.length; i++) {
            tiempos[i] = aleatorio(4.20,4.00);
        }

        for (int i = 0; i < tiempos.length; i++) {
            System.out.println(tiempos[i]);
        }

        System.out.println("El ganador tiene un tiempo de " + primero(tiempos));
        System.out.println("El último tiene un tiempo de " + ultimo(tiempos));

         */

        for (int i = 0; i < tiempos.length; i++) {
            tiempos[i] = aleatorio(200,10);
            suma += tiempos[i];
        }

        Arrays.sort(tiempos);

        System.out.println("El primero en llegar hace un tiempo de " + tiempos[0] + " minutos");
        System.out.println("El segundo en llegar hace un tiempo de " + tiempos[1] + " minutos");
        System.out.println("El último en llegar hace un tiempo de " + tiempos[tiempos.length-1] + " minutos");
        System.out.println("La media de tiempos es " + suma / tiempos.length + " minutos");







    }
}
