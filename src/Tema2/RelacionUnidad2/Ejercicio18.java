package Tema2.RelacionUnidad2;

import java.util.Scanner;

public class Ejercicio18 {

    /*
    Marcus Cubitus y Julius Humerus, legionarios apasionados por los juegos de dados, aprovechan los días
    cada vez más largos del mes de Iunius para probar nuevos juegos. En este juego, en cada turno un jugador
    lanza cuatro dados y se anota la suma de los valores impares obtenidos, mientras que el otro jugador
    lanza tres dados y se anota la suma de los valores pares obtenidos. Gana el turno el jugador que obtenga
    más puntos y gana la partida el jugador que haya ganado más turnos.
     */

    public static int tiradaCuadruple( int mayor, int menor) {
        int sumaImpares = 0;
        int dado1 = (int) (Math.random() * (mayor - menor + 1)) + menor;
        int dado2 = (int) (Math.random() * (mayor - menor + 1)) + menor;
        int dado3 = (int) (Math.random() * (mayor - menor + 1)) + menor;
        int dado4 = (int) (Math.random() * (mayor - menor + 1)) + menor;

        if (dado1 % 2 != 0) {
            sumaImpares+=dado1;
        }
        if (dado2 % 2 != 0) {
            sumaImpares+=dado2;
        }
        if (dado3 % 2 != 0) {
            sumaImpares+=dado3;
        }
        if (dado4 % 2 != 0) {
            sumaImpares+=dado4;
        }

        System.out.println("Dado1 : " + dado1);
        System.out.println("Dado2 : " + dado2);
        System.out.println("Dado3 : " + dado3);
        System.out.println("Dado4 : " + dado4);

        return sumaImpares;

    }

    public static int tiradaTriple (int mayor, int menor) {
        int sumaPares = 0;

        int dado1 =  (int) (Math.random() * (mayor - menor + 1)) + menor;
        int dado2 =  (int) (Math.random() * (mayor - menor + 1)) + menor;
        int dado3 =  (int) (Math.random() * (mayor - menor + 1)) + menor;

        if (dado1 % 2 == 0) {
            sumaPares+=dado1;
        }
        if (dado2 % 2 == 0) {
            sumaPares+=dado2;
        }
        if (dado3 % 2 == 0) {
            sumaPares+=dado3;
        }

        System.out.println("Dado1 : " + dado1);
        System.out.println("Dado2 : " + dado2);
        System.out.println("Dado3 : " + dado3);


        return sumaPares;
    }

    public static String ganadorPartida(int victoriasCubitus, int victoriasHumerus) {
        if (victoriasCubitus > victoriasHumerus) {
            return "Gana la partida Cubitus";
        } else if (victoriasCubitus < victoriasHumerus) {
            return "Gana la partida Humerus";
        } else {
            return "Es un empate";
        }
    }

    public static void main(String[] args) {

        int tiradaC, tiradaH, ronda;
        int victoriasC = 0;
        int victoriasH = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce cuántas rondas se van a jugar:");
        ronda = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < ronda; i++) {
            tiradaC = tiradaCuadruple(20, 1);
            System.out.println("Valor Cubitus: " + tiradaC);
            tiradaH = tiradaTriple(20, 1);
            System.out.println("Valor Humerus: " + tiradaH);

            if (tiradaC > tiradaH){
                System.out.println("Gana la ronda Cubitus");
                victoriasC++;
            } else if (tiradaC < tiradaH){
                System.out.println("Gana la ronda Humerus");
                victoriasH++;
            } else {
                System.out.println("Es un empate");
            }
        }

        System.out.println("Cubitus ha ganado " + victoriasC + " rondas");
        System.out.println("Humerus ha ganado " + victoriasH + " rondas");


        System.out.println(ganadorPartida(victoriasC, victoriasH));




    }
}
