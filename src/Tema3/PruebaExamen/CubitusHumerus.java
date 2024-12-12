package Tema3.PruebaExamen;
/*
Marcus Cubitus y Julius Humerus, legionarios apasionados por los juegos de dados,
aprovechan los días cada vez más largos del mes de Iunius para probar nuevos juegos.
Pide por teclado un número de turnos que van a jugar. En cada turno Cubitus lanza cuatro
dados de 10 caras y se anota la suma de los valores impares obtenidos, mientras que el
Humerus lanza tres dados de 15 caras y se anota la suma de los valores pares obtenidos.
Gana el turno el jugador que obtenga más puntos y gana la partida el jugador que haya
ganado más turnos.
¿Es un juego equitativo? ¿Cómo lo comprobarías?
 */

import java.util.Scanner;

public class CubitusHumerus {

    public static int tirada3Dados(){
        int suma = 0;

        int dado1 = (int) (Math.random() * 15 + 1);
        int dado2 = (int) (Math.random() * 15 + 1);
        int dado3 = (int) (Math.random() * 15 + 1);

        if (dado1 % 2 == 0){
            suma += dado1;
        }
        if (dado2 % 2 == 0){
            suma += dado2;
        }
        if (dado3 % 2 == 0){
            suma += dado3;
        }

        return suma;
    }

    public static int tirada4Dados(){
        int suma = 0;

        int dado1 = (int) (Math.random() * 10 + 1);
        int dado2 = (int) (Math.random() * 10 + 1);
        int dado3 = (int) (Math.random() * 10 + 1);
        int dado4 = (int) (Math.random() * 10 + 1);

        if (dado1 % 2 != 0){
            suma += dado1;
        }
        if (dado2 % 2 != 0){
            suma += dado2;
        }
        if (dado3 % 2 != 0){
            suma += dado3;
        }
        if (dado4 % 2 != 0){
            suma += dado4;
        }

        return suma;
    }

    public static void main(String[] args) {

        int cubitus;
        int humerus;
        int rondas;
        int victoriasCubitus = 0;
        int victoriasHumerus = 0;


        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Escribe cuántas rondas se van a jugar");
            rondas = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < rondas; i++) {
                cubitus = tirada4Dados();
                humerus = tirada3Dados();

                System.out.println("Tirada Cubitus: " + cubitus);
                System.out.println("Tirada Humerus: " + humerus);

                if (cubitus > humerus){
                    System.out.println("Cubitus gana esta ronda");
                    victoriasCubitus++;
                } else if (humerus > cubitus){
                    System.out.println("Humerus gana esta ronda");
                    victoriasHumerus++;
                } else
                    System.out.println("Es un empate");
            }

            System.out.println();
            System.out.println("Cubitus gana: " + victoriasCubitus + " rondas");
            System.out.println("Humerus gana: " + victoriasHumerus + " rondas");

            if (victoriasCubitus > victoriasHumerus){
                System.out.println("Cubitus gana la partida");
            } else if (victoriasHumerus > victoriasCubitus){
                System.out.println("Humerus gana la partida");
            }


        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
