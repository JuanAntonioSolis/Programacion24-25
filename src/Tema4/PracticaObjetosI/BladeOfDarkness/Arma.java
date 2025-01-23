package Tema4.PracticaObjetosI.BladeOfDarkness;

public class Arma {

    enum Tipo{ ESPADA, HACHA, BASTON, ARCO };

    private String nombre;
    private Tipo tipo;
    private Integer puntosD;
    private Boolean manos;

    //Constructor completo
    public Arma(String nombre, Tipo tipo, Integer puntosD, Boolean manos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.puntosD = puntosD;
        this.manos = manos;
    }

    //Constructor por defecto...
    public Arma() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Integer getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(Integer puntosD) {
        this.puntosD = puntosD;
    }

    public Boolean getManos() {
        return manos;
    }

    public void setManos(Boolean manos) {
        this.manos = manos;
    }

    @Override
    public String toString() {
        return "Arma{" +
                "nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", puntosD=" + puntosD +
                ", manos=" + manos +
                '}';
    }


}
