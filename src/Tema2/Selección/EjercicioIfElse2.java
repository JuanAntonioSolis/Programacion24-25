package Tema2.Selección;

public class EjercicioIfElse2 {

    public static void main(String[] args) {

        // VidaJugador = 0-100
        // VidaMonstruo = 0-50
        // PuntosEspada = 0-50
        // RunaMagica = true/false

        // Es un combate entre el jugador y el monstruo.
        // Gana el jugador si:
        //          - VidaJugador > 50 y PuntosEspada > 30
        //          - VidaJugador < 50 y PuntosEspada > 50
        //          - VidaJugador < 50 y PuntosEspada < 30 y RunaMagica = true

        // Gana el monstruo si:
        //          - Si la vida del jugador es menor de 50 y los puntos
        //          de la espada menor que 50,
        //          O si la vida del jugador es menor de 50 y RunaMagica = false

        int vidaJugador = 40;
        int vidaMonstruo = 25;
        int puntosEspada = 20;
        boolean runaMagica = false;

        if (vidaJugador > 50 && puntosEspada > 30){
            System.out.println("Gana el jugador x");
        } else if (vidaJugador <50 && puntosEspada >= 50){
            System.out.println("Gana el jugador y");
        } else if (vidaJugador < 50 && puntosEspada < 30 && runaMagica==true) {
            System.out.println("Gana el jugador z");
        } else if (vidaJugador < 50 && puntosEspada < 50 || vidaJugador < 50 && runaMagica==false){
            System.out.println("Gana el monstruo");
        }

        /*
        Ejemplo simplificado:
        if ( (vidaJugador > 50 && puntosEspada > 30) ||
             (vidaJugador < 50 && puntosEspada >= 50) ||
             (vidaJugador < 50 && puntosEspada < 30 && runaMagica==true) ) {
             System.out.println("Gana el jugador)
        }

         */




    }
}
