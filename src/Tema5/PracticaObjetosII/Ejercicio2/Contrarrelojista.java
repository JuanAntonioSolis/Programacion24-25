package Tema5.PracticaObjetosII.Ejercicio2;

public class Contrarrelojista extends Ciclista{

    private Double velocidadMax;

    public Contrarrelojista(Integer id, String nombre, Integer tiempoAcumulado, Double velocidadMax) {
        super(id, nombre, tiempoAcumulado);
        this.velocidadMax = velocidadMax;
    }

    public Double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(Double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    @Override
    public String toString() {
        return "Contrarrelojista{" +
                "velocidadMax=" + velocidadMax +
                '}';
    }

    @Override
    public String imprimirTipo() {
        return "Ciclista contrarrelojista " + getNombre()
                + ", velocidadMax=" + velocidadMax;
    }






}
