package Tema5.PracticaObjetosIII;

import java.util.ArrayList;

public class Torneo {

    private String nombre;
    private ArrayList<Equipo> equipos;

    public Torneo(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Torneo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", equipos=").append(equipos);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Añade equipos al arraylist de equipos
     * @param equipo
     */
    public void inscribirEquipo(Equipo equipo) throws Exception{
        equipos.add(equipo);
    }


    /**
     * Devuelve el equipo que más puntos tenga
     *
     * @return
     */
    public Equipo jugarTorneo(){

        Equipo ganador = new FPS("win",1,1);

        for (Equipo equipo : equipos) {
            if (equipo.calcularPuntos() > ganador.calcularPuntos()) {
                ganador = equipo;
            }
        }

        return ganador;

    }


    /**
     * Lista los equipos inscritos en el torneo y sus puntos calculados
     */
    public void imprimirEquipos(){
        int contador = 0;

        for (Equipo equipo : equipos) {
            contador++;
            System.out.println(contador + ". "
            + equipo + " - Puntos: " + equipo.calcularPuntos());

        }
    }




}
