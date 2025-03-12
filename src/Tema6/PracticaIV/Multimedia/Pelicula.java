package Tema6.PracticaIV.Multimedia;

public class Pelicula extends Multimedia{

    private Integer duracion;


    public Pelicula(String titulo, Boolean plus, Double precio, Integer duracion, Genero genero) {
        super(titulo, plus, precio, genero);
        this.duracion = duracion;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return super.toString() + (", Duración: ") +
                this.duracion;
    }




}
