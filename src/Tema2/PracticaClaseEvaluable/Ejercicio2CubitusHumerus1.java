package Tema2.PracticaClaseEvaluable;

/*
Marcus Cubitus y Julius Humerus son dos legionarios que se entretienen en sus ratos
libres jugando a juegos de dados, el pasatiempo favorito de los antiguos romanos. Un
juego que pudieron haber jugado estos amigos consiste en tirar cada jugador cinco dados
de 6 caras. La puntuación es la suma total de puntos, pero hay un bonus de 10 puntos por
sacar una escalera (1,2,3,4,5 o 2,3,4,5,6) y un bonus de 20 puntos por sacar los cinco
dados iguales. Hay una penalización de 5 puntos si la suma de los dados es menor de 8. El
jugador que saca más puntos gana la partida. Escriba un programa que simule varias
partidas seguidas de este juego de dados.


 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio2CubitusHumerus1 {




    public static int tiradaDados(){
        return (int) (Math.random() * 6 + 1);
    }




    public static void main(String[] args) {

        //int tiradaC, tiradaH;
        int victoriasC = 0, victoriasH = 0, rondas = 0, puntuacionC = 0, puntuacionH = 0;




        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe cuántas rondas se van a jugar:");
        rondas = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= rondas; i++) {


            int tirada1C = tiradaDados();
            int tirada2C = tiradaDados();
            int tirada3C = tiradaDados();
            int tirada4C = tiradaDados();
            int tirada5C = tiradaDados();

            int tirada1H = tiradaDados();
            int tirada2H = tiradaDados();
            int tirada3H = tiradaDados();
            int tirada4H = tiradaDados();
            int tirada5H = tiradaDados();


            System.out.println("Tiradas Cubitus:");
            System.out.println(tirada1C);
            System.out.println(tirada2C);
            System.out.println(tirada3C);
            System.out.println(tirada4C);
            System.out.println(tirada5C);
            System.out.println();
            System.out.println("Tiradas Humerus:");
            System.out.println(tirada1H);
            System.out.println(tirada2H);
            System.out.println(tirada3H);
            System.out.println(tirada4H);
            System.out.println(tirada5H);

            //Tiradas normales, gana un punto el que más sume de sus tiradas.

            if (tirada1C + tirada2C + tirada3C + tirada4C + tirada5C > tirada1H + tirada2H + tirada3H + tirada4H + tirada5H) {
                puntuacionC += 1;
            } else if (tirada1C + tirada2C + tirada3C + tirada4C + tirada5C < tirada1H + tirada2H + tirada3H + tirada4H + tirada5H)
                puntuacionH += 1;



            //Gana 10 puntos el que saque una tirada en escalera.

            if ((tirada1C == 1 && tirada2C == 2 && tirada3C == 3 && tirada4C == 4 && tirada5C == 5) ||
                    (tirada1C == 2 && tirada2C == 3 && tirada3C == 4 && tirada4C == 5 && tirada5C == 6)) {
                puntuacionC += 10;
            } else if ((tirada1H == 1 && tirada2H == 2 && tirada3H == 3 && tirada4H == 4 && tirada5H == 5) ||
                    (tirada1H == 2 && tirada2H == 3 && tirada3H == 4 && tirada4H == 5 && tirada5H == 6)) {
                puntuacionH += 10;
            }

            //Gana 20 puntos el que saque los mismos números en toda la tirada.

            if (tirada1C == tirada2C && tirada1C == tirada3C && tirada1C == tirada4C && tirada1C == tirada5C) {
                puntuacionC += 20;
            } else if (tirada1H == tirada2H && tirada1H == tirada3H && tirada1H == tirada4H && tirada1H == tirada5H) {
                puntuacionH += 20;
            }

            //Penalización de 5 puntos si las tiradas no llegan al 8.

            if (tirada1C + tirada2C + tirada3C + tirada4C + tirada5C < 8) {
                puntuacionC -= 5;
            } else if (tirada1H + tirada2H + tirada3H + tirada4H + tirada5H < 8) {
                puntuacionH -= 5;
            }

            System.out.println("Cubitus lleva " + puntuacionC + " puntos.");
            System.out.println("Humerus lleva " + puntuacionH + " puntos.");

            /*
            if (puntuacionC > puntuacionH) {
                victoriasC++;
                System.out.println("Cubitus gana la ronda.");
            } else if (puntuacionH > puntuacionC) {
                victoriasH++;
                System.out.println("Humerus gana la ronda.");
            }

             */



        }



        System.out.println("Cubitus ha ganado: " + victoriasC + " rondas.");
        System.out.println("Humerus ha ganado: " + victoriasH + " rondas.");

        if (victoriasC > victoriasH) {
            System.out.println("Cubitus gana la partida.");
        } else if (victoriasC < victoriasH) {
            System.out.println("Humerus gana la partida.");
        } else
            System.out.println("Es un empate");



    }
}
