package Tema3.Arrays.Practica4;

/*
Crea una matriz de enteros de dos dimensiones de 50x50 elementos,
rellénala con números aleatorios entre 1 y 500. A continuación, realiza dos funciones:

    a. ordenaFilas(matriz): que ordene la matriz por filas, cada fila de la matriz quedará
    ordenada de menor a mayor.
    b. ordenaColumnas(matriz): que ordene la matriz por columnas, cada columna quedará ordenada de
    menor a mayor, independientemente de las demás.


 */


import java.util.Arrays;

public class Ej17 {

    public static int numero_aleatorio(int min , int max){
        return (int) (Math.random()*(max-min+1) +min);
    }

    public static void pintar(int matriz[][]) {
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ordenaFilas (int matriz[][]) {

        for (int i = 0; i < matriz.length; i++) {
            Arrays.sort(matriz[i]);
        }

    }

    public static void ordenaColumnas (int matriz[][]) {

        for (int i = 0; i < matriz[i].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                Arrays.sort(matriz[j]);
            }
        }



    }



    public static void main(String[] args) {

        int tabla[][] = new int[5][5];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++){
                tabla[i][j] = numero_aleatorio(1,500);
            }
        }

        pintar(tabla);

        System.out.println();
        ordenaFilas(tabla);
        pintar(tabla);
        ordenaColumnas(tabla);
        System.out.println();
        pintar(tabla);

    }
}
