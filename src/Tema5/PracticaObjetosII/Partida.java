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

    public Jugador getPlayer() {
        return player;
    }

    public void setPlayer(Jugador player) {
        this.player = player;
    }

    public ArrayList<Monstruo> getMonsters() {
        return monsters;
    }

    @Override
    public String toString() {
        return "Partida{" +
                "player=" + player +
                ", monsters=" + monsters +
                '}';
    }

    /**
     * Se le llama en el constructor
     * Añade a la lista de monstruos 100 monstruos iguales
     * Equipa al jugador con armas
     */
   public void iniciarPartida(){

       for (int i=1; i<=10; i++){
            monsters.add(new Monstruo("Ghost",30,150.0, Monstruo.Clase.FANTASMA,60));
       }

       player.equipar(new Arma("Arquillo", Arma.Tipo.ARCO,40, true));

   }

   public void agregarMonsruos(Monstruo mon){
       this.monsters.add(mon);
   }

   public Boolean turnoJugador(){

       player.golpear(this.monsters.get(0));

       if (this.monsters.getFirst().getSalud() <= 0 ){
           System.out.println("El jugador ha acabado con el monstruo " + this.monsters.getFirst().getNombre());
           this.monsters.remove(this.monsters.get(0));
       }

       if (this.monsters.isEmpty()){
           System.out.println("Termina la partida, el jugador a acabado con todos los monstruos");
           return true;
       }


       return false;
   }

   public boolean turnoEnemigo(){

       this.monsters.getFirst().golpear(player);

       if (this.player.getSalud() <= 0 ){
           System.out.println("El jugador ha muerto, pierde la partida.");
           return true;
       }



       return false;
   }
}
