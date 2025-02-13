package Tema5.PracticaObjetosII;

import Tema4.PracticaObjetosI.BladeOfDarkness.Arma;

public class Jugador extends Personaje {

    enum Clase { MAGO, BRUJO, BARBARO, CABALLERO };

    private Integer experiencia;
    private Arma armaDerecha;
    private Arma armaIzquierda;
    private Clase clase;

    public Jugador(String nombre, Integer nivel, Double salud, Integer experiencia, Double salud1, Arma armaDerecha, Arma armaIzquierda) {
        super(nombre, nivel, salud);
        this.experiencia = experiencia;
        this.salud = salud1;
        this.armaDerecha = armaDerecha;
        this.armaIzquierda = armaIzquierda;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public Arma getArmaDerecha() {
        return armaDerecha;
    }

    public void setArmaDerecha(Arma armaDerecha) {
        this.armaDerecha = armaDerecha;
    }

    public Arma getArmaIzquierda() {
        return armaIzquierda;
    }

    public void setArmaIzquierda(Arma armaIzquierda) {
        this.armaIzquierda = armaIzquierda;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "experiencia=" + experiencia +
                ", salud=" + salud +
                ", armaDerecha=" + armaDerecha +
                ", armaIzquierda=" + armaIzquierda +
                ", nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", salud=" + salud +
                '}';
    }



    @Override
    public Boolean reducirVida(int puntosD) {
        return super.reducirVida(puntosD);
    }

    @Override
    public void subirNivel() {
        super.subirNivel();
    }

    @Override
    public void golpear(Personaje monstruo) {
        if (this.getArmaDerecha() != null){
            monstruo.reducirVida(this.getArmaDerecha().getPuntosD());
            if (! this.getArmaDerecha().getDosManos()){
                if (this.getArmaIzquierda() != null){
                    monstruo.reducirVida(this.getArmaIzquierda().getPuntosD());
                }
            }
        }

        if (monstruo.getSalud() <= 0){


            if (this.experiencia + (monstruo.getNivel() * 10) >= 1000){
                this.experiencia = 1000;
            } else{
                this.experiencia += (monstruo.getNivel() * 10);
                if (this.getExperiencia() % 100 == 0 ){
                    this.nivel++;
                }
            }

        }
    }

    /**
     * Metodo para equipar armas.
     * @param arma
     * @return
     */
    public Boolean equipar(Arma arma){
        if (arma.getDosManos()){
            if (this.armaDerecha == null && this.armaIzquierda == null){
                this.armaDerecha = arma;
                this.armaIzquierda = arma;
                return true;
            } else {
                return false;
            }
        } else
            if (this.armaDerecha == null){
                this.armaDerecha = arma;
                return true;
            } else if (this.armaIzquierda == null){
                this.armaIzquierda = arma;
                return true;
            } else
                return false;
    }

    /**
     * Metodo que añade vida conforme indique puntosS.
     * @param puntosS
     */
    public void tomarPocion(int puntosS){
        if (this.salud + puntosS >= 10000){
            this.salud = 10000.0;
        } else
            this.salud += puntosS;
    }


}
