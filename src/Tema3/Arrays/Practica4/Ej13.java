package Tema3.Arrays.Practica4;

/*
Crear una tabla bidimensional de tamaño 3x4 de números enteros (Leídos desde teclado)
Mostrar la matriz y la suma de los valores de cada fila.
 */


import java.util.Scanner;

public class Ej13 {

    public static void pintar(int matriz[][]) {
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int tabla[][] = new int[3][4];
        int sumaFila1 = 0;
        int sumaFila2 = 0;
        int sumaFila3 = 0;

        Scanner sc = new Scanner(System.in);

        for (int row = 0; row < tabla.length; row++) {
            for (int col = 0; col < tabla[row].length; col++) {
                System.out.println("Introduce valores para la matriz");
                tabla[row][col] = Integer.parseInt(sc.nextLine());
            }
        }

        pintar(tabla);

        for (int row = 0; row < tabla.length; row++) {
            for (int col = 0; col < tabla[0].length; col++) {
                sumaFila1 = (tabla[0][0] + tabla[0][1] + tabla[0][2] + tabla[0][3]);
                sumaFila2 = (tabla[1][0] + tabla[1][1] + tabla[1][2] + tabla[1][3]);
                sumaFila3 = (tabla[2][0] + tabla[2][1] + tabla[2][2] + tabla[2][3]);
            }
        }

        System.out.println("La suma de la fila 1 es: " + sumaFila1);
        System.out.println("La suma de la fila 2 es: " + sumaFila2);
        System.out.println("La suma de la fila 3 es: " + sumaFila3);




    }
}
