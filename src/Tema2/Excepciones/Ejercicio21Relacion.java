package Tema2.Excepciones;

import java.util.Scanner;

public class Ejercicio21Relacion {

    public static void main(String[] args) {

        /*
        Pedir un número entero positivo N. A continuación, introducir por teclado N números enteros. Mostrar
        la media de los N números introducidos, el mayor y el menor.

         */


        int numerosAIntroducir = 0;
        int num;
        int mayor = 0;
        int menor = 0;
        int suma = 0;

        Scanner sc = new Scanner(System.in);


        try {
            System.out.println("Introduce cuántas números quieres introducir:");
            numerosAIntroducir = Integer.parseInt(sc.nextLine());

            for (int i = 1; i <= numerosAIntroducir; i++) {
                System.out.println("Dime el número " + i + " :");
                num = Integer.parseInt(sc.nextLine());
                suma = suma + num;

                if (i == 1) {
                    mayor = num;
                    menor = num;
                }

                if (num > mayor) {
                    mayor = num;
                }

                if (num < menor) {
                    menor = num;
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println("Número incorrecto");

        }

        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
        System.out.println("La media es: " + ((double)suma / numerosAIntroducir));






    }
}


