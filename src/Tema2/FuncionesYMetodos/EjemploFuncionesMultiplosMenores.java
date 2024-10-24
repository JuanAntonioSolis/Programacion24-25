package Tema2.FuncionesYMetodos;

public class EjemploFuncionesMultiplosMenores {

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
        Pinta todos los mútiplos de un número
         */

        int num = 35;

        for (int i = num - 1; i > 1; i--) {
            if (multiplo(num,i)) {
                System.out.println(i);
            }
        }

    }
}
