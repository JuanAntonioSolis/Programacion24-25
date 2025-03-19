package Tema7.EjerciciosClase.HashSet;

import java.util.HashSet;

public class AulaNueva {

    private String nombre;
    private String ubicacion;
    private HashSet<Alumno> alumnos;

    public AulaNueva(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.alumnos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public HashSet<Alumno> getAlumnos() {
        return alumnos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AulaNueva{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", ubicacion='").append(ubicacion).append('\'');
        sb.append(", alumnos=").append(alumnos);
        sb.append('}');
        return sb.toString();
    }

    public void addAlumno(Alumno al){
        this.alumnos.add(al);
    }

    public void removeAlumno(Alumno al){
        this.alumnos.remove(al);
    }

    public void listarAlumnos(){
        for (Alumno a : this.alumnos){
            System.out.println(a);
        }
    }
}
