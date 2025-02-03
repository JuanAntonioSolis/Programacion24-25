package Tema4.PracticaObjetosI.AcademiaDeMagia;

import java.util.ArrayList;
import java.util.List;

public class Mago {

    private String nombre;
    private Integer energia;
    private ArrayList<Hechizo> hechizos;

    public Mago(String nombre, Integer energia) {
        this.nombre = nombre;
        this.energia = energia;
        this.hechizos = new ArrayList<>();
    }

    public ArrayList<Hechizo> getHechizos() {
        return hechizos;
    }

    public void setHechizos(ArrayList<Hechizo> hechizos) {
        this.hechizos = hechizos;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Mago{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", hechizos=" + hechizos +
                '}';
    }

    public void aprenderHechizo(Hechizo hechizo) {
        this.hechizos.add(hechizo);
    }

    public void recargarEnergia(int cantidad){
        if (this.energia + cantidad >= 100){
            this.energia = 100;
        } else
            this.energia += cantidad;
    }


    /**
     * Metodo que lanza hechizos:
     * Consume energia y usa el hechizo si está en la lista.
     * Primero busca que este el hechizo.
     * Si no esta false, si está, se comprueba si es efectivo contra la prueba. Si no es efectivo devuelve false,
     *
     * Si el hechizo es suficiente para la prueba devuelve true y suma la experiencia del mago la de la prueba(recompensa).
     * Sino, pierde energia el mago(recompensa) y devuelve false
     *
     * @param nombreHechizo
     * @param prueba
     * @return
     */
    public Boolean lanzarHechizo(String nombreHechizo, Prueba prueba){

        Hechizo eHechizo = this.buscar(nombreHechizo);

        if (eHechizo == null){
            System.out.println("Hechizo no encontrado");
            return false;
        } else {
            if (this.energia < eHechizo.getEnergiaNecesaria()){
                System.out.println("El mago no tiene energía suficiente para el conjuro");
                return false;
            } else {
                if (eHechizo.esEfectivo(prueba)){
                    this.recargarEnergia(prueba.getRecompensa());
                    return true;
                } else{
                    this.setEnergia(this.energia - prueba.getRecompensa());
                }
            }
        }

    return null;
    }



    public Hechizo buscar(String nombreHechizo){
        for (Hechizo hechizo : this.hechizos){
            if (hechizo.getNombre().equalsIgnoreCase(nombreHechizo)){
                return hechizo;
            }
        }
        return null;
    }

}
