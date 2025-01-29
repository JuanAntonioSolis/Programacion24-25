package Tema4.EjerciciosClase.EjerciciosSueltosPrincipio;

public class Arma {

    enum TipoArma { ESPADA, MARTILLO, HACHA};

    private String nombre;
    private int golpe;
    private TipoArma tipo;

    public Arma(String nombre, int golpe, TipoArma tipo) {
        this.nombre = nombre;
        this.golpe = golpe;
        this.tipo = tipo;
    }

    public Arma() {
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Arma{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", golpe=").append(golpe);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGolpe() {
        return golpe;
    }

    public void setGolpe(int golpe) {
        this.golpe = golpe;
    }

    public TipoArma getTipo() {
        return tipo;
    }

    public void setTipo(TipoArma tipo) {
        this.tipo = tipo;
    }

    public void golpear(Personaje personaje){
        personaje.setVida(personaje.getVida() - this.golpe);
    }
}
