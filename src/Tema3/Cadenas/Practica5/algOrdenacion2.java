package Tema3.Cadenas.Practica5;

/*
Mejora el metodo de la burbuja explicado anteriormente y utiliza una variable a modo de centinela o flag,
de tal manera que ésta se active cuando hay algún intercambio. En el momento que no haya ningún intercambio,
el algoritmo debería parar puesto que el vector ya está ordenado.
 */

import java.util.Arrays;

public class algOrdenacion2 {

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
