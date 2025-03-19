package Tema7.EjerciciosClase.RobotsClsGenericas;

import java.util.ArrayList;

public class Liga<T extends Robot>{

    private String nombre;
    private ArrayList<T> listaRobots;

    public Liga(String nombre) {
        this.nombre = nombre;
        this.listaRobots = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<T> getListaRobots() {
        return listaRobots;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Liga{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", listaRobots=").append(listaRobots);
        sb.append('}');
        return sb.toString();
    }

    public void addRobot(T robot){
        this.listaRobots.add(robot);
    }

    public void imprimirParticipantes(){
        for (T robot : this.listaRobots){
            System.out.println(robot.getNombre() + robot.getEnergia());
        }
    }


}
