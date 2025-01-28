package Tema4.PracticaObjetosI.BladeOfDarkness;

public class Jugador {

    enum Clase { MAGO, BRUJO, BARBARO, CABALLERO };

    private String nombre;
    private Clase clase;
    private Integer nivel;
    private Integer experiencia;
    private Double  salud;
    private Arma armaDerecha;
    private Arma armaIzquierda;

    /**
     * Constructor completo, Nivel por defecto a 1, Exp por defecto a 0, Salud por defecto a 200.
     * Armas null.
     * @param nombre
     * @param clase
     */
    public Jugador(String nombre, Clase clase) {
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = 1;
        this.experiencia = 0;
        this.salud = 200.0;
        this.armaDerecha = null;
        this.armaIzquierda = null;
    }

    /**
     * Metodo para subir nivel de 1 en 1. Nivel max, 10. Cuando sube de nivel, sube la vida 2.5^nivel.
     */
    public void subirNivel() {
        if (this.nivel + 1 >= 10){
            this.nivel = 10;
            this.salud += (Math.pow(2.5,this.nivel));
        } else {
            this.nivel += 1;
            this.salud += (Math.pow(2.5, this.nivel));
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

    /**
     * Metodo que reduce vida del jugador.
     * @param puntosD
     * @return
     */
    public Boolean reducirVida(int puntosD){

        this.salud -= puntosD;

        if (this.salud != 0){
            return false;
        } else if (this.salud == 0 || this.salud < 0){
            this.setSalud(0.0);
            return true;
        }

        return false;
    }

    /**
     * Metodo que resta vida al monstruo, conforme los puntosD de las armas.
     * Si del golpe se muere el monstruo, sube el nivel del jugador (10 * nivelMonstruo)
     * Por cada centena que suba la experiencia sube el nivel
     * @param monstruo
     */
    public void golpear(Monstruo monstruo){
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



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public Double getSalud() {
        return salud;
    }

    public void setSalud(Double salud) {
        this.salud = salud;
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
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase=").append(clase);
        sb.append(", nivel=").append(nivel);
        sb.append(", experiencia=").append(experiencia);
        sb.append(", salud=").append(salud);
        sb.append(", armaDerecha=").append(armaDerecha);
        sb.append(", armaIzquierda=").append(armaIzquierda);
        sb.append('}');
        return sb.toString();
    }
}
