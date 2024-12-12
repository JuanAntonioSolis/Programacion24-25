package primeraevaluacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

    public static int numero_aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void pintar(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }


    /**
     * Intercambia Columnas
     * Para dada una matriz, y dos números de columnas
     * intercambia los valores de estas entre sí.
     *
     * @param matriz
     * @param col1
     * @param col2
     */
    public static void intercambiarColumna(int matriz[][], int col1, int col2) {

        int otro;

        for (int i = 0; i < matriz.length; i++) {
                otro = matriz[i][col1];
                matriz[i][col1] = matriz[i][col2];
                matriz[i][col2] = otro;
        }
    }

    /**
     * Suma Fila
     * Dada una matriz y un número de fila, suma sus valores y los devuelve.
     *
     * @param matriz
     * @param fila
     * @return Suma de la fila
     */
    public static int sumadorFila(int matriz[][], int fila) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[fila][i];
        }

        return suma;
    }

    /**
     * Coordenadas del menor valor
     * Dada una matriz, se la recorre para identificar las coordenadas donde se encuentra el menor elemento
     *
     * @param matriz
     * @return Las coordenadas i,j donde se encuentra el menor valor de la matriz
     */
    public static String cooorMenor(int matriz[][]) {
        int menor = 100;
        int zonaFila = -1;
        int zonaCol = -1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    zonaFila = i;
                    zonaCol = j;

                }
            }
        }

        return zonaFila + "," + zonaCol;

    }

    /**
     * Ordenacion de Filas
     * Dada una matriz, con el metodo Arrays.sort ordena de menor a mayor sus filas
     *
     * @param matriz
     */
    public static void ordenaFilas(int matriz[][]) {

        for (int i = 0; i < matriz.length; i++) {
            Arrays.sort(matriz[i]);
        }

    }


    public static void main(String[] args) {

        int tabla[][] = new int[20][20];


        int opcion = -1;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = numero_aleatorio(1, 100);
            }
        }

        int columna1;
        int columna2;
        int sumaFila;

        while (opcion != 6) {
            System.out.println("1. Intercambiar dos columnas a elegir");
            System.out.println("2. Suma de una fila a elegir");
            System.out.println("3. Comprobar si las diagonales principales e inversa son iguales");
            System.out.println("4. Coordenadas del menor elemento de la matriz");
            System.out.println("5. Matriz con filas ordenadas de menor a mayor");
            System.out.println("6. Salir");

            try {
                System.out.println("Introduce una opción:");
                opcion = Integer.parseInt(sc.nextLine());

                if (opcion > 6 || opcion < 1) {
                    throw new Exception("Debes introducir una opción válida entre 1 y 6");
                }

                switch (opcion) {
                    case 1:
                        System.out.println("Introduce la primera columna");
                        columna1 = Integer.parseInt(sc.nextLine());
                        System.out.println("Introduce la segunda columna");
                        columna2 = Integer.parseInt(sc.nextLine());
                        pintar(tabla);
                        System.out.println("Arriba sin intercambiar, abajo con las columnas intercambiadas");
                        intercambiarColumna(tabla, columna1, columna2);
                        pintar(tabla);
                        break;
                    case 2:
                        try {
                            System.out.println("Introduce que fila quieres sumar (0-19)");
                            sumaFila = Integer.parseInt(sc.nextLine());
                            if (sumaFila > tabla.length - 1 || sumaFila < 0) {
                                throw new Exception("Valor de fila incorrecto");
                            }

                            pintar(tabla);
                            System.out.println("La suma de los valores de la fila " + sumaFila + " es:" + sumadorFila(tabla, sumaFila));


                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        pintar(tabla);
                        break;
                    case 4:
                        System.out.println("Las coordenadas del valor más chico de la matriz son: " + cooorMenor(tabla));
                        pintar(tabla);
                        break;
                    case 5:
                        pintar(tabla);
                        System.out.println("Arriba la matriz con filas sin ordenar, debajo con las filas ordenadas.");
                        ordenaFilas(tabla);
                        pintar(tabla);
                        break;
                    case 6:
                        System.out.println("Hasta luego, gracias por confiar en mi programa");
                        break;

                }
                sc.nextLine();

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }


    }
}
