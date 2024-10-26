package Tema2.RelacionUnidad2;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        /*
        Programa que lea un número positivo de un dígito por teclado y diga en letra a qué digito corresponde
        (uno, dos, tres, cuatro...). Ejemplo: si se introduce el 1, se mostrará por pantalla el "uno"; si se introduce
        el 11, se mostrará el mensaje "Error: no es un número de un dígito".
         */

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número de un dígito:");
        num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Siete");
                break;
            case 8:
                System.out.println("Ocho");
                break;
            case 9:
                System.out.println("Nueve");
                break;
            default:
                System.out.println("Error, no es un número de un dígito.");
        }
    }
}
