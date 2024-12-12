package primeraevaluacion;

import java.util.Scanner;

public class Ejercicio2 {

    public static int numero_aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int tirada() {
        int dado = numero_aleatorio(1,6);

        return dado;
    }


    public static void main(String[] args) {

        int puntosJ1 = 40;
        int puntosJ2 = 40;
        int reglaMagica;
        int tiradaJ1 = 0;
        int tiradaJ2 = 0;
        int rondas = 0;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Establece cuántas rondas se van a jugar");
            rondas = Integer.parseInt(sc.nextLine());
            if (rondas < 5){
                throw new Exception("Se deben jugar al menos 5 rondas");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        for (int i = 0; i <= rondas; i++) {

            reglaMagica = numero_aleatorio(1,5);

            tiradaJ1 = tirada();
            tiradaJ2 = tirada();


            switch (reglaMagica){


                case 1:
                    System.out.println("Regla del Fuego");
                    System.out.println("Tirada Jugador 1: " + tiradaJ1);
                    System.out.println("Tirada Jugador 2: " + tiradaJ2);
                    if (tiradaJ1 < tiradaJ2){
                        System.out.println("El jugador 1 pierde " + (tiradaJ2 - tiradaJ1) + " puntos");
                        puntosJ1 -= tiradaJ2 - tiradaJ1;
                    } else if (tiradaJ1 > tiradaJ2){
                        System.out.println("El jugador 2 pierde " + (tiradaJ1 - tiradaJ2) + " puntos");
                        puntosJ2 -= tiradaJ1 - tiradaJ2;
                    }
                    System.out.println("Puntos J1: " + puntosJ1);
                    System.out.println("Puntos J2: " + puntosJ2);
                    reglaMagica = 0;

                    break;
                case 2:
                    System.out.println("Regla de la Curación");
                    System.out.println("Tirada Jugador 1: " + tiradaJ1);
                    System.out.println("Tirada Jugador 2: " + tiradaJ2);
                    System.out.println("El jugador 1 suma " + tiradaJ1 + " puntos de vida.");
                    puntosJ1 += tiradaJ1;
                    System.out.println("El jugador 2 suma " + tiradaJ2 + " puntos de vida.");
                    puntosJ2 += tiradaJ2;

                    System.out.println("Puntos J1: " + puntosJ1);
                    System.out.println("Puntos J2: " + puntosJ2);
                    reglaMagica = 0;

                    break;
                case 3:
                    System.out.println("Regla del Robo");
                    System.out.println("Tirada Jugador 1: " + tiradaJ1);
                    System.out.println("Tirada Jugador 2: " + tiradaJ2);
                    if (tiradaJ1 > tiradaJ2){
                        System.out.println("El jugador 1 suma " + (tiradaJ1 / 2) + " puntos");
                        System.out.println("El jugador 2 pierde " + (tiradaJ1 / 2) + " puntos");
                        puntosJ1 += tiradaJ1 / 2;
                        puntosJ2 -= tiradaJ1 / 2;
                    } else if (tiradaJ1 < tiradaJ2) {
                        System.out.println("El jugador 2 suma " + (tiradaJ2 / 2) + " puntos");
                        System.out.println("El jugador 1 pierde " + (tiradaJ2 / 2) + " puntos");
                        puntosJ1 -= tiradaJ2 / 2;
                        puntosJ2 += tiradaJ2 / 2;
                    }
                    System.out.println("Puntos J1: " + puntosJ1);
                    System.out.println("Puntos J2: " + puntosJ2);
                    reglaMagica = 0;

                    break;
                case 4:
                    System.out.println("Regla de la Explotación");
                    System.out.println("Tirada Jugador 1: " + tiradaJ1);
                    System.out.println("Tirada Jugador 2: " + tiradaJ2);
                    if (tiradaJ1 == 6 && tiradaJ2 != 6){
                        System.out.println("El jugador 2 pierde 10 puntos");
                        puntosJ2 -= 10;
                    } else if (tiradaJ2 == 6 && tiradaJ1 != 6){
                        System.out.println("El jugador 1 pierde 10 puntos");
                        puntosJ1 -= 10;
                    }
                    System.out.println("Puntos J1: " + puntosJ1);
                    System.out.println("Puntos J2: " + puntosJ2);
                    reglaMagica = 0;
                    break;





            }

            if (puntosJ1 <= 0 || puntosJ2 <= 0){
                System.out.println("Termina la partida");
                if (puntosJ1 != 0 || puntosJ1 > 0){
                    System.out.println("Gana el Jugador 1");
                } else if (puntosJ2 != 0 || tiradaJ2 > 0) {
                    System.out.println("Gana el Jugador 2");
                }
            }

        }

        System.out.println("El jugador 1 tiene " + puntosJ1 + " puntos.");
        System.out.println("El jugador 2 tiene " + puntosJ2 + " puntos.");

        if (puntosJ1 > puntosJ2){
            System.out.println("Gana el jugador 1");
        } else if (puntosJ2 > puntosJ1) {
            System.out.println("Gana el jugador 2");
        }







    }
}
