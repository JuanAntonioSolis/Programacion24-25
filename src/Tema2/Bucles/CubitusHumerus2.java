package Tema2.Bucles;

import java.sql.SQLOutput;

public class CubitusHumerus2 {

    public static void main(String[] args) {

        //Nuestros dos romanos favoritos juegan a los dados
        //Cada uno tira dos dados
        //Gana aquel de los dos cuya suma de sus dados sea mayor, o
        //aquel cuyos dos dados sean iguales
        //Juega 20 rondas y dime quién gana

        int tiradaH1, tiradaH2; // Tirada 1 y 2 de Humerus
        int tiradaC1, tiradaC2; // Tirada 1 y 2 de Cubitus
        int victoriasH = 0; // Contador de victorias Humerus
        int victoriasC = 0; // Contador de victorias



        for (int i = 0; i < 20; i++) { // 20 rondas, 20 veces se repite el bucle

            tiradaH1 = (int)(Math.random() * (20-1+1) + 1); //Tirada 1 Humerus
            tiradaH2 = (int)(Math.random() * (20-1+1) + 1); //Tirada 2 Humerus
            tiradaC1 = (int)(Math.random() * (20-1+1) + 1); //Tirada 1 Cubitus
            tiradaC2 = (int)(Math.random() * (20-1+1) + 1); //Tirada 2 Cubitus

            System.out.println("Primer dado de Humerus " + tiradaH1);
            System.out.println("Segundo dado de Humerus " + tiradaH2);
            System.out.println("Primer dado de Cubitus " + tiradaC1);
            System.out.println("Segundo dado de Cubitus " + tiradaC2);

            if ( (tiradaH1 == tiradaH2) && (tiradaC1 != tiradaC2 )) { //Si los 2 dados de H son iguales y los de C no, gana H.
                System.out.println("Gana Humerus");
                victoriasH++;
            } else if ( (tiradaC1 == tiradaC2) && (tiradaH1 != tiradaH2) ) { //Si los 2 dados de C son iguales y los de H no, gana C.
                System.out.println("Gana Cubitus");
                victoriasC++;
            } else if ( (tiradaC1 == tiradaC2) && (tiradaH1 == tiradaH2) ) { //Si los 2 dados de C y H son iguales, es un empate.
                System.out.println("Es un empate");
            } else if ( (tiradaH1 + tiradaH2) > (tiradaC1 + tiradaC2) ) { //Si la suma de las tiradas de Humerus es mayor que la suma de las tiradas de Cubitus, gana Humerus
                System.out.println("Gana Humerus");
                victoriasH++;
            } else if ( (tiradaC1 + tiradaC2) > (tiradaH1 + tiradaH2) ) { //Si la suma de de las tiradas de C es mayor que la suma de las tiradas de H, gana Cubitus
                System.out.println("Gana Cubitus");
                victoriasC++;
            } else if ( (tiradaH1 + tiradaH2) == (tiradaC1 + tiradaC2) ) { //Si la suma de las tiradas da el mismo resultado, es un empate.
                System.out.println("Es un empate");
            }

        }

        System.out.println("Humerus ha ganado " + victoriasH + " partidas.");
        System.out.println("Cubitus ha ganado " + victoriasC + " partidas.");

        if (victoriasH > victoriasC) {
            System.out.println("Ha ganado Humerus");
        } else
            System.out.println("Ha ganado Cubitus");

    }
}
