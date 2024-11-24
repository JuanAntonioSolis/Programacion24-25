package Tema3.Arrays.Practica4;

/*
Escribe un programa que genere al azar 20 números enteros comprendidos entre 0 y 9.
Estos números se deben introducir en un array de 4 filas por 5 columnas.
El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara.
La suma total debe aparecer en la esquina inferior derecha.
 */

public class Ej18 {

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

    public static int sumarFila(int arr[][]){
        int suma = 0;
        for(int i=0; i < arr.length; i++) {
            suma += arr[i][i];
        }
        return suma;
    }


    public static void main(String[] args) {

        int tabla[][] = new int[5][6];
        int total = 0;
        int suma = 0;


        for (int i = 0; i < tabla.length-1; i++) {
            for (int j = 0; j < tabla[i].length-1; j++) {
                tabla[i][j] = numero_aleatorio(0,9);//Asigna valores aleatorios
                total += tabla[i][j];//Acumulador para calcular el total
            }
        }

        //La posición final es igual al total de todos los valores de la matriz
        for (int i = 0; i < tabla.length-1; i++) {
            for (int j = 0; j < tabla[i].length-1; j++) {
                tabla[tabla.length-1][tabla[i].length-1] = total;
            }
        }

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][tabla[i].length-1] = sumarFila(tabla);
            }
        }





        pintar(tabla);








    }
}
