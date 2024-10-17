package Tema1.EjerciciosEstructuras;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        //Realiza un programa que reciba una cantidad de minutos  y muestre por pantalla a cuantas horas y
        //minutos corresponde.
        //Por ejemplo: 1000 minutos son 16 horas y 40 minutos.

        int minutos;
        int horas;
        int minutosHoras;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero de minutos: ");


        minutos = sc.nextInt();

        horas = minutos / 60;
        minutosHoras = minutos % 60;


        System.out.println(minutos + " minutos son " + horas + " horas y " + minutosHoras + " minutos.");
    }
}
