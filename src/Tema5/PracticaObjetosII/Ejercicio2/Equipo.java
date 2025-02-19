package Tema5.PracticaObjetosII.Ejercicio2;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private String pais;
    private ArrayList<Ciclista> equipo;

    private static Integer tiemposCarrera = 0; //Estático de tiempo en carrera (minutos)

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.equipo = new ArrayList<>();
    }

    protected static Integer getTiemposCarrera() {
        return tiemposCarrera;
    }

    protected static void setTiemposCarrera(Integer tiemposCarrera) {
        Equipo.tiemposCarrera = tiemposCarrera;
    }

    protected ArrayList<Ciclista> getEquipo() {
        return equipo;
    }

    protected String getPais() {
        return pais;
    }

    protected void setPais(String pais) {
        this.pais = pais;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Equipo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", pais='").append(pais).append('\'');
        sb.append(", equipo=").append(equipo);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Añade ciclistas a un ArrayList de un equipo
     * @param cic
     */
    protected void agregarCliclista (Ciclista cic){
        this.equipo.add(cic);
    }

    /**
     * Calcula el tiempo toal de los ciclistas del equipo
     * Devuelve la suma de los tiempos acumulados de cada ciclista
     * @return
     */
    protected Integer calcularTiempoCarrera() {
        for (Ciclista cic: equipo) {
            Equipo.tiemposCarrera += cic.getTiempoAcumulado();
        }

        return Equipo.tiemposCarrera;
    }

    /**
     * Devuelve el nombre de todos los ciclistas del equipo
     */
    protected void nombresCiclistas() {
        for (Ciclista cic: equipo) {
            System.out.println(cic.getNombre());
        }
    }

    public boolean encontrarCiclista(Integer id){


        for (Ciclista cic: equipo) {
            if (cic.getId().equals(id)) {
                System.out.println("Ciclista encontrado: ");
                System.out.println(cic);
                return true;
            } else{
                System.out.println("Ciclista no encontrado");
                return false;
            }

        }
        return false;

        /*
        int posicion = this.equipo.indexOf(id);

        if (posicion <0){
            System.out.println("Ciclista no encontrado");
            return false;
        } else{
            System.out.println("Ciclista encontrado");
            System.out.println(this.equipo.indexOf(id));
            return true;
        }

         */



    }










}
