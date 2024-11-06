package Tema2.PracticaClaseEvaluable;

/*
Realiza un programa que pida un número por teclado. Luego muestra un menú con las
siguientes opciones:
1. Muestra la suma de cada uno de sus dígitos
2. Que diga si es primo o no
3. La longitud de una circunferencia cuyo radio fuera ese número
4. Salir
Para cada una de las opciones deberás llamar a una función que calcule lo que se pide y
devuelva el resultado.
 */

import java.util.Scanner;

public class Ejercicio1Menu {

    public static int sumaDigitos (int num) {
        int total = 0;

        while (num > 0) {
            total += num % 10;
            num = num / 10;
        }

        return total;

    }

    public static boolean primo(int num) {

        boolean primo = true;

        for (int i = num - 1; i >= 2; i--) {
            if (num % i == 0) {
                primo = false;
            }
        }

        return primo;
    }

    public static double longitudCircunferencia (int num) {

        return 2 * (Math.PI * num);
    }

    /*
    public static int sumaDigitos (int num) {

    }

     */

    public static void main(String[] args) {

        int num;
        int opcion = -1;

        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un número:");
        num = Integer.parseInt(sc.nextLine());

        while (opcion != 4) {

            System.out.println("1. Mostrar la suma de sus dígitos.");
            System.out.println("2. Primo o no primo.");
            System.out.println("3. Longitud de una circunferencia con ese radio.");
            System.out.println("4. Salir");

            System.out.println("Elige una de las opciones:");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("La suma de sus dígitos es: " + sumaDigitos (num));
                    break;
                case 2:
                    if (primo(num)) {
                        System.out.println("El número es primo.");
                    } else
                        System.out.println("El número no es primo.");
                    break;
                case 3:
                    System.out.println("La longitud de una circunferencia con ese radio es " + longitudCircunferencia(num));
                    break;
                case 4:
                    System.out.println("Fin.");
                    break;
                default:
                    System.out.println("Opción escogida incorrecta.");
            }
        }






    }
}
