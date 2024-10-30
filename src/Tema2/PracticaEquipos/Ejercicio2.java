package Tema2.PracticaEquipos;

import java.util.Scanner;

public class Ejercicio2 {

    public static int tirada() {
        int dado1=tiradaDados();
        int dado2=tiradaDados();
        int dado3=tiradaDados();
        int dado4=tiradaDados();
        int dado5=tiradaDados();

        return sumaTirada(dado1,dado2,dado3,dado4,dado5);

    }

    public static int tiradaDados(){
        return (int) (Math.random() * 13 + 1);
    }

    public static int maximoTirada(int dado1,int dado2, int dado3, int dado4, int dado5) {
        int mayor = dado1;

        if (dado2 > mayor) {
            mayor = dado2;
        }
        if (dado3 > mayor) {
            mayor = dado3;
        }
        if (dado4 > mayor) {
            mayor = dado4;
        }
        if (dado5 > mayor) {
            mayor = dado5;

        }
        return mayor;
    }

    public static int minimoTirada(int dado1,int dado2, int dado3, int dado4, int dado5) {
        int menor = dado1;

        if (dado2 < menor) {
            menor = dado2;
        }
        if (dado3 < menor) {
            menor = dado3;
        }
        if (dado4 < menor) {
            menor = dado4;
        }
        if (dado5 < menor) {
            menor = dado5;

        }
        return menor;
    }

    public static int sumaTirada(int dado1, int dado2, int dado3, int dado4, int dado5) {
        int total = 0;
        int mayor = maximoTirada(dado1, dado2, dado3, dado4, dado5);
        int menor = minimoTirada(dado1, dado2, dado3, dado4, dado5);
        if (dado1 != mayor && dado1 != menor) {
            total += dado1;
        }
        if (dado2 != mayor && dado2 != menor) {
            total += dado2;
        }
        if (dado3 != mayor && dado3 != menor) {
            total += dado3;
        }
        if (dado4 != mayor && dado4 != menor) {
            total += dado4;
        }
        if (dado5 != mayor && dado5 != menor) {
            total += dado5;
        }
        return total;
    }

    public static void main(String[] args) {

        /*
        Marcus Cubitus y Julius Humerus son dos legionarios que se entretienen en sus ratos
    libres jugando a juegos de dados, el pasatiempo favorito de los antiguos romanos. Un
    juego que pudieron haber jugado estos amigos consiste en tirar cada jugador cinco
    dados. La puntuación es la suma total de puntos, sin contar los valores que coincidan
    con el mínimo o el máximo obtenido. El jugador que saca más puntos gana la partida.
    Escriba un programa que simule varias partidas seguidas de este juego de dados.
         */

        int rondas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe cuántas rondas se van a jugar");
        rondas = Integer.parseInt(sc.nextLine());
        int victoriasC = 0;
        int victoriasH = 0;


        for (int i = 1; i <= rondas; i++) {
            int totalC = tirada();
            int totalH = tirada();




            System.out.println("Total Cubitus: " + totalC);
            System.out.println("Total Humerus: " + totalH);

            if (totalC > totalH) {
                victoriasC++;
            } else if (totalC < totalH) {
                victoriasH++;
            }
        }

        System.out.println("Cubitus ha ganado : " + victoriasC + " partidas");
        System.out.println("Humerus ha ganado : " + victoriasH + " partidas");

        if (victoriasC > victoriasH) {
            System.out.println("Cubitus gana la partida.");
        } else if (victoriasC < victoriasH) {
            System.out.println("Humerus gana la partida.");

        } else
            System.out.println("Es un empate");

    }
}
