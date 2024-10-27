package Tema2.RelacionUnidad2;

public class Ejercicio13 {

    public static void main(String[] args) {

        /*
        Programa que muestre por pantalla los números del 1 al 100 sin mostar los que sean múltiplos de 5.
         */

        int numero, cont;
        numero = 1;

        do {
            numero++;
            if (numero % 5 != 0) {
                System.out.println(numero);
            }
        } while (numero<100);
    }
}
