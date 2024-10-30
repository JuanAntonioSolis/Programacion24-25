package Tema2.RelacionUnidad2;

/*
Pedir un número entero positivo N. A continuación, introducir por teclado N números enteros. Mostar la media
de los N números introducidos, el mayor y el menor.
 */

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {

        int numerosIntroducir = 0;
        int num;
        int mayor = 0;
        int menor = 0;
        int suma = 0;

        Scanner sc = new Scanner(System.in);



        try {
            System.out.println("Escribe un número entero:");
            numerosIntroducir = Integer.parseInt(sc.nextLine());

            for (int i = 1; i <= numerosIntroducir; i++) {
                System.out.println("Dime el " + i + " número:");
                num = Integer.parseInt(sc.nextLine());
                suma += num;

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
        } catch (Exception ex) {
            System.out.println("Numero introducido incorrecto");
        }

        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
        System.out.println("La media es: " + ((double)suma / numerosIntroducir));




    }





}
