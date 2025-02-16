package Tema5.PracticaObjetosII.Ejercicio2;

public class Escalador extends Ciclista{

    private Float aceleracionMediaSubida;
    private Float gradoRampaSoportada;

    public Escalador(Integer id, String nombre, Integer tiempoAcumulado, Float aceleracionMediaSubida, Float gradoRampaSoportada) {
        super(id, nombre, tiempoAcumulado);
        this.aceleracionMediaSubida = aceleracionMediaSubida;
        this.gradoRampaSoportada = gradoRampaSoportada;
    }

    public Float getAceleracionMediaSubida() {
        return aceleracionMediaSubida;
    }

    public void setAceleracionMediaSubida(Float aceleracionMediaSubida) {
        this.aceleracionMediaSubida = aceleracionMediaSubida;
    }

    public Float getGradoRampaSoportada() {
        return gradoRampaSoportada;
    }

    public void setGradoRampaSoportada(Float gradoRampaSoportada) {
        this.gradoRampaSoportada = gradoRampaSoportada;
    }

    @Override
    public String toString() {
        return "Escalador{" +
                "aceleracionMediaSubida=" + aceleracionMediaSubida +
                ", gradoRampaSoportada=" + gradoRampaSoportada +
                '}';
    }

    @Override
    public String imprimirTipo() {
        return "";
    }
}
