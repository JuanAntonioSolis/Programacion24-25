package Tema2.RelacionUnidad2;

/*

Pedir el día, mes y año de una fecha y mostrar la fecha del día siguiente (sin años bisiestos) Hacer
primero una función para determinar que la fecha introducida es correcta.

 */

import java.util.Scanner;

public class Ejercicio23 {

    public static boolean fechaCorrecta (int dia, int mes) {

        boolean correcto = true;

        if (dia < 1 && dia > 31) {
            System.out.println("No es un día válido");
            correcto = false;
        }
        if (mes < 1 && mes > 12) {
            System.out.println("No es un mes válido");
            correcto = false;
        }

        switch (mes) {
            case 2:
                if (dia > 28) {
                    System.out.println("Febrero no tiene tantos días");
                    correcto = false;
                }

            case 4,6,9,11:
                if (dia > 30) {
                    System.out.println("El mes no puede tener tantos días");
                    correcto = false;
                }
        }

        return correcto;
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

        System.out.println(fechaCorrecta(dia, mes) );






    }
}
