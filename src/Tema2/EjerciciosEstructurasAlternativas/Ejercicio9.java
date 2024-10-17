package Tema2.EjerciciosEstructurasAlternativas;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        /*

        Escribe un programa que pida un número entero entre uno y doce e imprima el número de días que tiene
        el mes correspondiente.

         */

        int días;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de un mes");
        días = sc.nextInt();

        if (días == 1){
            System.out.println("Enero tiene 31 días");
        } else if (días == 2){
            System.out.println("Febrero tiene 28 días en un año no bisiesto y 29 en uno bisiesto");
        } else if (días == 3){
            System.out.println("Marzo tiene 31 días");
        } else if (días == 4){
            System.out.println("Abril tiene 30 días");
        } else if (días == 5) {
            System.out.println("Mayo tiene 31 días");
        } else if (días == 6){
            System.out.println("Junio tiene 30 días");
        } else if (días == 7){
            System.out.println("Julio tiene 31 días");
        } else if (días == 8){
            System.out.println("Agosto tiene 31 días");
        } else if (días == 9){
            System.out.println("Septiembre tiene 30 días");
        } else if (días == 10){
            System.out.println("Octubre tiene 31 días");
        } else if (días == 11){
            System.out.println("Noviembre tiene 30 días");
        } else if (días == 12){
            System.out.println("Diciembre tiene 31 días");
        }
    }
}
