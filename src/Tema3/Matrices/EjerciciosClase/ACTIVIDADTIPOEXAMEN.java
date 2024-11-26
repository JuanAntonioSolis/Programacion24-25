package Tema3.Matrices.EjerciciosClase;

/*
            En una plantación tenemos seis zonas diferentes.
            En cada zona tenemos tres sensores, uno de temperatura (-5, 55), otro de
            humedad (0, 100), y otro de pH (0, 10) del suelo.
            Cada sensor nos da la temperatura media del día.

            Vamos a almacenar esa información donde cada fila es una zona y cada
            columna la media de cada tipo de sensor.

            Escribe un programa Java que:
            1. Genere aleatoriamente los datos de los sensores.
            2. Pinte toda la información
            3. Calcule el promedio de cada tipo de sensor en toda la plantación
            4. Identifique la zona con la temperatura más alta
            5. Diga si alguna zona tiene una humedad inferior al 30%



*/

public class ACTIVIDADTIPOEXAMEN {

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

        int sensores[][] = new int[6][3];


        //1. Genere aleatoriamente los datos de los sensores.
        for (int i = 0; i < sensores.length; i++) {
            sensores[i][0] = numero_aleatorio(-5, 55);
            sensores[i][1] = numero_aleatorio(0, 100);
            sensores[i][2] = numero_aleatorio(0, 10);
        }

        pintar(sensores);


        //3. Calcule el promedio de cada tipo de sensor en toda la plantación
        int mediaTemp = 0;
        int mediaHum = 0;
        int mediaPh = 0;

        for (int i = 0; i < sensores.length; i++) {
            mediaTemp += sensores[i][0];
            mediaHum += sensores[i][1];
            mediaPh += sensores[i][2];
        }

        System.out.println("La media de temperaturas en la plantación es: " + mediaTemp/ sensores.length);
        System.out.println("La media de humedad de la plantación es: " + mediaHum/ sensores.length);
        System.out.println("La media de pH en la plantación es: " + mediaPh/ sensores.length);

        //4. Identifique la zona con la temperatura más alta

        int max = -5;
        int zona = -1;

        for (int i = 0; i < sensores.length; i++) {
            if (sensores[i][0] > max) {
                max = sensores[i][0];
                zona = i;
            }
        }

        System.out.println("La zona con más temperatura es la " + zona);

        //5. Diga si alguna zona tiene una humedad inferior al 30%

        boolean inferior = false;

        for (int i = 0; i < sensores.length; i++) {
            if (sensores[i][1] < 30) {
                inferior = true;
                break;
            }
        }

        if (inferior) {
            System.out.println("Alguna de las zonas tiene un índice de humedad inferior al 30%");
        } else {
            System.out.println("No hay zonas con índice de humedad inferior al 30%");
        }

    }
}
