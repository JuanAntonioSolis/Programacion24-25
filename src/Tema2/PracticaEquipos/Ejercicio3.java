package Tema2.PracticaEquipos;

import java.util.Scanner;

/*
Marcus Cubitus y Julius Humerus, dos legionarios romanos aficionados a los dados y
habituales de estos exámenes, han ideado un nuevo juego. Primero se decide cuántos
turnos va a tener la partida (uno por lo menos, lógicamente). En cada turno, cada uno
tira un dado. Si ambos dados son pares o si ambos son impares, Cubitus se apunta la
suma de los dos valores. Si un dado es par y el otro impar, los puntos se los lleva
Humerus. El ganador es el que ha obtenido más puntos.
 */
public class Ejercicio3 {


    public static void main(String[] args) {


        int sumaDadosC = 0;
        int sumaDadosH = 0;
        String gana = "";
        int rondas = 0;
        Scanner sc = new Scanner(System.in);

        while (rondas == 0) {
            System.out.println("Escribe cuántas rondas quieres que se jueguen:");

            try {
                rondas = Integer.parseInt(sc.nextLine());
                if (rondas < 1) throw new Exception("Deben jugar al menos una ronda");
            } catch (NumberFormatException e) {
                System.out.println("Introduce un valor válido");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                rondas = 0;
            }
        }

        for (int i = 1; i<= rondas; i++) {

            int tiradaH = Ejercicio2.tiradaDados();
            int tiradaC = Ejercicio2.tiradaDados();

            if ((tiradaC % 2 == 0 && tiradaH % 2 == 0) || (tiradaC % 2 != 0 && tiradaH % 2 != 0)){
                sumaDadosC += tiradaC + tiradaH;
                gana = "Cubitus";

            } else {
                sumaDadosH += tiradaC + tiradaH;
                gana = "Humerus";
            }

            System.out.println(i + " ronda:");
            System.out.println("Tirada Humerus: " + tiradaH);
            System.out.println("Tirada Cubitus: " + tiradaC);
            System.out.println(gana + " gana la ronda.");
            System.out.println("Humerus acumula " + sumaDadosH);
            System.out.println("Cubitus acumula " + sumaDadosC);
            System.out.println();

        }

        System.out.println();


        if (sumaDadosC > sumaDadosH) {
            System.out.println("Cubitus gana la partida");
        } else if (sumaDadosC < sumaDadosH) {
            System.out.println("Humerus gana la partida");
        } else
            System.out.println("Es un empate.");


    }
}
