package Tema5.PracticaObjetosII;



import java.util.ArrayList;

public class Partida {



    private Jugador player;
    private ArrayList<Monstruo> monsters;

    public Partida(Jugador player) {
        this.player = player;
        this.monsters = new ArrayList<>(10);
        iniciarPartida();
   }

    /**
     * Se le llama en el constructor
     * Añade a la lista de monstruos 100 monstruos iguales
     * Equipa al jugador con armas
     */
   public void iniciarPartida(){

       for (int i=1; i<=100; i++){
            monsters.add(new Monstruo("Ghost",30,150.0, Monstruo.Clase.FANTASMA,60));
       }

       player.equipar(new Arma("Arquillo", Arma.Tipo.ARCO,40, true));

   }

   public Boolean turnoJugador(){
       for (Monstruo monstruo: monsters){
           player.golpear(monstruo);
           return true;
           if (monstruo.getSalud() <= 0){
               monsters.remove(monstruo);
               return true;
           }
           if (!monsters.isEmpty()){
               return true;
           } else
               return false;

       }
         return false;

   }
}
