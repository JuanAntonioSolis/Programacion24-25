package Tema2.Bucles;

import java.sql.SQLOutput;

public class CubitusHumerus1 {

    public static void main(String[] args) {

        /*
        2 romanos asediando una ciudad, se aburren y se ponen a jugar a los dados.
        Cada uno tira un dado de 20 caras.
        Gana el que saca el dado mayor o si alguno de ellos saca el 9.
        Juega una partida y dime quien gana.
        !!!!EJERCICIO JODIDO EXAMEN!!!!!!
        OJOOOOOOOOOOO
        OJOOO
        OJOOO
        OJOOO
         */




        int tiradaH;
        int tiradaC;
        int contH = 0;
        int contC = 0;



        tiradaH = (int) (Math.random() * 20) + 1;
        tiradaC = (int) (Math.random() * 20) + 1;
        System.out.println("TiradaH " + tiradaH);
        System.out.println("TiradaC " + tiradaC);

        for (int i =0; i<=10; i++) {
            if ( (tiradaH == 9) && (tiradaC != 9) ) {
                System.out.println("Gana Humerus");
                contH++;
            } else if ( (tiradaC == 9) && (tiradaH != 9) ) {
                System.out.println("Gana Cubitus");
                contC++;
            } else if ( (tiradaC == 9) && (tiradaH == 9) ) {
                System.out.println("Empate");
            } else if (tiradaC > tiradaH) {
                System.out.println("Gana Cubitus");
                contC++;
            } else if (tiradaH > tiradaC) {
                System.out.println("Gana Humerus");
                contH++;
            } else if (tiradaC == tiradaH) {
                System.out.println("Empate");
            }
        }

        System.out.println("Cubitos ha ganado " + contC + " partidas.");
        System.out.println("Homerus ha ganado " + contH + " partidas.") ;

        if (contC > contH) {
            System.out.println("Ha ganado Cubitus");
        } else
            System.out.println("Ha ganado Homerus");



    }
}
