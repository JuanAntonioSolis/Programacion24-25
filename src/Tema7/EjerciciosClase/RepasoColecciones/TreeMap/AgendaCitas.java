package Tema7.EjerciciosClase.RepasoColecciones.TreeMap;

import java.time.LocalDateTime;
import java.util.TreeMap;

public class AgendaCitas {

    private TreeMap<LocalDateTime,String> citas;

    public AgendaCitas() {
        this.citas = new TreeMap<>(); //Ordena por localDateTime por defecto
    }

    public boolean addCita(String desc,LocalDateTime fecha){
        if (fecha.isBefore(LocalDateTime.now())){
            return false;
        }

        //Comprobar que no tenemos una cita en esa fecha
        if (this.citas.containsKey(fecha)){
            return false;
        }

        citas.put(fecha,desc);
        return true;
    }

    public void mostrarProximasCitas(){
        for (LocalDateTime fech : citas.keySet()){
            System.out.println(fech + " - " + citas.get(fech));
        }
    }

    public String eliminarCita(LocalDateTime fecha){
        return this.citas.remove(fecha);
    }




}
