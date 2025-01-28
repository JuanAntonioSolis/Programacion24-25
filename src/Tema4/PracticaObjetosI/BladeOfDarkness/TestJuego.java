package Tema4.PracticaObjetosI.BladeOfDarkness;

public class TestJuego {

    public static void main(String[] args) {

        Jugador player = new Jugador("Raton",Jugador.Clase.MAGO);
        Arma bow = new Arma("MagicBow",Arma.Tipo.ARCO,85,false);

        player.equipar(bow);

        System.out.println(player);

        player.tomarPocion(9901);

        System.out.println(player);
    }
}
