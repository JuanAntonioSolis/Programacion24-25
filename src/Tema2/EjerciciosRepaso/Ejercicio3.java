package Tema2.EjerciciosRepaso;

public class Ejercicio3 {

    public static void main(String[] args) {

        /*
        Muestra todos los números divisibles entre 7 entre el número 500 y el 1.
         */

        int numero = 1;

        while (numero <= 500) {
            if (numero % 7 == 0) {
                System.out.println(numero);
            }
            numero++;
        }


    }
}
