package Tema3.Matrices.EjerciciosClase;

/*
Crea una matriz 7x3 de double. Rellénala de valores aleatorios y
dime la suma de cada una de las columnas
 */

public class Act2 {

    public static double numero_aleatorio(double min , double max){
        return (Math.random()*(max-min+1) +min);
    }

    public static void pintar(double matriz[][]) {
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        double valores[][] = new double[7][3];
        double sumaColumna = 0;

        for(int i=0; i < valores.length; i++) {
            for(int j=0; j < valores[i].length; j++) {
                valores[i][j] = numero_aleatorio(1, 9);
            }
        }

        pintar(valores);

        for (int j = 0; j < valores[0].length; j++) {
            for (int i = 0; i < valores.length; i++) {
                sumaColumna += valores[i][j];
            }

            System.out.println("Columna " + j + " es igual a " + sumaColumna );
            sumaColumna = 0;
        }




    }
}
