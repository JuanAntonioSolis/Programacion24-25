package Tema5.PracticaObjetosII.Ejercicio2;

public class Velocista extends Ciclista{

    private Double potenciaMedia; //(Vatios)
    private Double velocidadMediaSprint; //km/h

    public Velocista(Integer id, String nombre, Integer tiempoAcumulado, Double potenciaMedia, Double velocidadMediaSprint) {
        super(id, nombre, tiempoAcumulado);
        this.potenciaMedia = potenciaMedia;
        this.velocidadMediaSprint = velocidadMediaSprint;
    }

    public Double getPotenciaMedia() {
        return potenciaMedia;
    }

    public void setPotenciaMedia(Double potenciaMedia) {
        this.potenciaMedia = potenciaMedia;
    }

    public Double getVelocidadMediaSprint() {
        return velocidadMediaSprint;
    }

    public void setVelocidadMediaSprint(Double velocidadMediaSprint) {
        this.velocidadMediaSprint = velocidadMediaSprint;
    }

    @Override
    public String toString() {
        return "Velocista{" +
                "potenciaMedia=" + potenciaMedia +
                ", velocidadMediaSprint=" + velocidadMediaSprint +
                '}';
    }

    @Override
    public String imprimirTipo() {
        return "Ciclista velocista " + getNombre()
                + "potenciaMedia=" + potenciaMedia +
                ", velocidadMediaSprint=" + velocidadMediaSprint +
                '}';
    }
}
