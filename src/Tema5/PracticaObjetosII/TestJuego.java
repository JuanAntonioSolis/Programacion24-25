package Tema5.PracticaObjetosII;

public class TestJuego {

    public static void main(String[] args) {

        int contadorTurnos = 0;

        Jugador pl1 = new Jugador("Aprendiz",1,200.0, Jugador.Clase.CABALLERO,
                100,null,null);

        MonstruoFinal mf1 = new MonstruoFinal("Papón",10,350.0, Monstruo.Clase.DEMONIO,
                60,80);

        MonstruoFinal mf2 = new MonstruoFinal("Shake",8,190.0, Monstruo.Clase.DEMONIO,
                50,85);


        Partida pt1 = new Partida(pl1);

        System.out.println(pl1);
        System.out.println();

        pt1.agregarMonsruos(mf1);

        System.out.println(pt1.getMonsters());





        while ((pt1.turnoJugador() != true || pt1.turnoEnemigo() != true) && contadorTurnos != 5){
            contadorTurnos++;
            System.out.println("Ronda " + contadorTurnos);
            System.out.println("El jugador golpea al monstruo: ");
            System.out.println(pt1.getMonsters().get(0));
            pt1.turnoJugador();
            System.out.println(pt1.getMonsters().get(0));

            System.out.println();

            System.out.println("El monstruo golpea al jugador: ");
            System.out.println("Vida del jugador antes del golpe: " + pl1.getSalud());
            pt1.turnoEnemigo();
            System.out.println("Vida del jugador golpeado: " + pl1.getSalud());
            System.out.println();
        }







    }
}
