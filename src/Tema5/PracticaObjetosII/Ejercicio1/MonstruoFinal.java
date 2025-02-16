package Tema5.PracticaObjetosII.Ejercicio1;

public class MonstruoFinal extends Monstruo{

    private Integer golpeEspecial;
    private Integer usosGolpeEspecial;


    public MonstruoFinal(String nombre, Integer nivel, Double salud, Clase clase, Integer puntosD,
                         Integer golpeEspecial) {
        super(nombre, nivel, salud, clase, puntosD);
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
        return "MonstruoFinal{" +
                "golpeEspecial=" + golpeEspecial +
                ", usosGolpeEspecial=" + usosGolpeEspecial +
                ", nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", salud=" + salud +
                '}';
    }

    /**
     * Metodo golpear pero con el golpeEspecial de este tipo de monstruo
     * Cada vez que se accede a este golpe, se resta uno en la cantidad de golpes dados.
     * @param jugador
     */
    @Override
    public void golpear(Personaje jugador) {
        jugador.reducirVida(this.golpeEspecial);

        if (this.usosGolpeEspecial -- == 0){
            this.usosGolpeEspecial = 0;
        } else
            this.usosGolpeEspecial--;
    }


}
