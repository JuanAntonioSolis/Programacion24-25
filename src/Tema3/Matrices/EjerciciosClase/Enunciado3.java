package Tema3.Matrices.EjerciciosClase;

/*
Simulación de contaminación

Tenemos una ciudad dividida en cuadrantes, una matriz NxM, decide tú.

Cada celda contiene un número entre 0 y 100 indicando el nivel de contaminación.

Pinta una nueva matriz, marcando con un 0 las zonas con contaminación menor a un umbral,

p. ej. 10, con un 1 las zonas entre 10 y 80, y con un 2 las zonas con más de 80.

Dime las coordenadas (i,j) de las zonas con más de 80 de contaminación

Dime también el nivel de contaminación promedio de la ciudad

 */

public class Enunciado3 {

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

        int niveles[][] = new int[3][3];
        int emisiones[][] = new int[3][3];
        int suma = 0;
        int zonasContaminantes[][] = new int[3][3];

        for (int i = 0; i < niveles.length; i++) {
            for (int j = 0; j < niveles.length; j++) {
                niveles[i][j] = numero_aleatorio(0,100);
            }
        }

        pintar(niveles);

        for (int i = 0; i < niveles.length; i++) {
            for (int j = 0; j < niveles.length; j++) {
                if (niveles[i][j] < 10) {
                    emisiones[i][j] = 0;
                } else if (niveles[i][j] > 10 && niveles[i][j] < 80) {
                    emisiones[i][j] = 1;
                } else if (niveles[i][j] > 80) {
                    emisiones[i][j] = 2;
                    System.out.println("Zona peligrosa: (" + i + "," + j + ")");
                }

            }
        }

        pintar(emisiones);

        for (int i = 0; i < niveles.length; i++) {
            for (int j = 0; j < niveles.length; j++) {
                suma += niveles[i][j];
            }
        }

        System.out.println("La media de emisiones de la ciudad es: " + suma/niveles.length);







    }
}
