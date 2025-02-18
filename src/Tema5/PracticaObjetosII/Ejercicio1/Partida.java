package Tema5.PracticaObjetosII.Ejercicio1;



import java.util.ArrayList;
import java.util.NoSuchElementException;

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
        final StringBuffer sb = new StringBuffer("Partida{");
        sb.append("player=")
                .append("vida: ")
                .append(player.getSalud())
                .append(", nivel: ")
                .append(player.getNivel())
                .append(" y experiencia: ")
                .append(player.getExperiencia())
                .append("\n");

        sb.append("Monstruos =");
        for (Monstruo m : monsters) {
            sb.append(m.getNombre()).append(" - ")
                    .append(m.getSalud()).append(" - ")
                    .append(m.getNivel()).append(" \n ");
        }


        return sb.toString();
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

       if (this.monsters.getFirst().getSalud() <= 0 || this.monsters.isEmpty()){
           this.monsters.remove(this.monsters.getFirst());
           return true; //Gana la partida
       } else {
           return false; //Sigue jugando
       }
   }


   public boolean turnoEnemigo(){
       try {
           return this.monsters.getFirst().golpear(this.player);
       } catch (NoSuchElementException ex) {
           System.out.println("No hay más monstruos, qué fiera eres");
       }

       return false;
   }
}
