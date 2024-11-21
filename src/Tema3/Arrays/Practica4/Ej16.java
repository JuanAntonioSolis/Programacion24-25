package Tema3.Arrays.Practica4;

/*
Crea una matriz de 3x6 números enteros aleatorios NO REPETIDOS.

 */

public class Ej16 {

    public static boolean buscar(int matriz[][], int valor){

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] == valor){
                    return true;
                }
            }
        }

        return false;
    }

    public static int aleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
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

        int tabla[][] = new int[3][6];
        int valor;

        for (int i = 0; i < tabla.length; i++){
            for (int j = 0; j < tabla[i].length; j++){
                valor = aleatorio(18,1 );

                while (buscar(tabla,valor)){
                    valor = aleatorio(18,1 );
                }
                tabla[i][j] = valor;

            }
        }

        pintar(tabla);







    }
}
