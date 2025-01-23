package Tema4.PracticaObjetosI.BladeOfDarkness;

public class Jugador {

    enum Clase { MAGO, BRUJO, BARBARO, CABALLERO };

    private String nombre;
    private Clase clase;
    private Integer nivel;
    private Integer experiencia;
    private Double  salud;
    private Arma armaDerecha;
    private Arma armaIzquierda;

    //Constructor completo, Nivel por defecto a 1, Exp por defecto a 0, Salud por defecto a 200. Armas null.
    public Jugador(String nombre, Clase clase) {
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = 1;
        this.experiencia = 0;
        this.salud = 200.0;
        this.armaDerecha = null;
        this.armaIzquierda = null;
    }

    //Metodo para subir nivel de 1 en 1. Nivel max, 10. Cuando sube de nivel, sube la vida 2.5^nivel.
    public void subirNivel(Jugador jugador) {
        while (this.nivel <= 10){
            this.nivel += 1;
            this.salud += (Math.pow(2.5,this.nivel));
        }
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

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public Double getSalud() {
        return salud;
    }

    public void setSalud(Double salud) {
        this.salud = salud;
    }

    public Arma getArmaDerecha() {
        return armaDerecha;
    }

    public void setArmaDerecha(Arma armaDerecha) {
        this.armaDerecha = armaDerecha;
    }

    public Arma getArmaIzquierda() {
        return armaIzquierda;
    }

    public void setArmaIzquierda(Arma armaIzquierda) {
        this.armaIzquierda = armaIzquierda;
    }
}
