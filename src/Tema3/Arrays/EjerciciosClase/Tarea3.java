package Tema3.Arrays.EjerciciosClase;

/*
Cubitus y Humerus juegan hoy otra vez a los dados.
Ambos lanzan dos dados de 6 caras y un dado de 15 caras.
Si en su tirada Cubitus obtiene un valor mayor en los dados de 6 caras que en el de 15 suma tres puntos al total.
Si en su tirada Humerus obtiene un valor mayor en el dado de 15 caras que en los de 6 suma tres puntos al total.
Gana la ronda el que tenga más puntos. Simula el juego de 100 partidas, guarda los resultados en un array,
 y dime cuál es la media de la puntuación de las partidas jugadas, y quién es el ganador.
 */

public class Tarea3 {

    public static int aleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static int tiradaCubitus(){

        int dado1, dado2, dado3;


        dado1 = aleatorio(6,1);
        dado2 = aleatorio(6,1);
        dado3 = aleatorio(15,1);

        int total = dado1 + dado3 + dado3;

        if (dado1 + dado2 > dado3) {
            total += 3;
        }

        return total;

    }

    public static int tiradaHumeruss(){

        int dado1, dado2, dado3;


        dado1 = aleatorio(6,1);
        dado2 = aleatorio(6,1);
        dado3 = aleatorio(15,1);

        int total = dado1 + dado3 + dado3;

        if (dado1 + dado2 < dado3) {
            total += 3;
        }

        return total;

    }

    public static void main(String[] args) {

        int partidas[] = new int[20];
        int puntosCubitus, puntosHumerus;
        int victoriasCubitus = 0;
        int victoriasHumerus = 0;
        int puntuacionesTotal = 0;

        for (int i = 0; i < partidas.length; i++) {
            puntosCubitus = tiradaCubitus();
            puntosHumerus = tiradaHumeruss();

            System.out.println("Tirada Cubitus: " + puntosCubitus);
            System.out.println("Tirada Humerus: " + puntosHumerus);

            if (puntosCubitus > puntosHumerus) {
                partidas[i] = puntosCubitus;
                System.out.println("Cubitus gana la ronda");
                victoriasCubitus++;
            } else if (puntosCubitus < puntosHumerus) {
                partidas[i] = puntosHumerus;
                System.out.println("Humerus gana la ronda");
                victoriasHumerus++;
            }

        }

        for (int i = 0; i < partidas.length; i++) {
            puntuacionesTotal += partidas[i];
        }

        if (victoriasCubitus > victoriasHumerus) {
            System.out.println("Cubitus gana la partida");
        } else if (victoriasCubitus < victoriasHumerus) {
            System.out.println("Humerus gana la partida");
        } else
            System.out.println("Es un empate");


        System.out.println("La media de las partidas jugadas es " + puntuacionesTotal / partidas.length);


    }
}
