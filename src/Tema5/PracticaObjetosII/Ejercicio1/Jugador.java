package Tema5.PracticaObjetosII.Ejercicio1;

public class Jugador extends Personaje {

    enum Clase {MAGO, BRUJO, BARBARO, CABALLERO};

    private Clase clase;
    private Integer experiencia;
    private Arma armaDerecha;
    private Arma armaIzquierda;


    public Jugador(String nombre, Clase clase, Arma armaDerecha, Arma armaIzquierda) {
        super(nombre, 1, 200.0);
        this.clase = clase;
        this.experiencia = 0;
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
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("clase=").append(clase);
        sb.append(", experiencia=").append(experiencia);
        sb.append(", armaDerecha=").append(armaDerecha);
        sb.append(", armaIzquierda=").append(armaIzquierda);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append('}');
        return sb.toString();
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
    public Boolean golpear(Personaje monstruo) {

        boolean muere = false;

        if (this.getArmaDerecha() == null && this.getArmaIzquierda() == null) {
            return false;
        } else if (this.getArmaDerecha() != null && this.getArmaIzquierda() != null) {
            //Dos manos
            if (this.getArmaDerecha().getDosManos()) {
                muere = monstruo.reducirVida(this.getArmaDerecha().getPuntosD());
            } else {
                //Golpear con las dos
                monstruo.reducirVida(this.getArmaDerecha().getPuntosD());
                muere = monstruo.reducirVida(this.getArmaIzquierda().getPuntosD());
            }
        } else if (this.getArmaIzquierda() == null) {
            muere = monstruo.reducirVida(this.getArmaDerecha().getPuntosD());
        }


        //Comprobar si el monstruo muere
        if (muere == false) {
            return false;
        } else {
            //En qué centena estamos
            int centena = this.experiencia / 100;
            //Subir la experiencia y el nivel
            this.experiencia += 10 * monstruo.getNivel();
            //En qué centena estoy después de subir la experiencia
            int nuevaCentena = this.experiencia / 100;

            //Detectar si hay un cambio de centena en la experiencia
            if (centena != nuevaCentena) {
                this.subirNivel();
            }
            return true;
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
