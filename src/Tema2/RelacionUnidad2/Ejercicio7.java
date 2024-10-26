package Tema2.RelacionUnidad2;

import java.util.Scanner;

public class Ejercicio7 {
    //El factorial de un número es ex. 10 = 10*9*8*7*6*5*4*3*2*1 (Realmente no es necesario multiplicar el 1 del final)
    public static long factorial(int numero) { //Ponemos long, porque el resultado que queremos mostrar será un long.
        //Además cuando no ponemos el void, sino tipo de variable (long en este caso) y su nombre (factorial), la función
        //nos devuelve un valor

        long total = 1; //Inicializamos una nueva variable a 1 para ir multiplicando dentro del bucle for

        for (int i = numero; i > 1; i--) { //Para i = numero (10porejemplo);i hasta 1(puede ser 2 tmb); 10-- (10-1)
            total = total * i; //Total = 1 * 10, 10 * 9, 90 * 8, 720 * 7..., total * 1 (que tmb puede ser hasta 2)
        }

        return total; //Nos devuelve dentro del main, el valor de total, habiendo introducido ya un valor en el main
    }

    public static void main(String[] args) {

        /*
        Funcion que calcule el factorial de un número entero positivo pasado cómo parámetro.
         */

        int numero;


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();

        System.out.println("El factorial es: " + factorial(numero)); //Cuando aquí ponemos factorial

    }
}
