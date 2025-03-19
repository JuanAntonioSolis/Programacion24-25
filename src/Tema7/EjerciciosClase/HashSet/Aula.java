package Tema7.EjerciciosClase.HashSet;

import java.util.ArrayList;

public class Aula {

    private String nombre;
    private String ubicacion;
    private ArrayList<Alumno> alumnos;

    public Aula(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.alumnos = new ArrayList<>();
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

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Aula{");
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
