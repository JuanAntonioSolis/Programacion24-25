package Tema3.Cadenas.Practica5;

/*
Realiza un programa que cree un array de 50 posiciones cargado con valores aleatorios.
Los valores aleatorios deberán estar entre el 1 y el 100.
Una vez cargado el vector, deberá ordenarlo mediante el metodo de la burbuja y mostrarlo ordenado por pantalla.
Para el metodo de la burbuja deberás crear una función que reciba un array de números y lo devuelva ordenado.
 */

import java.util.Arrays;

public class algOrdenacion1 {

    public static int aleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void burbuja(int arr[]) {
        Arrays.sort(arr);
    }

    public static void pintar(int numeros[]) {
        for(int i=0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int caja[] = new int[50];

        for (int i = 0; i < caja.length; i++) {
            caja[i] = aleatorio(100, 1);
        }

        pintar(caja);

        burbuja(caja);

        pintar(caja);

    }
}
