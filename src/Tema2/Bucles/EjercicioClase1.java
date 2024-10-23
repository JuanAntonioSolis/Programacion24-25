package Tema2.Bucles;

public class EjercicioClase1 {

    public static void main(String[] args) {

        /*
        Dados 2 números numero1 y numero 2, dime cuántos múltiplos de 5 hay entre ellos.
         */

        int numero1 = 120;
        int numero2 = 327;

        int contador = 0;



        for (int i = numero1; i<numero2; i++) {
            System.out.println(i);
            if (i % 5 == 0) {
                System.out.println("Es multiplo de 5");
                contador++;
            }
        }

        System.out.println("Hay " + contador + " multiplos de 5.");

    }
}
