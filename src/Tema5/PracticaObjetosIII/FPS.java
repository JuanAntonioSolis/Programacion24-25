package Tema5.PracticaObjetosIII;

public class FPS extends Equipo{

    private Integer punteria;

    public FPS(String nombre, Integer nivel, Integer punteria) {
        super(nombre, nivel);
        this.punteria = punteria;
    }

    public Integer getPunteria() {
        return punteria;
    }

    public void setPunteria(Integer punteria) {
        this.punteria = punteria;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("FPS{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", punteria=").append(punteria);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Integer calcularPuntos() {
        return this.nivel + (this.punteria*5);
    }


}
