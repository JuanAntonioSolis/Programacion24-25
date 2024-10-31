package Tema2.RelacionUnidad2;

/*

Pedir el día, mes y año de una fecha y mostrar la fecha del día siguiente (sin años bisiestos) Hacer
primero una función para determinar que la fecha introducida es correcta.

 */

import java.util.Scanner;

public class Ejercicio23 {

    public static boolean fechaCorrecta (int dia, int mes) {

        if (dia > 31) {
            System.out.println("Ningún mes tiene tantos días.");
        }
        if (mes > 12) {
            System.out.println("No tenemos tantos meses en el calendario.");
        }

        if (mes == 2) {
            if (dia > 28) {
                System.out.println("Febrero no tiene tantos días");
            }
        }

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia > 31) {
                System.out.println("El mes no tiene tantos días");
            }
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
            if (dia > 30) {
                System.out.println("El mes no tiene tantos días");
            }
        }

        /*

        switch (mes) {
            case 2:
                if (dia > 28) {
                    System.out.println("Febrero no tiene tantos días");
                }
            case 1,3,5,7,8,10,12:
                if (dia > 31) {
                    System.out.println("El mes no tiene tantos días");
                }
            case 4,6,9,11:
                if (dia > 30) {
                    System.out.println("El mes no puede tener tantos días");
                }
        }

         */
        return true;
    }



    public static void main(String[] args) {

        int dia, mes, year;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe que día es:");
        dia = Integer.parseInt(sc.nextLine());
        System.out.println("Escribe en qué mes estamos:");
        mes = Integer.parseInt(sc.nextLine());
        System.out.println("Escribe en qué año estamos:");
        year = Integer.parseInt(sc.nextLine());

        if (fechaCorrecta(dia, mes) == true) {
            System.out.println("La fecha introducida es correcta");
        } else
            System.out.println("La fecha introducida es incorrecta");


        System.out.println(fechaCorrecta(dia, mes));






    }
}
