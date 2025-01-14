package Tema4.EjerciciosClase;

public class Personaje {

    enum EligeArma {ESPADA, MARTILLO, HACHA}

    private String nombre;
    private String clase;
    private String sexo;
    private int vida;
    private EligeArma arma;

    public Personaje(String nombre, String clase, String sexo, int vida, EligeArma arma) {
        this.nombre = nombre;
        this.clase = clase;
        this.sexo = sexo;
        this.vida = vida;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public EligeArma getArma() {
        return arma;
    }

    public void setArma(EligeArma arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", clase='" + clase + '\'' +
                ", sexo='" + sexo + '\'' +
                ", vida=" + vida +
                ", arma=" + arma +
                '}';
    }

}
