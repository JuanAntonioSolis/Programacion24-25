package Tema5.PracticaObjetosIII;

public class MOBA extends Equipo{

    private Integer estrategia;

    public MOBA(String nombre, Integer nivel, Integer estrategia) {
        super(nombre, nivel);
        this.estrategia = estrategia;
    }

    public Integer getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(Integer estrategia) {
        this.estrategia = estrategia;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MOBA{");
        sb.append("Nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", estrategia=").append(estrategia);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Integer calcularPuntos() {
        return this.nivel * this.estrategia;
    }


}
