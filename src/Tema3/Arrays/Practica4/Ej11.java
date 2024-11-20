package Tema3.Arrays.Practica4;

/*
Crear una tabla bidimensional de tamaño 5x5 y rellenarla de forma
que los elementos de la diagonal principal sean 1 y el resto 0.
Mostrarla.
 */

public class Ej11 {

    public static void pintar(int matriz[][]) {
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int tabla[][] = new int[5][5];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length;j++){
                if (tabla[i] == tabla[j]) {
                    tabla[i][j] = 1;
                }
            }
        }

        pintar(tabla);


    }
}
