package Tema2.EjerciciosRepaso;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        /*
        Piedra-papel-tijera. Realiza un programa que genere una tirada simulando piedra-papel-tijera. Haz otra
        tirada para otro jugador y di quién de los dos gana. Mejora el programa para que indique el número de partidas
        a jugar y al final indica cuántas partidas ha ganado cada uno.
         */

        int maquina, jugador;
        String eleccionMaquina = "";
        String eleccionJugador = "";
        int partidas = 0;
        int victoriasMaquina = 0;
        int victoriasJugador = 0;

        System.out.println("Se van a jugar 3 partidas");

        while (partidas < 3) {

            //Tirada de la máquina. Se randomiza entre 1 y 3, depende lo que salga es Piedra papel o tijera.
            maquina = (int) (Math.random() * (3-1+1)+1);
            switch (maquina) {
                case 1:
                    eleccionMaquina = "Piedra";
                    break;
                case 2:
                    eleccionMaquina = "Papel";
                    break;
                case 3:
                    eleccionMaquina = "Tijera";
                    break;
            }

            //Tirada del jugador. La pedimos por teclado entre 1 y 3 y la guardamos en otra variable.

            Scanner sc = new Scanner(System.in);
            System.out.println("Elije que quieres tirar");
            System.out.println("1 para Piedra, 2 para Papel, 3 para Tijera:");
            jugador = sc.nextInt();
            switch (jugador) {
                case 1:
                    eleccionJugador = "Piedra";
                    break;
                case 2:
                    eleccionJugador = "Papel";
                    break;
                case 3:
                    eleccionJugador = "Tijera";
                    break;
            }

            // A partir de aqui, empieza la partida, depende de las elecciones decimos quien gana o pierde o empata.
            System.out.println("La máquina dice " + eleccionMaquina + ". Tu dices " + eleccionJugador);

            switch (jugador) {
                case 1:
                    if (maquina == 1) {
                        System.out.println("Es un empate");
                    } else if (maquina == 2) {
                        System.out.println("Gana la máquina ");
                        victoriasMaquina++;
                    } else if (maquina == 3) {
                        System.out.println("Gana el jugador");
                        victoriasJugador++;
                    }
                    break;
                case 2:
                    if (maquina == 1) {
                        System.out.println("Gana el jugador");
                        victoriasJugador++;
                    } else if (maquina == 2) {
                        System.out.println("Es un empate");
                    } else if (maquina == 3) {
                        System.out.println("Gana la máquina");
                        victoriasMaquina++;
                    }
                    break;
                case 3:
                    if (maquina == 1) {
                        System.out.println("Gana la máquina");
                        victoriasMaquina++;
                    } else if (maquina == 2) {
                        System.out.println("Gana el jugador");
                        victoriasJugador++;
                    } else if (maquina == 3) {
                        System.out.println("Es un empate");
                    }
                    break;
            }

            partidas++;

        }

        System.out.println("La máquina ha ganado " + victoriasMaquina + " partidas.");
        System.out.println("El jugador ha ganado " + victoriasJugador + " partidas.");




    }

}
