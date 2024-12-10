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


    public static void main(String[] args) {




    }
}
