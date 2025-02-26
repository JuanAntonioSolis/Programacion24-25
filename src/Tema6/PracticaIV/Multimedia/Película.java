package Tema6.PracticaIV.Multimedia;

public class Película extends Multimedia{

    private Integer duracion;


    public Película(String titulo, Boolean plus, Double precio, Integer duracion) {
        super(titulo, plus, precio);
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
