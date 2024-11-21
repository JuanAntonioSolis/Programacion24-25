package Tema3.Arrays.Practica4;

/*
Crear una matriz 5x3 de números enteros(aleatorios) y mostar el menor, el mayor y la media de los elementos.

 */
public class Ej14 {

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

    public static int menor(int matriz[][]) {

        int menor = matriz[0][0];

        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                if(matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        return menor;
    }

    public static int mayor(int matriz[][]) {

        int mayor = matriz[0][0];

        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                if(matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }

        return mayor;
    }


    public static void main(String[] args) {

        int tabla[][] = new int[5][3];

        double suma = 0;

        for(int i=0; i < tabla.length; i++) {
            for(int j=0; j < tabla[i].length; j++) {
                tabla[i][j] = numero_aleatorio(10,100);
                suma += tabla[i][j];
            }
        }

        pintar(tabla);

        System.out.println("El menor valor de la tabla es " + menor(tabla));
        System.out.println("El mayor valor de la tabla es " + mayor(tabla));
        System.out.println("La media de los elementos de tabla es " + suma/tabla.length);








    }
}
