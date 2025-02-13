package Tema5.PracticaObjetosII;

import Tema4.PracticaObjetosI.BladeOfDarkness.Arma;

import java.util.ArrayList;

public class Partida {

    private Jugador player;
    private ArrayList<Monstruo> monsters;

    public Partida(Jugador player) {
        this.player = player;
        this.monsters = new ArrayList<>(10);
   }

    /**
     * Se le llama en el constructor
     * Añade a la lista de monstruos 100 monstruos iguales
     * Equipa al jugador con armas
     *
     */
   public void iniciarPartida(){

       for (int i=1; i<=100; i++){
            monsters.add(new Monstruo("Ghost",30,150.0, Monstruo.Clase.FANTASMA,60));
       }

       //player.equipar(new Arma("Sable", Arma.Tipo.ESPADA,50,false));
       //player.equipar(new Arma("Arquillo", Arma.Tipo.ARCO,70,false));

   }
}
