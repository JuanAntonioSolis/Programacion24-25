package Tema4.PracticaObjetosI.BladeOfDarkness;

public class Monstruo {

    enum Clase { GOBLIN, TROLL, SKRALL, DEMONIO, FANTASMA };

    private String nombre;
    private Clase clase;
    private Integer nivel;
    private Double salud;
    private Integer puntosD;

    public Monstruo(String nombre, Clase clase, Integer puntosD) {
        this.nombre = nombre;
        this.clase = clase;
        this.puntosD = puntosD;
        this.nivel = 1;
        this.salud = 100.0;
    }

    //Metodo para subir el nivel del monstruo.
    public void subirNivel(){
        while (this.nivel <= 10){
            this.nivel += 1;
            this.salud += (Math.pow(2,this.nivel));
        }
    }

    //Metodo que reduce la vida del monstruo.
    public Boolean reducirVida(int puntosD){
        this.salud -= puntosD;

        if (this.salud != 0){
            return false;
        } else if (this.salud == 0 || this.salud < 0){
            this.setSalud(0.0);
            return true;
        }

        return false;
    }

    //Metodo que golpea al jugador y le quita tanta vida como valor de puntosD del monstruo.
    public void golpear(Jugador jugador){
        jugador.setSalud(jugador.getSalud() - this.puntosD);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Monstruo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase=").append(clase);
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append(", puntosD=").append(puntosD);
        sb.append('}');
        return sb.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Double getSalud() {
        return salud;
    }

    public void setSalud(Double salud) {
        this.salud = salud;
    }

    public Integer getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(Integer puntosD) {
        this.puntosD = puntosD;
    }
}
