package Tema3.PruebaExamen;

/*
Nos piden crear una matriz 20x20 de números enteros que inicialmente rellenamos
de valores aleatorios (1-100), nos piden hacer un menú con estas opciones:

1. Intercambiar fila. Te pedirá dos números de fila e intercambiará los valores
de la primera por los valores de la segunda.
2. Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
3. Sumar la diagonal principal y la diagonal inversa, y mostar las 2 sumas.
4. Pintar las coordenadas i,j donde se encuentra el mayor elemento de la matriz.
5. Pintar la matriz traspuesta.
6. Muestra la matriz con las filas ordenadas de mayor a menor.
7. Salir
 */

import java.util.Scanner;

public class Ejercicio1 {

    public static void intercambiarFila(int matriz[][], int fila1, int fila2) {

        int otro = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                otro = matriz[fila1][j];
                matriz[fila1][j] = matriz[fila2][j];
                matriz[fila2][j] = otro;
            }
        }
    }

    public static int sumaColumna (int matriz[][], int colummna) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][colummna];
        }



        return suma;
    }

    public static int diagonalPrincipal(int matriz[][]) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length;j++){
                if (matriz[i] == matriz [j]) {
                    suma += matriz[i][j];
                }
            }
        }

        return suma;
    }

    public static int diagonalInversa(int[][] matriz) {
        int suma = 0;

        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz[i].length - 1; j >= 0; j--) {
                if (i + j == matriz.length - 1) {
                    suma += matriz[i][j];
                }
            }
        }

        return suma;
    }

    public static String cooorMayor (int matriz[][]) {
        int mayor = 0;
        int zonaFila = -1;
        int zonaCol = -1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    zonaFila = i;
                    zonaCol = j;

                }
            }
        }

        return zonaFila + "," + zonaCol;

    }

    public static void trasponerMatriz(int matriz[][]) {
        int temp=0;
        for(int k=0; k<matriz.length; k++) {

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 1; j < matriz[0].length; j++) {

                }
            }

        }

        //matriz[0][0], matriz[1][0], matriz[2][0] ...
    }

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

        int matriz[][] = new int[5][5];

        int opciónMenu = -1;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numero_aleatorio(1, 100);
            }
        }


        int primeraFila;
        int segundaFila;
        int columaSuma;


        while (opciónMenu != 7) {
            System.out.println("1. Intercambiar dos filas.");
            System.out.println("2. Suma de los valores de una columna a elegir.");
            System.out.println("3. Suma de la diagonal principal e inversa.");
            System.out.println("4. Coordenadas del mayor valor de la matriz.");
            System.out.println("5. Pintar la matriz traspuesta");
            System.out.println("6. Mostrar la matriz con las filas ordenadas.");
            System.out.println("7. Salir");

            System.out.println("Introduce opción elegida: ");
            opciónMenu = Integer.parseInt(sc.nextLine());

            switch (opciónMenu) {
                case 1:
                    System.out.println("Has elegido la primera opción, introduce dos líneas " +
                            "a intercambiar(0-4):");
                    primeraFila = Integer.parseInt(sc.nextLine());
                    segundaFila = Integer.parseInt(sc.nextLine());
                    intercambiarFila(matriz, primeraFila, segundaFila);

                    pintar(matriz);
                    break;
                case 2:
                    System.out.println("Has elegido la segunda opción, selecciona que columna quieres sumar(0-4):");
                    columaSuma = Integer.parseInt(sc.nextLine());
                    pintar(matriz);
                    System.out.println("La suma de los valores de esa columna = " + sumaColumna(matriz,columaSuma));
                    break;
                case 3:
                    System.out.println("Has elegido la tercera opción");
                    pintar(matriz);
                    System.out.println("La suma de la diagonal principal es = " + diagonalPrincipal(matriz));
                    System.out.println("La suma de la diagonal inversa es = " + diagonalInversa(matriz));
                    break;
                case 4:
                    System.out.println("Las coordenadas del valor mas grande de la matriz son: " + cooorMayor(matriz));
                    pintar(matriz);
                    break;
                case 5:
                    System.out.println("Has elegido la quinta opción, la matriz traspuesta:");
                    pintar(matriz);
                    trasponerMatriz(matriz);
                    pintar(matriz);

            }

        }




    }
}
