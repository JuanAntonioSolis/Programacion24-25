package Tema1.EjerciciosIntroduccion;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        //Realiza un programa en Java con una variable entera t la cual contiene un tiempo en segundos y queremos
        //conocer este tiempo, pero expresado en horas, minutos y segundos.

        int segundos;
        int minutos;
        int horas;
        int segundosRestantes;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cantidad de segundos:");

        segundos = sc.nextInt();

        minutos = (segundos / 60) %60;
        horas = segundos / 3600;
        segundosRestantes = segundos % 60;

        System.out.println(segundos + " segundos equivalen a: " + horas + " horas, " + minutos + " minutos y " + segundosRestantes + " segundos");


    }
}
