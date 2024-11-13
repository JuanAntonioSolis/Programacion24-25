package Tema3.Arrays.EjerciciosClase;

/*
Genera un vector de 20 elementos enteros y rellénalo con los 20 primeros números primos.
 */

public class Tarea6 {

    public static boolean calculoPrimo(int num) {
        boolean primo = true;
        for (int i = num - 1; i>=2;i--) {
            if (num % i == 0) {
                primo = false;
            }
        }

        return primo;
    }

    public static void main(String[] args) {

        int numeros[] = new int[20];

        int contPrimos = 0;

        int num = 1;

        while (contPrimos < 20) {
            if (calculoPrimo(num)) {
                numeros[contPrimos] = num;
                contPrimos++;
            }
            num++;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}
