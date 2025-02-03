package Tema4.PracticaObjetosI.AcademiaDeMagia;

public class Prueba {

    private String descripcion;
    private Integer nivelDificultad;
    private Integer recompensa;

    public Prueba(String descripcion, Integer nivelDificultad, Integer recompensa) {
        this.descripcion = descripcion;
        this.nivelDificultad = nivelDificultad;
        this.recompensa = recompensa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(Integer nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public Integer getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(Integer recompensa) {
        this.recompensa = recompensa;
    }

    @Override
    public String toString() {
        return "Prueba{" +
                "descripcion='" + descripcion + '\'' +
                ", nivelDificultad=" + nivelDificultad +
                ", recompensa=" + recompensa +
                '}';
    }

    public Boolean resolver(Hechizo hechizo){
        if (this.nivelDificultad <= hechizo.getPotencia()){
            return true;
        } else
            return false;

    }
}
