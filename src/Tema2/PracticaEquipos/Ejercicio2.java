package Tema2.PracticaEquipos;

public class Ejercicio2 {

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

        int mayorCubitus = maximoTirada(tirada1C, tirada2C, tirada3C, tirada4C,tirada5C);
        int menorCubits = minimoTirada(tirada1C, tirada2C, tirada3C, tirada4C,tirada5C);
        int mayorHumerus = maximoTirada(tirada1H,tirada2H,tirada3H,tirada4H,tirada5H);
        int menorHumerus = minimoTirada(tirada1H,tirada2H,tirada3H,tirada4H,tirada5H);




        System.out.printf("%d %d %d %d %d",tirada1C,tirada2C,tirada3C,tirada4C,tirada5C);
        System.out.println();
        System.out.println("Mayor C: " + mayorCubitus);
        System.out.println("Menor C: " + menorCubits);
        System.out.println("Total C: " + sumaTirada(tirada1C,tirada2C,tirada3C,tirada4C,tirada5C));
        System.out.printf("%d %d %d %d %d",tirada1H,tirada2H,tirada3H,tirada4H,tirada5H);
        System.out.println();
        System.out.println("Mayor H: " + mayorHumerus);
        System.out.println("Menor H: " + menorHumerus);
        System.out.println("Total H: " + sumaTirada(tirada1H,tirada2H,tirada3H,tirada4H,tirada5H));


    }
}
