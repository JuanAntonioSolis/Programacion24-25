package Tema2.Bucles;

public class EjercicioFaactorial {

    public static void main(String[] args) {

        /*
        Calcular el factorial de un número. Que es el producto de todos los números anteriores a el hasta el 1.
        Factorial:
        8!= 8x7x6x5x4x3x2x1
         */

        long total = 1;
        int factorial = 8;

        for (int i = factorial; i >=1; i--) {
            total = total * i;
            System.out.println("Factorial: " + i + " " + total);
        }
        System.out.println("El factorial es: " + total);
    }
}
