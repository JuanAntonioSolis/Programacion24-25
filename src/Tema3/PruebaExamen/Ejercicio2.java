package Tema3.PruebaExamen;

/*
CRAPS. Es un juego de dados muy facil, y consiste en arrojar la suma de 2 dados,
y si su suma es 7 u 11 ganas la partida. En cambio, si sacas un 2, 3 o 12 pierdes. Con
cualquier otro número que saques, debes guardar ese número y tirar los dados
repetidamente hasta volver a sacar ese dado (ganas) o sacar el 7 (pierdes).
Realiza el juego para dos jugadores simulando las tiradas de forma aleatoria y que
juegen 10 partidas, indica cuántas partidas gana Jugador1 y cuántas jugador2.
Ahora simula 1000 partidas e indica las partidas que gana cada uno.
 */

public class Ejercicio2 {

    public static int tiradaDados(){
        int suma = 0;

        int dado1 = (int) (Math.random() * 6 + 1);
        int dado2 = (int) (Math.random() * 6 + 1);

        suma = dado1 + dado2;

        return suma;
    }


    public static int comprobacion(int t1, int t2) {

        int ganador = 0;
        int resultado = 0;

        if ((t1 == 7 || t1 == 11) & (t2 !=7 || t2 != 11) ) {
            ganador = t1;
        } else if((t1 != 7 || t1 != 11) & (t2 ==7 || t2 == 11)) {
            ganador = t2;
        } else if (t1 == 2 || t1 == 3 || t1 == 12 & t2 != 2 || t2 != 3 || t2 != 12) {
            ganador = t2;
        } else if (t1 != 2 || t1 != 3 || t1 != 12 & t2 == 2 || t2 == 3 || t2 == 12) {
            ganador = t1;
        } else if (t1 != 7 || t1 != 11 || t1 != 2 || t1 != 3 || t1 != 12 ){
            resultado = t1;
            while (t1 != resultado || t1  == 7){
                t1 = tiradaDados();
                if (t1 == resultado)
                    ganador = t1;
                else if (t1 == 7)
                    ganador = t2;
            }
        } else if (t2 != 7 || t2 != 11 || t2 != 2 || t2 != 3 || t2 != 12 ){
            resultado = t2;
            while (t2 != resultado || t2  == 7){
                t2 = tiradaDados();
                if (t2 == resultado)
                    ganador = t2;
                else if (t2 == 7)
                    ganador = t1;
            }
        }

        return ganador;
    }



    /*

    public static boolean comprobacion7_11(int tirada) {

        if (tirada == 7 || tirada == 11){
            return true;
        }

        return false;
    }

    public static boolean comprobacion2_3_12(int tirada) {
        if (tirada == 2 || tirada == 3 || tirada == 12){
            return true;
        }
        return false;
    }


    IBAS POR AQUI
    public static boolean comprobacionGuardar(int tirada) {
        if (tirada == 1 || tirada == 4 || tirada == 5)
    }

     */



    public static void main(String[] args) {


        int jugador1;
        int jugador2;
        int victoriasJugador1 = 0;
        int victoriasJugador2 = 0;
        int partidas = 10;

        for (int i = 0; i < partidas; i++) {
            jugador1 = tiradaDados();
            jugador2 = tiradaDados();

            System.out.println("Tirada jugador 1: " + jugador1);
            System.out.println("Tirada jugador 2: " + jugador2);


            if (comprobacion(jugador1, jugador2) == jugador1) {
                System.out.println("Gana el jugador 1");
                victoriasJugador1++;
            } else if (comprobacion(jugador1, jugador2) == jugador2) {
                System.out.println("Gana el jugador 2");
                victoriasJugador2++;
            } else if (jugador1 == jugador2) {
                System.out.println("Es un empate");
            }


            System.out.println("");
        }

        System.out.println("El jugador 1 ha ganado: " + victoriasJugador1 + " partidas");
        System.out.println("El jugador 2 ha ganado: " + victoriasJugador2 + " partidas");

        /*
        for (int i = 0; i < partidas; i++) {
            jugador1 = tiradaDados();
            jugador2 = tiradaDados();

            System.out.println("Tirada jugador 1: " + jugador1);
            System.out.println("Tirada jugador 2: " + jugador2);
            System.out.println();

            if (comprobacion7_11(jugador1)) {
                victoriasJugador1++;
                System.out.println("Gana el jugador 1");
            } else if (comprobacion7_11(jugador2)) {
                victoriasJugador2++;
                System.out.println("Gana el jugador 2");
            }

            if (comprobacion2_3_12(jugador1) && !comprobacion2_3_12(jugador2)) {
                victoriasJugador2++;
                System.out.println("Gana el jugador 2");
            } else if (comprobacion2_3_12(jugador2) && !comprobacion2_3_12(jugador1)) {
                victoriasJugador1++;
                System.out.println("Gana el jugador 1");
            } else
                System.out.println("No gana nadie");
        }

        System.out.println("El jugador 1 ha ganado: " + victoriasJugador1);
        System.out.println("El jugador 2 ha ganado: " + victoriasJugador2);

         */


    }
}
