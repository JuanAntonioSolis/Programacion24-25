package Tema3.Arrays.EjerciciosClase;

/*
Crea un programa que pida al usuario un número de mes (por ejemplo, el 4) y
diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar un vector. Para
simplificarlo vamos a suponer que febrero tiene 28 días.
 */

import java.util.Scanner;

public class Tarea1 {

    public static void main(String[] args) {

        String nombreMes[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        int diasMes[] = {31,28,31,30,31,30,31,31,30,31,30,31};

        int numeroMes;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el número del mes:");
        numeroMes = Integer.parseInt(sc.nextLine());

        System.out.println("El mes " + nombreMes[numeroMes-1] + " tiene " + diasMes[numeroMes-1] + " dias");



    }
}
