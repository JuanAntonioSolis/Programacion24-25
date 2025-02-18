package Tema5.PracticaObjetosII.Ejercicio1;

public class Monstruo extends Personaje {

    enum Clase { GOBLIN, TROLL, SKRALL, DEMONIO, FANTASMA };

    protected Clase clase;
    protected Integer puntosD;

    public Monstruo(String nombre, Clase clase, Integer puntosD) {
        super(nombre, 1, 100.0);
        this.clase = clase;
        this.puntosD = puntosD;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Monstruo{");
        sb.append("clase=").append(clase);
        sb.append(", puntosD=").append(puntosD);
        sb.append(", salud=").append(salud);
        sb.append(", nivel=").append(nivel);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
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
    public Boolean golpear(Personaje jugador) {
        return jugador.reducirVida(this.getPuntosD());
    }


}
