package Tema5.PracticaObjetosII.Ejercicio1;

public class TestJuego {

    public static void main(String[] args) {

        Jugador playa = new Jugador("Juan",1,200.0,Jugador.Clase.CABALLERO,null,null);

        Partida pt1 = new Partida(playa);

        boolean ganaPlayer = false;
        boolean gananMonstruos = false;

        for (int i = 0; i <10;i++ ){
            ganaPlayer = pt1.turnoJugador();
            gananMonstruos = pt1.turnoEnemigo();
            System.out.println(pt1);

            if (ganaPlayer){
                System.out.println("Gana el player");
                break;
            }

            if (gananMonstruos){
                System.out.println("Ganan los monstruos");
                break;
            }
        }





    }
}
