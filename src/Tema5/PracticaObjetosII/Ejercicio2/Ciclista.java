package Tema5.PracticaObjetosII.Ejercicio2;

public abstract class Ciclista {

    private Integer id;
    private String nombre;
    private Integer tiempoAcumulado = 0;

    public Ciclista(Integer id, String nombre, Integer tiempoAcumulado) {
        this.id = id;
        this.nombre = nombre;
        this.tiempoAcumulado = tiempoAcumulado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(Integer tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    @Override
    public String toString() {
        return "Ciclista{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tiempoAcumulado=" + tiempoAcumulado +
                '}';
    }

    public abstract String imprimirTipo();

}
