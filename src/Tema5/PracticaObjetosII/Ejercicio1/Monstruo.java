package Tema5.PracticaObjetosII.Ejercicio1;

public class Monstruo extends Personaje {

    enum Clase { GOBLIN, TROLL, SKRALL, DEMONIO, FANTASMA };

    private Clase clase;
    private Integer puntosD;

    public Monstruo(String nombre, Integer nivel, Double salud, Clase clase, Integer puntosD) {
        super(nombre, nivel, salud);
        this.clase = clase;
        this.puntosD = puntosD;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Integer getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(Integer puntosD) {
        this.puntosD = puntosD;
    }

    @Override
    public void subirNivel() {
        super.subirNivel();
    }

    @Override
    public Boolean reducirVida(int puntosD) {
        return super.reducirVida(puntosD);
    }

    @Override
    public void golpear(Personaje jugador) {
            jugador.reducirVida(this.getPuntosD());
    }


}
