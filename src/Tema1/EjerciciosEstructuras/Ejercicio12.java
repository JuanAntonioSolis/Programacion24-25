package Tema1.EjerciciosEstructuras;

public class Ejercicio12 {
    public static void main(String[] args) {

        /*Dos vehículos viajan a diferentes velocidades y están distanciados por una distancia d. El que está
        detrás viaja a una velocidad mayor. Se pide hacer un algoritmo para ingresar la distancia entre los
        dos vehículos (km) y sus respectivas velocidades (km/h) y con eso determinar y mostar en que tiempo
        (minutos) alcanzará el vehículo más rápido al otro.
         */

        int coche1 = 90;
        int coche2 = 125;
        int distancia = 40;
        int diferenciaCoches = coche2 - coche1;
        int tiempo;


        tiempo = 40 / diferenciaCoches;

        int tiempoMin = tiempo * 60;


        System.out.println("El 2do vehículo tardará " + tiempoMin + " minutos en alcanzar al primer coche");


    }
}
