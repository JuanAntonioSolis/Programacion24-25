package Tema4.PracticaObjetosI.AcademiaDeMagia;

import java.util.Objects;

public class Hechizo {

    private String nombre;
    private Integer energiaNecesaria;
    private Integer potencia;

    public Hechizo(String nombre, Integer energiaNecesaria, Integer potencia) {
        this.nombre = nombre;
        this.energiaNecesaria = energiaNecesaria;
        this.potencia = potencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEnergiaNecesaria() {
        return energiaNecesaria;
    }

    public void setEnergiaNecesaria(Integer energiaNecesaria) {
        this.energiaNecesaria = energiaNecesaria;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Hechizo{" +
                "nombre='" + nombre + '\'' +
                ", energiaNecesaria=" + energiaNecesaria +
                ", potencia=" + potencia +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hechizo hechizo = (Hechizo) o;
        return Objects.equals(nombre, hechizo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    public Boolean esEfectivo(Prueba prueba){
        return prueba.resolver(this);
    }
}
