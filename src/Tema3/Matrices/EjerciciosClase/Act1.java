package Tema3.Matrices.EjerciciosClase;

/*
Crea un matriz 6x6 de enteros. Rellénala de valores aleatorios y
dime la suma de la diagonal principal y de la diagonal secundaria.
 */

public class Act1 {

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

        int numeros[][] = new int[6][6];
        int diagonalPrincipal = 0;
        int diagonalSecundaria = 0;

        for(int i=0; i < numeros.length; i++) {
            for(int j=0; j < numeros[i].length; j++) {
                numeros[i][j] = numero_aleatorio(1, 9);
            }
        }

        pintar(numeros);

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length;j++){
                if (numeros[i] == numeros[j]) {
                    diagonalPrincipal += numeros[i][j];
                }
            }
        }

        System.out.println(diagonalPrincipal);

        for (int i = numeros.length-1; i >= 0; i--) {
            for (int j = numeros[i].length-1;j >= 0; j--) {
                if (i + j == numeros.length-1){
                    diagonalSecundaria += numeros[i][j];
                }
            }
        }

        System.out.println(diagonalSecundaria);



    }
}
