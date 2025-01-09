package Tema4.EjerciciosClase;

public class Personaje {

    enum EligeArma {}

    private String nombre;
    private String clase;
    private String sexo;
    private int vida;
    private Arma tipoArma;


    public Personaje(String nombre, String clase, String sexo, int vida) {
        this.nombre = nombre;
        this.clase = clase;
        this.sexo = sexo;
        this.vida = vida;
    }

    public Personaje() {
        this.nombre = "SinNombre";
        this.clase = "Humano";
        this.sexo = "nodefinido";
        this.vida = 10;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personaje{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase='").append(clase).append('\'');
        sb.append(", sexo='").append(sexo).append('\'');
        sb.append(", vida=").append(vida);
        sb.append('}');
        return sb.toString();
    }
}
