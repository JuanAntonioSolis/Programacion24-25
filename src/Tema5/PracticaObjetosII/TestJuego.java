package Tema5.PracticaObjetosII;

public class TestJuego {

    public static void main(String[] args) {

        Jugador pl1 = new Jugador("Aprendiz",1,200.0, Jugador.Clase.CABALLERO,
                100,null,null);

        MonstruoFinal mf1 = new MonstruoFinal("Papón",10,350.0, Monstruo.Clase.DEMONIO,
                60,80);

        MonstruoFinal mf2 = new MonstruoFinal("Shake",8,190.0, Monstruo.Clase.DEMONIO,
                50,85);


        Partida pt1 = new Partida(pl1);

        System.out.println(pl1);

        pt1.agregarMonsruos(mf1);

        System.out.println(pt1.getMonsters());





    }
}
