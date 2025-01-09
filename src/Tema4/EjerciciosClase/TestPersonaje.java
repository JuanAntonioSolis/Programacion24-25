package Tema4.EjerciciosClase;

public class TestPersonaje {

    public static void main(String[] args) {

        Personaje player1 = new Personaje("Juan","Elfo","Hombre",22);
        Personaje playerPc = new Personaje();

        player1.setClase("Enano");

        playerPc.setVida(75);

        System.out.println(player1);
        System.out.println(playerPc);

    }
}
