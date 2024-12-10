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

    public static boolean ronda() {

        int tirada = tiradaDados();

        System.out.println("Tirada " + tirada);
        switch(tirada){
            case 7,11:
                System.out.println("Gana la partida");
                return true;
            case 2,3,12:
                System.out.println("Pierde la partida");
                return false;

            default:
                //Tirar los dados hasta que salga de nuevo el mismo num(gana) o el 7(pierde)
                int tiradaRep = 0;

                while (tiradaRep != 7 && tiradaRep != tirada) {
                    tiradaRep = tiradaDados();
                    System.out.println("Intermedias: " + tiradaRep);
                }

                if (tiradaRep == 7) {
                    return false;
                } else {
                    return true;
                }
        }

    }




    public static void main(String[] args) {

        int p1 = 0;
        int p2 = 0;
        boolean ronda1 = false;
        boolean ronda2 = false;

        for (int i = 0; i<10; i++) {
            ronda1 = ronda();
            ronda2 = ronda();

            if (ronda1 == true && ronda2 == false) {
                p1++;
            }

            if (ronda1 == false && ronda2 == true) {
                p2++;
            }
        }

        System.out.println("El jugador 1 ha ganado " + p1 + " veces.");
        System.out.println("El jugador 2 ha ganado " + p2 + " veces.");






    }
}
