package Tema2.FuncionesYMetodos;

public class EjemploFuncionesMultiplo {

    public static boolean multiplo (int a, int b) {
        /**
         * Metodo que dice si el 2do número es mútiplo del 1ro
         * a
         * b
         * true / false
         */

        if (a % b == 0) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {

        /*
        Crea una función que te diga si un número es múltiplo de otro
        Pruébala con 2 números cualquiera.
         */

        int num1 = 25;
        int num2 = 5;

        System.out.println(multiplo(num1,num2));

    }
}
