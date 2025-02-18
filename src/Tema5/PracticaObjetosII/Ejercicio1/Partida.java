package Tema5.PracticaObjetosII.Ejercicio1;



import java.util.ArrayList;

public class Partida {



    private Jugador player;
    private ArrayList<Monstruo> monsters;

    public Partida(Jugador player) {
        this.player = player;
        this.monsters = new ArrayList<>(10);
        this.iniciarPartida();
   }

    public Jugador getPlayer() {
        return player;
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


       for (int i=1; i<=4; i++){

           Monstruo mn = new Monstruo("Pepín", Monstruo.Clase.DEMONIO,25);
           this.monsters.add(mn);
       }

       this.monsters.add( new MonstruoFinal("Jefe", Monstruo.Clase.FANTASMA,30,50));

       for (int i=1; i<=4; i++){

           Monstruo mn = new Monstruo("Duende", Monstruo.Clase.SKRALL,20);
           this.monsters.add(mn);
       }

       this.monsters.add( new MonstruoFinal("Diablo", Monstruo.Clase.TROLL,25,40));


       player.equipar(new Arma("Arquillo", Arma.Tipo.ARCO,200, true));



   }

   public void agregarMonsruos(Monstruo mon){
       this.monsters.add(mon);
   }

   public Boolean turnoJugador(){

       player.golpear(this.monsters.getFirst());

       if (this.monsters.getFirst().getSalud() <= 0 ){
           System.out.println("El jugador ha acabado con el monstruo " + this.monsters.getFirst().getNombre());
           this.monsters.remove(this.monsters.getFirst());
           return true;
       }

       if (this.monsters.isEmpty()){
           System.out.println("Termina la partida, el jugador a acabado con todos los monstruos");
           return true;
       } else {
           return false;
       }
   }


   public boolean turnoEnemigo(){

       this.monsters.getFirst().golpear(player);

       if (this.player.getSalud() <= 0 ){
           System.out.println("El jugador ha muerto, pierde la partida.");
           return true;
       } else
           return false;


   }
}
