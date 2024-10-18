package OpenWebinars;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        /*
        Realiza un programa que calcule la nota media de un alumno en la asignatura Programación
        La nota media se calcula como el promedio de las 3 notas trimestrales.
        Muestra la nota promedio redondeada y además, muestra un mensaje que indique si el alumno está APROBADO
        o SUSPENSO.
         */

        double  nota1, nota2, nota3;
        double notaFinal;
        double notaRedondeada;


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la nota del 1er Trimestre:");
        nota1 = sc.nextDouble();
        System.out.println("Ingresa la nota del 2do Trimestre:");
        nota2 = sc.nextDouble();
        System.out.println("Ingresa la nota del 3er Trimestre:");
        nota3 = sc.nextDouble();

        notaFinal = (nota1 + nota2 + nota3) / 3;
        notaRedondeada = Math.round(notaFinal);


        System.out.println("La nota media del curso sin redondear es: " + notaFinal);
        System.out.println("La nota media del alumno es " + notaRedondeada);

        if (notaRedondeada >= 5) {
            System.out.println("El alumno está APROBADO");
        } else
            System.out.println("El alumno está SUSPENSO");


    }
}
