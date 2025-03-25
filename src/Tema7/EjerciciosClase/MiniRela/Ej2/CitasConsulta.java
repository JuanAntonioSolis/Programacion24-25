package Tema7.EjerciciosClase.MiniRela.Ej2;

import Tema5.EjerciciosPracticarPOO.Ejercicio1.Persona;

import java.util.ArrayList;
import java.util.Comparator;

public class CitasConsulta {

    private ArrayList<Cita> citas;

    public CitasConsulta() {
        this.citas = new ArrayList<>();
    }

    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<Cita> citas) {
        this.citas = citas;
    }

    public void addCita(Cita c){
        this.citas.add(c);
    }

    public void deleteCita(Cita c){
        this.citas.remove(c);
    }

    public void listarCitasPorNombre(){
        ArrayList<Cita> ordNombre = new ArrayList<>(this.citas);
        ordNombre.sort(new Comparator<Cita>() {
            @Override
            public int compare(Cita o1, Cita o2) {
                return o1.getPersona().getNombre().compareTo(o2.getPersona().getNombre());
            }
        });

        listarCitas(citas);
    }

    public void listarCitasPorApellidos(){
        ArrayList<Cita> ordNombre = new ArrayList<>(this.citas);
        ordNombre.sort(new Comparator<Cita>() {
            @Override
            public int compare(Cita o1, Cita o2) {
                return o1.getPersona().getApellidos().compareTo(o2.getPersona().getApellidos());
            }
        });

        listarCitas(citas);
    }

    public void listarCitasPorFechaYApellidos(){

    }





    public void listarCitas(ArrayList<Cita> appoint){
        StringBuffer sb = new StringBuffer();

        for (Cita ct : appoint){
            sb.append(ct);
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
