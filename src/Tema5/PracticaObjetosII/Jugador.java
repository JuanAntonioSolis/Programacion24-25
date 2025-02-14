package Tema5.PracticaObjetosII;

public class Jugador extends Personaje {

    enum Clase {MAGO, BRUJO, BARBARO, CABALLERO};

    private Clase clase;
    private Integer experiencia;
    private Arma armaDerecha;
    private Arma armaIzquierda;


    public Jugador(String nombre, Integer nivel, Double salud, Clase clase,
                   Integer experiencia, Arma armaDerecha, Arma armaIzquierda) {
        super(nombre, nivel, salud);
        this.clase = clase;
        this.experiencia = experiencia;
        this.armaDerecha = armaDerecha;
        this.armaIzquierda = armaIzquierda;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Integer getExperiencia() {
        return experiencia;
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
                "clase=" + clase +
                ", experiencia=" + experiencia +
                ", armaDerecha=" + armaDerecha +
                ", armaIzquierda=" + armaIzquierda +
                ", nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", salud=" + salud +
                '}';
    }

    @Override
    public void subirNivel() {
        super.subirNivel();
    }

    @Override
    public Boolean reducirVida(int puntosD) {
        return super.reducirVida(puntosD);
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

    public void tomarPocion(int puntosS){
        if (this.salud + puntosS >= 10000){
            this.salud += 10000;
        } else {
            this.salud += puntosS;
        }
    }

    public Boolean equipar(Arma weapon){
        if (weapon.getDosManos()){
            if (this.armaDerecha == null && this.armaIzquierda == null){
                this.armaDerecha = weapon;
                this.armaIzquierda = weapon;
                return true;
            } else {
                return false;
            }
        } else if (this.armaDerecha == null){
            this.armaDerecha = weapon;
            return true;
        } else if (this.armaIzquierda == null) {
            this.armaIzquierda = weapon;
            return true;

        } else
            return false;
    }


}
