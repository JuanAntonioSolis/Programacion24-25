package Tema3.Arrays.Practica4;

/*
Crear dos matrices 3x3 de números enteros aleatorios, pintarlas, sumarlas y mostrar su suma.
El resultado será también una matriz(suma) donde cada elemento será la suma de los elementos
de las otras matrices en la misma posición.
*/

public class Ej15 {

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

    public static void main(String[] args) {

        int tabla1[][] = new int[3][3];
        int tabla2[][] = new int[3][3];
        int suma[][] = new int[3][3];

        for (int i = 0; i < tabla1.length; i++) {
            for (int j = 0; j < tabla1.length; j++) {
                tabla1[i][j] = numero_aleatorio(1,9);
            }
        }

        for (int i = 0; i < tabla1.length; i++) {
            for (int j = 0; j < tabla1.length; j++) {
                tabla2[i][j] = numero_aleatorio(1,9);
            }
        }

        pintar(tabla1);
        System.out.println();
        pintar(tabla2);

        for (int i = 0; i < tabla1.length; i++) {
            for (int j = 0; j < tabla1.length; j++) {
                suma[i][j] = tabla1[i][j] + tabla2[i][j];
            }
        }

        System.out.println();
        pintar(suma);





    }
}
