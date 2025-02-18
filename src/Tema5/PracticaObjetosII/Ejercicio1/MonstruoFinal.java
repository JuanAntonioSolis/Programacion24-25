package Tema5.PracticaObjetosII.Ejercicio1;

public class MonstruoFinal extends Monstruo{

    private Integer golpeEspecial;
    private Integer usosGolpeEspecial;


    public MonstruoFinal(String nombre, Clase clase, Integer puntosD,
                         Integer golpeEspecial) {
        super(nombre, clase, puntosD);
        this.golpeEspecial = golpeEspecial;
        this.usosGolpeEspecial = 3;
    }

    public Integer getGolpeEspecial() {
        return golpeEspecial;
    }

    public void setGolpeEspecial(Integer golpeEspecial) {
        this.golpeEspecial = golpeEspecial;
    }

    public Integer getUsosGolpeEspecial() {
        return usosGolpeEspecial;
    }

    public void setUsosGolpeEspecial(Integer usosGolpeEspecial) {
        this.usosGolpeEspecial = usosGolpeEspecial;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MonstruoFinal{");
        sb.append("golpeEspecial=").append(golpeEspecial);
        sb.append(", usosGolpeEspecial=").append(usosGolpeEspecial);
        sb.append(", clase=").append(clase);
        sb.append(", puntosD=").append(puntosD);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Metodo golpear pero con el golpeEspecial de este tipo de monstruo
     * Cada vez que se accede a este golpe, se resta uno en la cantidad de golpes dados.
     * @param jugador
     */
    @Override
    public Boolean golpear(Personaje jugador) {

        if (this.usosGolpeEspecial > 0) {
            this.usosGolpeEspecial--;
            return jugador.reducirVida(this.golpeEspecial);
        } else {
            return super.golpear(jugador);
        }
    }


}
